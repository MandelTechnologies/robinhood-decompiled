package com.robinhood.android.recommendations.p224ui.utils;

import android.content.Context;
import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.p224ui.walkthrough.PortfolioBlocksDrawable;
import com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsPortfolio;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UiRecommendationPortfolios.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00032\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\b\u001a\u00020\t¨\u0006\r"}, m3636d2 = {"getPages", "", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio;", "res", "Landroid/content/res/Resources;", "getPortfolioBlocks", "Lcom/robinhood/android/recommendations/ui/walkthrough/PortfolioBlocksDrawable$Block;", "context", "Landroid/content/Context;", "createExitAlertDialog", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$Summary;", "feature-recommendations_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.recommendations.ui.utils.UiRecommendationPortfoliosKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UiRecommendationPortfolios {
    public static final List<RecommendationsWalkthroughPage> getPages(UiRecommendationsPortfolio uiRecommendationsPortfolio, Resources res) {
        Intrinsics.checkNotNullParameter(uiRecommendationsPortfolio, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        RecommendationsWalkthroughPage.Companion companion = RecommendationsWalkthroughPage.INSTANCE;
        UiRecommendationsPortfolio.SimplePage diversification = uiRecommendationsPortfolio.getDiversification();
        RecommendationsWalkthroughPage.AnimationType animationType = RecommendationsWalkthroughPage.AnimationType.LOTTIE;
        List listListOf = CollectionsKt.listOf((Object[]) new RecommendationsWalkthroughPage.Simple[]{companion.from(diversification, animationType, 0, 0, new Screen(Screen.Name.RECS_PORTFOLIO_DIVERSIFICATION, null, null, null, 14, null), res.getString(C25978R.string.recommendations_walkthrough_diversification_disclosure)), RecommendationsWalkthroughPage.Companion.from$default(companion, uiRecommendationsPortfolio.getPortfolioIncludes(), animationType, 0, 90, new Screen(Screen.Name.RECS_PORTFOLIO_INCLUDES, null, null, null, 14, null), (String) null, 32, (Object) null)});
        int i = 0;
        UiRecommendationsPortfolio.AssetPage assetPage = uiRecommendationsPortfolio.getAssetWalkthrough().get(0);
        UUID id = uiRecommendationsPortfolio.getPortfolio().get(0).getId();
        Screen.Name name = Screen.Name.RECS_PORTFOLIO_WALKTHROUGH;
        String string2 = uiRecommendationsPortfolio.getPortfolio().get(0).getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        List listPlus = CollectionsKt.plus((Collection) listListOf, (Iterable) CollectionsKt.listOf(companion.from(assetPage, animationType, 90, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, id, new Screen(name, null, string2, null, 10, null))));
        List<UiRecommendationsPortfolio.AssetPage> listSubList = uiRecommendationsPortfolio.getAssetWalkthrough().subList(1, uiRecommendationsPortfolio.getAssetWalkthrough().size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
        for (Object obj : listSubList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            UiRecommendationsPortfolio.AssetPage assetPage2 = (UiRecommendationsPortfolio.AssetPage) obj;
            RecommendationsWalkthroughPage.Companion companion2 = RecommendationsWalkthroughPage.INSTANCE;
            RecommendationsWalkthroughPage.AnimationType animationType2 = RecommendationsWalkthroughPage.AnimationType.LOTTIE;
            int i3 = i * 60;
            int i4 = i3 + EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
            int i5 = i3 + EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
            UUID id2 = uiRecommendationsPortfolio.getPortfolio().get(i2).getId();
            Screen.Name name2 = Screen.Name.RECS_PORTFOLIO_WALKTHROUGH;
            String string3 = uiRecommendationsPortfolio.getPortfolio().get(i2).getId().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            arrayList.add(companion2.from(assetPage2, animationType2, i4, i5, id2, new Screen(name2, null, string3, null, 10, null)));
            i = i2;
        }
        List listPlus2 = CollectionsKt.plus((Collection) listPlus, (Iterable) arrayList);
        RecommendationsWalkthroughPage.Companion companion3 = RecommendationsWalkthroughPage.INSTANCE;
        return CollectionsKt.plus((Collection) listPlus2, (Iterable) CollectionsKt.listOf((Object[]) new RecommendationsWalkthroughPage.Simple[]{RecommendationsWalkthroughPage.Companion.from$default(companion3, uiRecommendationsPortfolio.getAllocation(), RecommendationsWalkthroughPage.AnimationType.PORTFOLIO_VIEW_INCOMING, 340, 340, new Screen(Screen.Name.RECS_PORTFOLIO_ALLOCATION, null, null, null, 14, null), (String) null, 32, (Object) null), RecommendationsWalkthroughPage.Companion.from$default(companion3, uiRecommendationsPortfolio.getAllocation(), RecommendationsWalkthroughPage.AnimationType.PORTFOLIO_VIEW_WEIGHTED, 340, 340, (Screen) null, (String) null, 48, (Object) null)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<PortfolioBlocksDrawable.Block> getPortfolioBlocks(UiRecommendationsPortfolio uiRecommendationsPortfolio, Context context) throws Resources.NotFoundException {
        int themeColor;
        Intrinsics.checkNotNullParameter(uiRecommendationsPortfolio, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        List<UiRecommendationsPortfolio.BreakdownRow> breakdownRows = uiRecommendationsPortfolio.getSummary().getBreakdownRows();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(breakdownRows, 10));
        int i = 0;
        for (Object obj : breakdownRows) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float weight = uiRecommendationsPortfolio.getPortfolio().get(i).getWeight();
            ResourceReferences4<Integer> resourceReferences4MapSimpleServerColor = ServerToBentoColorMapper.INSTANCE.mapSimpleServerColor(((UiRecommendationsPortfolio.BreakdownRow) obj).getColor());
            if (resourceReferences4MapSimpleServerColor != null) {
                Resources.Theme theme = context.getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                Integer numResolve = resourceReferences4MapSimpleServerColor.resolve(theme);
                if (numResolve != null) {
                    themeColor = numResolve.intValue();
                } else {
                    themeColor = ThemeColors.getThemeColor(context, C13997R.attr.paletteColorPrime);
                }
            }
            arrayList.add(new PortfolioBlocksDrawable.Block(weight, 0.0f, 0.0f, themeColor, 6, null));
            i = i2;
        }
        return arrayList;
    }

    public static final RhDialogFragment.Builder createExitAlertDialog(UiRecommendationsPortfolio.Summary summary, Context context) {
        Intrinsics.checkNotNullParameter(summary, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new RhDialogFragment.Builder(context).setTitle(summary.getExitConfirmationAlert().getTitle()).setMessage(summary.getExitConfirmationAlert().getSubtitleMarkdown()).setPositiveButton(summary.getExitConfirmationAlert().getConfirmButtonTitle()).setNegativeButton(summary.getExitConfirmationAlert().getDismissButtonTitle()).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Negative);
    }
}
