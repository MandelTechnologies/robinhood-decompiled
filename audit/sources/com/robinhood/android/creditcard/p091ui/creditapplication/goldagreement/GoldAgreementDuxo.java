package com.robinhood.android.creditcard.p091ui.creditapplication.goldagreement;

import com.robinhood.android.brokeragecontent.BrokerageAgreement;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.markdown.ContentRenderer;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.staticcontent.model.Agreement;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.commonmark.node.Node;

/* compiled from: GoldAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/goldagreement/GoldAgreementDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/goldagreement/GoldAgreementViewState;", "contentRenderer", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/contentful/markdown/ContentRenderer;Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class GoldAgreementDuxo extends BaseDuxo4<GoldAgreementViewState> {
    public static final int $stable = 8;
    private final BrokerageResourceManager brokerageResourceManager;
    private final ContentRenderer contentRenderer;
    private final CoroutineDispatcher defaultDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldAgreementDuxo(ContentRenderer contentRenderer, BrokerageResourceManager brokerageResourceManager, @DefaultDispatcher CoroutineDispatcher defaultDispatcher, DuxoBundle duxoBundle) {
        super(new GoldAgreementViewState(null, null, null), duxoBundle);
        Intrinsics.checkNotNullParameter(contentRenderer, "contentRenderer");
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.contentRenderer = contentRenderer;
        this.brokerageResourceManager = brokerageResourceManager;
        this.defaultDispatcher = defaultDispatcher;
    }

    /* compiled from: GoldAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementDuxo$onStart$1", m3645f = "GoldAgreementDuxo.kt", m3646l = {34, 35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementDuxo$onStart$1 */
    static final class C123891 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C123891(Continuation<? super C123891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldAgreementDuxo.this.new C123891(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C123891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:38|(1:(6:6|7|8|25|32|33)(2:11|12))(1:13))(5:15|34|16|(1:18)|23)|19|20|36|21|(4:24|25|32|33)|23|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
        
            r0 = e;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            IOException iOException;
            C123891 c123891;
            Agreement agreement;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                try {
                } catch (IOException e) {
                    iOException = e;
                    c123891 = this;
                    GoldAgreementDuxo.this.applyMutation(new AnonymousClass2(iOException, null));
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    agreement = (Agreement) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    c123891 = this;
                    GoldAgreementDuxo.this.applyMutation(new AnonymousClass1(agreement, (Node) obj, null));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                try {
                    BrokerageResourceManager brokerageResourceManager = GoldAgreementDuxo.this.brokerageResourceManager;
                    BrokerageAgreement brokerageAgreement = BrokerageAgreement.GOLD;
                    this.label = 1;
                    obj = brokerageResourceManager.loadResourceSuspend(brokerageAgreement, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (IOException e2) {
                    e = e2;
                    c123891 = this;
                    iOException = e;
                    GoldAgreementDuxo.this.applyMutation(new AnonymousClass2(iOException, null));
                    return Unit.INSTANCE;
                }
            }
            Agreement agreement2 = (Agreement) obj;
            ContentRenderer contentRenderer = GoldAgreementDuxo.this.contentRenderer;
            ResourceLink<AssetResource<?>> markdownContent = agreement2.getMarkdownContent();
            this.L$0 = agreement2;
            this.label = 2;
            c123891 = this;
            Object objRenderAssetLink$default = ContentRenderer.renderAssetLink$default(contentRenderer, markdownContent, null, c123891, 2, null);
            if (objRenderAssetLink$default != coroutine_suspended) {
                agreement = agreement2;
                obj = objRenderAssetLink$default;
                GoldAgreementDuxo.this.applyMutation(new AnonymousClass1(agreement, (Node) obj, null));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        /* compiled from: GoldAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/goldagreement/GoldAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementDuxo$onStart$1$1", m3645f = "GoldAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldAgreementViewState, Continuation<? super GoldAgreementViewState>, Object> {
            final /* synthetic */ Agreement $agreement;
            final /* synthetic */ Node $disclosureMarkdown;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Agreement agreement, Node node, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$agreement = agreement;
                this.$disclosureMarkdown = node;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$agreement, this.$disclosureMarkdown, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldAgreementViewState goldAgreementViewState, Continuation<? super GoldAgreementViewState> continuation) {
                return ((AnonymousClass1) create(goldAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return GoldAgreementViewState.copy$default((GoldAgreementViewState) this.L$0, this.$agreement.getTitle(), this.$disclosureMarkdown, null, 4, null);
            }
        }

        /* compiled from: GoldAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/goldagreement/GoldAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementDuxo$onStart$1$2", m3645f = "GoldAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.goldagreement.GoldAgreementDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GoldAgreementViewState, Continuation<? super GoldAgreementViewState>, Object> {
            final /* synthetic */ IOException $error;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(IOException iOException, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$error = iOException;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$error, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldAgreementViewState goldAgreementViewState, Continuation<? super GoldAgreementViewState> continuation) {
                return ((AnonymousClass2) create(goldAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return GoldAgreementViewState.copy$default((GoldAgreementViewState) this.L$0, null, null, this.$error, 3, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), this.defaultDispatcher, null, new C123891(null), 2, null);
    }
}
