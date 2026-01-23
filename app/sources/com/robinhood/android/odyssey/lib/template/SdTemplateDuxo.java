package com.robinhood.android.odyssey.lib.template;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.Spanned;
import androidx.core.text.PrecomputedTextCompat;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.odyssey.lib.template.LoadContentRequest;
import com.robinhood.android.odyssey.lib.template.SdTemplateDuxo;
import com.robinhood.android.odyssey.lib.template.SdTemplateState;
import com.robinhood.android.odyssey.lib.template.SdTemplateState2;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.GenericService;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.markdown.ContentRenderer;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.RichNode;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.models.api.serverdrivenui.ApiSdComponentDataChangeResponse;
import com.robinhood.models.api.serverdrivenui.ApiSdResponse;
import com.robinhood.models.api.serverdrivenui.ApiSdSubmitPayloadRequest;
import com.robinhood.models.api.serverdrivenui.component.ApiSdComponentDataChange;
import com.robinhood.models.api.serverdrivenui.component.ApiSdDeeplinkConfig;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.models.api.serverdrivenui.page.ApiSdPage;
import com.robinhood.models.api.serverdrivenui.page.ApiSdPollingConfig;
import com.robinhood.staticcontent.model.FancyAgreement;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p408rx.DownloadManagerOnSubscribe;
import dispatch.core.Suspend;
import io.noties.markwon.Markwon;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import okhttp3.HttpUrl;
import org.commonmark.node.Node;

/* compiled from: SdTemplateDuxo.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u0014\u001a\u00020\u00152\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00100\u000eJ\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ(\u0010\u001b\u001a\u00020\u00152\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0!J<\u0010\"\u001a\u00020\u00152\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0!J\u000e\u0010$\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J0\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0!H\u0002J$\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u00112\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH\u0002J&\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-J\"\u0010.\u001a\u00020\u00152\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001503JH\u00104\u001a4\u00120\u0012.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001806 8*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001806\u0018\u00010000052\f\u00109\u001a\b\u0012\u0004\u0012\u00020100H\u0002J\u0016\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<H\u0082@¢\u0006\u0002\u0010=J\u0016\u0010>\u001a\u0002072\u0006\u0010;\u001a\u00020?H\u0082@¢\u0006\u0002\u0010@J\u0018\u0010A\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000eX\u0082.¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00100\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdTemplateDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/odyssey/lib/template/SdoState;", "genericService", "Lcom/robinhood/api/retrofit/GenericService;", "contentRenderer", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Lcom/robinhood/api/retrofit/GenericService;Lcom/robinhood/contentful/markdown/ContentRenderer;Lcom/robinhood/contentful/StaticContentStore;Lio/noties/markwon/Markwon;)V", "postEndpoint", "Lkotlin/Function1;", "Lcom/robinhood/models/api/serverdrivenui/ApiSdSubmitPayloadRequest;", "Lio/reactivex/Maybe;", "Lcom/robinhood/models/api/serverdrivenui/ApiSdResponse;", "validationEndpoint", "Lcom/robinhood/models/api/serverdrivenui/ApiSdComponentDataChangeResponse;", "setEndpoints", "", "configurePolling", "pageKey", "", "pollingConfig", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPollingConfig;", "validateValuesAndHandleDeferredPostRequest", "newEntities", "", "Lcom/robinhood/android/odyssey/lib/template/SdBackendMetadata;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "toBeValidatedWithEndpoint", "", "validateValuesAndHandlePostRequest", "updatedEntitiesSinceLastCheckpoint", "handleUpdatePostRequest", "maybeValidateValues", "handlePostResponse", "response", "downloadFileContent", "filename", "url", "contentType", "context", "Landroid/content/Context;", "loadContents", "loadContentRequests", "", "Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest;", "onFinishLoadingAction", "Lkotlin/Function0;", "getContentPrecomputedTextParams", "Lio/reactivex/Single;", "Lkotlin/Pair;", "Landroidx/core/text/PrecomputedTextCompat;", "kotlin.jvm.PlatformType", "requests", "getRichNodePrecomputedTextParam", "request", "Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest$FancyAgreement;", "(Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest$FancyAgreement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMarkdownPrecomputedTextParam", "Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest$Markdown;", "(Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest$Markdown;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPollingCheckpoint", "pollingCheckpoint", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdTemplateDuxo extends OldBaseDuxo<SdTemplateState> {
    public static final int $stable = 8;
    private final ContentRenderer contentRenderer;
    private final GenericService genericService;
    private final Markwon markwon;
    private Function1<? super ApiSdSubmitPayloadRequest, ? extends Maybe<ApiSdResponse>> postEndpoint;
    private final StaticContentStore staticContentStore;
    private Function1<? super ApiSdSubmitPayloadRequest, ? extends Maybe<ApiSdComponentDataChangeResponse>> validationEndpoint;

    /* compiled from: SdTemplateDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.odyssey.lib.template.SdTemplateDuxo", m3645f = "SdTemplateDuxo.kt", m3646l = {342}, m3647m = "getMarkdownPrecomputedTextParam")
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$getMarkdownPrecomputedTextParam$1 */
    static final class C226541 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C226541(Continuation<? super C226541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SdTemplateDuxo.this.getMarkdownPrecomputedTextParam(null, this);
        }
    }

    /* compiled from: SdTemplateDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.odyssey.lib.template.SdTemplateDuxo", m3645f = "SdTemplateDuxo.kt", m3646l = {330, 331}, m3647m = "getRichNodePrecomputedTextParam")
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$getRichNodePrecomputedTextParam$1 */
    static final class C226551 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C226551(Continuation<? super C226551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SdTemplateDuxo.this.getRichNodePrecomputedTextParam(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdTemplateState handlePostResponse$lambda$11(SdTemplateState.SdoUiEvent sdoUiEvent, SdTemplateState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return sdoUiEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SdTemplateDuxo(GenericService genericService, ContentRenderer contentRenderer, StaticContentStore staticContentStore, Markwon markwon) {
        super(SdTemplateState.Initial.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(genericService, "genericService");
        Intrinsics.checkNotNullParameter(contentRenderer, "contentRenderer");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.genericService = genericService;
        this.contentRenderer = contentRenderer;
        this.staticContentStore = staticContentStore;
        this.markwon = markwon;
    }

    public final void setEndpoints(Function1<? super ApiSdSubmitPayloadRequest, ? extends Maybe<ApiSdResponse>> postEndpoint, Function1<? super ApiSdSubmitPayloadRequest, ? extends Maybe<ApiSdComponentDataChangeResponse>> validationEndpoint) {
        Intrinsics.checkNotNullParameter(postEndpoint, "postEndpoint");
        Intrinsics.checkNotNullParameter(validationEndpoint, "validationEndpoint");
        this.postEndpoint = postEndpoint;
        this.validationEndpoint = validationEndpoint;
    }

    /* compiled from: SdTemplateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$configurePolling$1", m3645f = "SdTemplateDuxo.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$configurePolling$1 */
    static final class C226501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $pageKey;
        final /* synthetic */ Ref.IntRef $pollingAttempts;
        final /* synthetic */ ApiSdPollingConfig $pollingConfig;
        int label;
        final /* synthetic */ SdTemplateDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C226501(Ref.IntRef intRef, ApiSdPollingConfig apiSdPollingConfig, SdTemplateDuxo sdTemplateDuxo, String str, Continuation<? super C226501> continuation) {
            super(2, continuation);
            this.$pollingAttempts = intRef;
            this.$pollingConfig = apiSdPollingConfig;
            this.this$0 = sdTemplateDuxo;
            this.$pageKey = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C226501(this.$pollingAttempts, this.$pollingConfig, this.this$0, this.$pageKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C226501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0050 -> B:16:0x0053). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$pollingAttempts.element >= this.$pollingConfig.getMax_attempts()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$pollingAttempts.element++;
                if (this.$pollingAttempts.element >= this.$pollingConfig.getMax_attempts()) {
                    this.this$0.sendPollingCheckpoint(this.$pollingConfig.getError_checkpoint(), this.$pageKey);
                    return Unit.INSTANCE;
                }
                this.this$0.sendPollingCheckpoint(this.$pollingConfig.getPoll_checkpoint(), this.$pageKey);
                long interval_ms = this.$pollingConfig.getInterval_ms();
                this.label = 1;
                if (DelayKt.delay(interval_ms, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.$pollingAttempts.element++;
                if (this.$pollingAttempts.element >= this.$pollingConfig.getMax_attempts()) {
                }
            }
        }
    }

    public final void configurePolling(String pageKey, ApiSdPollingConfig pollingConfig) {
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        Intrinsics.checkNotNullParameter(pollingConfig, "pollingConfig");
        Ref.IntRef intRef = new Ref.IntRef();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.RESUMED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C226501(intRef, pollingConfig, this, pageKey, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C226512(pollingConfig.getTimeout_ms() + System.currentTimeMillis(), this, pollingConfig, pageKey, null));
    }

    /* compiled from: SdTemplateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$configurePolling$2", m3645f = "SdTemplateDuxo.kt", m3646l = {79}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$configurePolling$2 */
    static final class C226512 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $pageKey;
        final /* synthetic */ ApiSdPollingConfig $pollingConfig;
        final /* synthetic */ long $pollingTimeoutTime;
        int label;
        final /* synthetic */ SdTemplateDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C226512(long j, SdTemplateDuxo sdTemplateDuxo, ApiSdPollingConfig apiSdPollingConfig, String str, Continuation<? super C226512> continuation) {
            super(2, continuation);
            this.$pollingTimeoutTime = j;
            this.this$0 = sdTemplateDuxo;
            this.$pollingConfig = apiSdPollingConfig;
            this.$pageKey = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C226512(this.$pollingTimeoutTime, this.this$0, this.$pollingConfig, this.$pageKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C226512) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long jCurrentTimeMillis = this.$pollingTimeoutTime - System.currentTimeMillis();
                if (jCurrentTimeMillis > 0) {
                    this.label = 1;
                    if (DelayKt.delay(jCurrentTimeMillis, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.sendPollingCheckpoint(this.$pollingConfig.getError_checkpoint(), this.$pageKey);
            return Unit.INSTANCE;
        }
    }

    public final void validateValuesAndHandleDeferredPostRequest(final Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities, Set<SdBackendMetadata> toBeValidatedWithEndpoint) {
        Intrinsics.checkNotNullParameter(newEntities, "newEntities");
        Intrinsics.checkNotNullParameter(toBeValidatedWithEndpoint, "toBeValidatedWithEndpoint");
        LifecycleHost.DefaultImpls.bind$default(this, maybeValidateValues(newEntities, toBeValidatedWithEndpoint), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.validateValuesAndHandleDeferredPostRequest$lambda$1(this.f$0, newEntities, (Unit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateValuesAndHandleDeferredPostRequest$lambda$1(SdTemplateDuxo sdTemplateDuxo, final Map map, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        sdTemplateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.validateValuesAndHandleDeferredPostRequest$lambda$1$lambda$0(map, (SdTemplateState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdTemplateState validateValuesAndHandleDeferredPostRequest$lambda$1$lambda$0(Map map, SdTemplateState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new SdTemplateState.SdoUiEvent(new SdTemplateState2.DeferredPostValidationSuccess(map));
    }

    public final void validateValuesAndHandlePostRequest(final Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities, final Map<SdBackendMetadata, ? extends ApiSdTypedValue> updatedEntitiesSinceLastCheckpoint, Set<SdBackendMetadata> toBeValidatedWithEndpoint) {
        Intrinsics.checkNotNullParameter(newEntities, "newEntities");
        Intrinsics.checkNotNullParameter(updatedEntitiesSinceLastCheckpoint, "updatedEntitiesSinceLastCheckpoint");
        Intrinsics.checkNotNullParameter(toBeValidatedWithEndpoint, "toBeValidatedWithEndpoint");
        Maybe<R> maybeFlatMap = maybeValidateValues(newEntities, toBeValidatedWithEndpoint).doOnSuccess(new C226611()).flatMap(new Function() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo.validateValuesAndHandlePostRequest.2
            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends ApiSdResponse> apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ApiSdSubmitPayloadRequest apiSdSubmitPayloadRequest = SdBackendMetadata2.toApiSdSubmitPayloadRequest(MapsKt.plus(updatedEntitiesSinceLastCheckpoint, newEntities));
                Function1 function1 = this.postEndpoint;
                if (function1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("postEndpoint");
                    function1 = null;
                }
                return (MaybeSource) function1.invoke(apiSdSubmitPayloadRequest);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeFlatMap, "flatMap(...)");
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, maybeFlatMap, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.validateValuesAndHandlePostRequest$lambda$2(this.f$0, newEntities, (ApiSdResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.validateValuesAndHandlePostRequest$lambda$4(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
    }

    /* compiled from: SdTemplateDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$validateValuesAndHandlePostRequest$1 */
    static final class C226611<T> implements Consumer {
        C226611() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SdTemplateState accept$lambda$0(SdTemplateState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SdTemplateState.Loading.INSTANCE;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Unit unit) {
            SdTemplateDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$validateValuesAndHandlePostRequest$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SdTemplateDuxo.C226611.accept$lambda$0((SdTemplateState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateValuesAndHandlePostRequest$lambda$2(SdTemplateDuxo sdTemplateDuxo, Map map, ApiSdResponse apiSdResponse) {
        Intrinsics.checkNotNull(apiSdResponse);
        sdTemplateDuxo.handlePostResponse(apiSdResponse, map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateValuesAndHandlePostRequest$lambda$4(SdTemplateDuxo sdTemplateDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        sdTemplateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.validateValuesAndHandlePostRequest$lambda$4$lambda$3(throwable, (SdTemplateState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdTemplateState validateValuesAndHandlePostRequest$lambda$4$lambda$3(Throwable th, SdTemplateState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new SdTemplateState.SdoUiEvent(new SdTemplateState2.Error(th, SdTemplateState2.Error.FailureReason.CHECKPOINT));
    }

    public final void handleUpdatePostRequest(final String pageKey) {
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        Function1<? super ApiSdSubmitPayloadRequest, ? extends Maybe<ApiSdResponse>> function1 = this.postEndpoint;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("postEndpoint");
            function1 = null;
        }
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, function1.invoke(new ApiSdSubmitPayloadRequest(null, null, null, null, 15, null)), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.handleUpdatePostRequest$lambda$7(this.f$0, pageKey, (ApiSdResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.handleUpdatePostRequest$lambda$9(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleUpdatePostRequest$lambda$7(SdTemplateDuxo sdTemplateDuxo, String str, ApiSdResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        for (final ApiSdPage apiSdPage : ((ApiSdResponse.Pages) response).getPages()) {
            if (Intrinsics.areEqual(apiSdPage.getPage_key(), str)) {
                sdTemplateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SdTemplateDuxo.handleUpdatePostRequest$lambda$7$lambda$6(apiSdPage, (SdTemplateState) obj);
                    }
                });
                return Unit.INSTANCE;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdTemplateState handleUpdatePostRequest$lambda$7$lambda$6(ApiSdPage apiSdPage, SdTemplateState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new SdTemplateState.SdoUiEvent(new SdTemplateState2.UpdatePage(apiSdPage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleUpdatePostRequest$lambda$9(SdTemplateDuxo sdTemplateDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        sdTemplateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.handleUpdatePostRequest$lambda$9$lambda$8(throwable, (SdTemplateState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdTemplateState handleUpdatePostRequest$lambda$9$lambda$8(Throwable th, SdTemplateState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new SdTemplateState.SdoUiEvent(new SdTemplateState2.Error(th, SdTemplateState2.Error.FailureReason.CHECKPOINT));
    }

    private final Maybe<Unit> maybeValidateValues(Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities, Set<SdBackendMetadata> toBeValidatedWithEndpoint) {
        if (toBeValidatedWithEndpoint.isEmpty()) {
            Maybe<Unit> maybeJust = Maybe.just(Unit.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(maybeJust, "just(...)");
            return maybeJust;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<SdBackendMetadata, ? extends ApiSdTypedValue> entry : newEntities.entrySet()) {
            if (toBeValidatedWithEndpoint.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Function1<? super ApiSdSubmitPayloadRequest, ? extends Maybe<ApiSdComponentDataChangeResponse>> function1 = this.validationEndpoint;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("validationEndpoint");
            function1 = null;
        }
        Maybe<Unit> maybeFlatMap = function1.invoke(SdBackendMetadata2.toApiSdSubmitPayloadRequest(linkedHashMap)).doOnSubscribe(new C226571()).doOnError(new C226582()).map(new Function() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo.maybeValidateValues.3
            @Override // io.reactivex.functions.Function
            public final List<ApiSdComponentDataChange> apply(ApiSdComponentDataChangeResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getComponent_data_change();
            }
        }).flatMap(new C226604());
        Intrinsics.checkNotNullExpressionValue(maybeFlatMap, "flatMap(...)");
        return maybeFlatMap;
    }

    /* compiled from: SdTemplateDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$maybeValidateValues$1 */
    static final class C226571<T> implements Consumer {
        C226571() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SdTemplateState accept$lambda$0(SdTemplateState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SdTemplateState.Loading.INSTANCE;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            SdTemplateDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$maybeValidateValues$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SdTemplateDuxo.C226571.accept$lambda$0((SdTemplateState) obj);
                }
            });
        }
    }

    /* compiled from: SdTemplateDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$maybeValidateValues$2 */
    static final class C226582<T> implements Consumer {
        C226582() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(final Throwable th) {
            SdTemplateDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$maybeValidateValues$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SdTemplateDuxo.C226582.accept$lambda$0(th, (SdTemplateState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SdTemplateState accept$lambda$0(Throwable th, SdTemplateState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            Intrinsics.checkNotNull(th);
            return new SdTemplateState.SdoUiEvent(new SdTemplateState2.Error(th, SdTemplateState2.Error.FailureReason.VALIDATION));
        }
    }

    /* compiled from: SdTemplateDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$maybeValidateValues$4 */
    static final class C226604<T, R> implements Function {
        C226604() {
        }

        @Override // io.reactivex.functions.Function
        public final MaybeSource<? extends Unit> apply(final List<? extends ApiSdComponentDataChange> changes) {
            Intrinsics.checkNotNullParameter(changes, "changes");
            if (!changes.isEmpty()) {
                SdTemplateDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$maybeValidateValues$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SdTemplateDuxo.C226604.apply$lambda$0(changes, (SdTemplateState) obj);
                    }
                });
                return Maybe.empty();
            }
            return Maybe.just(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SdTemplateState apply$lambda$0(List list, SdTemplateState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            Intrinsics.checkNotNull(list);
            return new SdTemplateState.SdoUiEvent(new SdTemplateState2.ComponentDataChange(list));
        }
    }

    private final void handlePostResponse(ApiSdResponse response, Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities) {
        Uri deeplink;
        final SdTemplateState.SdoUiEvent sdoUiEvent;
        Uri exit_deeplink;
        if (response instanceof ApiSdResponse.Pages) {
            sdoUiEvent = new SdTemplateState.SdoUiEvent(new SdTemplateState2.CheckpointUpdate(((ApiSdResponse.Pages) response).getPages(), newEntities));
        } else if (response instanceof ApiSdResponse.ExitDeeplink) {
            ApiSdResponse.ExitDeeplink exitDeeplink = (ApiSdResponse.ExitDeeplink) response;
            ApiSdDeeplinkConfig deeplink_config = exitDeeplink.getDeeplink_config();
            if ((deeplink_config == null || (exit_deeplink = deeplink_config.getUrl()) == null) && (exit_deeplink = exitDeeplink.getExit_deeplink()) == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ApiSdDeeplinkConfig deeplink_config2 = exitDeeplink.getDeeplink_config();
            if (deeplink_config2 != null && !deeplink_config2.getShould_close_flow()) {
                sdoUiEvent = new SdTemplateState.SdoUiEvent(new SdTemplateState2.DeeplinkReceived(exit_deeplink));
            } else {
                sdoUiEvent = new SdTemplateState.SdoUiEvent(new SdTemplateState2.ExitDeeplinkReceived(exit_deeplink));
            }
        } else if (response instanceof ApiSdResponse.Popup) {
            sdoUiEvent = new SdTemplateState.SdoUiEvent(new SdTemplateState2.PopupReceived(((ApiSdResponse.Popup) response).getPopup()));
        } else if (response instanceof ApiSdResponse.Deeplink) {
            ApiSdResponse.Deeplink deeplink2 = (ApiSdResponse.Deeplink) response;
            ApiSdDeeplinkConfig deeplink_config3 = deeplink2.getDeeplink_config();
            if ((deeplink_config3 == null || (deeplink = deeplink_config3.getUrl()) == null) && (deeplink = deeplink2.getDeeplink()) == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ApiSdDeeplinkConfig deeplink_config4 = deeplink2.getDeeplink_config();
            if (deeplink_config4 != null && deeplink_config4.getShould_close_flow()) {
                sdoUiEvent = new SdTemplateState.SdoUiEvent(new SdTemplateState2.ExitDeeplinkReceived(deeplink));
            } else {
                sdoUiEvent = new SdTemplateState.SdoUiEvent(new SdTemplateState2.DeeplinkReceived(deeplink));
            }
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(response);
            throw new ExceptionsH();
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.handlePostResponse$lambda$11(sdoUiEvent, (SdTemplateState) obj);
            }
        });
    }

    public final void downloadFileContent(String filename, String url, final String contentType, Context context) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(context, "context");
        Single singleDoOnSubscribe = Single.create(new DownloadManagerOnSubscribe(context, HttpUrl.INSTANCE.get(url), new File(context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), filename), false, 8, null)).doOnSubscribe(new C226521());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        bind(singleDoOnSubscribe, LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.downloadFileContent$lambda$13(this.f$0, contentType, (File) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.downloadFileContent$lambda$15(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: SdTemplateDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$downloadFileContent$1 */
    static final class C226521<T> implements Consumer {
        C226521() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SdTemplateState accept$lambda$0(SdTemplateState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SdTemplateState.Loading.INSTANCE;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            SdTemplateDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$downloadFileContent$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SdTemplateDuxo.C226521.accept$lambda$0((SdTemplateState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadFileContent$lambda$13(SdTemplateDuxo sdTemplateDuxo, final String str, final File file) {
        sdTemplateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.downloadFileContent$lambda$13$lambda$12(file, str, (SdTemplateState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdTemplateState downloadFileContent$lambda$13$lambda$12(File file, String str, SdTemplateState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(file);
        return new SdTemplateState.SdoUiEvent(new SdTemplateState2.FileDownloaded(file, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadFileContent$lambda$15(SdTemplateDuxo sdTemplateDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        sdTemplateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.downloadFileContent$lambda$15$lambda$14(throwable, (SdTemplateState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdTemplateState downloadFileContent$lambda$15$lambda$14(Throwable th, SdTemplateState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new SdTemplateState.SdoUiEvent(new SdTemplateState2.Error(th, SdTemplateState2.Error.FailureReason.FILE_DOWNLOAD));
    }

    /* compiled from: SdTemplateDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$loadContents$1 */
    static final class C226561<T> implements Consumer {
        C226561() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SdTemplateState accept$lambda$0(SdTemplateState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SdTemplateState.Loading.INSTANCE;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            SdTemplateDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$loadContents$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SdTemplateDuxo.C226561.accept$lambda$0((SdTemplateState) obj);
                }
            });
        }
    }

    public final void loadContents(List<? extends LoadContentRequest> loadContentRequests, final Function0<Unit> onFinishLoadingAction) {
        Intrinsics.checkNotNullParameter(loadContentRequests, "loadContentRequests");
        Intrinsics.checkNotNullParameter(onFinishLoadingAction, "onFinishLoadingAction");
        Single<List<Tuples2<PrecomputedTextCompat, String>>> singleDoOnSubscribe = getContentPrecomputedTextParams(loadContentRequests).doOnSubscribe(new C226561());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.loadContents$lambda$17(this.f$0, onFinishLoadingAction, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.loadContents$lambda$19(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContents$lambda$17(SdTemplateDuxo sdTemplateDuxo, final Function0 function0, final List list) {
        sdTemplateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.loadContents$lambda$17$lambda$16(list, function0, (SdTemplateState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdTemplateState loadContents$lambda$17$lambda$16(List list, Function0 function0, SdTemplateState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return new SdTemplateState.SdoUiEvent(new SdTemplateState2.LoadedContents(list, function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContents$lambda$19(SdTemplateDuxo sdTemplateDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        sdTemplateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.loadContents$lambda$19$lambda$18(throwable, (SdTemplateState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdTemplateState loadContents$lambda$19$lambda$18(Throwable th, SdTemplateState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new SdTemplateState.SdoUiEvent(new SdTemplateState2.Error(th, SdTemplateState2.Error.FailureReason.CONTENT_LOADING));
    }

    /* compiled from: SdTemplateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlin/Pair;", "Landroidx/core/text/PrecomputedTextCompat;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$getContentPrecomputedTextParams$1", m3645f = "SdTemplateDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$getContentPrecomputedTextParams$1 */
    static final class C226531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends Tuples2<? extends PrecomputedTextCompat, ? extends String>>>, Object> {
        final /* synthetic */ List<LoadContentRequest> $requests;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SdTemplateDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C226531(List<? extends LoadContentRequest> list, SdTemplateDuxo sdTemplateDuxo, Continuation<? super C226531> continuation) {
            super(2, continuation);
            this.$requests = list;
            this.this$0 = sdTemplateDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C226531 c226531 = new C226531(this.$requests, this.this$0, continuation);
            c226531.L$0 = obj;
            return c226531;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Tuples2<? extends PrecomputedTextCompat, ? extends String>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<? extends Tuples2<? extends PrecomputedTextCompat, String>>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<? extends Tuples2<? extends PrecomputedTextCompat, String>>> continuation) {
            return ((C226531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<LoadContentRequest> list = this.$requests;
            SdTemplateDuxo sdTemplateDuxo = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new SdTemplateDuxo2((LoadContentRequest) it.next(), sdTemplateDuxo, null), 3, null));
            }
            this.label = 1;
            Object objAwaitAll = Await2.awaitAll(arrayList, this);
            return objAwaitAll == coroutine_suspended ? coroutine_suspended : objAwaitAll;
        }
    }

    private final Single<List<Tuples2<PrecomputedTextCompat, String>>> getContentPrecomputedTextParams(List<? extends LoadContentRequest> requests) {
        Single<List<Tuples2<PrecomputedTextCompat, String>>> singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C226531(requests, this, null), 1, null).subscribeOn(Schedulers.computation());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r10 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRichNodePrecomputedTextParam(LoadContentRequest.FancyAgreement fancyAgreement, Continuation<? super PrecomputedTextCompat> continuation) throws IOException {
        C226551 c226551;
        if (continuation instanceof C226551) {
            c226551 = (C226551) continuation;
            int i = c226551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c226551.label = i - Integer.MIN_VALUE;
            } else {
                c226551 = new C226551(continuation);
            }
        }
        C226551 c2265512 = c226551;
        Object objLoadEntry$default = c2265512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2265512.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoadEntry$default);
            StaticContentStore staticContentStore = this.staticContentStore;
            String contentfulId = fancyAgreement.getContentfulId();
            c2265512.L$0 = fancyAgreement;
            c2265512.label = 1;
            objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, contentfulId, null, c2265512, 2, null);
            if (objLoadEntry$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fancyAgreement = (LoadContentRequest.FancyAgreement) c2265512.L$0;
            ResultKt.throwOnFailure(objLoadEntry$default);
            Intrinsics.checkNotNull(objLoadEntry$default);
            Spanned spannedRender = this.markwon.render((Node) objLoadEntry$default);
            Intrinsics.checkNotNullExpressionValue(spannedRender, "render(...)");
            PrecomputedTextCompat precomputedTextCompatCreate = PrecomputedTextCompat.create(spannedRender, fancyAgreement.getPrecomputedTextParams());
            Intrinsics.checkNotNullExpressionValue(precomputedTextCompatCreate, "create(...)");
            return precomputedTextCompatCreate;
        }
        fancyAgreement = (LoadContentRequest.FancyAgreement) c2265512.L$0;
        ResultKt.throwOnFailure(objLoadEntry$default);
        FancyAgreement fancyAgreement2 = (FancyAgreement) ((EntryResource) objLoadEntry$default).getValue();
        ContentRenderer contentRenderer = this.contentRenderer;
        RichNode agreement = fancyAgreement2.getAgreement();
        c2265512.L$0 = fancyAgreement;
        c2265512.label = 2;
        objLoadEntry$default = contentRenderer.render(agreement, c2265512);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getMarkdownPrecomputedTextParam(LoadContentRequest.Markdown markdown, Continuation<? super PrecomputedTextCompat> continuation) {
        C226541 c226541;
        if (continuation instanceof C226541) {
            c226541 = (C226541) continuation;
            int i = c226541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c226541.label = i - Integer.MIN_VALUE;
            } else {
                c226541 = new C226541(continuation);
            }
        }
        Object objWithIO$default = c226541.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c226541.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithIO$default);
            SdTemplateDuxo3 sdTemplateDuxo3 = new SdTemplateDuxo3(this, markdown, null);
            c226541.L$0 = markdown;
            c226541.label = 1;
            objWithIO$default = Suspend.withIO$default(null, sdTemplateDuxo3, c226541, 1, null);
            if (objWithIO$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            markdown = (LoadContentRequest.Markdown) c226541.L$0;
            ResultKt.throwOnFailure(objWithIO$default);
        }
        Spanned markdown2 = this.markwon.toMarkdown((String) objWithIO$default);
        Intrinsics.checkNotNullExpressionValue(markdown2, "toMarkdown(...)");
        PrecomputedTextCompat precomputedTextCompatCreate = PrecomputedTextCompat.create(markdown2, markdown.getPrecomputedTextParams());
        Intrinsics.checkNotNullExpressionValue(precomputedTextCompatCreate, "create(...)");
        return precomputedTextCompatCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendPollingCheckpoint(String pollingCheckpoint, final String pageKey) {
        final Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to(new SdBackendMetadata("checkpoint", "checkpoint"), new ApiSdTypedValue.ApiSdString(pollingCheckpoint)));
        ApiSdSubmitPayloadRequest apiSdSubmitPayloadRequest = SdBackendMetadata2.toApiSdSubmitPayloadRequest(mapMapOf);
        Function1<? super ApiSdSubmitPayloadRequest, ? extends Maybe<ApiSdResponse>> function1 = this.postEndpoint;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("postEndpoint");
            function1 = null;
        }
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, function1.invoke(apiSdSubmitPayloadRequest), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.sendPollingCheckpoint$lambda$20(pageKey, this, mapMapOf, (ApiSdResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.sendPollingCheckpoint$lambda$22(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendPollingCheckpoint$lambda$20(String str, SdTemplateDuxo sdTemplateDuxo, Map map, ApiSdResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!(response instanceof ApiSdResponse.Pages) || !Intrinsics.areEqual(((ApiSdPage) CollectionsKt.first((List) ((ApiSdResponse.Pages) response).getPages())).getPage_key(), str)) {
            sdTemplateDuxo.handlePostResponse(response, map);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendPollingCheckpoint$lambda$22(SdTemplateDuxo sdTemplateDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        sdTemplateDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdTemplateDuxo.sendPollingCheckpoint$lambda$22$lambda$21(throwable, (SdTemplateState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdTemplateState sendPollingCheckpoint$lambda$22$lambda$21(Throwable th, SdTemplateState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new SdTemplateState.SdoUiEvent(new SdTemplateState2.Error(th, SdTemplateState2.Error.FailureReason.CHECKPOINT));
    }
}
