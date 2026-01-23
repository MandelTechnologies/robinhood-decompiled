package com.robinhood.android.recommendations.lib.p221ui;

import android.content.Context;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.recommendations.lib.p221ui.RecommendationsLoadingFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsEligibilityStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsReentryStore;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsExistingAnswers;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.reactivex.Single;
import io.reactivex.rxkotlin.Singles;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecommendationsLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0017H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/recommendations/lib/ui/RecommendationsLoadingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "recsEligibilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsEligibilityStore;", "getRecsEligibilityStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsEligibilityStore;", "setRecsEligibilityStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsEligibilityStore;)V", "recsReentryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsReentryStore;", "getRecsReentryStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsReentryStore;", "setRecsReentryStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsReentryStore;)V", "callbacks", "Lcom/robinhood/android/recommendations/lib/ui/RecommendationsLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/lib/ui/RecommendationsLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onStart", "Callbacks", "Companion", "feature-lib-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsLoadingFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.lib.ui.RecommendationsLoadingFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof RecommendationsLoadingFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public RecommendationsEligibilityStore recsEligibilityStore;
    public RecommendationsReentryStore recsReentryStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/lib/ui/RecommendationsLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecommendationsLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/recommendations/lib/ui/RecommendationsLoadingFragment$Callbacks;", "", "onRecommendationsReentry", "", "existingAnswers", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsExistingAnswers;", "onRecommendationsEligibilityConfirmed", "onRecommendationsEligibilityDenied", "feature-lib-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRecommendationsEligibilityConfirmed();

        void onRecommendationsEligibilityDenied();

        void onRecommendationsReentry(UiRecommendationsExistingAnswers existingAnswers);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(RecommendationsLoadingFragment recommendationsLoadingFragment, int i, Composer composer, int i2) {
        recommendationsLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final RecommendationsEligibilityStore getRecsEligibilityStore() {
        RecommendationsEligibilityStore recommendationsEligibilityStore = this.recsEligibilityStore;
        if (recommendationsEligibilityStore != null) {
            return recommendationsEligibilityStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recsEligibilityStore");
        return null;
    }

    public final void setRecsEligibilityStore(RecommendationsEligibilityStore recommendationsEligibilityStore) {
        Intrinsics.checkNotNullParameter(recommendationsEligibilityStore, "<set-?>");
        this.recsEligibilityStore = recommendationsEligibilityStore;
    }

    public final RecommendationsReentryStore getRecsReentryStore() {
        RecommendationsReentryStore recommendationsReentryStore = this.recsReentryStore;
        if (recommendationsReentryStore != null) {
            return recommendationsReentryStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recsReentryStore");
        return null;
    }

    public final void setRecsReentryStore(RecommendationsReentryStore recommendationsReentryStore) {
        Intrinsics.checkNotNullParameter(recommendationsReentryStore, "<set-?>");
        this.recsReentryStore = recommendationsReentryStore;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-58706998);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-58706998, i, -1, "com.robinhood.android.recommendations.lib.ui.RecommendationsLoadingFragment.ComposeContent (RecommendationsLoadingFragment.kt:34)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), null, true, false, composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.lib.ui.RecommendationsLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecommendationsLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Singles singles = Singles.INSTANCE;
        Single<Boolean> singleOnErrorReturnItem = getRecsEligibilityStore().getEligibility().onErrorReturnItem(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturnItem, "onErrorReturnItem(...)");
        Single<Optional<UiRecommendationsExistingAnswers>> singleOnErrorReturnItem2 = getRecsReentryStore().getExistingAnswers().onErrorReturnItem(Optional.INSTANCE.m2972of(null));
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturnItem2, "onErrorReturnItem(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singles.zip(singleOnErrorReturnItem, singleOnErrorReturnItem2)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.lib.ui.RecommendationsLoadingFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsLoadingFragment.onStart$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RecommendationsLoadingFragment recommendationsLoadingFragment, Tuples2 tuples2) {
        List<UiRecommendationsExistingAnswers.QuestionAnswerSummary> entryRows;
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        Boolean bool = (Boolean) tuples2.component1();
        Optional optional = (Optional) tuples2.component2();
        if (bool.booleanValue()) {
            UiRecommendationsExistingAnswers uiRecommendationsExistingAnswers = (UiRecommendationsExistingAnswers) optional.getOrNull();
            if (uiRecommendationsExistingAnswers != null && (entryRows = uiRecommendationsExistingAnswers.getEntryRows()) != null && (!entryRows.isEmpty())) {
                recommendationsLoadingFragment.getCallbacks().onRecommendationsReentry(uiRecommendationsExistingAnswers);
            } else {
                recommendationsLoadingFragment.getCallbacks().onRecommendationsEligibilityConfirmed();
            }
        } else {
            recommendationsLoadingFragment.getCallbacks().onRecommendationsEligibilityDenied();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: RecommendationsLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/lib/ui/RecommendationsLoadingFragment$Companion;", "", "<init>", "()V", "newInstance", "Landroidx/fragment/app/Fragment;", "feature-lib-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Fragment newInstance() {
            return new RecommendationsLoadingFragment();
        }
    }
}
