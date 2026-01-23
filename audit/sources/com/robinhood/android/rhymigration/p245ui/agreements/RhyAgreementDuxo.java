package com.robinhood.android.rhymigration.p245ui.agreements;

import android.content.Context;
import android.os.Environment;
import android.text.Spanned;
import androidx.core.text.PrecomputedTextCompat;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.rhymigration.p245ui.agreements.RhyAgreementFragment;
import com.robinhood.android.rhymigration.p245ui.agreements.RhyAgreementState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.markdown.ContentRenderer;
import com.robinhood.contentful.model.AssetDetail;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.model.RichNode;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.RhyApplicationStore;
import com.robinhood.models.api.identi.ApiUserAgreement;
import com.robinhood.staticcontent.model.FancyAgreement;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.p408rx.DownloadManagerOnSubscribe;
import io.noties.markwon.Markwon;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.commonmark.node.Node;

/* compiled from: RhyAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\"B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0015J(\u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d\u0012\u0004\u0012\u00020\u001f0\u001c0\u001b2\u0006\u0010 \u001a\u00020!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState;", "Lcom/robinhood/android/udf/HasSavedState;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "contentRenderer", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "markwon", "Lio/noties/markwon/Markwon;", "rhyApplicationStore", "Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/contentful/markdown/ContentRenderer;Lio/noties/markwon/Markwon;Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;Lcom/robinhood/contentful/StaticContentStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "loadMarkdown", "", "precomputedTextParams", "Landroidx/core/text/PrecomputedTextCompat$Params;", "reportUserSignedAgreement", "submitApplication", "downloadAgreement", "Lio/reactivex/Single;", "Lkotlin/Pair;", "Lcom/robinhood/contentful/model/AssetResource$File;", "Lcom/robinhood/contentful/model/AssetDetail;", "Ljava/io/File;", "context", "Landroid/content/Context;", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyAgreementDuxo extends OldBaseDuxo<RhyAgreementState> implements HasSavedState {
    private final ContentRenderer contentRenderer;
    private final Identi identi;
    private final Markwon markwon;
    private final RhyApplicationStore rhyApplicationStore;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RhyAgreementDuxo(Identi identi2, ContentRenderer contentRenderer, Markwon markwon, RhyApplicationStore rhyApplicationStore, StaticContentStore staticContentStore, SavedStateHandle savedStateHandle) {
        super(RhyAgreementState.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(contentRenderer, "contentRenderer");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(rhyApplicationStore, "rhyApplicationStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.identi = identi2;
        this.contentRenderer = contentRenderer;
        this.markwon = markwon;
        this.rhyApplicationStore = rhyApplicationStore;
        this.staticContentStore = staticContentStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final void loadMarkdown(PrecomputedTextCompat.Params precomputedTextParams) {
        Intrinsics.checkNotNullParameter(precomputedTextParams, "precomputedTextParams");
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementDuxo.loadMarkdown$lambda$0((RhyAgreementState) obj);
            }
        });
        Single singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C276002(precomputedTextParams, null), 1, null).subscribeOn(Schedulers.computation());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleSubscribeOn, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementDuxo.loadMarkdown$lambda$2(this.f$0, (PrecomputedTextCompat) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementDuxo.loadMarkdown$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyAgreementState loadMarkdown$lambda$0(RhyAgreementState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyAgreementState.Loading.INSTANCE;
    }

    /* compiled from: RhyAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Landroidx/core/text/PrecomputedTextCompat;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$loadMarkdown$2", m3645f = "RhyAgreementDuxo.kt", m3646l = {43, 44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$loadMarkdown$2 */
    static final class C276002 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PrecomputedTextCompat>, Object> {
        final /* synthetic */ PrecomputedTextCompat.Params $precomputedTextParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C276002(PrecomputedTextCompat.Params params, Continuation<? super C276002> continuation) {
            super(2, continuation);
            this.$precomputedTextParams = params;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyAgreementDuxo.this.new C276002(this.$precomputedTextParams, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PrecomputedTextCompat> continuation) {
            return ((C276002) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
        
            if (r11 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws IOException {
            C276002 c276002;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = RhyAgreementDuxo.this.staticContentStore;
                ResourceLink<EntryResource<FancyAgreement>> resourceLink = ((RhyAgreementFragment.Args) RhyAgreementDuxo.INSTANCE.getArgs((HasSavedState) RhyAgreementDuxo.this)).getAgreementBrief().getResourceLink();
                this.label = 1;
                c276002 = this;
                obj = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, c276002, 2, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c276002 = this;
                Node node = (Node) obj;
                Markwon markwon = RhyAgreementDuxo.this.markwon;
                Intrinsics.checkNotNull(node);
                Spanned spannedRender = markwon.render(node);
                Intrinsics.checkNotNullExpressionValue(spannedRender, "render(...)");
                return PrecomputedTextCompat.create(spannedRender, c276002.$precomputedTextParams);
            }
            ResultKt.throwOnFailure(obj);
            c276002 = this;
            FancyAgreement fancyAgreement = (FancyAgreement) ((EntryResource) obj).getValue();
            ContentRenderer contentRenderer = RhyAgreementDuxo.this.contentRenderer;
            RichNode agreement = fancyAgreement.getAgreement();
            c276002.label = 2;
            obj = contentRenderer.render(agreement, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadMarkdown$lambda$2(RhyAgreementDuxo rhyAgreementDuxo, final PrecomputedTextCompat precomputedTextCompat) {
        rhyAgreementDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementDuxo.loadMarkdown$lambda$2$lambda$1(precomputedTextCompat, (RhyAgreementState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyAgreementState loadMarkdown$lambda$2$lambda$1(PrecomputedTextCompat precomputedTextCompat, RhyAgreementState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new RhyAgreementState.AgreementLoaded(new UiEvent(precomputedTextCompat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadMarkdown$lambda$4(RhyAgreementDuxo rhyAgreementDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rhyAgreementDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementDuxo.loadMarkdown$lambda$4$lambda$3(throwable, (RhyAgreementState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyAgreementState loadMarkdown$lambda$4$lambda$3(Throwable th, RhyAgreementState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new RhyAgreementState.Error(new UiEvent(th));
    }

    public final void reportUserSignedAgreement() {
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementDuxo.reportUserSignedAgreement$lambda$5((RhyAgreementState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxCompletable$default(this, null, new C276012(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAgreementDuxo.reportUserSignedAgreement$lambda$7(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementDuxo.reportUserSignedAgreement$lambda$9(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyAgreementState reportUserSignedAgreement$lambda$5(RhyAgreementState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyAgreementState.Loading.INSTANCE;
    }

    /* compiled from: RhyAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$reportUserSignedAgreement$2", m3645f = "RhyAgreementDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$reportUserSignedAgreement$2 */
    static final class C276012 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C276012(Continuation<? super C276012> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyAgreementDuxo.this.new C276012(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C276012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Identi identi2 = RhyAgreementDuxo.this.identi;
                Companion companion = RhyAgreementDuxo.INSTANCE;
                ApiUserAgreement.Request request = new ApiUserAgreement.Request(((RhyAgreementFragment.Args) companion.getArgs((HasSavedState) RhyAgreementDuxo.this)).getAgreementBrief().getId(), boxing.boxInt(((RhyAgreementFragment.Args) companion.getArgs((HasSavedState) RhyAgreementDuxo.this)).getAgreementBrief().getVersion()));
                this.label = 1;
                if (identi2.agreeToUserAgreement(request, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportUserSignedAgreement$lambda$7(RhyAgreementDuxo rhyAgreementDuxo) {
        rhyAgreementDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementDuxo.reportUserSignedAgreement$lambda$7$lambda$6((RhyAgreementState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyAgreementState reportUserSignedAgreement$lambda$7$lambda$6(RhyAgreementState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyAgreementState.AgreementAcceptanceReported.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportUserSignedAgreement$lambda$9(RhyAgreementDuxo rhyAgreementDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rhyAgreementDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementDuxo.reportUserSignedAgreement$lambda$9$lambda$8(throwable, (RhyAgreementState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyAgreementState reportUserSignedAgreement$lambda$9$lambda$8(Throwable th, RhyAgreementState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new RhyAgreementState.Error(new UiEvent(th));
    }

    public final void submitApplication() {
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementDuxo.submitApplication$lambda$10((RhyAgreementState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RhyApplicationStore.submitRhyApplication$default(this.rhyApplicationStore, false, 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAgreementDuxo.submitApplication$lambda$12(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementDuxo.submitApplication$lambda$14(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyAgreementState submitApplication$lambda$10(RhyAgreementState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new RhyAgreementState.ApplicationSubmitted(true, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitApplication$lambda$12(RhyAgreementDuxo rhyAgreementDuxo) {
        rhyAgreementDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementDuxo.submitApplication$lambda$12$lambda$11((RhyAgreementState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyAgreementState submitApplication$lambda$12$lambda$11(RhyAgreementState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new RhyAgreementState.ApplicationSubmitted(false, null, new UiEvent(Unit.INSTANCE), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitApplication$lambda$14(RhyAgreementDuxo rhyAgreementDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rhyAgreementDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementDuxo.submitApplication$lambda$14$lambda$13(throwable, (RhyAgreementState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyAgreementState submitApplication$lambda$14$lambda$13(Throwable th, RhyAgreementState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new RhyAgreementState.ApplicationSubmitted(false, new UiEvent(th), null, 4, null);
    }

    /* compiled from: RhyAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/contentful/model/AssetResource$File;", "Lcom/robinhood/contentful/model/AssetDetail;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$downloadAgreement$1", m3645f = "RhyAgreementDuxo.kt", m3646l = {125, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo$downloadAgreement$1 */
    static final class C275981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AssetResource.File<? extends AssetDetail>>, Object> {
        int label;

        C275981(Continuation<? super C275981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyAgreementDuxo.this.new C275981(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AssetResource.File<? extends AssetDetail>> continuation) {
            return ((C275981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
        
            if (r11 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C275981 c275981;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = RhyAgreementDuxo.this.staticContentStore;
                ResourceLink<EntryResource<FancyAgreement>> resourceLink = ((RhyAgreementFragment.Args) RhyAgreementDuxo.INSTANCE.getArgs((HasSavedState) RhyAgreementDuxo.this)).getAgreementBrief().getResourceLink();
                this.label = 1;
                obj = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, this, 2, null);
                c275981 = this;
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((AssetResource) obj).getContent().getFile();
            }
            ResultKt.throwOnFailure(obj);
            c275981 = this;
            ResourceLink<AssetResource<?>> exportContent = ((FancyAgreement) ((EntryResource) obj).getValue()).getExportContent();
            StaticContentStore staticContentStore2 = RhyAgreementDuxo.this.staticContentStore;
            c275981.label = 2;
            obj = ContentRepository.DefaultImpls.load$default(staticContentStore2, exportContent, null, c275981, 2, null);
        }
    }

    public final Single<Tuples2<AssetResource.File<? extends AssetDetail>, File>> downloadAgreement(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        Single<Tuples2<AssetResource.File<? extends AssetDetail>, File>> singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C275981(null), 1, null).flatMap(new Function() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo.downloadAgreement.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples2<AssetResource.File<? extends AssetDetail>, File>> apply(final AssetResource.File<? extends AssetDetail> assetFile) {
                Intrinsics.checkNotNullParameter(assetFile, "assetFile");
                final File file = new File(externalFilesDir, assetFile.getFileName());
                return Single.create(new DownloadManagerOnSubscribe(context, assetFile.getUrl(), file, false, 8, null)).map(new Function() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementDuxo.downloadAgreement.2.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<AssetResource.File<? extends AssetDetail>, File> apply(File it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Tuples4.m3642to(assetFile, file);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    /* compiled from: RhyAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementDuxo;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementFragment$Args;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RhyAgreementDuxo, RhyAgreementFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RhyAgreementFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RhyAgreementFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RhyAgreementFragment.Args getArgs(RhyAgreementDuxo rhyAgreementDuxo) {
            return (RhyAgreementFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, rhyAgreementDuxo);
        }
    }
}
