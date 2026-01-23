package com.robinhood.android.cash.rewards.p074ui.onboarding;

import android.text.Spanned;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.SweepsStatus;
import com.robinhood.librobinhood.data.store.SweepsStatusStore;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.udf.UiEvent;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
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

/* compiled from: RewardsOnboardingActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\fJ\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingActivityDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingActivityViewState;", "sweepStatusStore", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;Lcom/robinhood/contentful/StaticContentStore;Lio/noties/markwon/Markwon;)V", "onStart", "", "createAssetSelectionContentIds", "Lcom/robinhood/android/cash/rewards/ui/onboarding/AssetSelectionContentIds;", "state", "loadContentfulResource", "contentfulId", "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent$ContentfulType;", "completeIntro", "completeAssetSelection", "selectedInvestmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "action", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "handleChangeInvestment", "Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingContentEnum;", "handleNewInvestment", "sweepStatus", "Lcom/robinhood/android/cash/rewards/ui/onboarding/SweepStatus;", "completeSignup", "investmentType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "assetSymbol", "", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RewardsOnboardingActivityDuxo extends OldBaseDuxo<RewardsOnboardingActivityViewState> {
    public static final int $stable = 8;
    private final Markwon markwon;
    private final StaticContentStore staticContentStore;
    private final SweepsStatusStore sweepStatusStore;

    /* compiled from: RewardsOnboardingActivityDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RewardsOnboardingActivityViewState5.values().length];
            try {
                iArr[RewardsOnboardingActivityViewState5.NOT_ELIGIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardsOnboardingActivityViewState5.ELIGIBLE_NOT_ENROLLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardsOnboardingActivityViewState5.ENROLLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiAssetType.values().length];
            try {
                iArr2[ApiAssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiAssetType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiAssetType.BROKERAGE_CASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiAssetType.TOKENIZED_STOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RewardsOnboardingActivityDuxo(SweepsStatusStore sweepStatusStore, StaticContentStore staticContentStore, Markwon markwon) {
        super(new RewardsOnboardingActivityViewState(null, null, null, null, null, null, 63, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(sweepStatusStore, "sweepStatusStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.sweepStatusStore = sweepStatusStore;
        this.staticContentStore = staticContentStore;
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        SweepsStatusStore.refresh$default(this.sweepStatusStore, false, 1, null);
        Observable<SweepsStatus> observableDistinctUntilChanged = this.sweepStatusStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivityDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingActivityDuxo.onStart$lambda$1(this.f$0, (SweepsStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RewardsOnboardingActivityDuxo rewardsOnboardingActivityDuxo, final SweepsStatus sweepsStatus) {
        rewardsOnboardingActivityDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivityDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingActivityDuxo.onStart$lambda$1$lambda$0(sweepsStatus, (RewardsOnboardingActivityViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingActivityViewState onStart$lambda$1$lambda$0(SweepsStatus sweepsStatus, RewardsOnboardingActivityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (sweepsStatus.getSweepEnrollment().getSweepEnrolled()) {
            return RewardsOnboardingActivityViewState.copy$default(applyMutation, RewardsOnboardingActivityViewState5.ENROLLED, null, null, null, null, null, 62, null);
        }
        if (sweepsStatus.getSweepEligible()) {
            return RewardsOnboardingActivityViewState.copy$default(applyMutation, RewardsOnboardingActivityViewState5.ELIGIBLE_NOT_ENROLLED, null, null, null, null, null, 62, null);
        }
        return RewardsOnboardingActivityViewState.copy$default(applyMutation, RewardsOnboardingActivityViewState5.NOT_ELIGIBLE, null, null, null, null, null, 62, null);
    }

    private final AssetSelectionContentIds createAssetSelectionContentIds(RewardsOnboardingActivityViewState state) {
        RewardsOnboardingActivityViewState3 rewardsOnboardingActivityViewState3;
        RewardsOnboardingActivityViewState3 rewardsOnboardingActivityViewState32 = RewardsOnboardingActivityViewState3.ASSET_SELECTION_EXP;
        int i = WhenMappings.$EnumSwitchMapping$0[state.getSweepStatus().ordinal()];
        if (i == 1) {
            rewardsOnboardingActivityViewState3 = RewardsOnboardingActivityViewState3.ASSET_SELECTION_BROKE_SWEEP_INELIGIBLE;
        } else if (i == 2) {
            rewardsOnboardingActivityViewState3 = RewardsOnboardingActivityViewState3.ASSET_SELECTION_BROKE_SWEEP_NOT_ENROLLED;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            rewardsOnboardingActivityViewState3 = RewardsOnboardingActivityViewState3.ASSET_SELECTION_BROKE_SWEEP_ENROLLED;
        }
        return new AssetSelectionContentIds(rewardsOnboardingActivityViewState32, rewardsOnboardingActivityViewState3, RewardsOnboardingActivityViewState3.ASSET_SELECTION_TITLE);
    }

    /* compiled from: RewardsOnboardingActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivityDuxo$loadContentfulResource$1", m3645f = "RewardsOnboardingActivityDuxo.kt", m3646l = {69, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, 81}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivityDuxo$loadContentfulResource$1 */
    static final class C102021 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super HashMap<String, RewardsOnboardingContent>>, Object> {
        final /* synthetic */ RewardsOnboardingContent.ContentfulType $contentfulId;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C102021(RewardsOnboardingContent.ContentfulType contentfulType, Continuation<? super C102021> continuation) {
            super(2, continuation);
            this.$contentfulId = contentfulType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RewardsOnboardingActivityDuxo.this.new C102021(this.$contentfulId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HashMap<String, RewardsOnboardingContent>> continuation) {
            return ((C102021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
        
            if (r0 == r6) goto L30;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0168 A[RETURN] */
        /* JADX WARN: Type inference failed for: r11v12, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.CharSequence] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00c4 -> B:22:0x00c5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0127 -> B:32:0x012d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0157 -> B:34:0x015a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objLoadEntry$default;
            Collection arrayList;
            Iterator it;
            RewardsOnboardingActivityDuxo rewardsOnboardingActivityDuxo;
            HashMap map;
            RewardsOnboardingActivityDuxo rewardsOnboardingActivityDuxo2;
            Iterator it2;
            C102021 c102021 = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = c102021.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = RewardsOnboardingActivityDuxo.this.staticContentStore;
                String id = c102021.$contentfulId.getId();
                c102021.label = 1;
                objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, id, null, c102021, 2, null);
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                objLoadEntry$default = obj;
            } else if (i == 2) {
                Collection collection = (Collection) c102021.L$3;
                Iterator it3 = (Iterator) c102021.L$2;
                arrayList = (Collection) c102021.L$1;
                RewardsOnboardingActivityDuxo rewardsOnboardingActivityDuxo3 = (RewardsOnboardingActivityDuxo) c102021.L$0;
                ResultKt.throwOnFailure(obj);
                Collection collection2 = collection;
                it = it3;
                rewardsOnboardingActivityDuxo = rewardsOnboardingActivityDuxo3;
                Object objLoad$default = obj;
                collection2.add((ProductMarketing.Feature) ((EntryResource) objLoad$default).getValue());
                collection2 = arrayList;
                if (it.hasNext()) {
                    ResourceLink resourceLink = (ResourceLink) it.next();
                    StaticContentStore staticContentStore2 = rewardsOnboardingActivityDuxo.staticContentStore;
                    c102021.L$0 = rewardsOnboardingActivityDuxo;
                    c102021.L$1 = collection2;
                    c102021.L$2 = it;
                    c102021.L$3 = collection2;
                    c102021.label = 2;
                    objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore2, resourceLink, null, c102021, 2, null);
                    if (objLoad$default != coroutine_suspended) {
                        arrayList = collection2;
                        collection2.add((ProductMarketing.Feature) ((EntryResource) objLoad$default).getValue());
                        collection2 = arrayList;
                        if (it.hasNext()) {
                            HashMap map2 = new HashMap();
                            RewardsOnboardingActivityDuxo rewardsOnboardingActivityDuxo4 = RewardsOnboardingActivityDuxo.this;
                            Iterator it4 = ((List) collection2).iterator();
                            map = map2;
                            rewardsOnboardingActivityDuxo2 = rewardsOnboardingActivityDuxo4;
                            it2 = it4;
                            if (!it2.hasNext()) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = (String) c102021.L$6;
                ?? r1 = (Map) c102021.L$5;
                String str2 = (String) c102021.L$4;
                ?? r4 = (CharSequence) c102021.L$3;
                Iterator it5 = (Iterator) c102021.L$2;
                RewardsOnboardingActivityDuxo rewardsOnboardingActivityDuxo5 = (RewardsOnboardingActivityDuxo) c102021.L$1;
                ?? r11 = (Map) c102021.L$0;
                ResultKt.throwOnFailure(obj);
                String identifier = str;
                Object objLoad$default2 = obj;
                HashMap map3 = r1;
                Spanned spanned = r4;
                HashMap map4 = r11;
                Disclosure disclosure = (Disclosure) ((EntryResource) objLoad$default2).getValue();
                RewardsOnboardingContent.Disclosure disclosure2 = new RewardsOnboardingContent.Disclosure(disclosure.getTitle(), Markwons.toSpanned$default(rewardsOnboardingActivityDuxo5.markwon, disclosure.getContent(), null, 2, null), disclosure.getButton(), disclosure.getAdditionalData());
                String title = str2;
                Spanned spanned$default = spanned;
                rewardsOnboardingActivityDuxo2 = rewardsOnboardingActivityDuxo5;
                map = map3;
                HashMap map5 = map4;
                map.put(identifier, new RewardsOnboardingContent(title, spanned$default, disclosure2));
                c102021 = this;
                map = map5;
                it2 = it5;
                if (!it2.hasNext()) {
                    ProductMarketing.Feature feature = (ProductMarketing.Feature) it2.next();
                    identifier = feature.getIdentifier();
                    title = feature.getTitle();
                    spanned$default = Markwons.toSpanned$default(rewardsOnboardingActivityDuxo2.markwon, feature.getContent(), null, 2, null);
                    ResourceLink<EntryResource<Disclosure>> disclosure3 = feature.getDisclosure();
                    if (disclosure3 != null) {
                        StaticContentStore staticContentStore3 = rewardsOnboardingActivityDuxo2.staticContentStore;
                        c102021.L$0 = map;
                        c102021.L$1 = rewardsOnboardingActivityDuxo2;
                        c102021.L$2 = it2;
                        c102021.L$3 = spanned$default;
                        c102021.L$4 = title;
                        c102021.L$5 = map;
                        c102021.L$6 = identifier;
                        c102021.label = 3;
                        objLoad$default2 = ContentRepository.DefaultImpls.load$default(staticContentStore3, disclosure3, null, c102021, 2, null);
                        if (objLoad$default2 != coroutine_suspended) {
                            HashMap map6 = map;
                            it5 = it2;
                            str2 = title;
                            spanned = spanned$default;
                            map4 = map6;
                            rewardsOnboardingActivityDuxo5 = rewardsOnboardingActivityDuxo2;
                            map3 = map6;
                            Disclosure disclosure4 = (Disclosure) ((EntryResource) objLoad$default2).getValue();
                            RewardsOnboardingContent.Disclosure disclosure22 = new RewardsOnboardingContent.Disclosure(disclosure4.getTitle(), Markwons.toSpanned$default(rewardsOnboardingActivityDuxo5.markwon, disclosure4.getContent(), null, 2, null), disclosure4.getButton(), disclosure4.getAdditionalData());
                            String title2 = str2;
                            Spanned spanned$default2 = spanned;
                            rewardsOnboardingActivityDuxo2 = rewardsOnboardingActivityDuxo5;
                            map = map3;
                            HashMap map52 = map4;
                            map.put(identifier, new RewardsOnboardingContent(title2, spanned$default2, disclosure22));
                            c102021 = this;
                            map = map52;
                            it2 = it5;
                            if (!it2.hasNext()) {
                                return map;
                            }
                        }
                        return coroutine_suspended;
                    }
                    disclosure22 = null;
                    it5 = it2;
                    map52 = map;
                    map.put(identifier, new RewardsOnboardingContent(title2, spanned$default2, disclosure22));
                    c102021 = this;
                    map = map52;
                    it2 = it5;
                    if (!it2.hasNext()) {
                    }
                }
            }
            List<ResourceLink<EntryResource<ProductMarketing.Feature>>> features = ((ProductMarketing) ((EntryResource) objLoadEntry$default).getValue()).getFeatures();
            RewardsOnboardingActivityDuxo rewardsOnboardingActivityDuxo6 = RewardsOnboardingActivityDuxo.this;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(features, 10));
            it = features.iterator();
            rewardsOnboardingActivityDuxo = rewardsOnboardingActivityDuxo6;
            collection2 = arrayList;
            if (it.hasNext()) {
            }
        }
    }

    public final void loadContentfulResource(RewardsOnboardingContent.ContentfulType contentfulId) {
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        Observable observableDistinctUntilChanged = RxFactory.DefaultImpls.rxSingle$default(this, null, new C102021(contentfulId, null), 1, null).toObservable().subscribeOn(Schedulers.m3346io()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivityDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingActivityDuxo.loadContentfulResource$lambda$3(this.f$0, (HashMap) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivityDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingActivityDuxo.loadContentfulResource$lambda$5(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContentfulResource$lambda$3(final RewardsOnboardingActivityDuxo rewardsOnboardingActivityDuxo, final HashMap map) {
        rewardsOnboardingActivityDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivityDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingActivityDuxo.loadContentfulResource$lambda$3$lambda$2(map, rewardsOnboardingActivityDuxo, (RewardsOnboardingActivityViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingActivityViewState loadContentfulResource$lambda$3$lambda$2(HashMap map, RewardsOnboardingActivityDuxo rewardsOnboardingActivityDuxo, RewardsOnboardingActivityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingActivityViewState.copy$default(applyMutation, null, new UiEvent(new Tuples2(map, rewardsOnboardingActivityDuxo.createAssetSelectionContentIds(applyMutation))), null, null, null, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContentfulResource$lambda$5(RewardsOnboardingActivityDuxo rewardsOnboardingActivityDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rewardsOnboardingActivityDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivityDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingActivityDuxo.loadContentfulResource$lambda$5$lambda$4(it, (RewardsOnboardingActivityViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingActivityViewState loadContentfulResource$lambda$5$lambda$4(Throwable th, RewardsOnboardingActivityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingActivityViewState.copy$default(applyMutation, null, null, new UiEvent(th), null, null, null, 59, null);
    }

    public final void completeIntro() {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivityDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingActivityDuxo.completeIntro$lambda$6(this.f$0, (RewardsOnboardingActivityViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingActivityViewState completeIntro$lambda$6(RewardsOnboardingActivityDuxo rewardsOnboardingActivityDuxo, RewardsOnboardingActivityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingActivityViewState.copy$default(applyMutation, null, null, null, new UiEvent(rewardsOnboardingActivityDuxo.createAssetSelectionContentIds(applyMutation)), null, null, 55, null);
    }

    public final void completeAssetSelection(final InvestmentTarget selectedInvestmentTarget, final LegacyIntentKey.RewardsOnboarding.Action action) {
        Intrinsics.checkNotNullParameter(selectedInvestmentTarget, "selectedInvestmentTarget");
        Intrinsics.checkNotNullParameter(action, "action");
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivityDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingActivityDuxo.completeAssetSelection$lambda$7(action, this, selectedInvestmentTarget, (RewardsOnboardingActivityViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingActivityViewState completeAssetSelection$lambda$7(LegacyIntentKey.RewardsOnboarding.Action action, RewardsOnboardingActivityDuxo rewardsOnboardingActivityDuxo, InvestmentTarget investmentTarget, RewardsOnboardingActivityViewState applyMutation) {
        RewardsOnboardingActivityViewState3 rewardsOnboardingActivityViewState3HandleNewInvestment;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (action == LegacyIntentKey.RewardsOnboarding.Action.CHANGE_INVESTMENT) {
            rewardsOnboardingActivityViewState3HandleNewInvestment = rewardsOnboardingActivityDuxo.handleChangeInvestment(investmentTarget);
        } else {
            rewardsOnboardingActivityViewState3HandleNewInvestment = rewardsOnboardingActivityDuxo.handleNewInvestment(investmentTarget, applyMutation.getSweepStatus());
        }
        return RewardsOnboardingActivityViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(new Tuples2(investmentTarget, new SignupContentIds(rewardsOnboardingActivityViewState3HandleNewInvestment, RewardsOnboardingActivityViewState3.VARIABLE_BONUS))), null, 47, null);
    }

    private final RewardsOnboardingActivityViewState3 handleChangeInvestment(InvestmentTarget selectedInvestmentTarget) {
        if (selectedInvestmentTarget.isCrypto()) {
            return RewardsOnboardingActivityViewState3.SIGNUP_CHANGE_SELECTION_RHC;
        }
        return RewardsOnboardingActivityViewState3.SIGNUP_CHANGE_SELECTION_RHS;
    }

    private final RewardsOnboardingActivityViewState3 handleNewInvestment(InvestmentTarget selectedInvestmentTarget, RewardsOnboardingActivityViewState5 sweepStatus) {
        int i = WhenMappings.$EnumSwitchMapping$1[selectedInvestmentTarget.getTargetType().ordinal()];
        if (i == 1) {
            return RewardsOnboardingActivityViewState3.SIGNUP_REVIEW_ASSET_RHS;
        }
        if (i == 2) {
            return RewardsOnboardingActivityViewState3.SIGNUP_REVIEW_ASSET_RHC;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("This flow doesn't support tokenized stocks");
        }
        if (sweepStatus == RewardsOnboardingActivityViewState5.NOT_ELIGIBLE) {
            return RewardsOnboardingActivityViewState3.SIGNUP_SWEEP_INELIGIBLE;
        }
        return RewardsOnboardingActivityViewState3.SIGNUP_BROKERAGE;
    }

    public final void completeSignup(final ApiAssetType investmentType, final String assetSymbol) {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivityDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingActivityDuxo.completeSignup$lambda$8(investmentType, assetSymbol, (RewardsOnboardingActivityViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingActivityViewState completeSignup$lambda$8(ApiAssetType apiAssetType, String str, RewardsOnboardingActivityViewState applyMutation) {
        RewardsOnboardingActivityViewState3 rewardsOnboardingActivityViewState3;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (apiAssetType == ApiAssetType.BROKERAGE_CASH) {
            rewardsOnboardingActivityViewState3 = RewardsOnboardingActivityViewState3.CONFIRMATION_BROKE;
        } else {
            rewardsOnboardingActivityViewState3 = RewardsOnboardingActivityViewState3.CONFIRMATION_ASSET;
        }
        return RewardsOnboardingActivityViewState.copy$default(applyMutation, null, null, null, null, null, new UiEvent(new Tuples2(str, rewardsOnboardingActivityViewState3)), 31, null);
    }
}
