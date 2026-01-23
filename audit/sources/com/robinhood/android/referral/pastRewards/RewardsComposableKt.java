package com.robinhood.android.referral.pastRewards;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.referral.C26659R;
import com.robinhood.android.referral.pastRewards.RewardsComposableKt;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.p320db.CashReward;
import com.robinhood.models.p320db.RewardData;
import com.robinhood.models.p320db.RewardReferral;
import com.robinhood.models.p320db.StockReward;
import com.robinhood.models.p355ui.UiCashRewardItem;
import com.robinhood.models.p355ui.UiReferralStockRewardItem;
import com.robinhood.models.p355ui.UiRewards3;
import com.robinhood.models.p355ui.UiStandaloneStockRewardItem;
import com.robinhood.models.p355ui.UiStockRewardSection;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.format.InstantFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import p479j$.time.Instant;

/* compiled from: RewardsComposable.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nj\u0002`\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0002\u001a\u0015\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u001a]\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001d2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nj\u0002`\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u0011H\u0003¢\u0006\u0002\u0010\u001e\u001aE\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020 2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nj\u0002`\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u0011H\u0003¢\u0006\u0002\u0010!\u001aE\u0010\"\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020#2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nj\u0002`\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u0011H\u0003¢\u0006\u0002\u0010$\u001a\r\u0010%\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010&\"\u000e\u0010'\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"RewardsComposable", "", "title", "", "rewards", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiStockRewardSection;", "loading", "", "onClaim", "Lkotlin/Function1;", "Lcom/robinhood/models/db/RewardData;", "Lcom/robinhood/android/referral/pastRewards/ClaimReward;", "onRemind", "Lcom/robinhood/models/db/RewardReferral;", "Lcom/robinhood/android/referral/pastRewards/RemindReferral;", "openDetail", "Lcom/robinhood/android/referral/pastRewards/OpenDetail;", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "wrap", "Lcom/robinhood/android/referral/pastRewards/RewardItem;", "Lcom/robinhood/models/ui/UiRewardItem;", "HeaderRowView", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/referral/pastRewards/Header;", "(Lcom/robinhood/android/referral/pastRewards/Header;Landroidx/compose/runtime/Composer;I)V", "ReferralStockRewardRowView", "Lcom/robinhood/android/referral/pastRewards/ReferralStockRewardItem;", "(Lcom/robinhood/android/referral/pastRewards/ReferralStockRewardItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "StandaloneStockRewardRowView", "Lcom/robinhood/android/referral/pastRewards/StandaloneStockRewardItem;", "(Lcom/robinhood/android/referral/pastRewards/StandaloneStockRewardItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CashRewardRowView", "Lcom/robinhood/android/referral/pastRewards/CashRewardItem;", "(Lcom/robinhood/android/referral/pastRewards/CashRewardItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Loading", "(Landroidx/compose/runtime/Composer;I)V", "RewardsTestTagRewardHeader", "RewardsTestTagReferralStockReward", "RewardsTestTagStandaloneStockReward", "RewardsTestTagCashReward", "RewardsTestTagLoading", "RewardsTestTagBackButton", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RewardsComposableKt {
    public static final String RewardsTestTagBackButton = "RewardsBackButton";
    public static final String RewardsTestTagCashReward = "RewardsCashReward";
    public static final String RewardsTestTagLoading = "RewardsLoading";
    public static final String RewardsTestTagReferralStockReward = "RewardsReferralStockReward";
    public static final String RewardsTestTagRewardHeader = "RewardsRewardHeader";
    public static final String RewardsTestTagStandaloneStockReward = "RewardsStandaloneStockReward";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CashRewardRowView$lambda$19(CashRewardItem cashRewardItem, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        CashRewardRowView(cashRewardItem, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderRowView$lambda$3(Header header, int i, Composer composer, int i2) {
        HeaderRowView(header, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$20(int i, Composer composer, int i2) {
        Loading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReferralStockRewardRowView$lambda$9(ReferralStockRewardItem referralStockRewardItem, Function1 function1, Function1 function12, Function1 function13, int i, Composer composer, int i2) {
        ReferralStockRewardRowView(referralStockRewardItem, function1, function12, function13, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardsComposable$lambda$2(String str, ImmutableList immutableList, boolean z, Function1 function1, Function1 function12, Function1 function13, Function0 function0, int i, Composer composer, int i2) {
        RewardsComposable(str, immutableList, z, function1, function12, function13, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandaloneStockRewardRowView$lambda$14(StandaloneStockRewardItem standaloneStockRewardItem, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        StandaloneStockRewardRowView(standaloneStockRewardItem, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RewardsComposable(final String str, final ImmutableList<UiStockRewardSection> immutableList, final boolean z, final Function1<? super RewardData, Unit> onClaim, final Function1<? super RewardReferral, Unit> onRemind, final Function1<? super RewardData, Unit> openDetail, final Function0<Unit> onBackClick, Composer composer, final int i) {
        boolean z2;
        List listEmptyList;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onClaim, "onClaim");
        Intrinsics.checkNotNullParameter(onRemind, "onRemind");
        Intrinsics.checkNotNullParameter(openDetail, "openDetail");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(263208281);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClaim) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRemind) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(openDetail) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBackClick) ? 1048576 : 524288;
        }
        if ((599187 & i2) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(263208281, i2, -1, "com.robinhood.android.referral.pastRewards.RewardsComposable (RewardsComposable.kt:39)");
            }
            if (immutableList == null) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = new ArrayList();
                for (UiStockRewardSection uiStockRewardSection : immutableList) {
                    List listListOf = CollectionsKt.listOf(new Header(uiStockRewardSection.getSection().getName()));
                    List<UiRewards3> items = uiStockRewardSection.getItems();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
                    Iterator<T> it = items.iterator();
                    while (it.hasNext()) {
                        arrayList.add(wrap((UiRewards3) it.next()));
                    }
                    CollectionsKt.addAll(listEmptyList, CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList));
                }
            }
            List list = listEmptyList;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5625Scaffold27mzLpw(null, null, ComposableLambda3.rememberComposableLambda(1755657972, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt.RewardsComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1755657972, i4, -1, "com.robinhood.android.referral.pastRewards.RewardsComposable.<anonymous> (RewardsComposable.kt:47)");
                    }
                    final String str2 = str;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(717626599, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt.RewardsComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i5) {
                            if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(717626599, i5, -1, "com.robinhood.android.referral.pastRewards.RewardsComposable.<anonymous>.<anonymous> (RewardsComposable.kt:49)");
                            }
                            String str3 = str2;
                            if (str3 != null) {
                                BentoText2.m20747BentoText38GnDrw(str3, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextM(), composer4, 0, 0, 8190);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54);
                    final Function0<Unit> function0 = onBackClick;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(-1097871085, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt.RewardsComposable.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i5) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i5 & 6) == 0) {
                                i5 |= (i5 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i5 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1097871085, i5, -1, "com.robinhood.android.referral.pastRewards.RewardsComposable.<anonymous>.<anonymous> (RewardsComposable.kt:57)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, RewardsComposableKt.RewardsTestTagBackButton), false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | 6 | ((i5 << 12) & 57344), 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), ComposableLambda3.rememberComposableLambda(1929047771, true, new C267702(z2, list, onClaim, onRemind, openDetail), composerStartRestartGroup, 54), composer2, 384, 12582912, 32763);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardsComposableKt.RewardsComposable$lambda$2(str, immutableList, z, onClaim, onRemind, openDetail, onBackClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RewardsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.pastRewards.RewardsComposableKt$RewardsComposable$2 */
    static final class C267702 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ boolean $loading;
        final /* synthetic */ Function1<RewardData, Unit> $onClaim;
        final /* synthetic */ Function1<RewardReferral, Unit> $onRemind;
        final /* synthetic */ Function1<RewardData, Unit> $openDetail;
        final /* synthetic */ List<RewardItem> $rewardSections;

        /* JADX WARN: Multi-variable type inference failed */
        C267702(boolean z, List<? extends RewardItem> list, Function1<? super RewardData, Unit> function1, Function1<? super RewardReferral, Unit> function12, Function1<? super RewardData, Unit> function13) {
            this.$loading = z;
            this.$rewardSections = list;
            this.$onClaim = function1;
            this.$onRemind = function12;
            this.$openDetail = function13;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1929047771, i2, -1, "com.robinhood.android.referral.pastRewards.RewardsComposable.<anonymous> (RewardsComposable.kt:65)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), 0.0f, 1, null), paddingValues);
            boolean z = this.$loading;
            final List<RewardItem> list = this.$rewardSections;
            final Function1<RewardData, Unit> function1 = this.$onClaim;
            final Function1<RewardReferral, Unit> function12 = this.$onRemind;
            final Function1<RewardData, Unit> function13 = this.$openDetail;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z) {
                composer.startReplaceGroup(-553756060);
                RewardsComposableKt.Loading(composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-553679707);
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(list) | composer.changed(function1) | composer.changed(function12) | composer.changed(function13);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$RewardsComposable$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RewardsComposableKt.C267702.invoke$lambda$3$lambda$2$lambda$1(list, function1, function12, function13, (LazyListScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 511);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(final List list, final Function1 function1, final Function1 function12, final Function1 function13, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final C26765x6822d45f c26765x6822d45f = new Function1() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$RewardsComposable$2$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(RewardItem rewardItem) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((RewardItem) obj);
                }
            };
            LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$RewardsComposable$2$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c26765x6822d45f.invoke(list.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$RewardsComposable$2$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    Composer composer2;
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    RewardItem rewardItem = (RewardItem) list.get(i);
                    composer.startReplaceGroup(822673046);
                    if (rewardItem instanceof Header) {
                        composer.startReplaceGroup(996370180);
                        RewardsComposableKt.HeaderRowView((Header) rewardItem, composer, 0);
                        composer.endReplaceGroup();
                        composer2 = composer;
                    } else if (rewardItem instanceof ReferralStockRewardItem) {
                        composer.startReplaceGroup(996373137);
                        composer2 = composer;
                        RewardsComposableKt.ReferralStockRewardRowView((ReferralStockRewardItem) rewardItem, function1, function12, function13, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = composer;
                        if (rewardItem instanceof StandaloneStockRewardItem) {
                            composer2.startReplaceGroup(996381534);
                            RewardsComposableKt.StandaloneStockRewardRowView((StandaloneStockRewardItem) rewardItem, function1, function13, composer2, 0);
                            composer2.endReplaceGroup();
                        } else if (rewardItem instanceof CashRewardItem) {
                            composer2.startReplaceGroup(996388979);
                            RewardsComposableKt.CashRewardRowView((CashRewardItem) rewardItem, function1, function13, composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(996369165);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }
    }

    private static final RewardItem wrap(UiRewards3 uiRewards3) {
        if (uiRewards3 instanceof UiReferralStockRewardItem) {
            return new ReferralStockRewardItem((UiReferralStockRewardItem) uiRewards3);
        }
        if (uiRewards3 instanceof UiStandaloneStockRewardItem) {
            return new StandaloneStockRewardItem((UiStandaloneStockRewardItem) uiRewards3);
        }
        if (uiRewards3 instanceof UiCashRewardItem) {
            return new CashRewardItem((UiCashRewardItem) uiRewards3);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HeaderRowView(final Header header, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1894645681);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(header) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1894645681, i2, -1, "com.robinhood.android.referral.pastRewards.HeaderRowView (RewardsComposable.kt:109)");
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, RewardsTestTagRewardHeader), 0.0f, 1, null), 0.0f, composerStartRestartGroup, 6, 1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(header.getTitle(), PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composer2, 24576, 0, 8168);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardsComposableKt.HeaderRowView$lambda$3(header, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ReferralStockRewardRowView(ReferralStockRewardItem referralStockRewardItem, final Function1<? super RewardData, Unit> function1, final Function1<? super RewardReferral, Unit> function12, final Function1<? super RewardData, Unit> function13, Composer composer, final int i) {
        final ReferralStockRewardItem referralStockRewardItem2;
        int i2;
        String string2;
        String description;
        Money costBasis;
        Instant createdAt;
        Composer composerStartRestartGroup = composer.startRestartGroup(-541103937);
        if ((i & 6) == 0) {
            referralStockRewardItem2 = referralStockRewardItem;
            i2 = (composerStartRestartGroup.changedInstance(referralStockRewardItem2) ? 4 : 2) | i;
        } else {
            referralStockRewardItem2 = referralStockRewardItem;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-541103937, i2, -1, "com.robinhood.android.referral.pastRewards.ReferralStockRewardRowView (RewardsComposable.kt:129)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final RewardReferral referral = referralStockRewardItem2.getItem().getReferral();
            final StockReward reward = referralStockRewardItem2.getItem().getReward();
            if (reward != null && reward.getClaimable()) {
                string2 = context.getString(C26659R.string.symmetric_referral_past_referrals_claim);
            } else {
                string2 = referral.getRemindable() ? context.getString(C26659R.string.symmetric_referral_past_referrals_remind) : null;
            }
            String str = (reward == null || (createdAt = reward.getCreatedAt()) == null) ? null : InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(createdAt);
            if (str == null) {
                str = "";
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, RewardsTestTagReferralStockReward);
            if (reward == null || (description = reward.getDescription()) == null) {
                description = referral.getDescription();
            }
            String str2 = (reward == null || (costBasis = reward.getCostBasis()) == null) ? null : Money.format$default(costBasis, null, false, null, false, 0, null, false, null, false, false, 1023, null);
            String rewardDescription = reward != null ? reward.getRewardDescription() : null;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(reward) | ((i2 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RewardsComposableKt.ReferralStockRewardRowView$lambda$6$lambda$5(reward, function13);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            String str3 = string2;
            boolean zChangedInstance2 = ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(referral) | composerStartRestartGroup.changedInstance(reward) | ((i2 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RewardsComposableKt.ReferralStockRewardRowView$lambda$8$lambda$7(referral, function12, reward, function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            RewardRowComposable.RewardRowComposable(description, modifierTestTag, str, str2, rewardDescription, str3, false, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 48, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardsComposableKt.ReferralStockRewardRowView$lambda$9(referralStockRewardItem2, function1, function12, function13, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReferralStockRewardRowView$lambda$6$lambda$5(StockReward stockReward, Function1 function1) {
        if (stockReward != null) {
            function1.invoke(stockReward);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReferralStockRewardRowView$lambda$8$lambda$7(RewardReferral rewardReferral, Function1 function1, StockReward stockReward, Function1 function12) {
        if (rewardReferral.getRemindable()) {
            function1.invoke(rewardReferral);
        } else if (stockReward != null && stockReward.getClaimable()) {
            function12.invoke(stockReward);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StandaloneStockRewardRowView(final StandaloneStockRewardItem standaloneStockRewardItem, final Function1<? super RewardData, Unit> function1, final Function1<? super RewardData, Unit> function12, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(184783282);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(standaloneStockRewardItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(184783282, i2, -1, "com.robinhood.android.referral.pastRewards.StandaloneStockRewardRowView (RewardsComposable.kt:171)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final StockReward reward = standaloneStockRewardItem.getItem().getReward();
            String string2 = reward.getClaimable() ? context.getString(C26659R.string.symmetric_referral_past_referrals_claim) : null;
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, RewardsTestTagStandaloneStockReward);
            String description = reward.getDescription();
            String str = InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(reward.getCreatedAt());
            Money costBasis = reward.getCostBasis();
            String str2 = costBasis != null ? Money.format$default(costBasis, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null;
            String rewardDescription = reward.getRewardDescription();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(reward) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RewardsComposableKt.StandaloneStockRewardRowView$lambda$11$lambda$10(reward, function12);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(reward) | ((i2 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RewardsComposableKt.StandaloneStockRewardRowView$lambda$13$lambda$12(reward, function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            RewardRowComposable.RewardRowComposable(description, modifierTestTag, str, str2, rewardDescription, string2, false, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 48, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardsComposableKt.StandaloneStockRewardRowView$lambda$14(standaloneStockRewardItem, function1, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandaloneStockRewardRowView$lambda$11$lambda$10(StockReward stockReward, Function1 function1) {
        if (!stockReward.getClaimable()) {
            function1.invoke(stockReward);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandaloneStockRewardRowView$lambda$13$lambda$12(StockReward stockReward, Function1 function1) {
        if (stockReward.getClaimable()) {
            function1.invoke(stockReward);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CashRewardRowView(final CashRewardItem cashRewardItem, final Function1<? super RewardData, Unit> function1, final Function1<? super RewardData, Unit> function12, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2050646488);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(cashRewardItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2050646488, i2, -1, "com.robinhood.android.referral.pastRewards.CashRewardRowView (RewardsComposable.kt:203)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final CashReward reward = cashRewardItem.getItem().getReward();
            String string2 = reward.getClaimable() ? context.getString(C26659R.string.symmetric_referral_past_referrals_claim) : null;
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, RewardsTestTagCashReward);
            String description = reward.getDescription();
            String str = InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(reward.getCreatedAt());
            Money costBasis = reward.getCostBasis();
            String str2 = costBasis != null ? Money.format$default(costBasis, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null;
            String rewardDescription = reward.getRewardDescription();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(reward) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RewardsComposableKt.CashRewardRowView$lambda$16$lambda$15(reward, function12);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(reward) | ((i2 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RewardsComposableKt.CashRewardRowView$lambda$18$lambda$17(reward, function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            RewardRowComposable.RewardRowComposable(description, modifierTestTag, str, str2, rewardDescription, string2, false, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 48, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardsComposableKt.CashRewardRowView$lambda$19(cashRewardItem, function1, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CashRewardRowView$lambda$16$lambda$15(CashReward cashReward, Function1 function1) {
        if (!cashReward.getClaimable()) {
            function1.invoke(cashReward);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CashRewardRowView$lambda$18$lambda$17(CashReward cashReward, Function1 function1) {
        if (cashReward.getClaimable()) {
            function1.invoke(cashReward);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2123989222);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2123989222, i, -1, "com.robinhood.android.referral.pastRewards.Loading (RewardsComposable.kt:231)");
            }
            LocalShowPlaceholder.Loadable(true, TestTag3.testTag(Modifier.INSTANCE, RewardsTestTagLoading), null, ComposableSingletons$RewardsComposableKt.INSTANCE.getLambda$1568461706$feature_referral_externalDebug(), composerStartRestartGroup, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.pastRewards.RewardsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardsComposableKt.Loading$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
