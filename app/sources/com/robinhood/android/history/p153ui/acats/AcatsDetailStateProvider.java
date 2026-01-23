package com.robinhood.android.history.p153ui.acats;

import android.net.Uri;
import android.text.Spanned;
import com.robinhood.android.history.p153ui.AcatsInDetailBannerView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.acats.p299db.bonfire.AcatsDetailPageResponse;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.models.serverdriven.p347db.StandardRow;
import com.robinhood.models.serverdriven.p347db.TimelineRow;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/history/ui/acats/AcatsDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/history/ui/acats/AcatsDetailDataState;", "Lcom/robinhood/android/history/ui/acats/AcatsDetailViewState;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Lio/noties/markwon/Markwon;)V", "reduce", "dataState", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AcatsDetailStateProvider implements StateProvider<AcatsDetailDataState, AcatsDetailViewState> {
    public static final int $stable = 8;
    private final Markwon markwon;

    public AcatsDetailStateProvider(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public AcatsDetailViewState reduce(AcatsDetailDataState dataState) {
        List<StandardRow> listEmptyList;
        List listEmptyList2;
        GenericAlert helpAlertSheet;
        List<GenericButton> buttons;
        GenericAlert helpAlertSheet2;
        String subtitleMarkdown;
        GenericAlert helpAlertSheet3;
        List<GenericButton> footerButtons;
        AcatsDetailPageResponse.AcatsDetailPageBanner banner;
        GenericButton button;
        AcatsDetailPageResponse.AcatsDetailPageBanner banner2;
        GenericButton button2;
        AcatsDetailPageResponse.AcatsDetailPageBanner banner3;
        AcatsDetailPageResponse.AcatsDetailPageBanner banner4;
        String content;
        AcatsDetailPageResponse.AcatsDetailPageBanner banner5;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        AcatsDetailPageResponse detailPageResponse = dataState.getDetailPageResponse();
        String title = (detailPageResponse == null || (banner5 = detailPageResponse.getBanner()) == null) ? null : banner5.getTitle();
        AcatsDetailPageResponse detailPageResponse2 = dataState.getDetailPageResponse();
        Spanned markdown = (detailPageResponse2 == null || (banner4 = detailPageResponse2.getBanner()) == null || (content = banner4.getContent()) == null) ? null : this.markwon.toMarkdown(content);
        AcatsDetailPageResponse detailPageResponse3 = dataState.getDetailPageResponse();
        String estimatedCompletionDate = (detailPageResponse3 == null || (banner3 = detailPageResponse3.getBanner()) == null) ? null : banner3.getEstimatedCompletionDate();
        AcatsDetailPageResponse detailPageResponse4 = dataState.getDetailPageResponse();
        String title2 = (detailPageResponse4 == null || (banner2 = detailPageResponse4.getBanner()) == null || (button2 = banner2.getButton()) == null) ? null : button2.getTitle();
        AcatsDetailPageResponse detailPageResponse5 = dataState.getDetailPageResponse();
        GenericAction typedAction = (detailPageResponse5 == null || (banner = detailPageResponse5.getBanner()) == null || (button = banner.getButton()) == null) ? null : button.getTypedAction();
        GenericAction.DeeplinkAction deeplinkAction = typedAction instanceof GenericAction.DeeplinkAction ? (GenericAction.DeeplinkAction) typedAction : null;
        Uri uri = deeplinkAction != null ? deeplinkAction.getUri() : null;
        boolean z = dataState.getDetailPageResponse() == null;
        AcatsDetailPageResponse detailPageResponse6 = dataState.getDetailPageResponse();
        String title3 = detailPageResponse6 != null ? detailPageResponse6.getTitle() : null;
        AcatsDetailPageResponse detailPageResponse7 = dataState.getDetailPageResponse();
        String subtitle = detailPageResponse7 != null ? detailPageResponse7.getSubtitle() : null;
        List<TimelineRow> timelineRows = dataState.getTimelineRows();
        AcatsDetailPageResponse detailPageResponse8 = dataState.getDetailPageResponse();
        if (detailPageResponse8 == null || (listEmptyList = detailPageResponse8.getDetailRows()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<StandardRow> list = listEmptyList;
        AcatsDetailPageResponse detailPageResponse9 = dataState.getDetailPageResponse();
        if (detailPageResponse9 == null || (footerButtons = detailPageResponse9.getFooterButtons()) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        } else {
            List<GenericButton> list2 = footerButtons;
            listEmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                listEmptyList2.add(ServerDrivenButton.INSTANCE.from((GenericButton) it.next()));
            }
        }
        List list3 = listEmptyList2;
        Unit unit = !dataState.getTimelineRows().isEmpty() ? Unit.INSTANCE : null;
        AcatsDetailPageResponse detailPageResponse10 = dataState.getDetailPageResponse();
        AcatsInDetailBannerView.BannerViewData bannerViewData = (detailPageResponse10 == null || detailPageResponse10.getBanner() == null) ? null : new AcatsInDetailBannerView.BannerViewData(title, estimatedCompletionDate, markdown, title2, uri);
        boolean showHelpIcon = dataState.getShowHelpIcon();
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = dataState.getShowHelpIcon() ? ServerToBentoAssetMapper2.HELP_24 : null;
        AcatsDetailPageResponse detailPageResponse11 = dataState.getDetailPageResponse();
        String title4 = (detailPageResponse11 == null || (helpAlertSheet3 = detailPageResponse11.getHelpAlertSheet()) == null) ? null : helpAlertSheet3.getTitle();
        AcatsDetailPageResponse detailPageResponse12 = dataState.getDetailPageResponse();
        Spanned markdown2 = (detailPageResponse12 == null || (helpAlertSheet2 = detailPageResponse12.getHelpAlertSheet()) == null || (subtitleMarkdown = helpAlertSheet2.getSubtitleMarkdown()) == null) ? null : this.markwon.toMarkdown(subtitleMarkdown);
        AcatsDetailPageResponse detailPageResponse13 = dataState.getDetailPageResponse();
        GenericButton genericButton = (detailPageResponse13 == null || (helpAlertSheet = detailPageResponse13.getHelpAlertSheet()) == null || (buttons = helpAlertSheet.getButtons()) == null) ? null : (GenericButton) CollectionsKt.first((List) buttons);
        AcatsDetailPageResponse detailPageResponse14 = dataState.getDetailPageResponse();
        return new AcatsDetailViewState(null, z, title3, subtitle, timelineRows, list, list3, unit, bannerViewData, showHelpIcon, serverToBentoAssetMapper2, title4, markdown2, genericButton, detailPageResponse14 != null ? detailPageResponse14.getGoldDepositBoost() : null, 1, null);
    }
}
