package com.robinhood.android.rhymigration.p245ui;

import android.app.Application;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.rhymigration.CmSunsetIncentiveExperiment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.rhymigration.model.Bound;
import com.robinhood.android.rhymigration.model.UiFancyAgreementBrief;
import com.robinhood.android.rhymigration.model.UiRhyMigration;
import com.robinhood.android.rhymigration.model.UiRhyMigrationCardPage;
import com.robinhood.android.rhymigration.model.UiRhyMigrationCmShutdown;
import com.robinhood.android.rhymigration.model.UiRhyMigrationCmShutdownUpsell;
import com.robinhood.android.rhymigration.model.UiRhyMigrationContrastPage;
import com.robinhood.android.rhymigration.model.UiRhyMigrationFeaturePage;
import com.robinhood.android.rhymigration.model.UiRhyMigrationLoadingAnimation;
import com.robinhood.android.rhymigration.model.UiRhyMigrationReviewPage;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoadingDuxo;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.CmSunsetExperiment;
import com.robinhood.librobinhood.CmSunsetExperiment2;
import com.robinhood.librobinhood.CmSunsetExperiment3;
import com.robinhood.librobinhood.CmSunsetExperiment4;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.RhyApplicationStore;
import com.robinhood.models.api.minerva.RhyMigrationVariables;
import com.robinhood.staticcontent.model.FancyAgreement;
import com.robinhood.staticcontent.model.IdentifiableTitleAndBody;
import com.robinhood.staticcontent.model.MobileContentPage;
import com.robinhood.staticcontent.model.TitleAndBody;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import com.robinhood.staticcontent.model.rhymigration.RhyMigration;
import com.robinhood.staticcontent.model.rhymigration.RhyMigrationCardPage;
import com.robinhood.staticcontent.model.rhymigration.RhyMigrationCmShutdownUpsell;
import com.robinhood.staticcontent.model.rhymigration.RhyMigrationContrastPage;
import com.robinhood.staticcontent.model.rhymigration.RhyMigrationFeaturePage;
import com.robinhood.staticcontent.model.rhymigration.RhyMigrationLoadingAnimation;
import com.robinhood.staticcontent.model.rhymigration.RhyMigrationReviewPage;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Supervisor3;

/* compiled from: RhyOnboardingLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u001dJ \u0010\u001e\u001a\u00020\u001f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 H\u0083@¢\u0006\u0004\b#\u0010$J \u0010\u001e\u001a\u00020%*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0!0 H\u0083@¢\u0006\u0004\b'\u0010$J \u0010\u001e\u001a\u00020(*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0!0 H\u0083@¢\u0006\u0004\b*\u0010$J \u0010\u001e\u001a\u00020+*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0!0 H\u0083@¢\u0006\u0004\b-\u0010$J \u0010\u001e\u001a\u00020.*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0!0 H\u0083@¢\u0006\u0004\b0\u0010$J \u0010\u001e\u001a\u000201*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020!0 H\u0083@¢\u0006\u0004\b3\u0010$J \u0010\u001e\u001a\u000204*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050!0 H\u0083@¢\u0006\u0004\b6\u0010$J \u0010\u001e\u001a\u000207*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080!0 H\u0083@¢\u0006\u0004\b9\u0010$J\u001c\u0010:\u001a\u00020\u0013*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030;0 H\u0082@¢\u0006\u0002\u0010$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingViewState;", "app", "Landroid/app/Application;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "rhyApplicationStore", "Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Landroid/app/Application;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "getContentfulModel", "Lio/reactivex/Observable;", "Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", "contentfulResourceId", "", "getContentfulOverrides", "", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "onCreate", "", "assetsToPrefetch", "getAssetsToPrefetch", "(Lcom/robinhood/android/rhymigration/model/UiRhyMigration;)Ljava/util/List;", "loadRhyMigration", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationFeaturePage;", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationFeaturePage;", "loadRhyMigrationFeaturePage", "(Lcom/robinhood/contentful/model/ResourceLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationReviewPage;", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationReviewPage;", "loadRhyMigrationReviewPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCardPage;", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationCardPage;", "loadRhyMigrationCardPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCmShutdown;", "Lcom/robinhood/staticcontent/model/MobileContentPage;", "loadMobileContentPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCmShutdownUpsell;", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationCmShutdownUpsell;", "loadCmShutdownUpsellPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationContrastPage;", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationContrastPage;", "loadRhyMigrationContrastPage", "Lcom/robinhood/android/rhymigration/model/UiFancyAgreementBrief;", "Lcom/robinhood/staticcontent/model/FancyAgreement;", "loadFancyAgreement", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationLoadingAnimation;", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationLoadingAnimation;", "loadRhyMigrationLoadingAnimation", "getAssetUrlString", "Lcom/robinhood/contentful/model/AssetResource;", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyOnboardingLoadingDuxo extends OldBaseDuxo<RhyOnboardingLoadingViewState> {
    private static final String RHY_INCENTIVES_OVERRIDES = "3blvcJwvm1UCguTTGIlCRl";
    private static final String RHY_MIGRATION_CONTENTFUL_ENTRY_ID = "5y4RjYx9fyKAKQKz0wSIkh";
    private static final String RHY_MIGRATION_CONTENTFUL_ENTRY_ID_V2_SOFT = "5mSDrEVzOQ2exnpyqxS6CR";
    private static final String RHY_MIGRATION_CONTENTFUL_ENTRY_ID_V2_STRONG = "1dC8jD1F9CPL6YQcVaPOCM";
    private final Application app;
    private final ExperimentsStore experimentsStore;
    private final MinervaAccountStore minervaAccountStore;
    private final RhyApplicationStore rhyApplicationStore;
    private final StaticContentStore staticContentStore;
    public static final int $stable = 8;

    /* compiled from: RhyOnboardingLoadingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo", m3645f = "RhyOnboardingLoadingDuxo.kt", m3646l = {412}, m3647m = "getAssetUrlString")
    /* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$getAssetUrlString$1 */
    static final class C275811 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C275811(Continuation<? super C275811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhyOnboardingLoadingDuxo.this.getAssetUrlString(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyOnboardingLoadingDuxo(Application app, StaticContentStore staticContentStore, RhyApplicationStore rhyApplicationStore, MinervaAccountStore minervaAccountStore, ExperimentsStore experimentsStore) {
        super(new RhyOnboardingLoadingViewState(null, null, null, null, null, null, 63, null), null, 2, null);
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(rhyApplicationStore, "rhyApplicationStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.app = app;
        this.staticContentStore = staticContentStore;
        this.rhyApplicationStore = rhyApplicationStore;
        this.minervaAccountStore = minervaAccountStore;
        this.experimentsStore = experimentsStore;
    }

    /* compiled from: RhyOnboardingLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$getContentfulModel$1", m3645f = "RhyOnboardingLoadingDuxo.kt", m3646l = {64, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$getContentfulModel$1 */
    static final class C275821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiRhyMigration>, Object> {
        final /* synthetic */ String $contentfulResourceId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C275821(String str, Continuation<? super C275821> continuation) {
            super(2, continuation);
            this.$contentfulResourceId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C275821 c275821 = RhyOnboardingLoadingDuxo.this.new C275821(this.$contentfulResourceId, continuation);
            c275821.L$0 = obj;
            return c275821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiRhyMigration> continuation) {
            return ((C275821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo = RhyOnboardingLoadingDuxo.this;
                String str = this.$contentfulResourceId;
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = rhyOnboardingLoadingDuxo.loadRhyMigration(str, this);
                if (obj != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                UiRhyMigration uiRhyMigration = (UiRhyMigration) this.L$0;
                ResultKt.throwOnFailure(obj);
                return uiRhyMigration;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = coroutineScope;
            UiRhyMigration uiRhyMigration2 = (UiRhyMigration) obj;
            List assetsToPrefetch = RhyOnboardingLoadingDuxo.this.getAssetsToPrefetch(uiRhyMigration2);
            RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo2 = RhyOnboardingLoadingDuxo.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(assetsToPrefetch, 10));
            Iterator it = assetsToPrefetch.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new RhyOnboardingLoadingDuxo$getContentfulModel$1$1$1(rhyOnboardingLoadingDuxo2, (String) it.next(), null), 3, null));
            }
            this.L$0 = uiRhyMigration2;
            this.label = 2;
            return Await2.awaitAll(arrayList, this) == coroutine_suspended ? coroutine_suspended : uiRhyMigration2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<UiRhyMigration> getContentfulModel(String contentfulResourceId) {
        Observable<UiRhyMigration> observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C275821(contentfulResourceId, null), 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* compiled from: RhyOnboardingLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$getContentfulOverrides$1", m3645f = "RhyOnboardingLoadingDuxo.kt", m3646l = {78}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$getContentfulOverrides$1 */
    static final class C275831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends ProductMarketing.Feature>>, Object> {
        int label;

        C275831(Continuation<? super C275831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyOnboardingLoadingDuxo.this.new C275831(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ProductMarketing.Feature>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<ProductMarketing.Feature>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ProductMarketing.Feature>> continuation) {
            return ((C275831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: RhyOnboardingLoadingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$getContentfulOverrides$1$1", m3645f = "RhyOnboardingLoadingDuxo.kt", m3646l = {79, 81}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$getContentfulOverrides$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends ProductMarketing.Feature>>, Object> {
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ RhyOnboardingLoadingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = rhyOnboardingLoadingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ProductMarketing.Feature>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<ProductMarketing.Feature>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ProductMarketing.Feature>> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
            
                if (r11 == r0) goto L18;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0092 -> B:20:0x0093). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AnonymousClass1 anonymousClass1;
                RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo;
                Collection arrayList;
                Iterator it;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StaticContentStore staticContentStore = this.this$0.staticContentStore;
                    this.label = 1;
                    anonymousClass1 = this;
                    obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, RhyOnboardingLoadingDuxo.RHY_INCENTIVES_OVERRIDES, null, anonymousClass1, 2, null);
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = (Collection) this.L$3;
                    it = (Iterator) this.L$2;
                    Collection collection = (Collection) this.L$1;
                    rhyOnboardingLoadingDuxo = (RhyOnboardingLoadingDuxo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                    arrayList.add((ProductMarketing.Feature) ((EntryResource) obj).getValue());
                    arrayList = collection;
                    if (it.hasNext()) {
                        ResourceLink resourceLink = (ResourceLink) it.next();
                        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                        RhyOnboardingLoadingDuxo$getContentfulOverrides$1$1$1$1 rhyOnboardingLoadingDuxo$getContentfulOverrides$1$1$1$1 = new RhyOnboardingLoadingDuxo$getContentfulOverrides$1$1$1$1(rhyOnboardingLoadingDuxo, resourceLink, null);
                        anonymousClass1.L$0 = rhyOnboardingLoadingDuxo;
                        anonymousClass1.L$1 = arrayList;
                        anonymousClass1.L$2 = it;
                        anonymousClass1.L$3 = arrayList;
                        anonymousClass1.label = 2;
                        obj = BuildersKt.withContext(coroutineDispatcher, rhyOnboardingLoadingDuxo$getContentfulOverrides$1$1$1$1, this);
                        if (obj != coroutine_suspended) {
                            collection = arrayList;
                            arrayList.add((ProductMarketing.Feature) ((EntryResource) obj).getValue());
                            arrayList = collection;
                            if (it.hasNext()) {
                                return (List) arrayList;
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                List<ResourceLink<EntryResource<ProductMarketing.Feature>>> features = ((ProductMarketing) ((EntryResource) obj).getValue()).getFeatures();
                RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo2 = anonymousClass1.this$0;
                rhyOnboardingLoadingDuxo = rhyOnboardingLoadingDuxo2;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(features, 10));
                it = features.iterator();
                if (it.hasNext()) {
                }
            }
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(RhyOnboardingLoadingDuxo.this, null);
            this.label = 1;
            Object objSupervisorScope = Supervisor3.supervisorScope(anonymousClass1, this);
            return objSupervisorScope == coroutine_suspended ? coroutine_suspended : objSupervisorScope;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<List<ProductMarketing.Feature>> getContentfulOverrides() {
        Observable<List<ProductMarketing.Feature>> observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C275831(null), 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observable observableFlatMap = Observables.INSTANCE.combineLatest(ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, CmSunsetExperiment.INSTANCE, CmSunsetExperiment2.CONTROL, false, 4, null), ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, CmSunsetExperiment3.INSTANCE, CmSunsetExperiment4.CONTROL, false, 4, null)).onErrorResumeNext(Observable.just(Tuples4.m3642to(CmSunsetExperiment2.COHORT2, CmSunsetExperiment4.f5264V1))).map(new Function() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo.onCreate.1

            /* compiled from: RhyOnboardingLoadingDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$onCreate$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CmSunsetExperiment4.values().length];
                    try {
                        iArr[CmSunsetExperiment4.f5264V1.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CmSunsetExperiment4.f5265V2.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final String apply(Tuples2<? extends CmSunsetExperiment2, ? extends CmSunsetExperiment4> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                CmSunsetExperiment2 cmSunsetExperiment2Component1 = tuples2.component1();
                CmSunsetExperiment4 cmSunsetExperiment4Component2 = tuples2.component2();
                if (!cmSunsetExperiment2Component1.isCohortOneOrLater()) {
                    return RhyOnboardingLoadingDuxo.RHY_MIGRATION_CONTENTFUL_ENTRY_ID;
                }
                int i = WhenMappings.$EnumSwitchMapping$0[cmSunsetExperiment4Component2.ordinal()];
                if (i != 1) {
                    return i != 2 ? RhyOnboardingLoadingDuxo.RHY_MIGRATION_CONTENTFUL_ENTRY_ID : RhyOnboardingLoadingDuxo.RHY_MIGRATION_CONTENTFUL_ENTRY_ID_V2_STRONG;
                }
                return RhyOnboardingLoadingDuxo.RHY_MIGRATION_CONTENTFUL_ENTRY_ID_V2_SOFT;
            }
        }).flatMap(new Function() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo.onCreate.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiRhyMigration> apply(String contentfulId) {
                Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
                return RhyOnboardingLoadingDuxo.this.getContentfulModel(contentfulId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.retryExponential(observableFlatMap, 3, new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(RhyOnboardingLoadingDuxo.onCreate$lambda$0((Throwable) obj));
            }
        }), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingLoadingDuxo.onCreate$lambda$2(this.f$0, (UiRhyMigration) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingLoadingDuxo.onCreate$lambda$4(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        Observable observableFlatMap2 = ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, CmSunsetIncentiveExperiment.INSTANCE, CmSunsetIncentiveExperiment.Variant.CONTROL, false, 4, null).flatMap(new C275876());
        Intrinsics.checkNotNullExpressionValue(observableFlatMap2, "flatMap(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.retryExponential(observableFlatMap2, 3, new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(RhyOnboardingLoadingDuxo.onCreate$lambda$5((Throwable) obj));
            }
        }), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingLoadingDuxo.onCreate$lambda$7(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingLoadingDuxo.onCreate$lambda$8((Throwable) obj);
            }
        }, null, null, 12, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.rhyApplicationStore.getEligibility(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingLoadingDuxo.onCreate$lambda$10(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingLoadingDuxo.onCreate$lambda$12(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Throwables.isNetworkRelated(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo, final UiRhyMigration uiRhyMigration) {
        rhyOnboardingLoadingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingLoadingDuxo.onCreate$lambda$2$lambda$1(uiRhyMigration, (RhyOnboardingLoadingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingLoadingViewState onCreate$lambda$2$lambda$1(UiRhyMigration uiRhyMigration, RhyOnboardingLoadingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingLoadingViewState.copy$default(applyMutation, null, null, null, null, uiRhyMigration, null, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, throwable, false, null, 6, null);
        rhyOnboardingLoadingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingLoadingDuxo.onCreate$lambda$4$lambda$3(throwable, (RhyOnboardingLoadingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingLoadingViewState onCreate$lambda$4$lambda$3(Throwable th, RhyOnboardingLoadingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingLoadingViewState.copy$default(applyMutation, th, null, null, null, null, null, 62, null);
    }

    /* compiled from: RhyOnboardingLoadingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$onCreate$6 */
    static final class C275876<T, R> implements Function {
        C275876() {
        }

        @Override // io.reactivex.functions.Function
        public final ObservableSource<? extends List<ProductMarketing.Feature>> apply(final CmSunsetIncentiveExperiment.Variant it) {
            Intrinsics.checkNotNullParameter(it, "it");
            RhyOnboardingLoadingDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$onCreate$6$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingLoadingDuxo.C275876.apply$lambda$0(it, (RhyOnboardingLoadingViewState) obj);
                }
            });
            if (it.isInExperiment()) {
                return RhyOnboardingLoadingDuxo.this.getContentfulOverrides();
            }
            Observable observableJust = Observable.just(CollectionsKt.emptyList());
            Intrinsics.checkNotNull(observableJust);
            return observableJust;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RhyOnboardingLoadingViewState apply$lambda$0(CmSunsetIncentiveExperiment.Variant variant, RhyOnboardingLoadingViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RhyOnboardingLoadingViewState.copy$default(applyMutation, null, null, null, variant, null, null, 55, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$5(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Throwables.isNetworkRelated(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo, final List list) {
        rhyOnboardingLoadingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingLoadingDuxo.onCreate$lambda$7$lambda$6(list, (RhyOnboardingLoadingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingLoadingViewState onCreate$lambda$7$lambda$6(List list, RhyOnboardingLoadingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingLoadingViewState.copy$default(applyMutation, null, null, null, null, null, list, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$10(RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo, final boolean z) {
        rhyOnboardingLoadingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingLoadingDuxo.onCreate$lambda$10$lambda$9(z, (RhyOnboardingLoadingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingLoadingViewState onCreate$lambda$10$lambda$9(boolean z, RhyOnboardingLoadingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingLoadingViewState.copy$default(applyMutation, null, Boolean.valueOf(z), null, null, null, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$12(RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, throwable, false, null, 6, null);
        rhyOnboardingLoadingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingLoadingDuxo.onCreate$lambda$12$lambda$11(throwable, (RhyOnboardingLoadingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingLoadingViewState onCreate$lambda$12$lambda$11(Throwable th, RhyOnboardingLoadingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingLoadingViewState.copy$default(applyMutation, th, null, null, null, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> getAssetsToPrefetch(UiRhyMigration uiRhyMigration) {
        return CollectionsKt.listOf((Object[]) new String[]{uiRhyMigration.getFeaturePage1().getAnimationAsset(), uiRhyMigration.getFeaturePage2().getAnimationAsset(), uiRhyMigration.getContrastPage().getAnimationAsset(), uiRhyMigration.getContrastPage().getAnimationAssetSmallDevice(), uiRhyMigration.getContrastPage().getAnimationAssetDark(), uiRhyMigration.getContrastPage().getAnimationAssetSmallDeviceDark(), uiRhyMigration.getReviewPage().getAnimationAsset(), uiRhyMigration.getLoadingAnimation().getAnimationAsset(), uiRhyMigration.getCardPage().getAnimationAsset()});
    }

    /* compiled from: RhyOnboardingLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$loadRhyMigration$2", m3645f = "RhyOnboardingLoadingDuxo.kt", m3646l = {192, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE, EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 224}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingDuxo$loadRhyMigration$2 */
    static final class C275842 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiRhyMigration>, Object> {
        final /* synthetic */ String $contentfulResourceId;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C275842(String str, Continuation<? super C275842> continuation) {
            super(2, continuation);
            this.$contentfulResourceId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C275842 c275842 = RhyOnboardingLoadingDuxo.this.new C275842(this.$contentfulResourceId, continuation);
            c275842.L$0 = obj;
            return c275842;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiRhyMigration> continuation) {
            return ((C275842) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0296 A[PHI: r0 r1 r2
          0x0296: PHI (r0v12 com.robinhood.staticcontent.model.rhymigration.RhyMigration) = 
          (r0v8 com.robinhood.staticcontent.model.rhymigration.RhyMigration)
          (r0v16 com.robinhood.staticcontent.model.rhymigration.RhyMigration)
         binds: [B:26:0x02dd, B:18:0x0289] A[DONT_GENERATE, DONT_INLINE]
          0x0296: PHI (r1v4 kotlinx.coroutines.CoroutineScope) = (r1v2 kotlinx.coroutines.CoroutineScope), (r1v9 kotlinx.coroutines.CoroutineScope) binds: [B:26:0x02dd, B:18:0x0289] A[DONT_GENERATE, DONT_INLINE]
          0x0296: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v12 java.lang.Object) binds: [B:26:0x02dd, B:18:0x0289] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x02ea  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x02ef  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x03bf  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x03ec  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0420  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x044f  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0482  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x04b0  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x04e3  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x050f  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0541  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x056b  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x059b  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objLoadEntry$default;
            CoroutineScope coroutineScope;
            RhyMigration rhyMigration;
            Object rhyMigrationVariables;
            Deferred deferredAsync$default;
            Deferred deferred;
            Object objAwait;
            Deferred deferred2;
            Deferred deferred3;
            RhyMigrationVariables rhyMigrationVariables2;
            Deferred deferred4;
            Deferred deferred5;
            Deferred deferred6;
            Deferred deferred7;
            Deferred deferred8;
            Deferred deferred9;
            Object objAwait2;
            Deferred deferred10;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage;
            Deferred deferred11;
            Deferred deferred12;
            Deferred deferred13;
            Deferred deferred14;
            Deferred deferred15;
            Deferred deferred16;
            Object objAwait3;
            Deferred deferred17;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage2;
            Deferred deferred18;
            Deferred deferred19;
            Deferred deferred20;
            Deferred deferred21;
            Deferred deferred22;
            Deferred deferred23;
            Deferred deferred24;
            Object objAwait4;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage3;
            Deferred deferred25;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage4;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage5;
            RhyMigrationVariables rhyMigrationVariables3;
            Deferred deferred26;
            Deferred deferred27;
            Deferred deferred28;
            Deferred deferred29;
            Deferred deferred30;
            Object objAwait5;
            Deferred deferred31;
            UiRhyMigrationContrastPage uiRhyMigrationContrastPage;
            Deferred deferred32;
            Deferred deferred33;
            Deferred deferred34;
            Deferred deferred35;
            Deferred deferred36;
            Object objAwait6;
            UiRhyMigrationContrastPage uiRhyMigrationContrastPage2;
            Deferred deferred37;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage6;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage7;
            UiRhyMigrationReviewPage uiRhyMigrationReviewPage;
            Deferred deferred38;
            Deferred deferred39;
            Deferred deferred40;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage8;
            Object objAwait7;
            Deferred deferred41;
            UiRhyMigrationCardPage uiRhyMigrationCardPage;
            Deferred deferred42;
            Deferred deferred43;
            Deferred deferred44;
            Object objAwait8;
            UiRhyMigrationCardPage uiRhyMigrationCardPage2;
            Deferred deferred45;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage9;
            UiRhyMigrationContrastPage uiRhyMigrationContrastPage3;
            UiRhyMigrationReviewPage uiRhyMigrationReviewPage2;
            UiFancyAgreementBrief uiFancyAgreementBrief;
            Deferred deferred46;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage10;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage11;
            Object objAwait9;
            Deferred deferred47;
            UiFancyAgreementBrief uiFancyAgreementBrief2;
            Deferred deferred48;
            RhyMigrationVariables rhyMigrationVariables4;
            Object objAwait10;
            UiFancyAgreementBrief uiFancyAgreementBrief3;
            UiRhyMigrationCardPage uiRhyMigrationCardPage3;
            UiRhyMigrationLoadingAnimation uiRhyMigrationLoadingAnimation;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage12;
            UiRhyMigrationContrastPage uiRhyMigrationContrastPage4;
            UiFancyAgreementBrief uiFancyAgreementBrief4;
            RhyMigrationVariables rhyMigrationVariables5;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage13;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage14;
            UiRhyMigrationReviewPage uiRhyMigrationReviewPage3;
            Object objAwait11;
            UiRhyMigrationCardPage uiRhyMigrationCardPage4;
            UiRhyMigrationCmShutdownUpsell uiRhyMigrationCmShutdownUpsell;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage15;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    StaticContentStore staticContentStore = RhyOnboardingLoadingDuxo.this.staticContentStore;
                    String str = this.$contentfulResourceId;
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, str, null, this, 2, null);
                    if (objLoadEntry$default != coroutine_suspended) {
                        coroutineScope = coroutineScope2;
                        rhyMigration = (RhyMigration) ((EntryResource) objLoadEntry$default).getValue();
                        MinervaAccountStore minervaAccountStore = RhyOnboardingLoadingDuxo.this.minervaAccountStore;
                        this.L$0 = coroutineScope;
                        this.L$1 = rhyMigration;
                        this.label = 2;
                        rhyMigrationVariables = minervaAccountStore.getRhyMigrationVariables(this);
                        if (rhyMigrationVariables != coroutine_suspended) {
                            CoroutineScope coroutineScope3 = coroutineScope;
                            RhyMigrationVariables rhyMigrationVariables6 = (RhyMigrationVariables) rhyMigrationVariables;
                            ResourceLink<EntryResource<RhyMigrationCardPage>> cardPageAndroidVirtual = !rhyMigrationVariables6.getVirtual_card_first() ? rhyMigration.getCardPageAndroidVirtual() : rhyMigration.getCardPageAndroidPhysical();
                            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$page1$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                            Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$page2$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$page3$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                            Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$contrastPage$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                            Deferred deferredAsync$default5 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$reviewPage$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                            Deferred deferredAsync$default6 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$cardPage$1(RhyOnboardingLoadingDuxo.this, cardPageAndroidVirtual, null), 3, null);
                            Deferred deferredAsync$default7 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$agreement1$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                            Deferred deferredAsync$default8 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$agreement2$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                            Deferred deferredAsync$default9 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$loadingAnimation$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                            Deferred deferredAsync$default10 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$upsellPage$1(rhyMigration, RhyOnboardingLoadingDuxo.this, null), 3, null);
                            Deferred deferredAsync$default11 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$optOutPage$1(rhyMigration, RhyOnboardingLoadingDuxo.this, null), 3, null);
                            this.L$0 = rhyMigrationVariables6;
                            this.L$1 = deferredAsync$default3;
                            this.L$2 = deferredAsync$default;
                            this.L$3 = deferredAsync$default4;
                            this.L$4 = deferredAsync$default5;
                            this.L$5 = deferredAsync$default6;
                            this.L$6 = deferredAsync$default7;
                            deferred = deferredAsync$default8;
                            this.L$7 = deferred;
                            this.L$8 = deferredAsync$default9;
                            this.L$9 = deferredAsync$default10;
                            this.L$10 = deferredAsync$default11;
                            this.label = 3;
                            objAwait = deferredAsync$default2.await(this);
                            if (objAwait != coroutine_suspended) {
                                deferred2 = deferredAsync$default5;
                                deferred3 = deferredAsync$default9;
                                rhyMigrationVariables2 = rhyMigrationVariables6;
                                deferred4 = deferredAsync$default3;
                                deferred5 = deferredAsync$default10;
                                deferred6 = deferredAsync$default11;
                                deferred7 = deferredAsync$default7;
                                deferred8 = deferredAsync$default6;
                                deferred9 = deferredAsync$default4;
                                UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage16 = (UiRhyMigrationFeaturePage) objAwait;
                                this.L$0 = rhyMigrationVariables2;
                                this.L$1 = deferredAsync$default;
                                this.L$2 = deferred9;
                                this.L$3 = deferred2;
                                this.L$4 = deferred8;
                                this.L$5 = deferred7;
                                this.L$6 = deferred;
                                this.L$7 = deferred3;
                                this.L$8 = deferred5;
                                this.L$9 = deferred6;
                                this.L$10 = uiRhyMigrationFeaturePage16;
                                this.label = 4;
                                objAwait2 = deferred4.await(this);
                                if (objAwait2 != coroutine_suspended) {
                                    Deferred deferred49 = deferred3;
                                    deferred10 = deferred5;
                                    uiRhyMigrationFeaturePage = uiRhyMigrationFeaturePage16;
                                    deferred11 = deferred49;
                                    Deferred deferred50 = deferred8;
                                    deferred12 = deferred7;
                                    deferred13 = deferred;
                                    deferred14 = deferred50;
                                    Deferred deferred51 = deferred2;
                                    deferred15 = deferred9;
                                    deferred16 = deferred51;
                                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage17 = (UiRhyMigrationFeaturePage) objAwait2;
                                    this.L$0 = rhyMigrationVariables2;
                                    this.L$1 = deferred15;
                                    this.L$2 = deferred16;
                                    this.L$3 = deferred14;
                                    this.L$4 = deferred12;
                                    this.L$5 = deferred13;
                                    this.L$6 = deferred11;
                                    this.L$7 = deferred10;
                                    this.L$8 = deferred6;
                                    this.L$9 = uiRhyMigrationFeaturePage;
                                    this.L$10 = uiRhyMigrationFeaturePage17;
                                    this.label = 5;
                                    objAwait3 = deferredAsync$default.await(this);
                                    if (objAwait3 != coroutine_suspended) {
                                        Deferred deferred52 = deferred10;
                                        deferred17 = deferred6;
                                        uiRhyMigrationFeaturePage2 = uiRhyMigrationFeaturePage17;
                                        deferred18 = deferred15;
                                        deferred19 = deferred16;
                                        deferred20 = deferred14;
                                        deferred21 = deferred12;
                                        deferred22 = deferred13;
                                        deferred23 = deferred11;
                                        deferred24 = deferred52;
                                        UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage18 = (UiRhyMigrationFeaturePage) objAwait3;
                                        this.L$0 = rhyMigrationVariables2;
                                        this.L$1 = deferred19;
                                        this.L$2 = deferred20;
                                        this.L$3 = deferred21;
                                        this.L$4 = deferred22;
                                        this.L$5 = deferred23;
                                        this.L$6 = deferred24;
                                        this.L$7 = deferred17;
                                        this.L$8 = uiRhyMigrationFeaturePage;
                                        this.L$9 = uiRhyMigrationFeaturePage2;
                                        this.L$10 = uiRhyMigrationFeaturePage18;
                                        this.label = 6;
                                        objAwait4 = deferred18.await(this);
                                        if (objAwait4 != coroutine_suspended) {
                                            Deferred deferred53 = deferred17;
                                            uiRhyMigrationFeaturePage3 = uiRhyMigrationFeaturePage2;
                                            deferred25 = deferred53;
                                            Deferred deferred54 = deferred24;
                                            uiRhyMigrationFeaturePage4 = uiRhyMigrationFeaturePage;
                                            uiRhyMigrationFeaturePage5 = uiRhyMigrationFeaturePage18;
                                            rhyMigrationVariables3 = rhyMigrationVariables2;
                                            deferred26 = deferred20;
                                            deferred27 = deferred21;
                                            deferred28 = deferred22;
                                            deferred29 = deferred23;
                                            deferred30 = deferred54;
                                            UiRhyMigrationContrastPage uiRhyMigrationContrastPage5 = (UiRhyMigrationContrastPage) objAwait4;
                                            this.L$0 = rhyMigrationVariables3;
                                            this.L$1 = deferred26;
                                            this.L$2 = deferred27;
                                            this.L$3 = deferred28;
                                            this.L$4 = deferred29;
                                            this.L$5 = deferred30;
                                            this.L$6 = deferred25;
                                            this.L$7 = uiRhyMigrationFeaturePage4;
                                            this.L$8 = uiRhyMigrationFeaturePage3;
                                            this.L$9 = uiRhyMigrationFeaturePage5;
                                            this.L$10 = uiRhyMigrationContrastPage5;
                                            this.label = 7;
                                            objAwait5 = deferred19.await(this);
                                            if (objAwait5 != coroutine_suspended) {
                                                Deferred deferred55 = deferred30;
                                                deferred31 = deferred25;
                                                uiRhyMigrationContrastPage = uiRhyMigrationContrastPage5;
                                                deferred32 = deferred26;
                                                deferred33 = deferred27;
                                                deferred34 = deferred28;
                                                deferred35 = deferred29;
                                                deferred36 = deferred55;
                                                UiRhyMigrationReviewPage uiRhyMigrationReviewPage4 = (UiRhyMigrationReviewPage) objAwait5;
                                                this.L$0 = rhyMigrationVariables3;
                                                this.L$1 = deferred33;
                                                this.L$2 = deferred34;
                                                this.L$3 = deferred35;
                                                this.L$4 = deferred36;
                                                this.L$5 = deferred31;
                                                this.L$6 = uiRhyMigrationFeaturePage4;
                                                this.L$7 = uiRhyMigrationFeaturePage3;
                                                this.L$8 = uiRhyMigrationFeaturePage5;
                                                this.L$9 = uiRhyMigrationContrastPage;
                                                this.L$10 = uiRhyMigrationReviewPage4;
                                                this.label = 8;
                                                objAwait6 = deferred32.await(this);
                                                if (objAwait6 != coroutine_suspended) {
                                                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage19 = uiRhyMigrationFeaturePage3;
                                                    uiRhyMigrationContrastPage2 = uiRhyMigrationContrastPage;
                                                    deferred37 = deferred31;
                                                    uiRhyMigrationFeaturePage6 = uiRhyMigrationFeaturePage19;
                                                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage20 = uiRhyMigrationFeaturePage4;
                                                    uiRhyMigrationFeaturePage7 = uiRhyMigrationFeaturePage5;
                                                    uiRhyMigrationReviewPage = uiRhyMigrationReviewPage4;
                                                    deferred38 = deferred34;
                                                    deferred39 = deferred35;
                                                    deferred40 = deferred36;
                                                    uiRhyMigrationFeaturePage8 = uiRhyMigrationFeaturePage20;
                                                    UiRhyMigrationCardPage uiRhyMigrationCardPage5 = (UiRhyMigrationCardPage) objAwait6;
                                                    this.L$0 = rhyMigrationVariables3;
                                                    this.L$1 = deferred38;
                                                    this.L$2 = deferred39;
                                                    this.L$3 = deferred40;
                                                    this.L$4 = deferred37;
                                                    this.L$5 = uiRhyMigrationFeaturePage8;
                                                    this.L$6 = uiRhyMigrationFeaturePage6;
                                                    this.L$7 = uiRhyMigrationFeaturePage7;
                                                    this.L$8 = uiRhyMigrationContrastPage2;
                                                    this.L$9 = uiRhyMigrationReviewPage;
                                                    this.L$10 = uiRhyMigrationCardPage5;
                                                    this.label = 9;
                                                    objAwait7 = deferred33.await(this);
                                                    if (objAwait7 != coroutine_suspended) {
                                                        Deferred deferred56 = deferred40;
                                                        deferred41 = deferred37;
                                                        uiRhyMigrationCardPage = uiRhyMigrationCardPage5;
                                                        deferred42 = deferred38;
                                                        deferred43 = deferred39;
                                                        deferred44 = deferred56;
                                                        UiFancyAgreementBrief uiFancyAgreementBrief5 = (UiFancyAgreementBrief) objAwait7;
                                                        this.L$0 = rhyMigrationVariables3;
                                                        this.L$1 = deferred43;
                                                        this.L$2 = deferred44;
                                                        this.L$3 = deferred41;
                                                        this.L$4 = uiRhyMigrationFeaturePage8;
                                                        this.L$5 = uiRhyMigrationFeaturePage6;
                                                        this.L$6 = uiRhyMigrationFeaturePage7;
                                                        this.L$7 = uiRhyMigrationContrastPage2;
                                                        this.L$8 = uiRhyMigrationReviewPage;
                                                        this.L$9 = uiRhyMigrationCardPage;
                                                        this.L$10 = uiFancyAgreementBrief5;
                                                        this.label = 10;
                                                        objAwait8 = deferred42.await(this);
                                                        if (objAwait8 != coroutine_suspended) {
                                                            UiRhyMigrationContrastPage uiRhyMigrationContrastPage6 = uiRhyMigrationContrastPage2;
                                                            uiRhyMigrationCardPage2 = uiRhyMigrationCardPage;
                                                            deferred45 = deferred41;
                                                            uiRhyMigrationFeaturePage9 = uiRhyMigrationFeaturePage6;
                                                            uiRhyMigrationContrastPage3 = uiRhyMigrationContrastPage6;
                                                            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage21 = uiRhyMigrationFeaturePage7;
                                                            uiRhyMigrationReviewPage2 = uiRhyMigrationReviewPage;
                                                            uiFancyAgreementBrief = uiFancyAgreementBrief5;
                                                            deferred46 = deferred44;
                                                            uiRhyMigrationFeaturePage10 = uiRhyMigrationFeaturePage8;
                                                            uiRhyMigrationFeaturePage11 = uiRhyMigrationFeaturePage21;
                                                            UiFancyAgreementBrief uiFancyAgreementBrief6 = (UiFancyAgreementBrief) objAwait8;
                                                            this.L$0 = rhyMigrationVariables3;
                                                            this.L$1 = deferred46;
                                                            this.L$2 = deferred45;
                                                            this.L$3 = uiRhyMigrationFeaturePage10;
                                                            this.L$4 = uiRhyMigrationFeaturePage9;
                                                            this.L$5 = uiRhyMigrationFeaturePage11;
                                                            this.L$6 = uiRhyMigrationContrastPage3;
                                                            this.L$7 = uiRhyMigrationReviewPage2;
                                                            this.L$8 = uiRhyMigrationCardPage2;
                                                            this.L$9 = uiFancyAgreementBrief;
                                                            this.L$10 = uiFancyAgreementBrief6;
                                                            this.label = 11;
                                                            objAwait9 = deferred43.await(this);
                                                            if (objAwait9 != coroutine_suspended) {
                                                                RhyMigrationVariables rhyMigrationVariables7 = rhyMigrationVariables3;
                                                                deferred47 = deferred45;
                                                                uiFancyAgreementBrief2 = uiFancyAgreementBrief6;
                                                                deferred48 = deferred46;
                                                                rhyMigrationVariables4 = rhyMigrationVariables7;
                                                                UiRhyMigrationLoadingAnimation uiRhyMigrationLoadingAnimation2 = (UiRhyMigrationLoadingAnimation) objAwait9;
                                                                this.L$0 = deferred47;
                                                                this.L$1 = uiRhyMigrationFeaturePage10;
                                                                this.L$2 = uiRhyMigrationFeaturePage9;
                                                                this.L$3 = uiRhyMigrationFeaturePage11;
                                                                this.L$4 = uiRhyMigrationContrastPage3;
                                                                this.L$5 = uiRhyMigrationReviewPage2;
                                                                this.L$6 = uiRhyMigrationCardPage2;
                                                                this.L$7 = uiFancyAgreementBrief;
                                                                this.L$8 = uiFancyAgreementBrief2;
                                                                this.L$9 = uiRhyMigrationLoadingAnimation2;
                                                                this.L$10 = rhyMigrationVariables4;
                                                                this.label = 12;
                                                                objAwait10 = deferred48.await(this);
                                                                if (objAwait10 != coroutine_suspended) {
                                                                    UiRhyMigrationReviewPage uiRhyMigrationReviewPage5 = uiRhyMigrationReviewPage2;
                                                                    uiFancyAgreementBrief3 = uiFancyAgreementBrief2;
                                                                    uiRhyMigrationCardPage3 = uiRhyMigrationCardPage2;
                                                                    uiRhyMigrationLoadingAnimation = uiRhyMigrationLoadingAnimation2;
                                                                    uiRhyMigrationFeaturePage12 = uiRhyMigrationFeaturePage9;
                                                                    uiRhyMigrationContrastPage4 = uiRhyMigrationContrastPage3;
                                                                    uiFancyAgreementBrief4 = uiFancyAgreementBrief;
                                                                    rhyMigrationVariables5 = rhyMigrationVariables4;
                                                                    uiRhyMigrationFeaturePage13 = uiRhyMigrationFeaturePage10;
                                                                    uiRhyMigrationFeaturePage14 = uiRhyMigrationFeaturePage11;
                                                                    uiRhyMigrationReviewPage3 = uiRhyMigrationReviewPage5;
                                                                    UiRhyMigrationCmShutdownUpsell uiRhyMigrationCmShutdownUpsell2 = (UiRhyMigrationCmShutdownUpsell) objAwait10;
                                                                    this.L$0 = uiRhyMigrationFeaturePage13;
                                                                    this.L$1 = uiRhyMigrationFeaturePage12;
                                                                    this.L$2 = uiRhyMigrationFeaturePage14;
                                                                    this.L$3 = uiRhyMigrationContrastPage4;
                                                                    this.L$4 = uiRhyMigrationReviewPage3;
                                                                    this.L$5 = uiRhyMigrationCardPage3;
                                                                    this.L$6 = uiFancyAgreementBrief4;
                                                                    this.L$7 = uiFancyAgreementBrief3;
                                                                    this.L$8 = uiRhyMigrationLoadingAnimation;
                                                                    this.L$9 = rhyMigrationVariables5;
                                                                    this.L$10 = uiRhyMigrationCmShutdownUpsell2;
                                                                    this.label = 13;
                                                                    objAwait11 = deferred47.await(this);
                                                                    if (objAwait11 != coroutine_suspended) {
                                                                        uiRhyMigrationCardPage4 = uiRhyMigrationCardPage3;
                                                                        uiRhyMigrationCmShutdownUpsell = uiRhyMigrationCmShutdownUpsell2;
                                                                        uiRhyMigrationFeaturePage15 = uiRhyMigrationFeaturePage13;
                                                                        return new UiRhyMigration(uiRhyMigrationFeaturePage15, uiRhyMigrationFeaturePage12, uiRhyMigrationFeaturePage14, uiRhyMigrationContrastPage4, uiRhyMigrationReviewPage3, uiRhyMigrationCardPage4, uiFancyAgreementBrief4, uiFancyAgreementBrief3, uiRhyMigrationLoadingAnimation, rhyMigrationVariables5, uiRhyMigrationCmShutdownUpsell, (UiRhyMigrationCmShutdown) objAwait11);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope4;
                    objLoadEntry$default = obj;
                    rhyMigration = (RhyMigration) ((EntryResource) objLoadEntry$default).getValue();
                    MinervaAccountStore minervaAccountStore2 = RhyOnboardingLoadingDuxo.this.minervaAccountStore;
                    this.L$0 = coroutineScope;
                    this.L$1 = rhyMigration;
                    this.label = 2;
                    rhyMigrationVariables = minervaAccountStore2.getRhyMigrationVariables(this);
                    if (rhyMigrationVariables != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 2:
                    rhyMigration = (RhyMigration) this.L$1;
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    rhyMigrationVariables = obj;
                    CoroutineScope coroutineScope32 = coroutineScope;
                    RhyMigrationVariables rhyMigrationVariables62 = (RhyMigrationVariables) rhyMigrationVariables;
                    if (!rhyMigrationVariables62.getVirtual_card_first()) {
                    }
                    Deferred deferredAsync$default22 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$page1$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                    Deferred deferredAsync$default32 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$page2$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                    deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$page3$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                    Deferred deferredAsync$default42 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$contrastPage$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                    Deferred deferredAsync$default52 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$reviewPage$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                    Deferred deferredAsync$default62 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$cardPage$1(RhyOnboardingLoadingDuxo.this, cardPageAndroidVirtual, null), 3, null);
                    Deferred deferredAsync$default72 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$agreement1$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                    Deferred deferredAsync$default82 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$agreement2$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                    Deferred deferredAsync$default92 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$loadingAnimation$1(RhyOnboardingLoadingDuxo.this, rhyMigration, null), 3, null);
                    Deferred deferredAsync$default102 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$upsellPage$1(rhyMigration, RhyOnboardingLoadingDuxo.this, null), 3, null);
                    Deferred deferredAsync$default112 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new RhyOnboardingLoadingDuxo$loadRhyMigration$2$optOutPage$1(rhyMigration, RhyOnboardingLoadingDuxo.this, null), 3, null);
                    this.L$0 = rhyMigrationVariables62;
                    this.L$1 = deferredAsync$default32;
                    this.L$2 = deferredAsync$default;
                    this.L$3 = deferredAsync$default42;
                    this.L$4 = deferredAsync$default52;
                    this.L$5 = deferredAsync$default62;
                    this.L$6 = deferredAsync$default72;
                    deferred = deferredAsync$default82;
                    this.L$7 = deferred;
                    this.L$8 = deferredAsync$default92;
                    this.L$9 = deferredAsync$default102;
                    this.L$10 = deferredAsync$default112;
                    this.label = 3;
                    objAwait = deferredAsync$default22.await(this);
                    if (objAwait != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    deferred6 = (Deferred) this.L$10;
                    deferred5 = (Deferred) this.L$9;
                    deferred3 = (Deferred) this.L$8;
                    Deferred deferred57 = (Deferred) this.L$7;
                    deferred7 = (Deferred) this.L$6;
                    deferred8 = (Deferred) this.L$5;
                    Deferred deferred58 = (Deferred) this.L$4;
                    deferred9 = (Deferred) this.L$3;
                    Deferred deferred59 = (Deferred) this.L$2;
                    deferred4 = (Deferred) this.L$1;
                    rhyMigrationVariables2 = (RhyMigrationVariables) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    deferredAsync$default = deferred59;
                    deferred2 = deferred58;
                    deferred = deferred57;
                    objAwait = obj;
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage162 = (UiRhyMigrationFeaturePage) objAwait;
                    this.L$0 = rhyMigrationVariables2;
                    this.L$1 = deferredAsync$default;
                    this.L$2 = deferred9;
                    this.L$3 = deferred2;
                    this.L$4 = deferred8;
                    this.L$5 = deferred7;
                    this.L$6 = deferred;
                    this.L$7 = deferred3;
                    this.L$8 = deferred5;
                    this.L$9 = deferred6;
                    this.L$10 = uiRhyMigrationFeaturePage162;
                    this.label = 4;
                    objAwait2 = deferred4.await(this);
                    if (objAwait2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 4:
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage22 = (UiRhyMigrationFeaturePage) this.L$10;
                    Deferred deferred60 = (Deferred) this.L$9;
                    deferred10 = (Deferred) this.L$8;
                    deferred11 = (Deferred) this.L$7;
                    deferred13 = (Deferred) this.L$6;
                    deferred12 = (Deferred) this.L$5;
                    deferred14 = (Deferred) this.L$4;
                    deferred16 = (Deferred) this.L$3;
                    deferred15 = (Deferred) this.L$2;
                    Deferred deferred61 = (Deferred) this.L$1;
                    rhyMigrationVariables2 = (RhyMigrationVariables) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    uiRhyMigrationFeaturePage = uiRhyMigrationFeaturePage22;
                    deferred6 = deferred60;
                    deferredAsync$default = deferred61;
                    objAwait2 = obj;
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage172 = (UiRhyMigrationFeaturePage) objAwait2;
                    this.L$0 = rhyMigrationVariables2;
                    this.L$1 = deferred15;
                    this.L$2 = deferred16;
                    this.L$3 = deferred14;
                    this.L$4 = deferred12;
                    this.L$5 = deferred13;
                    this.L$6 = deferred11;
                    this.L$7 = deferred10;
                    this.L$8 = deferred6;
                    this.L$9 = uiRhyMigrationFeaturePage;
                    this.L$10 = uiRhyMigrationFeaturePage172;
                    this.label = 5;
                    objAwait3 = deferredAsync$default.await(this);
                    if (objAwait3 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 5:
                    uiRhyMigrationFeaturePage2 = (UiRhyMigrationFeaturePage) this.L$10;
                    uiRhyMigrationFeaturePage = (UiRhyMigrationFeaturePage) this.L$9;
                    deferred17 = (Deferred) this.L$8;
                    deferred24 = (Deferred) this.L$7;
                    deferred23 = (Deferred) this.L$6;
                    deferred22 = (Deferred) this.L$5;
                    deferred21 = (Deferred) this.L$4;
                    deferred20 = (Deferred) this.L$3;
                    deferred19 = (Deferred) this.L$2;
                    deferred18 = (Deferred) this.L$1;
                    rhyMigrationVariables2 = (RhyMigrationVariables) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait3 = obj;
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage182 = (UiRhyMigrationFeaturePage) objAwait3;
                    this.L$0 = rhyMigrationVariables2;
                    this.L$1 = deferred19;
                    this.L$2 = deferred20;
                    this.L$3 = deferred21;
                    this.L$4 = deferred22;
                    this.L$5 = deferred23;
                    this.L$6 = deferred24;
                    this.L$7 = deferred17;
                    this.L$8 = uiRhyMigrationFeaturePage;
                    this.L$9 = uiRhyMigrationFeaturePage2;
                    this.L$10 = uiRhyMigrationFeaturePage182;
                    this.label = 6;
                    objAwait4 = deferred18.await(this);
                    if (objAwait4 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 6:
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage23 = (UiRhyMigrationFeaturePage) this.L$10;
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage24 = (UiRhyMigrationFeaturePage) this.L$9;
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage25 = (UiRhyMigrationFeaturePage) this.L$8;
                    Deferred deferred62 = (Deferred) this.L$7;
                    deferred30 = (Deferred) this.L$6;
                    deferred29 = (Deferred) this.L$5;
                    deferred28 = (Deferred) this.L$4;
                    deferred27 = (Deferred) this.L$3;
                    Deferred deferred63 = (Deferred) this.L$2;
                    Deferred deferred64 = (Deferred) this.L$1;
                    RhyMigrationVariables rhyMigrationVariables8 = (RhyMigrationVariables) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    uiRhyMigrationFeaturePage5 = uiRhyMigrationFeaturePage23;
                    deferred25 = deferred62;
                    uiRhyMigrationFeaturePage4 = uiRhyMigrationFeaturePage25;
                    uiRhyMigrationFeaturePage3 = uiRhyMigrationFeaturePage24;
                    rhyMigrationVariables3 = rhyMigrationVariables8;
                    deferred26 = deferred63;
                    deferred19 = deferred64;
                    objAwait4 = obj;
                    UiRhyMigrationContrastPage uiRhyMigrationContrastPage52 = (UiRhyMigrationContrastPage) objAwait4;
                    this.L$0 = rhyMigrationVariables3;
                    this.L$1 = deferred26;
                    this.L$2 = deferred27;
                    this.L$3 = deferred28;
                    this.L$4 = deferred29;
                    this.L$5 = deferred30;
                    this.L$6 = deferred25;
                    this.L$7 = uiRhyMigrationFeaturePage4;
                    this.L$8 = uiRhyMigrationFeaturePage3;
                    this.L$9 = uiRhyMigrationFeaturePage5;
                    this.L$10 = uiRhyMigrationContrastPage52;
                    this.label = 7;
                    objAwait5 = deferred19.await(this);
                    if (objAwait5 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 7:
                    uiRhyMigrationContrastPage = (UiRhyMigrationContrastPage) this.L$10;
                    uiRhyMigrationFeaturePage5 = (UiRhyMigrationFeaturePage) this.L$9;
                    uiRhyMigrationFeaturePage3 = (UiRhyMigrationFeaturePage) this.L$8;
                    uiRhyMigrationFeaturePage4 = (UiRhyMigrationFeaturePage) this.L$7;
                    deferred31 = (Deferred) this.L$6;
                    deferred36 = (Deferred) this.L$5;
                    deferred35 = (Deferred) this.L$4;
                    deferred34 = (Deferred) this.L$3;
                    Deferred deferred65 = (Deferred) this.L$2;
                    deferred32 = (Deferred) this.L$1;
                    RhyMigrationVariables rhyMigrationVariables9 = (RhyMigrationVariables) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    rhyMigrationVariables3 = rhyMigrationVariables9;
                    deferred33 = deferred65;
                    objAwait5 = obj;
                    UiRhyMigrationReviewPage uiRhyMigrationReviewPage42 = (UiRhyMigrationReviewPage) objAwait5;
                    this.L$0 = rhyMigrationVariables3;
                    this.L$1 = deferred33;
                    this.L$2 = deferred34;
                    this.L$3 = deferred35;
                    this.L$4 = deferred36;
                    this.L$5 = deferred31;
                    this.L$6 = uiRhyMigrationFeaturePage4;
                    this.L$7 = uiRhyMigrationFeaturePage3;
                    this.L$8 = uiRhyMigrationFeaturePage5;
                    this.L$9 = uiRhyMigrationContrastPage;
                    this.L$10 = uiRhyMigrationReviewPage42;
                    this.label = 8;
                    objAwait6 = deferred32.await(this);
                    if (objAwait6 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 8:
                    UiRhyMigrationReviewPage uiRhyMigrationReviewPage6 = (UiRhyMigrationReviewPage) this.L$10;
                    UiRhyMigrationContrastPage uiRhyMigrationContrastPage7 = (UiRhyMigrationContrastPage) this.L$9;
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage26 = (UiRhyMigrationFeaturePage) this.L$8;
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage27 = (UiRhyMigrationFeaturePage) this.L$7;
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage28 = (UiRhyMigrationFeaturePage) this.L$6;
                    Deferred deferred66 = (Deferred) this.L$5;
                    deferred40 = (Deferred) this.L$4;
                    deferred39 = (Deferred) this.L$3;
                    deferred38 = (Deferred) this.L$2;
                    Deferred deferred67 = (Deferred) this.L$1;
                    RhyMigrationVariables rhyMigrationVariables10 = (RhyMigrationVariables) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    uiRhyMigrationReviewPage = uiRhyMigrationReviewPage6;
                    deferred37 = deferred66;
                    uiRhyMigrationFeaturePage8 = uiRhyMigrationFeaturePage28;
                    uiRhyMigrationFeaturePage6 = uiRhyMigrationFeaturePage27;
                    uiRhyMigrationFeaturePage7 = uiRhyMigrationFeaturePage26;
                    uiRhyMigrationContrastPage2 = uiRhyMigrationContrastPage7;
                    rhyMigrationVariables3 = rhyMigrationVariables10;
                    deferred33 = deferred67;
                    objAwait6 = obj;
                    UiRhyMigrationCardPage uiRhyMigrationCardPage52 = (UiRhyMigrationCardPage) objAwait6;
                    this.L$0 = rhyMigrationVariables3;
                    this.L$1 = deferred38;
                    this.L$2 = deferred39;
                    this.L$3 = deferred40;
                    this.L$4 = deferred37;
                    this.L$5 = uiRhyMigrationFeaturePage8;
                    this.L$6 = uiRhyMigrationFeaturePage6;
                    this.L$7 = uiRhyMigrationFeaturePage7;
                    this.L$8 = uiRhyMigrationContrastPage2;
                    this.L$9 = uiRhyMigrationReviewPage;
                    this.L$10 = uiRhyMigrationCardPage52;
                    this.label = 9;
                    objAwait7 = deferred33.await(this);
                    if (objAwait7 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 9:
                    uiRhyMigrationCardPage = (UiRhyMigrationCardPage) this.L$10;
                    uiRhyMigrationReviewPage = (UiRhyMigrationReviewPage) this.L$9;
                    uiRhyMigrationContrastPage2 = (UiRhyMigrationContrastPage) this.L$8;
                    uiRhyMigrationFeaturePage7 = (UiRhyMigrationFeaturePage) this.L$7;
                    uiRhyMigrationFeaturePage6 = (UiRhyMigrationFeaturePage) this.L$6;
                    uiRhyMigrationFeaturePage8 = (UiRhyMigrationFeaturePage) this.L$5;
                    deferred41 = (Deferred) this.L$4;
                    deferred44 = (Deferred) this.L$3;
                    deferred43 = (Deferred) this.L$2;
                    deferred42 = (Deferred) this.L$1;
                    RhyMigrationVariables rhyMigrationVariables11 = (RhyMigrationVariables) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    rhyMigrationVariables3 = rhyMigrationVariables11;
                    objAwait7 = obj;
                    UiFancyAgreementBrief uiFancyAgreementBrief52 = (UiFancyAgreementBrief) objAwait7;
                    this.L$0 = rhyMigrationVariables3;
                    this.L$1 = deferred43;
                    this.L$2 = deferred44;
                    this.L$3 = deferred41;
                    this.L$4 = uiRhyMigrationFeaturePage8;
                    this.L$5 = uiRhyMigrationFeaturePage6;
                    this.L$6 = uiRhyMigrationFeaturePage7;
                    this.L$7 = uiRhyMigrationContrastPage2;
                    this.L$8 = uiRhyMigrationReviewPage;
                    this.L$9 = uiRhyMigrationCardPage;
                    this.L$10 = uiFancyAgreementBrief52;
                    this.label = 10;
                    objAwait8 = deferred42.await(this);
                    if (objAwait8 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 10:
                    UiFancyAgreementBrief uiFancyAgreementBrief7 = (UiFancyAgreementBrief) this.L$10;
                    UiRhyMigrationCardPage uiRhyMigrationCardPage6 = (UiRhyMigrationCardPage) this.L$9;
                    UiRhyMigrationReviewPage uiRhyMigrationReviewPage7 = (UiRhyMigrationReviewPage) this.L$8;
                    UiRhyMigrationContrastPage uiRhyMigrationContrastPage8 = (UiRhyMigrationContrastPage) this.L$7;
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage29 = (UiRhyMigrationFeaturePage) this.L$6;
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage30 = (UiRhyMigrationFeaturePage) this.L$5;
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage31 = (UiRhyMigrationFeaturePage) this.L$4;
                    Deferred deferred68 = (Deferred) this.L$3;
                    Deferred deferred69 = (Deferred) this.L$2;
                    Deferred deferred70 = (Deferred) this.L$1;
                    RhyMigrationVariables rhyMigrationVariables12 = (RhyMigrationVariables) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    uiFancyAgreementBrief = uiFancyAgreementBrief7;
                    deferred45 = deferred68;
                    uiRhyMigrationFeaturePage10 = uiRhyMigrationFeaturePage31;
                    uiRhyMigrationFeaturePage9 = uiRhyMigrationFeaturePage30;
                    uiRhyMigrationFeaturePage11 = uiRhyMigrationFeaturePage29;
                    uiRhyMigrationContrastPage3 = uiRhyMigrationContrastPage8;
                    uiRhyMigrationReviewPage2 = uiRhyMigrationReviewPage7;
                    uiRhyMigrationCardPage2 = uiRhyMigrationCardPage6;
                    rhyMigrationVariables3 = rhyMigrationVariables12;
                    deferred46 = deferred69;
                    deferred43 = deferred70;
                    objAwait8 = obj;
                    UiFancyAgreementBrief uiFancyAgreementBrief62 = (UiFancyAgreementBrief) objAwait8;
                    this.L$0 = rhyMigrationVariables3;
                    this.L$1 = deferred46;
                    this.L$2 = deferred45;
                    this.L$3 = uiRhyMigrationFeaturePage10;
                    this.L$4 = uiRhyMigrationFeaturePage9;
                    this.L$5 = uiRhyMigrationFeaturePage11;
                    this.L$6 = uiRhyMigrationContrastPage3;
                    this.L$7 = uiRhyMigrationReviewPage2;
                    this.L$8 = uiRhyMigrationCardPage2;
                    this.L$9 = uiFancyAgreementBrief;
                    this.L$10 = uiFancyAgreementBrief62;
                    this.label = 11;
                    objAwait9 = deferred43.await(this);
                    if (objAwait9 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 11:
                    uiFancyAgreementBrief2 = (UiFancyAgreementBrief) this.L$10;
                    uiFancyAgreementBrief = (UiFancyAgreementBrief) this.L$9;
                    uiRhyMigrationCardPage2 = (UiRhyMigrationCardPage) this.L$8;
                    uiRhyMigrationReviewPage2 = (UiRhyMigrationReviewPage) this.L$7;
                    uiRhyMigrationContrastPage3 = (UiRhyMigrationContrastPage) this.L$6;
                    uiRhyMigrationFeaturePage11 = (UiRhyMigrationFeaturePage) this.L$5;
                    uiRhyMigrationFeaturePage9 = (UiRhyMigrationFeaturePage) this.L$4;
                    uiRhyMigrationFeaturePage10 = (UiRhyMigrationFeaturePage) this.L$3;
                    Deferred deferred71 = (Deferred) this.L$2;
                    deferred48 = (Deferred) this.L$1;
                    rhyMigrationVariables4 = (RhyMigrationVariables) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    deferred47 = deferred71;
                    objAwait9 = obj;
                    UiRhyMigrationLoadingAnimation uiRhyMigrationLoadingAnimation22 = (UiRhyMigrationLoadingAnimation) objAwait9;
                    this.L$0 = deferred47;
                    this.L$1 = uiRhyMigrationFeaturePage10;
                    this.L$2 = uiRhyMigrationFeaturePage9;
                    this.L$3 = uiRhyMigrationFeaturePage11;
                    this.L$4 = uiRhyMigrationContrastPage3;
                    this.L$5 = uiRhyMigrationReviewPage2;
                    this.L$6 = uiRhyMigrationCardPage2;
                    this.L$7 = uiFancyAgreementBrief;
                    this.L$8 = uiFancyAgreementBrief2;
                    this.L$9 = uiRhyMigrationLoadingAnimation22;
                    this.L$10 = rhyMigrationVariables4;
                    this.label = 12;
                    objAwait10 = deferred48.await(this);
                    if (objAwait10 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 12:
                    RhyMigrationVariables rhyMigrationVariables13 = (RhyMigrationVariables) this.L$10;
                    UiRhyMigrationLoadingAnimation uiRhyMigrationLoadingAnimation3 = (UiRhyMigrationLoadingAnimation) this.L$9;
                    UiFancyAgreementBrief uiFancyAgreementBrief8 = (UiFancyAgreementBrief) this.L$8;
                    UiFancyAgreementBrief uiFancyAgreementBrief9 = (UiFancyAgreementBrief) this.L$7;
                    UiRhyMigrationCardPage uiRhyMigrationCardPage7 = (UiRhyMigrationCardPage) this.L$6;
                    uiRhyMigrationReviewPage3 = (UiRhyMigrationReviewPage) this.L$5;
                    uiRhyMigrationContrastPage4 = (UiRhyMigrationContrastPage) this.L$4;
                    uiRhyMigrationFeaturePage14 = (UiRhyMigrationFeaturePage) this.L$3;
                    uiRhyMigrationFeaturePage12 = (UiRhyMigrationFeaturePage) this.L$2;
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage32 = (UiRhyMigrationFeaturePage) this.L$1;
                    Deferred deferred72 = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    rhyMigrationVariables5 = rhyMigrationVariables13;
                    uiRhyMigrationCardPage3 = uiRhyMigrationCardPage7;
                    uiFancyAgreementBrief4 = uiFancyAgreementBrief9;
                    uiFancyAgreementBrief3 = uiFancyAgreementBrief8;
                    uiRhyMigrationLoadingAnimation = uiRhyMigrationLoadingAnimation3;
                    deferred47 = deferred72;
                    uiRhyMigrationFeaturePage13 = uiRhyMigrationFeaturePage32;
                    objAwait10 = obj;
                    UiRhyMigrationCmShutdownUpsell uiRhyMigrationCmShutdownUpsell22 = (UiRhyMigrationCmShutdownUpsell) objAwait10;
                    this.L$0 = uiRhyMigrationFeaturePage13;
                    this.L$1 = uiRhyMigrationFeaturePage12;
                    this.L$2 = uiRhyMigrationFeaturePage14;
                    this.L$3 = uiRhyMigrationContrastPage4;
                    this.L$4 = uiRhyMigrationReviewPage3;
                    this.L$5 = uiRhyMigrationCardPage3;
                    this.L$6 = uiFancyAgreementBrief4;
                    this.L$7 = uiFancyAgreementBrief3;
                    this.L$8 = uiRhyMigrationLoadingAnimation;
                    this.L$9 = rhyMigrationVariables5;
                    this.L$10 = uiRhyMigrationCmShutdownUpsell22;
                    this.label = 13;
                    objAwait11 = deferred47.await(this);
                    if (objAwait11 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 13:
                    UiRhyMigrationCmShutdownUpsell uiRhyMigrationCmShutdownUpsell3 = (UiRhyMigrationCmShutdownUpsell) this.L$10;
                    rhyMigrationVariables5 = (RhyMigrationVariables) this.L$9;
                    uiRhyMigrationLoadingAnimation = (UiRhyMigrationLoadingAnimation) this.L$8;
                    uiFancyAgreementBrief3 = (UiFancyAgreementBrief) this.L$7;
                    uiFancyAgreementBrief4 = (UiFancyAgreementBrief) this.L$6;
                    UiRhyMigrationCardPage uiRhyMigrationCardPage8 = (UiRhyMigrationCardPage) this.L$5;
                    uiRhyMigrationReviewPage3 = (UiRhyMigrationReviewPage) this.L$4;
                    uiRhyMigrationContrastPage4 = (UiRhyMigrationContrastPage) this.L$3;
                    uiRhyMigrationFeaturePage14 = (UiRhyMigrationFeaturePage) this.L$2;
                    uiRhyMigrationFeaturePage12 = (UiRhyMigrationFeaturePage) this.L$1;
                    UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage33 = (UiRhyMigrationFeaturePage) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait11 = obj;
                    uiRhyMigrationCmShutdownUpsell = uiRhyMigrationCmShutdownUpsell3;
                    uiRhyMigrationCardPage4 = uiRhyMigrationCardPage8;
                    uiRhyMigrationFeaturePage15 = uiRhyMigrationFeaturePage33;
                    return new UiRhyMigration(uiRhyMigrationFeaturePage15, uiRhyMigrationFeaturePage12, uiRhyMigrationFeaturePage14, uiRhyMigrationContrastPage4, uiRhyMigrationReviewPage3, uiRhyMigrationCardPage4, uiFancyAgreementBrief4, uiFancyAgreementBrief3, uiRhyMigrationLoadingAnimation, rhyMigrationVariables5, uiRhyMigrationCmShutdownUpsell, (UiRhyMigrationCmShutdown) objAwait11);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadRhyMigration(String str, Continuation<? super UiRhyMigration> continuation) {
        return Supervisor3.supervisorScope(new C275842(str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r10 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadRhyMigrationFeaturePage(ResourceLink<EntryResource<RhyMigrationFeaturePage>> resourceLink, Continuation<? super UiRhyMigrationFeaturePage> continuation) {
        RhyOnboardingLoadingDuxo$load$1 rhyOnboardingLoadingDuxo$load$1;
        RhyMigrationFeaturePage rhyMigrationFeaturePage;
        if (continuation instanceof RhyOnboardingLoadingDuxo$load$1) {
            rhyOnboardingLoadingDuxo$load$1 = (RhyOnboardingLoadingDuxo$load$1) continuation;
            int i = rhyOnboardingLoadingDuxo$load$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rhyOnboardingLoadingDuxo$load$1.label = i - Integer.MIN_VALUE;
            } else {
                rhyOnboardingLoadingDuxo$load$1 = new RhyOnboardingLoadingDuxo$load$1(this, continuation);
            }
        }
        RhyOnboardingLoadingDuxo$load$1 rhyOnboardingLoadingDuxo$load$12 = rhyOnboardingLoadingDuxo$load$1;
        Object objLoad$default = rhyOnboardingLoadingDuxo$load$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rhyOnboardingLoadingDuxo$load$12.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoad$default);
            StaticContentStore staticContentStore = this.staticContentStore;
            rhyOnboardingLoadingDuxo$load$12.label = 1;
            objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, rhyOnboardingLoadingDuxo$load$12, 2, null);
            if (objLoad$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rhyMigrationFeaturePage = (RhyMigrationFeaturePage) rhyOnboardingLoadingDuxo$load$12.L$0;
            ResultKt.throwOnFailure(objLoad$default);
            String disclosure = rhyMigrationFeaturePage.getDisclosure();
            return new UiRhyMigrationFeaturePage(rhyMigrationFeaturePage.getTitle(), rhyMigrationFeaturePage.getSubtitle(), (String) objLoad$default, disclosure, rhyMigrationFeaturePage.getDisclosureDialog(), rhyMigrationFeaturePage.getAnimationPortionUnderSubtitle(), rhyMigrationFeaturePage.getLoopAnimation());
        }
        ResultKt.throwOnFailure(objLoad$default);
        rhyMigrationFeaturePage = (RhyMigrationFeaturePage) ((EntryResource) objLoad$default).getValue();
        ResourceLink<AssetResource<?>> animationAsset = rhyMigrationFeaturePage.getAnimationAsset();
        rhyOnboardingLoadingDuxo$load$12.L$0 = rhyMigrationFeaturePage;
        rhyOnboardingLoadingDuxo$load$12.label = 2;
        objLoad$default = getAssetUrlString(animationAsset, rhyOnboardingLoadingDuxo$load$12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (r1 == r2) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ef -> B:34:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x013f -> B:42:0x0140). Please report as a decompilation issue!!! */
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadRhyMigrationReviewPage(ResourceLink<EntryResource<RhyMigrationReviewPage>> resourceLink, Continuation<? super UiRhyMigrationReviewPage> continuation) {
        RhyOnboardingLoadingDuxo$load$2 rhyOnboardingLoadingDuxo$load$2;
        RhyMigrationReviewPage rhyMigrationReviewPage;
        Collection arrayList;
        Iterator it;
        String str;
        RhyMigrationReviewPage rhyMigrationReviewPage2;
        RhyOnboardingLoadingDuxo$load$2 rhyOnboardingLoadingDuxo$load$22;
        RhyMigrationReviewPage rhyMigrationReviewPage3;
        RhyOnboardingLoadingDuxo$load$2 rhyOnboardingLoadingDuxo$load$23;
        String str2;
        List list;
        Collection arrayList2;
        Iterator it2;
        if (continuation instanceof RhyOnboardingLoadingDuxo$load$2) {
            rhyOnboardingLoadingDuxo$load$2 = (RhyOnboardingLoadingDuxo$load$2) continuation;
            int i = rhyOnboardingLoadingDuxo$load$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rhyOnboardingLoadingDuxo$load$2.label = i - Integer.MIN_VALUE;
            } else {
                rhyOnboardingLoadingDuxo$load$2 = new RhyOnboardingLoadingDuxo$load$2(this, continuation);
            }
        }
        RhyOnboardingLoadingDuxo$load$2 rhyOnboardingLoadingDuxo$load$24 = rhyOnboardingLoadingDuxo$load$2;
        Object objLoad$default = rhyOnboardingLoadingDuxo$load$24.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rhyOnboardingLoadingDuxo$load$24.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoad$default);
            StaticContentStore staticContentStore = this.staticContentStore;
            rhyOnboardingLoadingDuxo$load$24.label = 1;
            objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, rhyOnboardingLoadingDuxo$load$24, 2, null);
            if (objLoad$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(objLoad$default);
        } else if (i2 == 2) {
            rhyMigrationReviewPage = (RhyMigrationReviewPage) rhyOnboardingLoadingDuxo$load$24.L$0;
            ResultKt.throwOnFailure(objLoad$default);
            List<ResourceLink<EntryResource<TitleAndBody>>> dropdowns = rhyMigrationReviewPage.getDropdowns();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(dropdowns, 10));
            it = dropdowns.iterator();
            str = (String) objLoad$default;
            rhyMigrationReviewPage2 = rhyMigrationReviewPage;
            rhyOnboardingLoadingDuxo$load$22 = rhyOnboardingLoadingDuxo$load$24;
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else if (i2 == 3) {
            Collection collection = (Collection) rhyOnboardingLoadingDuxo$load$24.L$4;
            it = (Iterator) rhyOnboardingLoadingDuxo$load$24.L$3;
            arrayList = (Collection) rhyOnboardingLoadingDuxo$load$24.L$2;
            str = (String) rhyOnboardingLoadingDuxo$load$24.L$1;
            rhyMigrationReviewPage2 = (RhyMigrationReviewPage) rhyOnboardingLoadingDuxo$load$24.L$0;
            ResultKt.throwOnFailure(objLoad$default);
            rhyOnboardingLoadingDuxo$load$22 = rhyOnboardingLoadingDuxo$load$24;
            collection.add((TitleAndBody) ((EntryResource) objLoad$default).getValue());
            collection = arrayList;
            if (it.hasNext()) {
                ResourceLink resourceLink2 = (ResourceLink) it.next();
                StaticContentStore staticContentStore2 = this.staticContentStore;
                rhyOnboardingLoadingDuxo$load$22.L$0 = rhyMigrationReviewPage2;
                rhyOnboardingLoadingDuxo$load$22.L$1 = str;
                rhyOnboardingLoadingDuxo$load$22.L$2 = collection;
                rhyOnboardingLoadingDuxo$load$22.L$3 = it;
                rhyOnboardingLoadingDuxo$load$22.L$4 = collection;
                rhyOnboardingLoadingDuxo$load$22.label = 3;
                objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore2, resourceLink2, null, rhyOnboardingLoadingDuxo$load$22, 2, null);
                if (objLoad$default != coroutine_suspended) {
                    arrayList = collection;
                    collection.add((TitleAndBody) ((EntryResource) objLoad$default).getValue());
                    collection = arrayList;
                    if (it.hasNext()) {
                        List<ResourceLink<EntryResource<TitleAndBody>>> valueProps = rhyMigrationReviewPage2.getValueProps();
                        rhyMigrationReviewPage3 = rhyMigrationReviewPage2;
                        rhyOnboardingLoadingDuxo$load$23 = rhyOnboardingLoadingDuxo$load$22;
                        str2 = str;
                        list = (List) collection;
                        arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(valueProps, 10));
                        it2 = valueProps.iterator();
                        if (it2.hasNext()) {
                        }
                    }
                }
                return coroutine_suspended;
            }
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList2 = (Collection) rhyOnboardingLoadingDuxo$load$24.L$5;
            it2 = (Iterator) rhyOnboardingLoadingDuxo$load$24.L$4;
            Collection collection2 = (Collection) rhyOnboardingLoadingDuxo$load$24.L$3;
            list = (List) rhyOnboardingLoadingDuxo$load$24.L$2;
            str2 = (String) rhyOnboardingLoadingDuxo$load$24.L$1;
            rhyMigrationReviewPage3 = (RhyMigrationReviewPage) rhyOnboardingLoadingDuxo$load$24.L$0;
            ResultKt.throwOnFailure(objLoad$default);
            rhyOnboardingLoadingDuxo$load$23 = rhyOnboardingLoadingDuxo$load$24;
            arrayList2.add((TitleAndBody) ((EntryResource) objLoad$default).getValue());
            arrayList2 = collection2;
            if (it2.hasNext()) {
                ResourceLink resourceLink3 = (ResourceLink) it2.next();
                StaticContentStore staticContentStore3 = this.staticContentStore;
                rhyOnboardingLoadingDuxo$load$23.L$0 = rhyMigrationReviewPage3;
                rhyOnboardingLoadingDuxo$load$23.L$1 = str2;
                rhyOnboardingLoadingDuxo$load$23.L$2 = list;
                rhyOnboardingLoadingDuxo$load$23.L$3 = arrayList2;
                rhyOnboardingLoadingDuxo$load$23.L$4 = it2;
                rhyOnboardingLoadingDuxo$load$23.L$5 = arrayList2;
                rhyOnboardingLoadingDuxo$load$23.label = 4;
                objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore3, resourceLink3, null, rhyOnboardingLoadingDuxo$load$23, 2, null);
                if (objLoad$default != coroutine_suspended) {
                    collection2 = arrayList2;
                    arrayList2.add((TitleAndBody) ((EntryResource) objLoad$default).getValue());
                    arrayList2 = collection2;
                    if (it2.hasNext()) {
                        String title = rhyMigrationReviewPage3.getTitle();
                        return new UiRhyMigrationReviewPage(rhyMigrationReviewPage3.getCtaTitle(), rhyMigrationReviewPage3.getFaqTitle(), rhyMigrationReviewPage3.getShowAllLink(), rhyMigrationReviewPage3.getShowAllTitle(), title, list, (List) arrayList2, str2);
                    }
                }
                return coroutine_suspended;
            }
        }
        rhyMigrationReviewPage = (RhyMigrationReviewPage) ((EntryResource) objLoad$default).getValue();
        ResourceLink<AssetResource<?>> animationAsset = rhyMigrationReviewPage.getAnimationAsset();
        rhyOnboardingLoadingDuxo$load$24.L$0 = rhyMigrationReviewPage;
        rhyOnboardingLoadingDuxo$load$24.label = 2;
        objLoad$default = getAssetUrlString(animationAsset, rhyOnboardingLoadingDuxo$load$24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadRhyMigrationCardPage(ResourceLink<EntryResource<RhyMigrationCardPage>> resourceLink, Continuation<? super UiRhyMigrationCardPage> continuation) {
        RhyOnboardingLoadingDuxo$load$3 rhyOnboardingLoadingDuxo$load$3;
        String title;
        String subtitle;
        String str;
        String str2;
        if (continuation instanceof RhyOnboardingLoadingDuxo$load$3) {
            rhyOnboardingLoadingDuxo$load$3 = (RhyOnboardingLoadingDuxo$load$3) continuation;
            int i = rhyOnboardingLoadingDuxo$load$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rhyOnboardingLoadingDuxo$load$3.label = i - Integer.MIN_VALUE;
            } else {
                rhyOnboardingLoadingDuxo$load$3 = new RhyOnboardingLoadingDuxo$load$3(this, continuation);
            }
        }
        RhyOnboardingLoadingDuxo$load$3 rhyOnboardingLoadingDuxo$load$32 = rhyOnboardingLoadingDuxo$load$3;
        Object objLoad$default = rhyOnboardingLoadingDuxo$load$32.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rhyOnboardingLoadingDuxo$load$32.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoad$default);
            StaticContentStore staticContentStore = this.staticContentStore;
            rhyOnboardingLoadingDuxo$load$32.label = 1;
            objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, rhyOnboardingLoadingDuxo$load$32, 2, null);
            if (objLoad$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) rhyOnboardingLoadingDuxo$load$32.L$3;
            String str4 = (String) rhyOnboardingLoadingDuxo$load$32.L$2;
            subtitle = (String) rhyOnboardingLoadingDuxo$load$32.L$1;
            title = (String) rhyOnboardingLoadingDuxo$load$32.L$0;
            ResultKt.throwOnFailure(objLoad$default);
            str2 = str3;
            str = str4;
            return new UiRhyMigrationCardPage(title, subtitle, str, str2, (String) objLoad$default);
        }
        ResultKt.throwOnFailure(objLoad$default);
        RhyMigrationCardPage rhyMigrationCardPage = (RhyMigrationCardPage) ((EntryResource) objLoad$default).getValue();
        title = rhyMigrationCardPage.getTitle();
        subtitle = rhyMigrationCardPage.getSubtitle();
        String primaryCtaTitle = rhyMigrationCardPage.getPrimaryCtaTitle();
        String secondaryCtaTitle = rhyMigrationCardPage.getSecondaryCtaTitle();
        ResourceLink<AssetResource<?>> animationAsset = rhyMigrationCardPage.getAnimationAsset();
        rhyOnboardingLoadingDuxo$load$32.L$0 = title;
        rhyOnboardingLoadingDuxo$load$32.L$1 = subtitle;
        rhyOnboardingLoadingDuxo$load$32.L$2 = primaryCtaTitle;
        rhyOnboardingLoadingDuxo$load$32.L$3 = secondaryCtaTitle;
        rhyOnboardingLoadingDuxo$load$32.label = 2;
        Object assetUrlString = getAssetUrlString(animationAsset, rhyOnboardingLoadingDuxo$load$32);
        if (assetUrlString != coroutine_suspended) {
            str = primaryCtaTitle;
            str2 = secondaryCtaTitle;
            objLoad$default = assetUrlString;
            return new UiRhyMigrationCardPage(title, subtitle, str, str2, (String) objLoad$default);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r1 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a9 -> B:29:0x00aa). Please report as a decompilation issue!!! */
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadMobileContentPage(ResourceLink<EntryResource<MobileContentPage>> resourceLink, Continuation<? super UiRhyMigrationCmShutdown> continuation) {
        RhyOnboardingLoadingDuxo$load$4 rhyOnboardingLoadingDuxo$load$4;
        MobileContentPage mobileContentPage;
        List list;
        Iterator it;
        Collection collection;
        MobileContentPage mobileContentPage2;
        RhyOnboardingLoadingDuxo$load$4 rhyOnboardingLoadingDuxo$load$42;
        if (continuation instanceof RhyOnboardingLoadingDuxo$load$4) {
            rhyOnboardingLoadingDuxo$load$4 = (RhyOnboardingLoadingDuxo$load$4) continuation;
            int i = rhyOnboardingLoadingDuxo$load$4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rhyOnboardingLoadingDuxo$load$4.label = i - Integer.MIN_VALUE;
            } else {
                rhyOnboardingLoadingDuxo$load$4 = new RhyOnboardingLoadingDuxo$load$4(this, continuation);
            }
        }
        RhyOnboardingLoadingDuxo$load$4 rhyOnboardingLoadingDuxo$load$43 = rhyOnboardingLoadingDuxo$load$4;
        Object objLoad$default = rhyOnboardingLoadingDuxo$load$43.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rhyOnboardingLoadingDuxo$load$43.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoad$default);
            StaticContentStore staticContentStore = this.staticContentStore;
            rhyOnboardingLoadingDuxo$load$43.label = 1;
            objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, rhyOnboardingLoadingDuxo$load$43, 2, null);
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(objLoad$default);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) rhyOnboardingLoadingDuxo$load$43.L$3;
            it = (Iterator) rhyOnboardingLoadingDuxo$load$43.L$2;
            Collection collection2 = (Collection) rhyOnboardingLoadingDuxo$load$43.L$1;
            mobileContentPage2 = (MobileContentPage) rhyOnboardingLoadingDuxo$load$43.L$0;
            ResultKt.throwOnFailure(objLoad$default);
            rhyOnboardingLoadingDuxo$load$42 = rhyOnboardingLoadingDuxo$load$43;
            collection.add((TitleAndBody) ((EntryResource) objLoad$default).getValue());
            collection = collection2;
            if (it.hasNext()) {
                ResourceLink resourceLink2 = (ResourceLink) it.next();
                StaticContentStore staticContentStore2 = this.staticContentStore;
                rhyOnboardingLoadingDuxo$load$42.L$0 = mobileContentPage2;
                rhyOnboardingLoadingDuxo$load$42.L$1 = collection;
                rhyOnboardingLoadingDuxo$load$42.L$2 = it;
                rhyOnboardingLoadingDuxo$load$42.L$3 = collection;
                rhyOnboardingLoadingDuxo$load$42.label = 2;
                objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore2, resourceLink2, null, rhyOnboardingLoadingDuxo$load$42, 2, null);
                if (objLoad$default != coroutine_suspended) {
                    collection2 = collection;
                    collection.add((TitleAndBody) ((EntryResource) objLoad$default).getValue());
                    collection = collection2;
                    if (it.hasNext()) {
                        list = (List) collection;
                        mobileContentPage = mobileContentPage2;
                        return new UiRhyMigrationCmShutdown(mobileContentPage.getTitle(), mobileContentPage.getSubtitle(), mobileContentPage.getPrimaryCta(), mobileContentPage.getSecondaryCta(), list);
                    }
                }
                return coroutine_suspended;
            }
        }
        mobileContentPage = (MobileContentPage) ((EntryResource) objLoad$default).getValue();
        List<ResourceLink<EntryResource<TitleAndBody>>> pageFeatures = mobileContentPage.getPageFeatures();
        if (pageFeatures == null) {
            list = null;
            return new UiRhyMigrationCmShutdown(mobileContentPage.getTitle(), mobileContentPage.getSubtitle(), mobileContentPage.getPrimaryCta(), mobileContentPage.getSecondaryCta(), list);
        }
        List<ResourceLink<EntryResource<TitleAndBody>>> list2 = pageFeatures;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        it = list2.iterator();
        collection = arrayList;
        mobileContentPage2 = mobileContentPage;
        rhyOnboardingLoadingDuxo$load$42 = rhyOnboardingLoadingDuxo$load$43;
        if (it.hasNext()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
    
        if (r1 == r2) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0104 -> B:33:0x0107). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x015a -> B:41:0x015d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01b0 -> B:49:0x01b5). Please report as a decompilation issue!!! */
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadCmShutdownUpsellPage(ResourceLink<EntryResource<RhyMigrationCmShutdownUpsell>> resourceLink, Continuation<? super UiRhyMigrationCmShutdownUpsell> continuation) {
        RhyOnboardingLoadingDuxo$load$5 rhyOnboardingLoadingDuxo$load$5;
        Iterator it;
        Collection collection;
        RhyMigrationCmShutdownUpsell rhyMigrationCmShutdownUpsell;
        RhyMigrationCmShutdownUpsell rhyMigrationCmShutdownUpsell2;
        List list;
        Collection arrayList;
        Iterator it2;
        Iterator it3;
        List list2;
        Collection collection2;
        RhyMigrationCmShutdownUpsell rhyMigrationCmShutdownUpsell3;
        RhyOnboardingLoadingDuxo$load$5 rhyOnboardingLoadingDuxo$load$52;
        List list3;
        List list4;
        if (continuation instanceof RhyOnboardingLoadingDuxo$load$5) {
            rhyOnboardingLoadingDuxo$load$5 = (RhyOnboardingLoadingDuxo$load$5) continuation;
            int i = rhyOnboardingLoadingDuxo$load$5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rhyOnboardingLoadingDuxo$load$5.label = i - Integer.MIN_VALUE;
            } else {
                rhyOnboardingLoadingDuxo$load$5 = new RhyOnboardingLoadingDuxo$load$5(this, continuation);
            }
        }
        RhyOnboardingLoadingDuxo$load$5 rhyOnboardingLoadingDuxo$load$53 = rhyOnboardingLoadingDuxo$load$5;
        Object objLoad$default = rhyOnboardingLoadingDuxo$load$53.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rhyOnboardingLoadingDuxo$load$53.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoad$default);
            StaticContentStore staticContentStore = this.staticContentStore;
            rhyOnboardingLoadingDuxo$load$53.label = 1;
            objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, rhyOnboardingLoadingDuxo$load$53, 2, null);
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(objLoad$default);
        } else if (i2 == 2) {
            collection = (Collection) rhyOnboardingLoadingDuxo$load$53.L$3;
            it = (Iterator) rhyOnboardingLoadingDuxo$load$53.L$2;
            Collection collection3 = (Collection) rhyOnboardingLoadingDuxo$load$53.L$1;
            rhyMigrationCmShutdownUpsell = (RhyMigrationCmShutdownUpsell) rhyOnboardingLoadingDuxo$load$53.L$0;
            ResultKt.throwOnFailure(objLoad$default);
            collection.add((IdentifiableTitleAndBody) ((EntryResource) objLoad$default).getValue());
            collection = collection3;
            if (it.hasNext()) {
                ResourceLink resourceLink2 = (ResourceLink) it.next();
                StaticContentStore staticContentStore2 = this.staticContentStore;
                rhyOnboardingLoadingDuxo$load$53.L$0 = rhyMigrationCmShutdownUpsell;
                rhyOnboardingLoadingDuxo$load$53.L$1 = collection;
                rhyOnboardingLoadingDuxo$load$53.L$2 = it;
                rhyOnboardingLoadingDuxo$load$53.L$3 = collection;
                rhyOnboardingLoadingDuxo$load$53.label = 2;
                RhyOnboardingLoadingDuxo$load$5 rhyOnboardingLoadingDuxo$load$54 = rhyOnboardingLoadingDuxo$load$53;
                objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore2, resourceLink2, null, rhyOnboardingLoadingDuxo$load$54, 2, null);
                if (objLoad$default != coroutine_suspended) {
                    collection3 = collection;
                    rhyOnboardingLoadingDuxo$load$53 = rhyOnboardingLoadingDuxo$load$54;
                    collection.add((IdentifiableTitleAndBody) ((EntryResource) objLoad$default).getValue());
                    collection = collection3;
                    if (it.hasNext()) {
                        List<ResourceLink<EntryResource<IdentifiableTitleAndBody>>> comparisonTableTitleAndBody = rhyMigrationCmShutdownUpsell.getComparisonTableTitleAndBody();
                        rhyMigrationCmShutdownUpsell2 = rhyMigrationCmShutdownUpsell;
                        list = (List) collection;
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(comparisonTableTitleAndBody, 10));
                        it2 = comparisonTableTitleAndBody.iterator();
                        if (it2.hasNext()) {
                        }
                    }
                }
                return coroutine_suspended;
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list5 = (List) rhyOnboardingLoadingDuxo$load$53.L$3;
                    List list6 = (List) rhyOnboardingLoadingDuxo$load$53.L$2;
                    List list7 = (List) rhyOnboardingLoadingDuxo$load$53.L$1;
                    rhyMigrationCmShutdownUpsell3 = (RhyMigrationCmShutdownUpsell) rhyOnboardingLoadingDuxo$load$53.L$0;
                    ResultKt.throwOnFailure(objLoad$default);
                    list4 = list5;
                    list3 = list6;
                    list = list7;
                    Disclosure disclosure = (Disclosure) ((EntryResource) objLoad$default).getValue();
                    RhyMigrationCmShutdownUpsell rhyMigrationCmShutdownUpsell4 = rhyMigrationCmShutdownUpsell3;
                    return new UiRhyMigrationCmShutdownUpsell(rhyMigrationCmShutdownUpsell3.getTitle(), rhyMigrationCmShutdownUpsell3.getSubtitle(), rhyMigrationCmShutdownUpsell4.getPrimaryCta(), rhyMigrationCmShutdownUpsell4.getSecondaryCta(), list, rhyMigrationCmShutdownUpsell4.getComparisonTableTitle(), rhyMigrationCmShutdownUpsell4.getComparisonTableSubtitle(), rhyMigrationCmShutdownUpsell4.getComparisonTableHeader(), list3, rhyMigrationCmShutdownUpsell4.getFaqTitle(), list4, rhyMigrationCmShutdownUpsell4.getShowAllTitle(), rhyMigrationCmShutdownUpsell4.getShowAllLink(), disclosure);
                }
                collection2 = (Collection) rhyOnboardingLoadingDuxo$load$53.L$5;
                it3 = (Iterator) rhyOnboardingLoadingDuxo$load$53.L$4;
                Collection collection4 = (Collection) rhyOnboardingLoadingDuxo$load$53.L$3;
                List list8 = (List) rhyOnboardingLoadingDuxo$load$53.L$2;
                List list9 = (List) rhyOnboardingLoadingDuxo$load$53.L$1;
                RhyMigrationCmShutdownUpsell rhyMigrationCmShutdownUpsell5 = (RhyMigrationCmShutdownUpsell) rhyOnboardingLoadingDuxo$load$53.L$0;
                ResultKt.throwOnFailure(objLoad$default);
                rhyOnboardingLoadingDuxo$load$52 = rhyOnboardingLoadingDuxo$load$53;
                collection2.add((TitleAndBody) ((EntryResource) objLoad$default).getValue());
                collection2 = collection4;
                list2 = list8;
                list = list9;
                rhyMigrationCmShutdownUpsell3 = rhyMigrationCmShutdownUpsell5;
                if (it3.hasNext()) {
                    ResourceLink resourceLink3 = (ResourceLink) it3.next();
                    StaticContentStore staticContentStore3 = this.staticContentStore;
                    rhyOnboardingLoadingDuxo$load$52.L$0 = rhyMigrationCmShutdownUpsell3;
                    rhyOnboardingLoadingDuxo$load$52.L$1 = list;
                    rhyOnboardingLoadingDuxo$load$52.L$2 = list2;
                    rhyOnboardingLoadingDuxo$load$52.L$3 = collection2;
                    rhyOnboardingLoadingDuxo$load$52.L$4 = it3;
                    rhyOnboardingLoadingDuxo$load$52.L$5 = collection2;
                    rhyOnboardingLoadingDuxo$load$52.label = 4;
                    Object objLoad$default2 = ContentRepository.DefaultImpls.load$default(staticContentStore3, resourceLink3, null, rhyOnboardingLoadingDuxo$load$52, 2, null);
                    if (objLoad$default2 != coroutine_suspended) {
                        rhyMigrationCmShutdownUpsell5 = rhyMigrationCmShutdownUpsell3;
                        list9 = list;
                        list8 = list2;
                        collection4 = collection2;
                        objLoad$default = objLoad$default2;
                        collection2.add((TitleAndBody) ((EntryResource) objLoad$default).getValue());
                        collection2 = collection4;
                        list2 = list8;
                        list = list9;
                        rhyMigrationCmShutdownUpsell3 = rhyMigrationCmShutdownUpsell5;
                        if (it3.hasNext()) {
                            List list10 = (List) collection2;
                            StaticContentStore staticContentStore4 = this.staticContentStore;
                            ResourceLink<EntryResource<Disclosure>> disclosure2 = rhyMigrationCmShutdownUpsell3.getDisclosure();
                            rhyOnboardingLoadingDuxo$load$52.L$0 = rhyMigrationCmShutdownUpsell3;
                            rhyOnboardingLoadingDuxo$load$52.L$1 = list;
                            rhyOnboardingLoadingDuxo$load$52.L$2 = list2;
                            rhyOnboardingLoadingDuxo$load$52.L$3 = list10;
                            rhyOnboardingLoadingDuxo$load$52.L$4 = null;
                            rhyOnboardingLoadingDuxo$load$52.L$5 = null;
                            rhyOnboardingLoadingDuxo$load$52.label = 5;
                            Object objLoad$default3 = ContentRepository.DefaultImpls.load$default(staticContentStore4, disclosure2, null, rhyOnboardingLoadingDuxo$load$52, 2, null);
                            if (objLoad$default3 != coroutine_suspended) {
                                list3 = list2;
                                list4 = list10;
                                objLoad$default = objLoad$default3;
                                Disclosure disclosure3 = (Disclosure) ((EntryResource) objLoad$default).getValue();
                                RhyMigrationCmShutdownUpsell rhyMigrationCmShutdownUpsell42 = rhyMigrationCmShutdownUpsell3;
                                return new UiRhyMigrationCmShutdownUpsell(rhyMigrationCmShutdownUpsell3.getTitle(), rhyMigrationCmShutdownUpsell3.getSubtitle(), rhyMigrationCmShutdownUpsell42.getPrimaryCta(), rhyMigrationCmShutdownUpsell42.getSecondaryCta(), list, rhyMigrationCmShutdownUpsell42.getComparisonTableTitle(), rhyMigrationCmShutdownUpsell42.getComparisonTableSubtitle(), rhyMigrationCmShutdownUpsell42.getComparisonTableHeader(), list3, rhyMigrationCmShutdownUpsell42.getFaqTitle(), list4, rhyMigrationCmShutdownUpsell42.getShowAllTitle(), rhyMigrationCmShutdownUpsell42.getShowAllLink(), disclosure3);
                            }
                        }
                    }
                }
                return coroutine_suspended;
            }
            arrayList = (Collection) rhyOnboardingLoadingDuxo$load$53.L$4;
            it2 = (Iterator) rhyOnboardingLoadingDuxo$load$53.L$3;
            Collection collection5 = (Collection) rhyOnboardingLoadingDuxo$load$53.L$2;
            list = (List) rhyOnboardingLoadingDuxo$load$53.L$1;
            rhyMigrationCmShutdownUpsell2 = (RhyMigrationCmShutdownUpsell) rhyOnboardingLoadingDuxo$load$53.L$0;
            ResultKt.throwOnFailure(objLoad$default);
            arrayList.add((IdentifiableTitleAndBody) ((EntryResource) objLoad$default).getValue());
            arrayList = collection5;
            if (it2.hasNext()) {
                ResourceLink resourceLink4 = (ResourceLink) it2.next();
                StaticContentStore staticContentStore5 = this.staticContentStore;
                rhyOnboardingLoadingDuxo$load$53.L$0 = rhyMigrationCmShutdownUpsell2;
                rhyOnboardingLoadingDuxo$load$53.L$1 = list;
                rhyOnboardingLoadingDuxo$load$53.L$2 = arrayList;
                rhyOnboardingLoadingDuxo$load$53.L$3 = it2;
                rhyOnboardingLoadingDuxo$load$53.L$4 = arrayList;
                rhyOnboardingLoadingDuxo$load$53.label = 3;
                RhyOnboardingLoadingDuxo$load$5 rhyOnboardingLoadingDuxo$load$55 = rhyOnboardingLoadingDuxo$load$53;
                objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore5, resourceLink4, null, rhyOnboardingLoadingDuxo$load$55, 2, null);
                if (objLoad$default != coroutine_suspended) {
                    collection5 = arrayList;
                    rhyOnboardingLoadingDuxo$load$53 = rhyOnboardingLoadingDuxo$load$55;
                    arrayList.add((IdentifiableTitleAndBody) ((EntryResource) objLoad$default).getValue());
                    arrayList = collection5;
                    if (it2.hasNext()) {
                        List<ResourceLink<EntryResource<TitleAndBody>>> faqDropdown = rhyMigrationCmShutdownUpsell2.getFaqDropdown();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(faqDropdown, 10));
                        it3 = faqDropdown.iterator();
                        list2 = (List) arrayList;
                        collection2 = arrayList2;
                        rhyMigrationCmShutdownUpsell3 = rhyMigrationCmShutdownUpsell2;
                        rhyOnboardingLoadingDuxo$load$52 = rhyOnboardingLoadingDuxo$load$53;
                        if (it3.hasNext()) {
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
        RhyMigrationCmShutdownUpsell rhyMigrationCmShutdownUpsell6 = (RhyMigrationCmShutdownUpsell) ((EntryResource) objLoad$default).getValue();
        List<ResourceLink<EntryResource<IdentifiableTitleAndBody>>> accountComparison = rhyMigrationCmShutdownUpsell6.getAccountComparison();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(accountComparison, 10));
        it = accountComparison.iterator();
        collection = arrayList3;
        rhyMigrationCmShutdownUpsell = rhyMigrationCmShutdownUpsell6;
        if (it.hasNext()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2 A[PHI: r1 r3 r4
      0x00c2: PHI (r1v11 java.lang.Object) = (r1v10 java.lang.Object), (r1v1 java.lang.Object) binds: [B:32:0x00bf, B:21:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r3v6 java.lang.String) = (r3v5 java.lang.String), (r3v13 java.lang.String) binds: [B:32:0x00bf, B:21:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r4v4 com.robinhood.staticcontent.model.rhymigration.RhyMigrationContrastPage) = 
      (r4v3 com.robinhood.staticcontent.model.rhymigration.RhyMigrationContrastPage)
      (r4v11 com.robinhood.staticcontent.model.rhymigration.RhyMigrationContrastPage)
     binds: [B:32:0x00bf, B:21:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadRhyMigrationContrastPage(ResourceLink<EntryResource<RhyMigrationContrastPage>> resourceLink, Continuation<? super UiRhyMigrationContrastPage> continuation) {
        RhyOnboardingLoadingDuxo$load$6 rhyOnboardingLoadingDuxo$load$6;
        RhyMigrationContrastPage rhyMigrationContrastPage;
        String str;
        Object assetUrlString;
        String str2;
        RhyMigrationContrastPage rhyMigrationContrastPage2;
        String str3;
        Object assetUrlString2;
        String str4;
        RhyMigrationContrastPage rhyMigrationContrastPage3;
        String str5;
        if (continuation instanceof RhyOnboardingLoadingDuxo$load$6) {
            rhyOnboardingLoadingDuxo$load$6 = (RhyOnboardingLoadingDuxo$load$6) continuation;
            int i = rhyOnboardingLoadingDuxo$load$6.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rhyOnboardingLoadingDuxo$load$6.label = i - Integer.MIN_VALUE;
            } else {
                rhyOnboardingLoadingDuxo$load$6 = new RhyOnboardingLoadingDuxo$load$6(this, continuation);
            }
        }
        RhyOnboardingLoadingDuxo$load$6 rhyOnboardingLoadingDuxo$load$62 = rhyOnboardingLoadingDuxo$load$6;
        Object objLoad$default = rhyOnboardingLoadingDuxo$load$62.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rhyOnboardingLoadingDuxo$load$62.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoad$default);
            StaticContentStore staticContentStore = this.staticContentStore;
            rhyOnboardingLoadingDuxo$load$62.label = 1;
            objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, rhyOnboardingLoadingDuxo$load$62, 2, null);
            if (objLoad$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                RhyMigrationContrastPage rhyMigrationContrastPage4 = (RhyMigrationContrastPage) rhyOnboardingLoadingDuxo$load$62.L$0;
                ResultKt.throwOnFailure(objLoad$default);
                rhyMigrationContrastPage = rhyMigrationContrastPage4;
                str = (String) objLoad$default;
                ResourceLink<AssetResource<?>> animationAssetDark = rhyMigrationContrastPage.getAnimationAssetDark();
                rhyOnboardingLoadingDuxo$load$62.L$0 = rhyMigrationContrastPage;
                rhyOnboardingLoadingDuxo$load$62.L$1 = str;
                rhyOnboardingLoadingDuxo$load$62.label = 3;
                objLoad$default = getAssetUrlString(animationAssetDark, rhyOnboardingLoadingDuxo$load$62);
                if (objLoad$default != coroutine_suspended) {
                    String str6 = (String) objLoad$default;
                    ResourceLink<AssetResource<?>> animationAssetSmallDevice = rhyMigrationContrastPage.getAnimationAssetSmallDevice();
                    rhyOnboardingLoadingDuxo$load$62.L$0 = rhyMigrationContrastPage;
                    rhyOnboardingLoadingDuxo$load$62.L$1 = str;
                    rhyOnboardingLoadingDuxo$load$62.L$2 = str6;
                    rhyOnboardingLoadingDuxo$load$62.label = 4;
                    assetUrlString = getAssetUrlString(animationAssetSmallDevice, rhyOnboardingLoadingDuxo$load$62);
                    if (assetUrlString != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i2 == 3) {
                str = (String) rhyOnboardingLoadingDuxo$load$62.L$1;
                rhyMigrationContrastPage = (RhyMigrationContrastPage) rhyOnboardingLoadingDuxo$load$62.L$0;
                ResultKt.throwOnFailure(objLoad$default);
                String str62 = (String) objLoad$default;
                ResourceLink<AssetResource<?>> animationAssetSmallDevice2 = rhyMigrationContrastPage.getAnimationAssetSmallDevice();
                rhyOnboardingLoadingDuxo$load$62.L$0 = rhyMigrationContrastPage;
                rhyOnboardingLoadingDuxo$load$62.L$1 = str;
                rhyOnboardingLoadingDuxo$load$62.L$2 = str62;
                rhyOnboardingLoadingDuxo$load$62.label = 4;
                assetUrlString = getAssetUrlString(animationAssetSmallDevice2, rhyOnboardingLoadingDuxo$load$62);
                if (assetUrlString != coroutine_suspended) {
                    String str7 = str;
                    str2 = str62;
                    objLoad$default = assetUrlString;
                    rhyMigrationContrastPage2 = rhyMigrationContrastPage;
                    str3 = str7;
                    String str8 = (String) objLoad$default;
                    ResourceLink<AssetResource<?>> animationAssetSmallDeviceDark = rhyMigrationContrastPage2.getAnimationAssetSmallDeviceDark();
                    rhyOnboardingLoadingDuxo$load$62.L$0 = rhyMigrationContrastPage2;
                    rhyOnboardingLoadingDuxo$load$62.L$1 = str3;
                    rhyOnboardingLoadingDuxo$load$62.L$2 = str2;
                    rhyOnboardingLoadingDuxo$load$62.L$3 = str8;
                    rhyOnboardingLoadingDuxo$load$62.label = 5;
                    assetUrlString2 = getAssetUrlString(animationAssetSmallDeviceDark, rhyOnboardingLoadingDuxo$load$62);
                    if (assetUrlString2 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str9 = (String) rhyOnboardingLoadingDuxo$load$62.L$3;
                String str10 = (String) rhyOnboardingLoadingDuxo$load$62.L$2;
                str3 = (String) rhyOnboardingLoadingDuxo$load$62.L$1;
                RhyMigrationContrastPage rhyMigrationContrastPage5 = (RhyMigrationContrastPage) rhyOnboardingLoadingDuxo$load$62.L$0;
                ResultKt.throwOnFailure(objLoad$default);
                str4 = str9;
                str5 = str10;
                rhyMigrationContrastPage3 = rhyMigrationContrastPage5;
                String str11 = (String) objLoad$default;
                RhyMigrationContrastPage rhyMigrationContrastPage6 = rhyMigrationContrastPage3;
                return new UiRhyMigrationContrastPage(rhyMigrationContrastPage6.getTitle(), rhyMigrationContrastPage6.getSubtitle(), str3, str5, str4, str11, new Bound(rhyMigrationContrastPage6.getCombinedToSeparateStartFrame(), rhyMigrationContrastPage6.getCombinedToSeparateEndFrame()), new Bound(rhyMigrationContrastPage6.getSeparateToCombinedStartFrame(), rhyMigrationContrastPage6.getSeparateToCombinedEndFrame()), new Bound(rhyMigrationContrastPage6.getCombinedLoopStartFrame(), rhyMigrationContrastPage6.getCombinedLoopEndFrame()), new Bound(rhyMigrationContrastPage6.getSeparateLoopStartFrame(), rhyMigrationContrastPage6.getSeparateLoopEndFrame()), rhyMigrationContrastPage6.getPrimaryCtaText(), rhyMigrationContrastPage6.getSecondaryCtaText(), rhyMigrationContrastPage6.getSecondaryCtaDeeplink());
            }
            str2 = (String) rhyOnboardingLoadingDuxo$load$62.L$2;
            str3 = (String) rhyOnboardingLoadingDuxo$load$62.L$1;
            rhyMigrationContrastPage2 = (RhyMigrationContrastPage) rhyOnboardingLoadingDuxo$load$62.L$0;
            ResultKt.throwOnFailure(objLoad$default);
            String str82 = (String) objLoad$default;
            ResourceLink<AssetResource<?>> animationAssetSmallDeviceDark2 = rhyMigrationContrastPage2.getAnimationAssetSmallDeviceDark();
            rhyOnboardingLoadingDuxo$load$62.L$0 = rhyMigrationContrastPage2;
            rhyOnboardingLoadingDuxo$load$62.L$1 = str3;
            rhyOnboardingLoadingDuxo$load$62.L$2 = str2;
            rhyOnboardingLoadingDuxo$load$62.L$3 = str82;
            rhyOnboardingLoadingDuxo$load$62.label = 5;
            assetUrlString2 = getAssetUrlString(animationAssetSmallDeviceDark2, rhyOnboardingLoadingDuxo$load$62);
            if (assetUrlString2 != coroutine_suspended) {
                str4 = str82;
                objLoad$default = assetUrlString2;
                rhyMigrationContrastPage3 = rhyMigrationContrastPage2;
                str5 = str2;
                String str112 = (String) objLoad$default;
                RhyMigrationContrastPage rhyMigrationContrastPage62 = rhyMigrationContrastPage3;
                return new UiRhyMigrationContrastPage(rhyMigrationContrastPage62.getTitle(), rhyMigrationContrastPage62.getSubtitle(), str3, str5, str4, str112, new Bound(rhyMigrationContrastPage62.getCombinedToSeparateStartFrame(), rhyMigrationContrastPage62.getCombinedToSeparateEndFrame()), new Bound(rhyMigrationContrastPage62.getSeparateToCombinedStartFrame(), rhyMigrationContrastPage62.getSeparateToCombinedEndFrame()), new Bound(rhyMigrationContrastPage62.getCombinedLoopStartFrame(), rhyMigrationContrastPage62.getCombinedLoopEndFrame()), new Bound(rhyMigrationContrastPage62.getSeparateLoopStartFrame(), rhyMigrationContrastPage62.getSeparateLoopEndFrame()), rhyMigrationContrastPage62.getPrimaryCtaText(), rhyMigrationContrastPage62.getSecondaryCtaText(), rhyMigrationContrastPage62.getSecondaryCtaDeeplink());
            }
            return coroutine_suspended;
        }
        ResultKt.throwOnFailure(objLoad$default);
        RhyMigrationContrastPage rhyMigrationContrastPage7 = (RhyMigrationContrastPage) ((EntryResource) objLoad$default).getValue();
        ResourceLink<AssetResource<?>> animationAsset = rhyMigrationContrastPage7.getAnimationAsset();
        rhyOnboardingLoadingDuxo$load$62.L$0 = rhyMigrationContrastPage7;
        rhyOnboardingLoadingDuxo$load$62.label = 2;
        Object assetUrlString3 = getAssetUrlString(animationAsset, rhyOnboardingLoadingDuxo$load$62);
        if (assetUrlString3 != coroutine_suspended) {
            rhyMigrationContrastPage = rhyMigrationContrastPage7;
            objLoad$default = assetUrlString3;
            str = (String) objLoad$default;
            ResourceLink<AssetResource<?>> animationAssetDark2 = rhyMigrationContrastPage.getAnimationAssetDark();
            rhyOnboardingLoadingDuxo$load$62.L$0 = rhyMigrationContrastPage;
            rhyOnboardingLoadingDuxo$load$62.L$1 = str;
            rhyOnboardingLoadingDuxo$load$62.label = 3;
            objLoad$default = getAssetUrlString(animationAssetDark2, rhyOnboardingLoadingDuxo$load$62);
            if (objLoad$default != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadFancyAgreement(ResourceLink<EntryResource<FancyAgreement>> resourceLink, Continuation<? super UiFancyAgreementBrief> continuation) {
        RhyOnboardingLoadingDuxo$load$7 rhyOnboardingLoadingDuxo$load$7;
        ResourceLink<EntryResource<FancyAgreement>> resourceLink2;
        if (continuation instanceof RhyOnboardingLoadingDuxo$load$7) {
            rhyOnboardingLoadingDuxo$load$7 = (RhyOnboardingLoadingDuxo$load$7) continuation;
            int i = rhyOnboardingLoadingDuxo$load$7.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rhyOnboardingLoadingDuxo$load$7.label = i - Integer.MIN_VALUE;
            } else {
                rhyOnboardingLoadingDuxo$load$7 = new RhyOnboardingLoadingDuxo$load$7(this, continuation);
            }
        }
        RhyOnboardingLoadingDuxo$load$7 rhyOnboardingLoadingDuxo$load$72 = rhyOnboardingLoadingDuxo$load$7;
        Object objLoad$default = rhyOnboardingLoadingDuxo$load$72.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rhyOnboardingLoadingDuxo$load$72.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoad$default);
            StaticContentStore staticContentStore = this.staticContentStore;
            rhyOnboardingLoadingDuxo$load$72.L$0 = resourceLink;
            rhyOnboardingLoadingDuxo$load$72.label = 1;
            objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, rhyOnboardingLoadingDuxo$load$72, 2, null);
            if (objLoad$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            resourceLink2 = resourceLink;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            resourceLink2 = (ResourceLink) rhyOnboardingLoadingDuxo$load$72.L$0;
            ResultKt.throwOnFailure(objLoad$default);
        }
        FancyAgreement fancyAgreement = (FancyAgreement) ((EntryResource) objLoad$default).getValue();
        return new UiFancyAgreementBrief(fancyAgreement.getAgreementId(), fancyAgreement.getTitle(), fancyAgreement.getVersion(), resourceLink2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @JvmName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadRhyMigrationLoadingAnimation(ResourceLink<EntryResource<RhyMigrationLoadingAnimation>> resourceLink, Continuation<? super UiRhyMigrationLoadingAnimation> continuation) {
        RhyOnboardingLoadingDuxo$load$8 rhyOnboardingLoadingDuxo$load$8;
        RhyMigrationLoadingAnimation rhyMigrationLoadingAnimation;
        if (continuation instanceof RhyOnboardingLoadingDuxo$load$8) {
            rhyOnboardingLoadingDuxo$load$8 = (RhyOnboardingLoadingDuxo$load$8) continuation;
            int i = rhyOnboardingLoadingDuxo$load$8.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rhyOnboardingLoadingDuxo$load$8.label = i - Integer.MIN_VALUE;
            } else {
                rhyOnboardingLoadingDuxo$load$8 = new RhyOnboardingLoadingDuxo$load$8(this, continuation);
            }
        }
        RhyOnboardingLoadingDuxo$load$8 rhyOnboardingLoadingDuxo$load$82 = rhyOnboardingLoadingDuxo$load$8;
        Object objLoad$default = rhyOnboardingLoadingDuxo$load$82.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rhyOnboardingLoadingDuxo$load$82.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoad$default);
            StaticContentStore staticContentStore = this.staticContentStore;
            rhyOnboardingLoadingDuxo$load$82.label = 1;
            objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, rhyOnboardingLoadingDuxo$load$82, 2, null);
            if (objLoad$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rhyMigrationLoadingAnimation = (RhyMigrationLoadingAnimation) rhyOnboardingLoadingDuxo$load$82.L$0;
            ResultKt.throwOnFailure(objLoad$default);
            return new UiRhyMigrationLoadingAnimation((String) objLoad$default, rhyMigrationLoadingAnimation.getPhraseOneText(), rhyMigrationLoadingAnimation.getPhraseTwoText(), rhyMigrationLoadingAnimation.getPhraseThreeText(), new Bound(rhyMigrationLoadingAnimation.getPhraseOneLoopStartFrame(), rhyMigrationLoadingAnimation.getPhraseOneLoopEndFrame()), new Bound(rhyMigrationLoadingAnimation.getPhraseTwoTransitionStartFrame(), rhyMigrationLoadingAnimation.getPhraseTwoTransitionEndFrame()), new Bound(rhyMigrationLoadingAnimation.getPhraseThreeLoopStartFrame(), rhyMigrationLoadingAnimation.getPhraseThreeLoopEndFrame()), rhyMigrationLoadingAnimation.getPollingTimeoutSeconds());
        }
        ResultKt.throwOnFailure(objLoad$default);
        rhyMigrationLoadingAnimation = (RhyMigrationLoadingAnimation) ((EntryResource) objLoad$default).getValue();
        ResourceLink<AssetResource<?>> animationAsset = rhyMigrationLoadingAnimation.getAnimationAsset();
        rhyOnboardingLoadingDuxo$load$82.L$0 = rhyMigrationLoadingAnimation;
        rhyOnboardingLoadingDuxo$load$82.label = 2;
        objLoad$default = getAssetUrlString(animationAsset, rhyOnboardingLoadingDuxo$load$82);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAssetUrlString(ResourceLink<AssetResource<?>> resourceLink, Continuation<? super String> continuation) {
        C275811 c275811;
        if (continuation instanceof C275811) {
            c275811 = (C275811) continuation;
            int i = c275811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c275811.label = i - Integer.MIN_VALUE;
            } else {
                c275811 = new C275811(continuation);
            }
        }
        C275811 c2758112 = c275811;
        Object objLoad$default = c2758112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2758112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoad$default);
            StaticContentStore staticContentStore = this.staticContentStore;
            c2758112.label = 1;
            objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore, resourceLink, null, c2758112, 2, null);
            if (objLoad$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLoad$default);
        }
        return ((AssetResource) objLoad$default).getContent().getFile().getUrl().getUrl();
    }
}
