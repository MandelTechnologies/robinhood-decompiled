package com.robinhood.android.trade.recommendations.p262ui.order;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.recommendations.contracts.RecommendationsIntentKeys2;
import com.robinhood.android.trade.recommendations.p262ui.order.RecommendationsOrderParentFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsPortfolioStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsQuestionnaireStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsRiskProfileStore;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsPortfolio;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsQuestionnaire;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsRiskProfile;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsOrderActivity.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0006\u0010%\u001a\u00020\"J\b\u0010&\u001a\u00020\"H\u0002J\b\u0010'\u001a\u00020\"H\u0002R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "recsRiskProfileStore", "Ldagger/Lazy;", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsRiskProfileStore;", "getRecsRiskProfileStore", "()Ldagger/Lazy;", "setRecsRiskProfileStore", "(Ldagger/Lazy;)V", "recsPortfolioStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsPortfolioStore;", "getRecsPortfolioStore", "setRecsPortfolioStore", "recsQuestionnaireStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsQuestionnaireStore;", "getRecsQuestionnaireStore", "setRecsQuestionnaireStore", "source", "", "getSource", "()Ljava/lang/String;", "source$delegate", "Lkotlin/Lazy;", "recommendationId", "Ljava/util/UUID;", "getRecommendationId", "()Ljava/util/UUID;", "recommendationId$delegate", "accountNumber", "getAccountNumber", "accountNumber$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupSubmitToolbar", "simulateQuestionnaireAnswers", "prefetchLotties", "Companion", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecommendationsOrderActivity extends BaseActivity {
    private static final String EXTRA_ACCOUNT_NUMBER = "account_number";
    private static final String EXTRA_RECOMMENDATION_ID = "recommendation_id";
    private static final String EXTRA_SOURCE = "source";

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final Lazy accountNumber;

    /* renamed from: recommendationId$delegate, reason: from kotlin metadata */
    private final Lazy recommendationId;
    public dagger.Lazy<RecommendationsPortfolioStore> recsPortfolioStore;
    public dagger.Lazy<RecommendationsQuestionnaireStore> recsQuestionnaireStore;
    public dagger.Lazy<RecommendationsRiskProfileStore> recsRiskProfileStore;

    /* renamed from: source$delegate, reason: from kotlin metadata */
    private final Lazy source;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RecommendationsOrderActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.source = Activity.intentExtra(this, "source");
        this.recommendationId = Activity.intentExtra(this, EXTRA_RECOMMENDATION_ID);
        this.accountNumber = Activity.intentExtra(this, "account_number");
    }

    public final dagger.Lazy<RecommendationsRiskProfileStore> getRecsRiskProfileStore() {
        dagger.Lazy<RecommendationsRiskProfileStore> lazy = this.recsRiskProfileStore;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recsRiskProfileStore");
        return null;
    }

    public final void setRecsRiskProfileStore(dagger.Lazy<RecommendationsRiskProfileStore> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.recsRiskProfileStore = lazy;
    }

    public final dagger.Lazy<RecommendationsPortfolioStore> getRecsPortfolioStore() {
        dagger.Lazy<RecommendationsPortfolioStore> lazy = this.recsPortfolioStore;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recsPortfolioStore");
        return null;
    }

    public final void setRecsPortfolioStore(dagger.Lazy<RecommendationsPortfolioStore> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.recsPortfolioStore = lazy;
    }

    public final dagger.Lazy<RecommendationsQuestionnaireStore> getRecsQuestionnaireStore() {
        dagger.Lazy<RecommendationsQuestionnaireStore> lazy = this.recsQuestionnaireStore;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recsQuestionnaireStore");
        return null;
    }

    public final void setRecsQuestionnaireStore(dagger.Lazy<RecommendationsQuestionnaireStore> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.recsQuestionnaireStore = lazy;
    }

    private final String getSource() {
        return (String) this.source.getValue();
    }

    private final UUID getRecommendationId() {
        return (UUID) this.recommendationId.getValue();
    }

    private final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefetchLotties();
        if (savedInstanceState == null) {
            if (Intrinsics.areEqual(getRecommendationId(), StringsKt.toUuid("00000000-0000-0000-0000-000000000000")) && BuildFlavors.INSTANCE.isDebugOrInternal()) {
                simulateQuestionnaireAnswers();
            } else {
                setFragment(C11048R.id.fragment_container, RecommendationsOrderParentFragment.INSTANCE.newInstance((Parcelable) new RecommendationsOrderParentFragment.Args(getSource(), getRecommendationId(), getAccountNumber())));
            }
        }
    }

    public final void setupSubmitToolbar() {
        getWindow().setStatusBarColor(ThemeColors.getThemeColor(this, C20690R.attr.colorPrimary));
        super.hideToolbar();
    }

    private final void simulateQuestionnaireAnswers() {
        final UUID uuidRandomUUID = UUID.randomUUID();
        IdlingResourceCounters2.setBusy(IdlingResourceType.RECOMMENDATIONS_CHECKOUT, true);
        Single singleFlatMap = getRecsQuestionnaireStore().get().fetchRecommendationQuestionnaire().flatMap(new Function() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderActivity.simulateQuestionnaireAnswers.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<UiRecommendationsRiskProfile>> apply(Optional<UiRecommendationsQuestionnaire> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                UiRecommendationsQuestionnaire uiRecommendationsQuestionnaireComponent1 = optional.component1();
                Intrinsics.checkNotNull(uiRecommendationsQuestionnaireComponent1);
                List<UiRecommendationsQuestionnaire.Section> sections = uiRecommendationsQuestionnaireComponent1.getSections();
                ArrayList<UiRecommendationsQuestionnaire.Question> arrayList = new ArrayList();
                Iterator<T> it = sections.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, ((UiRecommendationsQuestionnaire.Section) it.next()).getQuestions());
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (UiRecommendationsQuestionnaire.Question question : arrayList) {
                    arrayList2.add(Tuples4.m3642to(question.getId(), question.getAllowedAnswers().get(0).getId()));
                }
                RecommendationsRiskProfileStore recommendationsRiskProfileStore = RecommendationsOrderActivity.this.getRecsRiskProfileStore().get();
                UUID uuid = uuidRandomUUID;
                Intrinsics.checkNotNull(uuid);
                return recommendationsRiskProfileStore.createRiskProfile(arrayList2, uuid);
            }
        }).flatMap(new Function() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderActivity.simulateQuestionnaireAnswers.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<UiRecommendationsPortfolio>> apply(Optional<UiRecommendationsRiskProfile> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RecommendationsPortfolioStore recommendationsPortfolioStore = RecommendationsOrderActivity.this.getRecsPortfolioStore().get();
                UUID uuid = uuidRandomUUID;
                Intrinsics.checkNotNull(uuid);
                return recommendationsPortfolioStore.createPortfolioRecommendation(uuid);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singleFlatMap), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderActivity.simulateQuestionnaireAnswers$lambda$0(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit simulateQuestionnaireAnswers$lambda$0(RecommendationsOrderActivity recommendationsOrderActivity, Optional optional) {
        UiRecommendationsPortfolio uiRecommendationsPortfolio = (UiRecommendationsPortfolio) optional.component1();
        if (uiRecommendationsPortfolio != null) {
            IdlingResourceCounters2.setBusy(IdlingResourceType.RECOMMENDATIONS_CHECKOUT, false);
            recommendationsOrderActivity.setFragment(C11048R.id.fragment_container, RecommendationsOrderParentFragment.INSTANCE.newInstance((Parcelable) new RecommendationsOrderParentFragment.Args(recommendationsOrderActivity.getSource(), uiRecommendationsPortfolio.getRecommendationId(), recommendationsOrderActivity.getAccountNumber())));
        }
        return Unit.INSTANCE;
    }

    private final void prefetchLotties() {
        LottieUrl.RECS_CELEBRATION_DAY.prefetch(this);
        LottieUrl.RECS_CELEBRATION_NIGHT.prefetch(this);
    }

    /* compiled from: RecommendationsOrderActivity.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/recommendations/contracts/RecommendationsOrder;", "<init>", "()V", "EXTRA_SOURCE", "", "EXTRA_RECOMMENDATION_ID", "EXTRA_ACCOUNT_NUMBER", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<RecommendationsIntentKeys2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, RecommendationsIntentKeys2 key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) RecommendationsOrderActivity.class);
            intent.putExtra("source", key.getSource());
            intent.putExtra(RecommendationsOrderActivity.EXTRA_RECOMMENDATION_ID, key.getRecommendationId());
            intent.putExtra("account_number", key.getAccountNumber());
            return intent;
        }
    }
}
