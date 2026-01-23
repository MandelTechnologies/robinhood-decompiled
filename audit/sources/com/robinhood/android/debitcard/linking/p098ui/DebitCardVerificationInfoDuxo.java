package com.robinhood.android.debitcard.linking.p098ui;

import android.text.Spanned;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardVerificationInfoContent;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import com.robinhood.staticcontent.util.Markwons;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DebitCardVerificationInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoViewState;", "markwon", "Lio/noties/markwon/Markwon;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "<init>", "(Lio/noties/markwon/Markwon;Lcom/robinhood/contentful/StaticContentStore;)V", "onCreate", "", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DebitCardVerificationInfoDuxo extends OldBaseDuxo<DebitCardVerificationInfoViewState> {
    public static final String DEBIT_CARD_VERIFICATION_INTRO_CONTENTFUL_ID = "31y16xm5gFUsg9N3lvezOk";
    private final Markwon markwon;
    private final StaticContentStore staticContentStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebitCardVerificationInfoDuxo(Markwon markwon, StaticContentStore staticContentStore) {
        super(new DebitCardVerificationInfoViewState(null, 1, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        this.markwon = markwon;
        this.staticContentStore = staticContentStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C139091(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationInfoDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardVerificationInfoDuxo.onCreate$lambda$1(this.f$0, (DebitCardVerificationInfoContent) obj);
            }
        });
    }

    /* compiled from: DebitCardVerificationInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoContent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.debitcard.linking.ui.DebitCardVerificationInfoDuxo$onCreate$1", m3645f = "DebitCardVerificationInfoDuxo.kt", m3646l = {24, 30, 39}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationInfoDuxo$onCreate$1 */
    static final class C139091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super DebitCardVerificationInfoContent>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        C139091(Continuation<? super C139091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DebitCardVerificationInfoDuxo.this.new C139091(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DebitCardVerificationInfoContent> continuation) {
            return ((C139091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
        
            if (r0 == r6) goto L30;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
        /* JADX WARN: Type inference failed for: r0v32, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v9, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d9 -> B:25:0x00dc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objLoadEntry$default;
            ProductMarketing productMarketing;
            int i;
            String str;
            Iterator it;
            DebitCardVerificationInfoDuxo debitCardVerificationInfoDuxo;
            ArrayList arrayList;
            ArrayList arrayList2;
            Object objLoad$default;
            Markwon markwon;
            String str2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            int i3 = 1;
            Spanned spanned$default = null;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = DebitCardVerificationInfoDuxo.this.staticContentStore;
                this.label = 1;
                objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, DebitCardVerificationInfoDuxo.DEBIT_CARD_VERIFICATION_INTRO_CONTENTFUL_ID, null, this, 2, null);
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r0 = (List) this.L$2;
                        str2 = (String) this.L$1;
                        markwon = (Markwon) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        arrayList2 = r0;
                        objLoad$default = obj;
                        spanned$default = Markwons.toSpanned$default(markwon, ((Disclosure) ((EntryResource) objLoad$default).getValue()).getContent(), null, 2, null);
                        str = str2;
                        return new DebitCardVerificationInfoContent(str, arrayList2, spanned$default);
                    }
                    int i4 = this.I$1;
                    int i5 = this.I$0;
                    Collection collection = (Collection) this.L$5;
                    String str3 = (String) this.L$4;
                    Iterator it2 = (Iterator) this.L$3;
                    ?? r11 = (Collection) this.L$2;
                    DebitCardVerificationInfoDuxo debitCardVerificationInfoDuxo2 = (DebitCardVerificationInfoDuxo) this.L$1;
                    ProductMarketing productMarketing2 = (ProductMarketing) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    it = it2;
                    debitCardVerificationInfoDuxo = debitCardVerificationInfoDuxo2;
                    ProductMarketing productMarketing3 = productMarketing2;
                    str = str3;
                    arrayList = r11;
                    i = i4;
                    Object objLoad$default2 = obj;
                    ProductMarketing.Feature feature = (ProductMarketing.Feature) ((EntryResource) objLoad$default2).getValue();
                    collection.add(new DebitCardVerificationInfoContent.Row(i + i3, feature.getTitle(), Markwons.toSpanned$default(debitCardVerificationInfoDuxo.markwon, feature.getContent(), null, 2, null)));
                    i = i5;
                    productMarketing = productMarketing3;
                    i3 = 1;
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i6 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        StaticContentStore staticContentStore2 = debitCardVerificationInfoDuxo.staticContentStore;
                        this.L$0 = productMarketing;
                        this.L$1 = debitCardVerificationInfoDuxo;
                        this.L$2 = arrayList;
                        this.L$3 = it;
                        this.L$4 = str;
                        this.L$5 = arrayList;
                        this.I$0 = i6;
                        this.I$1 = i;
                        this.label = 2;
                        productMarketing3 = productMarketing;
                        objLoad$default2 = ContentRepository.DefaultImpls.load$default(staticContentStore2, (ResourceLink) next, null, this, 2, null);
                        if (objLoad$default2 != coroutine_suspended) {
                            collection = arrayList;
                            i5 = i6;
                            ProductMarketing.Feature feature2 = (ProductMarketing.Feature) ((EntryResource) objLoad$default2).getValue();
                            collection.add(new DebitCardVerificationInfoContent.Row(i + i3, feature2.getTitle(), Markwons.toSpanned$default(debitCardVerificationInfoDuxo.markwon, feature2.getContent(), null, 2, null)));
                            i = i5;
                            productMarketing = productMarketing3;
                            i3 = 1;
                            if (it.hasNext()) {
                                arrayList2 = arrayList;
                                ResourceLink<EntryResource<Disclosure>> disclosure = productMarketing.getDisclosure();
                                if (disclosure != null) {
                                    DebitCardVerificationInfoDuxo debitCardVerificationInfoDuxo3 = DebitCardVerificationInfoDuxo.this;
                                    Markwon markwon2 = debitCardVerificationInfoDuxo3.markwon;
                                    StaticContentStore staticContentStore3 = debitCardVerificationInfoDuxo3.staticContentStore;
                                    this.L$0 = markwon2;
                                    this.L$1 = str;
                                    this.L$2 = arrayList2;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.label = 3;
                                    objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore3, disclosure, null, this, 2, null);
                                    if (objLoad$default != coroutine_suspended) {
                                        markwon = markwon2;
                                        str2 = str;
                                        spanned$default = Markwons.toSpanned$default(markwon, ((Disclosure) ((EntryResource) objLoad$default).getValue()).getContent(), null, 2, null);
                                        str = str2;
                                    }
                                }
                                return new DebitCardVerificationInfoContent(str, arrayList2, spanned$default);
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                ResultKt.throwOnFailure(obj);
                objLoadEntry$default = obj;
            }
            productMarketing = (ProductMarketing) ((EntryResource) objLoadEntry$default).getValue();
            String pageTitle = productMarketing.getPageTitle();
            List<ResourceLink<EntryResource<ProductMarketing.Feature>>> features = productMarketing.getFeatures();
            DebitCardVerificationInfoDuxo debitCardVerificationInfoDuxo4 = DebitCardVerificationInfoDuxo.this;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(features, 10));
            i = 0;
            str = pageTitle;
            it = features.iterator();
            debitCardVerificationInfoDuxo = debitCardVerificationInfoDuxo4;
            arrayList = arrayList3;
            if (it.hasNext()) {
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(DebitCardVerificationInfoDuxo debitCardVerificationInfoDuxo, final DebitCardVerificationInfoContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        debitCardVerificationInfoDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationInfoDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardVerificationInfoDuxo.onCreate$lambda$1$lambda$0(content, (DebitCardVerificationInfoViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DebitCardVerificationInfoViewState onCreate$lambda$1$lambda$0(DebitCardVerificationInfoContent debitCardVerificationInfoContent, DebitCardVerificationInfoViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(debitCardVerificationInfoContent);
    }
}
