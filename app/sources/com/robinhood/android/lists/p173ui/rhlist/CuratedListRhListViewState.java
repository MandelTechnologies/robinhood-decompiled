package com.robinhood.android.lists.p173ui.rhlist;

import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListViewState2;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListViewState4;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.directipo.models.api.ApiIpoAccessListEmptyState;
import com.robinhood.directipo.models.api.ApiIpoAccessListViewModel;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p320db.IpoAccessStatus;
import com.robinhood.models.p320db.bonfire.ListDisclosure;
import com.robinhood.models.p355ui.CryptoCuratedListEligible;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.models.p355ui.FuturesCuratedListEligible;
import com.robinhood.models.p355ui.InstrumentCuratedListEligible;
import com.robinhood.models.p355ui.SortOption;
import com.robinhood.shared.iac.extensions.IacInfoBanners;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CuratedListRhListViewState.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001:\u0004«\u0001¬\u0001B\u0095\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%¢\u0006\u0004\b'\u0010(J\r\u0010\u008c\u0001\u001a\u00020c*\u00020EH\u0002J\u0012\u0010\u008d\u0001\u001a\u00020\t2\u0007\u0010\u008e\u0001\u001a\u00020JH\u0002J\n\u0010\u0092\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\tHÆ\u0003J\u0012\u0010\u0096\u0001\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u0097\u0001\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u0098\u0001\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u0099\u0001\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u009a\u0001\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u009b\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000bHÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\tHÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u001cHÂ\u0003J\n\u0010¡\u0001\u001a\u00020\u001eHÂ\u0003J\n\u0010¢\u0001\u001a\u00020\tHÂ\u0003J\n\u0010£\u0001\u001a\u00020\tHÂ\u0003J\u0010\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020#0\"HÆ\u0003J\u0012\u0010¥\u0001\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%HÆ\u0003J\u0098\u0002\u0010¦\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%HÆ\u0001J\u0015\u0010§\u0001\u001a\u00020\t2\t\u0010¨\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010©\u0001\u001a\u00020\u0007HÖ\u0001J\n\u0010ª\u0001\u001a\u00020sHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b7\u00102R\u0011\u0010\u0014\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b8\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0019\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010D\u001a\u0004\u0018\u00010E¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u000e\u0010H\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010K\u001a\u0004\u0018\u00010L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u000e\u0010O\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010P\u001a\u0004\u0018\u00010&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020J0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010R\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bS\u0010@R\u0019\u0010T\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bU\u0010@R\u0011\u0010V\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bW\u00100R\u0011\u0010X\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bY\u00100R\u0011\u0010Z\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b[\u00100R\u0011\u0010\\\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b]\u00100R\u0011\u0010^\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b_\u00100R\u0010\u0010`\u001a\u0004\u0018\u00010aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010b\u001a\u0004\u0018\u00010c¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0013\u0010f\u001a\u0004\u0018\u00010c¢\u0006\b\n\u0000\u001a\u0004\bg\u0010eR\u0013\u0010h\u001a\u0004\u0018\u00010L¢\u0006\b\n\u0000\u001a\u0004\bi\u0010NR\u0013\u0010j\u001a\u0004\u0018\u00010k¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00130\"8F¢\u0006\u0006\u001a\u0004\bo\u0010@R\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00130\"8F¢\u0006\u0006\u001a\u0004\bq\u0010@R\u0013\u0010r\u001a\u0004\u0018\u00010s¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0014\u0010v\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u00100R\u0013\u0010x\u001a\u0004\u0018\u00010y8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0013\u0010|\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0012\u0010\u007f\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u00100R\u0013\u0010\u0081\u0001\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u00100R\u000f\u0010\u0083\u0001\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0084\u0001\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u00100R\u0013\u0010\u0086\u0001\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u00100R\u0013\u0010\u0088\u0001\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u00100R\u0013\u0010\u008a\u0001\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u00100R\u0016\u0010\u008b\u0001\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u00100R\u0016\u0010\u008f\u0001\u001a\u0004\u0018\u00010#¢\u0006\n\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u00ad\u0001"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState;", "", "curatedListState", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListState;", "curatedListItemState", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListItemState;", "totalListItemCount", "", "updatingFollowStatus", "", "followSuccessEvent", "Lcom/robinhood/udf/UiEvent;", "followErrorEvent", "", "updatedListErrorEvent", "showIpoNotificationBottomSheetEvent", "", "showIpoAccessOnboardingEvent", "showIpoAnnouncementEvent", "Ljava/util/UUID;", "showErrorImage", "currentSortOption", "Lcom/robinhood/models/ui/SortOption;", "viewMode", "Lcom/robinhood/models/db/CuratedListViewMode;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/models/db/bonfire/ListDisclosure;", "ipoAccessListViewModel", "Lcom/robinhood/directipo/models/api/ApiIpoAccessListViewModel;", "ipoAccessFilter", "Lcom/robinhood/android/lists/ui/rhlist/IpoAccessFilter;", "canShowMenuOptions", "isLoadingExpandedItems", "iacInfoBanners", "", "Lcom/robinhood/models/db/IacInfoBanner;", "filters", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter;", "<init>", "(Lcom/robinhood/android/lists/ui/rhlist/CuratedListState;Lcom/robinhood/android/lists/ui/rhlist/CuratedListItemState;IZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/models/ui/SortOption;Lcom/robinhood/models/db/CuratedListViewMode;Lcom/robinhood/models/db/bonfire/ListDisclosure;Lcom/robinhood/directipo/models/api/ApiIpoAccessListViewModel;Lcom/robinhood/android/lists/ui/rhlist/IpoAccessFilter;ZZLjava/util/List;Lkotlinx/collections/immutable/ImmutableList;)V", "getCuratedListState", "()Lcom/robinhood/android/lists/ui/rhlist/CuratedListState;", "getCuratedListItemState", "()Lcom/robinhood/android/lists/ui/rhlist/CuratedListItemState;", "getTotalListItemCount", "()I", "getUpdatingFollowStatus", "()Z", "getFollowSuccessEvent", "()Lcom/robinhood/udf/UiEvent;", "getFollowErrorEvent", "getUpdatedListErrorEvent", "getShowIpoNotificationBottomSheetEvent", "getShowIpoAccessOnboardingEvent", "getShowIpoAnnouncementEvent", "getShowErrorImage", "getCurrentSortOption", "()Lcom/robinhood/models/ui/SortOption;", "getViewMode", "()Lcom/robinhood/models/db/CuratedListViewMode;", "getDisclosure", "()Lcom/robinhood/models/db/bonfire/ListDisclosure;", "getIacInfoBanners", "()Ljava/util/List;", "getFilters", "()Lkotlinx/collections/immutable/ImmutableList;", "isLoadingListItems", "curatedList", "Lcom/robinhood/models/db/CuratedList;", "getCuratedList", "()Lcom/robinhood/models/db/CuratedList;", "showIpoAccessList", "curatedListEligibleItems", "Lcom/robinhood/models/ui/CuratedListEligible;", "serverDrivenIpoAccessEmptyState", "Lcom/robinhood/directipo/models/api/ApiIpoAccessListEmptyState;", "getServerDrivenIpoAccessEmptyState", "()Lcom/robinhood/directipo/models/api/ApiIpoAccessListEmptyState;", "showListItems", "selectedFilter", "filteredCuratedListItems", "visibleCuratedListItems", "getVisibleCuratedListItems", "visibleIpoAccessCuratedItems", "getVisibleIpoAccessCuratedItems", "showListError", "getShowListError", "showLoading", "getShowLoading", "showListItemError", "getShowListItemError", "showEmpty", "getShowEmpty", "showRelatedListCarousel", "getShowRelatedListCarousel", "headerDescription", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "headerState", "Lcom/robinhood/android/lists/ui/rhlist/HeaderState;", "getHeaderState", "()Lcom/robinhood/android/lists/ui/rhlist/HeaderState;", "ipoHeaderState", "getIpoHeaderState", "ipoAccessEmptyState", "getIpoAccessEmptyState", "relatedListCarouselState", "Lcom/robinhood/android/lists/ui/rhlist/RelatedListCarouselState;", "getRelatedListCarouselState", "()Lcom/robinhood/android/lists/ui/rhlist/RelatedListCarouselState;", "curatedListInstrumentItemsIds", "getCuratedListInstrumentItemsIds", "curatedListCurrencyPairIds", "getCuratedListCurrencyPairIds", "toolbarTitle", "", "getToolbarTitle", "()Ljava/lang/String;", "areItemsTruncated", "getAreItemsTruncated", "showAllItemsRowData", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$ShowAllItemsRowData;", "getShowAllItemsRowData", "()Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$ShowAllItemsRowData;", "selectedIpoAccessFilter", "getSelectedIpoAccessFilter", "()Lcom/robinhood/android/lists/ui/rhlist/IpoAccessFilter;", "showRhListDetail", "getShowRhListDetail", "showRhControlsButton", "getShowRhControlsButton", "isFollowableOrUnfollowable", "showFollowListMenuOption", "getShowFollowListMenuOption", "showUnfollowListMenuOption", "getShowUnfollowListMenuOption", "showLoadingListMenuOption", "getShowLoadingListMenuOption", "isFuturesOnlyList", "isListFollowed", "toHeaderState", "isCuratedListEligiblePreIpo", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "iacInfoBannerData", "getIacInfoBannerData", "()Lcom/robinhood/models/db/IacInfoBanner;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "toString", "ShowAllItemsRowData", "Filter", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class CuratedListRhListViewState {
    public static final int $stable = 8;
    private final boolean canShowMenuOptions;
    private final CuratedList curatedList;
    private final List<CuratedListEligible> curatedListEligibleItems;
    private final CuratedListRhListViewState2 curatedListItemState;
    private final CuratedListRhListViewState4 curatedListState;
    private final SortOption currentSortOption;
    private final ListDisclosure disclosure;
    private final List<CuratedListEligible> filteredCuratedListItems;
    private final ImmutableList<Filter> filters;
    private final UiEvent<Throwable> followErrorEvent;
    private final UiEvent<Boolean> followSuccessEvent;
    private final MarkdownContent headerDescription;
    private final HeaderState headerState;
    private final IacInfoBanner iacInfoBannerData;
    private final List<IacInfoBanner> iacInfoBanners;
    private final ApiIpoAccessListEmptyState ipoAccessEmptyState;
    private final CuratedListRhListViewState6 ipoAccessFilter;
    private final ApiIpoAccessListViewModel ipoAccessListViewModel;
    private final HeaderState ipoHeaderState;
    private final boolean isFollowableOrUnfollowable;
    private final boolean isFuturesOnlyList;
    private final boolean isLoadingExpandedItems;
    private final boolean isLoadingListItems;
    private final RelatedListCarouselState relatedListCarouselState;
    private final Filter selectedFilter;
    private final CuratedListRhListViewState6 selectedIpoAccessFilter;
    private final boolean showEmpty;
    private final boolean showErrorImage;
    private final boolean showFollowListMenuOption;
    private final boolean showIpoAccessList;
    private final UiEvent<Unit> showIpoAccessOnboardingEvent;
    private final UiEvent<UUID> showIpoAnnouncementEvent;
    private final UiEvent<Unit> showIpoNotificationBottomSheetEvent;
    private final boolean showListError;
    private final boolean showListItemError;
    private final boolean showListItems;
    private final boolean showLoading;
    private final boolean showLoadingListMenuOption;
    private final boolean showRelatedListCarousel;
    private final boolean showUnfollowListMenuOption;
    private final String toolbarTitle;
    private final int totalListItemCount;
    private final UiEvent<Throwable> updatedListErrorEvent;
    private final boolean updatingFollowStatus;
    private final CuratedListViewMode viewMode;
    private final List<CuratedListEligible> visibleCuratedListItems;
    private final List<CuratedListEligible> visibleIpoAccessCuratedItems;

    /* compiled from: CuratedListRhListViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CuratedListRhListViewState6.values().length];
            try {
                iArr[CuratedListRhListViewState6.IN_FLIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CuratedListRhListViewState6.LAUNCHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CuratedListRhListViewState6.LEARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CuratedListRhListViewState() {
        this(null, null, 0, false, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, 1048575, null);
    }

    /* renamed from: component15, reason: from getter */
    private final ApiIpoAccessListViewModel getIpoAccessListViewModel() {
        return this.ipoAccessListViewModel;
    }

    /* renamed from: component16, reason: from getter */
    private final CuratedListRhListViewState6 getIpoAccessFilter() {
        return this.ipoAccessFilter;
    }

    /* renamed from: component17, reason: from getter */
    private final boolean getCanShowMenuOptions() {
        return this.canShowMenuOptions;
    }

    /* renamed from: component18, reason: from getter */
    private final boolean getIsLoadingExpandedItems() {
        return this.isLoadingExpandedItems;
    }

    public static /* synthetic */ CuratedListRhListViewState copy$default(CuratedListRhListViewState curatedListRhListViewState, CuratedListRhListViewState4 curatedListRhListViewState4, CuratedListRhListViewState2 curatedListRhListViewState2, int i, boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, UiEvent uiEvent6, boolean z2, SortOption sortOption, CuratedListViewMode curatedListViewMode, ListDisclosure listDisclosure, ApiIpoAccessListViewModel apiIpoAccessListViewModel, CuratedListRhListViewState6 curatedListRhListViewState6, boolean z3, boolean z4, List list, ImmutableList immutableList, int i2, Object obj) {
        ImmutableList immutableList2;
        List list2;
        CuratedListRhListViewState4 curatedListRhListViewState42 = (i2 & 1) != 0 ? curatedListRhListViewState.curatedListState : curatedListRhListViewState4;
        CuratedListRhListViewState2 curatedListRhListViewState22 = (i2 & 2) != 0 ? curatedListRhListViewState.curatedListItemState : curatedListRhListViewState2;
        int i3 = (i2 & 4) != 0 ? curatedListRhListViewState.totalListItemCount : i;
        boolean z5 = (i2 & 8) != 0 ? curatedListRhListViewState.updatingFollowStatus : z;
        UiEvent uiEvent7 = (i2 & 16) != 0 ? curatedListRhListViewState.followSuccessEvent : uiEvent;
        UiEvent uiEvent8 = (i2 & 32) != 0 ? curatedListRhListViewState.followErrorEvent : uiEvent2;
        UiEvent uiEvent9 = (i2 & 64) != 0 ? curatedListRhListViewState.updatedListErrorEvent : uiEvent3;
        UiEvent uiEvent10 = (i2 & 128) != 0 ? curatedListRhListViewState.showIpoNotificationBottomSheetEvent : uiEvent4;
        UiEvent uiEvent11 = (i2 & 256) != 0 ? curatedListRhListViewState.showIpoAccessOnboardingEvent : uiEvent5;
        UiEvent uiEvent12 = (i2 & 512) != 0 ? curatedListRhListViewState.showIpoAnnouncementEvent : uiEvent6;
        boolean z6 = (i2 & 1024) != 0 ? curatedListRhListViewState.showErrorImage : z2;
        SortOption sortOption2 = (i2 & 2048) != 0 ? curatedListRhListViewState.currentSortOption : sortOption;
        CuratedListViewMode curatedListViewMode2 = (i2 & 4096) != 0 ? curatedListRhListViewState.viewMode : curatedListViewMode;
        ListDisclosure listDisclosure2 = (i2 & 8192) != 0 ? curatedListRhListViewState.disclosure : listDisclosure;
        CuratedListRhListViewState4 curatedListRhListViewState43 = curatedListRhListViewState42;
        ApiIpoAccessListViewModel apiIpoAccessListViewModel2 = (i2 & 16384) != 0 ? curatedListRhListViewState.ipoAccessListViewModel : apiIpoAccessListViewModel;
        CuratedListRhListViewState6 curatedListRhListViewState62 = (i2 & 32768) != 0 ? curatedListRhListViewState.ipoAccessFilter : curatedListRhListViewState6;
        boolean z7 = (i2 & 65536) != 0 ? curatedListRhListViewState.canShowMenuOptions : z3;
        boolean z8 = (i2 & 131072) != 0 ? curatedListRhListViewState.isLoadingExpandedItems : z4;
        List list3 = (i2 & 262144) != 0 ? curatedListRhListViewState.iacInfoBanners : list;
        if ((i2 & 524288) != 0) {
            list2 = list3;
            immutableList2 = curatedListRhListViewState.filters;
        } else {
            immutableList2 = immutableList;
            list2 = list3;
        }
        return curatedListRhListViewState.copy(curatedListRhListViewState43, curatedListRhListViewState22, i3, z5, uiEvent7, uiEvent8, uiEvent9, uiEvent10, uiEvent11, uiEvent12, z6, sortOption2, curatedListViewMode2, listDisclosure2, apiIpoAccessListViewModel2, curatedListRhListViewState62, z7, z8, list2, immutableList2);
    }

    /* renamed from: component1, reason: from getter */
    public final CuratedListRhListViewState4 getCuratedListState() {
        return this.curatedListState;
    }

    public final UiEvent<UUID> component10() {
        return this.showIpoAnnouncementEvent;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowErrorImage() {
        return this.showErrorImage;
    }

    /* renamed from: component12, reason: from getter */
    public final SortOption getCurrentSortOption() {
        return this.currentSortOption;
    }

    /* renamed from: component13, reason: from getter */
    public final CuratedListViewMode getViewMode() {
        return this.viewMode;
    }

    /* renamed from: component14, reason: from getter */
    public final ListDisclosure getDisclosure() {
        return this.disclosure;
    }

    public final List<IacInfoBanner> component19() {
        return this.iacInfoBanners;
    }

    /* renamed from: component2, reason: from getter */
    public final CuratedListRhListViewState2 getCuratedListItemState() {
        return this.curatedListItemState;
    }

    public final ImmutableList<Filter> component20() {
        return this.filters;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotalListItemCount() {
        return this.totalListItemCount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUpdatingFollowStatus() {
        return this.updatingFollowStatus;
    }

    public final UiEvent<Boolean> component5() {
        return this.followSuccessEvent;
    }

    public final UiEvent<Throwable> component6() {
        return this.followErrorEvent;
    }

    public final UiEvent<Throwable> component7() {
        return this.updatedListErrorEvent;
    }

    public final UiEvent<Unit> component8() {
        return this.showIpoNotificationBottomSheetEvent;
    }

    public final UiEvent<Unit> component9() {
        return this.showIpoAccessOnboardingEvent;
    }

    public final CuratedListRhListViewState copy(CuratedListRhListViewState4 curatedListState, CuratedListRhListViewState2 curatedListItemState, int totalListItemCount, boolean updatingFollowStatus, UiEvent<Boolean> followSuccessEvent, UiEvent<Throwable> followErrorEvent, UiEvent<Throwable> updatedListErrorEvent, UiEvent<Unit> showIpoNotificationBottomSheetEvent, UiEvent<Unit> showIpoAccessOnboardingEvent, UiEvent<UUID> showIpoAnnouncementEvent, boolean showErrorImage, SortOption currentSortOption, CuratedListViewMode viewMode, ListDisclosure disclosure, ApiIpoAccessListViewModel ipoAccessListViewModel, CuratedListRhListViewState6 ipoAccessFilter, boolean canShowMenuOptions, boolean isLoadingExpandedItems, List<IacInfoBanner> iacInfoBanners, ImmutableList<Filter> filters) {
        Intrinsics.checkNotNullParameter(curatedListState, "curatedListState");
        Intrinsics.checkNotNullParameter(curatedListItemState, "curatedListItemState");
        Intrinsics.checkNotNullParameter(ipoAccessFilter, "ipoAccessFilter");
        Intrinsics.checkNotNullParameter(iacInfoBanners, "iacInfoBanners");
        return new CuratedListRhListViewState(curatedListState, curatedListItemState, totalListItemCount, updatingFollowStatus, followSuccessEvent, followErrorEvent, updatedListErrorEvent, showIpoNotificationBottomSheetEvent, showIpoAccessOnboardingEvent, showIpoAnnouncementEvent, showErrorImage, currentSortOption, viewMode, disclosure, ipoAccessListViewModel, ipoAccessFilter, canShowMenuOptions, isLoadingExpandedItems, iacInfoBanners, filters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CuratedListRhListViewState)) {
            return false;
        }
        CuratedListRhListViewState curatedListRhListViewState = (CuratedListRhListViewState) other;
        return Intrinsics.areEqual(this.curatedListState, curatedListRhListViewState.curatedListState) && Intrinsics.areEqual(this.curatedListItemState, curatedListRhListViewState.curatedListItemState) && this.totalListItemCount == curatedListRhListViewState.totalListItemCount && this.updatingFollowStatus == curatedListRhListViewState.updatingFollowStatus && Intrinsics.areEqual(this.followSuccessEvent, curatedListRhListViewState.followSuccessEvent) && Intrinsics.areEqual(this.followErrorEvent, curatedListRhListViewState.followErrorEvent) && Intrinsics.areEqual(this.updatedListErrorEvent, curatedListRhListViewState.updatedListErrorEvent) && Intrinsics.areEqual(this.showIpoNotificationBottomSheetEvent, curatedListRhListViewState.showIpoNotificationBottomSheetEvent) && Intrinsics.areEqual(this.showIpoAccessOnboardingEvent, curatedListRhListViewState.showIpoAccessOnboardingEvent) && Intrinsics.areEqual(this.showIpoAnnouncementEvent, curatedListRhListViewState.showIpoAnnouncementEvent) && this.showErrorImage == curatedListRhListViewState.showErrorImage && Intrinsics.areEqual(this.currentSortOption, curatedListRhListViewState.currentSortOption) && this.viewMode == curatedListRhListViewState.viewMode && Intrinsics.areEqual(this.disclosure, curatedListRhListViewState.disclosure) && Intrinsics.areEqual(this.ipoAccessListViewModel, curatedListRhListViewState.ipoAccessListViewModel) && this.ipoAccessFilter == curatedListRhListViewState.ipoAccessFilter && this.canShowMenuOptions == curatedListRhListViewState.canShowMenuOptions && this.isLoadingExpandedItems == curatedListRhListViewState.isLoadingExpandedItems && Intrinsics.areEqual(this.iacInfoBanners, curatedListRhListViewState.iacInfoBanners) && Intrinsics.areEqual(this.filters, curatedListRhListViewState.filters);
    }

    public int hashCode() {
        int iHashCode = ((((((this.curatedListState.hashCode() * 31) + this.curatedListItemState.hashCode()) * 31) + Integer.hashCode(this.totalListItemCount)) * 31) + Boolean.hashCode(this.updatingFollowStatus)) * 31;
        UiEvent<Boolean> uiEvent = this.followSuccessEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.followErrorEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Throwable> uiEvent3 = this.updatedListErrorEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Unit> uiEvent4 = this.showIpoNotificationBottomSheetEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        UiEvent<Unit> uiEvent5 = this.showIpoAccessOnboardingEvent;
        int iHashCode6 = (iHashCode5 + (uiEvent5 == null ? 0 : uiEvent5.hashCode())) * 31;
        UiEvent<UUID> uiEvent6 = this.showIpoAnnouncementEvent;
        int iHashCode7 = (((iHashCode6 + (uiEvent6 == null ? 0 : uiEvent6.hashCode())) * 31) + Boolean.hashCode(this.showErrorImage)) * 31;
        SortOption sortOption = this.currentSortOption;
        int iHashCode8 = (iHashCode7 + (sortOption == null ? 0 : sortOption.hashCode())) * 31;
        CuratedListViewMode curatedListViewMode = this.viewMode;
        int iHashCode9 = (iHashCode8 + (curatedListViewMode == null ? 0 : curatedListViewMode.hashCode())) * 31;
        ListDisclosure listDisclosure = this.disclosure;
        int iHashCode10 = (iHashCode9 + (listDisclosure == null ? 0 : listDisclosure.hashCode())) * 31;
        ApiIpoAccessListViewModel apiIpoAccessListViewModel = this.ipoAccessListViewModel;
        int iHashCode11 = (((((((((iHashCode10 + (apiIpoAccessListViewModel == null ? 0 : apiIpoAccessListViewModel.hashCode())) * 31) + this.ipoAccessFilter.hashCode()) * 31) + Boolean.hashCode(this.canShowMenuOptions)) * 31) + Boolean.hashCode(this.isLoadingExpandedItems)) * 31) + this.iacInfoBanners.hashCode()) * 31;
        ImmutableList<Filter> immutableList = this.filters;
        return iHashCode11 + (immutableList != null ? immutableList.hashCode() : 0);
    }

    public String toString() {
        return "CuratedListRhListViewState(curatedListState=" + this.curatedListState + ", curatedListItemState=" + this.curatedListItemState + ", totalListItemCount=" + this.totalListItemCount + ", updatingFollowStatus=" + this.updatingFollowStatus + ", followSuccessEvent=" + this.followSuccessEvent + ", followErrorEvent=" + this.followErrorEvent + ", updatedListErrorEvent=" + this.updatedListErrorEvent + ", showIpoNotificationBottomSheetEvent=" + this.showIpoNotificationBottomSheetEvent + ", showIpoAccessOnboardingEvent=" + this.showIpoAccessOnboardingEvent + ", showIpoAnnouncementEvent=" + this.showIpoAnnouncementEvent + ", showErrorImage=" + this.showErrorImage + ", currentSortOption=" + this.currentSortOption + ", viewMode=" + this.viewMode + ", disclosure=" + this.disclosure + ", ipoAccessListViewModel=" + this.ipoAccessListViewModel + ", ipoAccessFilter=" + this.ipoAccessFilter + ", canShowMenuOptions=" + this.canShowMenuOptions + ", isLoadingExpandedItems=" + this.isLoadingExpandedItems + ", iacInfoBanners=" + this.iacInfoBanners + ", filters=" + this.filters + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CuratedListRhListViewState(CuratedListRhListViewState4 curatedListState, CuratedListRhListViewState2 curatedListItemState, int i, boolean z, UiEvent<Boolean> uiEvent, UiEvent<Throwable> uiEvent2, UiEvent<Throwable> uiEvent3, UiEvent<Unit> uiEvent4, UiEvent<Unit> uiEvent5, UiEvent<UUID> uiEvent6, boolean z2, SortOption sortOption, CuratedListViewMode curatedListViewMode, ListDisclosure listDisclosure, ApiIpoAccessListViewModel apiIpoAccessListViewModel, CuratedListRhListViewState6 ipoAccessFilter, boolean z3, boolean z4, List<IacInfoBanner> iacInfoBanners, ImmutableList<Filter> immutableList) {
        Filter filter;
        List arrayList;
        ArrayList arrayList2;
        MarkdownContent markdownContent;
        String displayDescription;
        HeaderState headerState;
        HeaderState headerState2;
        Function1<CuratedListEligible, Boolean> predicate;
        Filter next;
        List<CuratedListEligible> curatedListEligibleItems;
        Intrinsics.checkNotNullParameter(curatedListState, "curatedListState");
        Intrinsics.checkNotNullParameter(curatedListItemState, "curatedListItemState");
        Intrinsics.checkNotNullParameter(ipoAccessFilter, "ipoAccessFilter");
        Intrinsics.checkNotNullParameter(iacInfoBanners, "iacInfoBanners");
        this.curatedListState = curatedListState;
        this.curatedListItemState = curatedListItemState;
        this.totalListItemCount = i;
        this.updatingFollowStatus = z;
        this.followSuccessEvent = uiEvent;
        this.followErrorEvent = uiEvent2;
        this.updatedListErrorEvent = uiEvent3;
        this.showIpoNotificationBottomSheetEvent = uiEvent4;
        this.showIpoAccessOnboardingEvent = uiEvent5;
        this.showIpoAnnouncementEvent = uiEvent6;
        this.showErrorImage = z2;
        this.currentSortOption = sortOption;
        this.viewMode = curatedListViewMode;
        this.disclosure = listDisclosure;
        this.ipoAccessListViewModel = apiIpoAccessListViewModel;
        this.ipoAccessFilter = ipoAccessFilter;
        this.canShowMenuOptions = z3;
        this.isLoadingExpandedItems = z4;
        this.iacInfoBanners = iacInfoBanners;
        this.filters = immutableList;
        this.isLoadingListItems = curatedListItemState instanceof CuratedListRhListViewState2.Loading;
        CuratedListRhListViewState4.Success success = curatedListState instanceof CuratedListRhListViewState4.Success ? (CuratedListRhListViewState4.Success) curatedListState : null;
        CuratedList curatedList = success != null ? success.getCuratedList() : null;
        this.curatedList = curatedList;
        boolean z5 = false;
        this.showIpoAccessList = curatedList != null && curatedList.isIpoAccessList();
        CuratedListRhListViewState2.Success success2 = curatedListItemState instanceof CuratedListRhListViewState2.Success ? (CuratedListRhListViewState2.Success) curatedListItemState : null;
        this.curatedListEligibleItems = (success2 == null || (curatedListEligibleItems = success2.getCuratedListEligibleItems()) == null) ? CollectionsKt.emptyList() : curatedListEligibleItems;
        this.showListItems = (curatedListState instanceof CuratedListRhListViewState4.Success) && (curatedListItemState instanceof CuratedListRhListViewState2.Success) && i != 0;
        if (immutableList != null) {
            Iterator<Filter> it = immutableList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next.isSelected()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            filter = next;
        } else {
            filter = null;
        }
        this.selectedFilter = filter;
        if (filter != null && (predicate = filter.getPredicate()) != 0) {
            List<CuratedListEligible> list = this.curatedListEligibleItems;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = this.curatedListEligibleItems;
        }
        this.filteredCuratedListItems = arrayList;
        boolean z6 = this.showIpoAccessList;
        this.visibleCuratedListItems = (z6 || !this.showListItems) ? null : arrayList;
        if (z6 && this.showListItems) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.ipoAccessFilter.ordinal()];
            if (i2 == 1) {
                List<CuratedListEligible> list2 = this.curatedListEligibleItems;
                arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (isCuratedListEligiblePreIpo((CuratedListEligible) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
            } else if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList2 = null;
            } else {
                List<CuratedListEligible> list3 = this.curatedListEligibleItems;
                arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    if (!isCuratedListEligiblePreIpo((CuratedListEligible) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
            }
        } else {
            arrayList2 = null;
        }
        this.visibleIpoAccessCuratedItems = arrayList2;
        CuratedListRhListViewState4 curatedListRhListViewState4 = this.curatedListState;
        boolean z7 = curatedListRhListViewState4 instanceof CuratedListRhListViewState4.Failed;
        this.showListError = z7;
        this.showLoading = (curatedListRhListViewState4 instanceof CuratedListRhListViewState4.Loading) || (this.isLoadingListItems && !z7);
        this.showListItemError = (curatedListRhListViewState4 instanceof CuratedListRhListViewState4.Success) && (this.curatedListItemState instanceof CuratedListRhListViewState2.Failed);
        this.showEmpty = (curatedListRhListViewState4 instanceof CuratedListRhListViewState4.Success) && (this.curatedListItemState instanceof CuratedListRhListViewState2.Success) && !this.showIpoAccessList && this.totalListItemCount == 0;
        CuratedList curatedList2 = this.curatedList;
        this.showRelatedListCarousel = (curatedList2 == null || curatedList2.getRelatedLists().isEmpty()) ? false : true;
        CuratedList curatedList3 = this.curatedList;
        if (curatedList3 == null || (markdownContent = curatedList3.getMarkdownDisplayDescription()) == null) {
            CuratedList curatedList4 = this.curatedList;
            markdownContent = (curatedList4 == null || (displayDescription = curatedList4.getDisplayDescription()) == null) ? null : new MarkdownContent(displayDescription);
        }
        this.headerDescription = markdownContent;
        CuratedList curatedList5 = this.curatedList;
        this.headerState = (curatedList5 == null || (headerState2 = toHeaderState(curatedList5)) == null || this.showIpoAccessList) ? null : headerState2;
        CuratedList curatedList6 = this.curatedList;
        this.ipoHeaderState = (curatedList6 == null || (headerState = toHeaderState(curatedList6)) == null || !this.showIpoAccessList) ? null : headerState;
        ApiIpoAccessListEmptyState serverDrivenIpoAccessEmptyState = getServerDrivenIpoAccessEmptyState();
        this.ipoAccessEmptyState = (serverDrivenIpoAccessEmptyState == null || arrayList2 == null || !arrayList2.isEmpty()) ? null : serverDrivenIpoAccessEmptyState;
        CuratedList curatedList7 = this.curatedList;
        this.relatedListCarouselState = curatedList7 != null ? new RelatedListCarouselState(curatedList7.getRelatedLists()) : null;
        CuratedList curatedList8 = this.curatedList;
        this.toolbarTitle = curatedList8 != null ? curatedList8.getDisplayName() : null;
        this.selectedIpoAccessFilter = this.showIpoAccessList ? this.ipoAccessFilter : null;
        boolean z8 = !this.updatingFollowStatus && this.canShowMenuOptions;
        this.isFollowableOrUnfollowable = z8;
        this.showFollowListMenuOption = z8 && !isListFollowed() && this.canShowMenuOptions;
        this.showUnfollowListMenuOption = z8 && isListFollowed() && this.canShowMenuOptions;
        this.showLoadingListMenuOption = this.updatingFollowStatus;
        List<CuratedListEligible> list4 = this.curatedListEligibleItems;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator<T> it2 = list4.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((CuratedListEligible) it2.next()) instanceof FuturesCuratedListEligible) {
                        z5 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.isFuturesOnlyList = z5;
        this.iacInfoBannerData = IacInfoBanners.findByLocation(this.iacInfoBanners, IacInfoBannerLocation.INFO_BANNER_LIST_PAGE_TOP_LEVEL);
    }

    public /* synthetic */ CuratedListRhListViewState(CuratedListRhListViewState4 curatedListRhListViewState4, CuratedListRhListViewState2 curatedListRhListViewState2, int i, boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, UiEvent uiEvent6, boolean z2, SortOption sortOption, CuratedListViewMode curatedListViewMode, ListDisclosure listDisclosure, ApiIpoAccessListViewModel apiIpoAccessListViewModel, CuratedListRhListViewState6 curatedListRhListViewState6, boolean z3, boolean z4, List list, ImmutableList immutableList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CuratedListRhListViewState4.Loading.INSTANCE : curatedListRhListViewState4, (i2 & 2) != 0 ? CuratedListRhListViewState2.Loading.INSTANCE : curatedListRhListViewState2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? null : uiEvent, (i2 & 32) != 0 ? null : uiEvent2, (i2 & 64) != 0 ? null : uiEvent3, (i2 & 128) != 0 ? null : uiEvent4, (i2 & 256) != 0 ? null : uiEvent5, (i2 & 512) != 0 ? null : uiEvent6, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) != 0 ? null : sortOption, (i2 & 4096) != 0 ? null : curatedListViewMode, (i2 & 8192) != 0 ? null : listDisclosure, (i2 & 16384) != 0 ? null : apiIpoAccessListViewModel, (i2 & 32768) != 0 ? CuratedListRhListViewState6.IN_FLIGHT : curatedListRhListViewState6, (i2 & 65536) != 0 ? true : z3, (i2 & 131072) != 0 ? false : z4, (i2 & 262144) != 0 ? CollectionsKt.emptyList() : list, (i2 & 524288) != 0 ? null : immutableList);
    }

    public final CuratedListRhListViewState4 getCuratedListState() {
        return this.curatedListState;
    }

    public final CuratedListRhListViewState2 getCuratedListItemState() {
        return this.curatedListItemState;
    }

    public final int getTotalListItemCount() {
        return this.totalListItemCount;
    }

    public final boolean getUpdatingFollowStatus() {
        return this.updatingFollowStatus;
    }

    public final UiEvent<Boolean> getFollowSuccessEvent() {
        return this.followSuccessEvent;
    }

    public final UiEvent<Throwable> getFollowErrorEvent() {
        return this.followErrorEvent;
    }

    public final UiEvent<Throwable> getUpdatedListErrorEvent() {
        return this.updatedListErrorEvent;
    }

    public final UiEvent<Unit> getShowIpoNotificationBottomSheetEvent() {
        return this.showIpoNotificationBottomSheetEvent;
    }

    public final UiEvent<Unit> getShowIpoAccessOnboardingEvent() {
        return this.showIpoAccessOnboardingEvent;
    }

    public final UiEvent<UUID> getShowIpoAnnouncementEvent() {
        return this.showIpoAnnouncementEvent;
    }

    public final boolean getShowErrorImage() {
        return this.showErrorImage;
    }

    public final SortOption getCurrentSortOption() {
        return this.currentSortOption;
    }

    public final CuratedListViewMode getViewMode() {
        return this.viewMode;
    }

    public final ListDisclosure getDisclosure() {
        return this.disclosure;
    }

    public final List<IacInfoBanner> getIacInfoBanners() {
        return this.iacInfoBanners;
    }

    public final ImmutableList<Filter> getFilters() {
        return this.filters;
    }

    public final CuratedList getCuratedList() {
        return this.curatedList;
    }

    private final ApiIpoAccessListEmptyState getServerDrivenIpoAccessEmptyState() {
        ApiIpoAccessListViewModel apiIpoAccessListViewModel = this.ipoAccessListViewModel;
        if (apiIpoAccessListViewModel != null) {
            return apiIpoAccessListViewModel.getEmpty_state();
        }
        return null;
    }

    public final List<CuratedListEligible> getVisibleCuratedListItems() {
        return this.visibleCuratedListItems;
    }

    public final List<CuratedListEligible> getVisibleIpoAccessCuratedItems() {
        return this.visibleIpoAccessCuratedItems;
    }

    public final boolean getShowListError() {
        return this.showListError;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final boolean getShowListItemError() {
        return this.showListItemError;
    }

    public final boolean getShowEmpty() {
        return this.showEmpty;
    }

    public final boolean getShowRelatedListCarousel() {
        return this.showRelatedListCarousel;
    }

    public final HeaderState getHeaderState() {
        return this.headerState;
    }

    public final HeaderState getIpoHeaderState() {
        return this.ipoHeaderState;
    }

    public final ApiIpoAccessListEmptyState getIpoAccessEmptyState() {
        return this.ipoAccessEmptyState;
    }

    public final RelatedListCarouselState getRelatedListCarouselState() {
        return this.relatedListCarouselState;
    }

    public final List<UUID> getCuratedListInstrumentItemsIds() {
        List<CuratedListEligible> list = this.curatedListEligibleItems;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InstrumentCuratedListEligible) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InstrumentCuratedListEligible) it.next()).getCuratedListItem().getId());
        }
        return arrayList2;
    }

    public final List<UUID> getCuratedListCurrencyPairIds() {
        List<CuratedListEligible> list = this.curatedListEligibleItems;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof CryptoCuratedListEligible) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CryptoCuratedListEligible) it.next()).getCuratedListItem().getId());
        }
        return arrayList2;
    }

    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    private final boolean getAreItemsTruncated() {
        return (this.curatedListItemState instanceof CuratedListRhListViewState2.Success) && (this.curatedListState instanceof CuratedListRhListViewState4.Success) && this.totalListItemCount > this.curatedListEligibleItems.size();
    }

    public final ShowAllItemsRowData getShowAllItemsRowData() {
        if (getAreItemsTruncated()) {
            return new ShowAllItemsRowData(this.isLoadingExpandedItems);
        }
        return null;
    }

    public final CuratedListRhListViewState6 getSelectedIpoAccessFilter() {
        return this.selectedIpoAccessFilter;
    }

    public final boolean getShowRhListDetail() {
        return getShowRhControlsButton() && this.curatedList != null && this.totalListItemCount > 0;
    }

    public final boolean getShowRhControlsButton() {
        return (this.currentSortOption == null || this.isLoadingListItems || this.showIpoAccessList || this.curatedListEligibleItems.isEmpty()) ? false : true;
    }

    public final boolean getShowFollowListMenuOption() {
        return this.showFollowListMenuOption;
    }

    public final boolean getShowUnfollowListMenuOption() {
        return this.showUnfollowListMenuOption;
    }

    public final boolean getShowLoadingListMenuOption() {
        return this.showLoadingListMenuOption;
    }

    /* renamed from: isFuturesOnlyList, reason: from getter */
    public final boolean getIsFuturesOnlyList() {
        return this.isFuturesOnlyList;
    }

    private final boolean isListFollowed() {
        CuratedList curatedList = this.curatedList;
        if (curatedList != null) {
            return curatedList.getFollowed();
        }
        return false;
    }

    private final HeaderState toHeaderState(CuratedList curatedList) {
        return new HeaderState(curatedList.getId(), curatedList.getDisplayName(), curatedList.getUpdatedAt(), this.headerDescription, curatedList.getBackgroundColor(), curatedList.getBackgroundGradient(), this.showErrorImage, curatedList.getBadgeIcon(), curatedList.getBadgeTitle(), curatedList.getHeaderSizedUrlHolder());
    }

    private final boolean isCuratedListEligiblePreIpo(CuratedListEligible item) {
        IpoAccessStatus ipoAccessStatus = item.getCuratedListItem().getIpoAccessStatus();
        return ipoAccessStatus != null && ipoAccessStatus.isPreIpo();
    }

    /* compiled from: CuratedListRhListViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$ShowAllItemsRowData;", "", "showLoading", "", "<init>", "(Z)V", "getShowLoading", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAllItemsRowData {
        public static final int $stable = 0;
        private final boolean showLoading;

        public static /* synthetic */ ShowAllItemsRowData copy$default(ShowAllItemsRowData showAllItemsRowData, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = showAllItemsRowData.showLoading;
            }
            return showAllItemsRowData.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowLoading() {
            return this.showLoading;
        }

        public final ShowAllItemsRowData copy(boolean showLoading) {
            return new ShowAllItemsRowData(showLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowAllItemsRowData) && this.showLoading == ((ShowAllItemsRowData) other).showLoading;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showLoading);
        }

        public String toString() {
            return "ShowAllItemsRowData(showLoading=" + this.showLoading + ")";
        }

        public ShowAllItemsRowData(boolean z) {
            this.showLoading = z;
        }

        public final boolean getShowLoading() {
            return this.showLoading;
        }
    }

    public final IacInfoBanner getIacInfoBannerData() {
        return this.iacInfoBannerData;
    }

    /* compiled from: CuratedListRhListViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter;", "", "id", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter$Id;", "labelRes", "", "isSelected", "", "predicate", "Lkotlin/Function1;", "Lcom/robinhood/models/ui/CuratedListEligible;", "tooltipText", "", "<init>", "(Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter$Id;IZLkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "getId", "()Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter$Id;", "getLabelRes", "()I", "()Z", "getPredicate", "()Lkotlin/jvm/functions/Function1;", "getTooltipText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "Id", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Filter {
        public static final int $stable = 8;
        private final InterfaceC20905Id id;
        private final boolean isSelected;
        private final int labelRes;
        private final Function1<CuratedListEligible, Boolean> predicate;
        private final String tooltipText;

        public static /* synthetic */ Filter copy$default(Filter filter, InterfaceC20905Id interfaceC20905Id, int i, boolean z, Function1 function1, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                interfaceC20905Id = filter.id;
            }
            if ((i2 & 2) != 0) {
                i = filter.labelRes;
            }
            if ((i2 & 4) != 0) {
                z = filter.isSelected;
            }
            if ((i2 & 8) != 0) {
                function1 = filter.predicate;
            }
            if ((i2 & 16) != 0) {
                str = filter.tooltipText;
            }
            String str2 = str;
            boolean z2 = z;
            return filter.copy(interfaceC20905Id, i, z2, function1, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final InterfaceC20905Id getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getLabelRes() {
            return this.labelRes;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final Function1<CuratedListEligible, Boolean> component4() {
            return this.predicate;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTooltipText() {
            return this.tooltipText;
        }

        public final Filter copy(InterfaceC20905Id id, int labelRes, boolean isSelected, Function1<? super CuratedListEligible, Boolean> predicate, String tooltipText) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new Filter(id, labelRes, isSelected, predicate, tooltipText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) other;
            return Intrinsics.areEqual(this.id, filter.id) && this.labelRes == filter.labelRes && this.isSelected == filter.isSelected && Intrinsics.areEqual(this.predicate, filter.predicate) && Intrinsics.areEqual(this.tooltipText, filter.tooltipText);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + Integer.hashCode(this.labelRes)) * 31) + Boolean.hashCode(this.isSelected)) * 31;
            Function1<CuratedListEligible, Boolean> function1 = this.predicate;
            int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
            String str = this.tooltipText;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Filter(id=" + this.id + ", labelRes=" + this.labelRes + ", isSelected=" + this.isSelected + ", predicate=" + this.predicate + ", tooltipText=" + this.tooltipText + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Filter(InterfaceC20905Id id, int i, boolean z, Function1<? super CuratedListEligible, Boolean> function1, String str) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.labelRes = i;
            this.isSelected = z;
            this.predicate = function1;
            this.tooltipText = str;
        }

        public /* synthetic */ Filter(InterfaceC20905Id interfaceC20905Id, int i, boolean z, Function1 function1, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC20905Id, i, z, function1, (i2 & 16) != 0 ? null : str);
        }

        public final InterfaceC20905Id getId() {
            return this.id;
        }

        public final int getLabelRes() {
            return this.labelRes;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public final Function1<CuratedListEligible, Boolean> getPredicate() {
            return this.predicate;
        }

        public final String getTooltipText() {
            return this.tooltipText;
        }

        /* compiled from: CuratedListRhListViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter$Id;", "", "stringValue", "", "getStringValue", "()Ljava/lang/String;", "IndexOptions", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter$Id$IndexOptions;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListViewState$Filter$Id */
        public interface InterfaceC20905Id {
            String getStringValue();

            /* compiled from: CuratedListRhListViewState.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter$Id$IndexOptions;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter$Id;", "All", "ExtendedHours", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter$Id$IndexOptions$All;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter$Id$IndexOptions$ExtendedHours;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListViewState$Filter$Id$IndexOptions */
            public interface IndexOptions extends InterfaceC20905Id {

                /* compiled from: CuratedListRhListViewState.kt */
                @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter$Id$IndexOptions$All;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter$Id$IndexOptions;", "<init>", "()V", "stringValue", "", "getStringValue", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListViewState$Filter$Id$IndexOptions$All */
                public static final /* data */ class All implements IndexOptions {
                    public static final int $stable = 0;
                    public static final All INSTANCE = new All();
                    private static final String stringValue = ApiRenderablePlatforms.VERSIONS_ALL;

                    public boolean equals(Object other) {
                        return this == other || (other instanceof All);
                    }

                    public int hashCode() {
                        return -548480555;
                    }

                    public String toString() {
                        return "All";
                    }

                    private All() {
                    }

                    @Override // com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListViewState.Filter.InterfaceC20905Id
                    public String getStringValue() {
                        return stringValue;
                    }
                }

                /* compiled from: CuratedListRhListViewState.kt */
                @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter$Id$IndexOptions$ExtendedHours;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter$Id$IndexOptions;", "<init>", "()V", "stringValue", "", "getStringValue", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListViewState$Filter$Id$IndexOptions$ExtendedHours */
                public static final /* data */ class ExtendedHours implements IndexOptions {
                    public static final int $stable = 0;
                    public static final ExtendedHours INSTANCE = new ExtendedHours();
                    private static final String stringValue = "extended_hours";

                    public boolean equals(Object other) {
                        return this == other || (other instanceof ExtendedHours);
                    }

                    public int hashCode() {
                        return 1226667146;
                    }

                    public String toString() {
                        return "ExtendedHours";
                    }

                    private ExtendedHours() {
                    }

                    @Override // com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListViewState.Filter.InterfaceC20905Id
                    public String getStringValue() {
                        return stringValue;
                    }
                }
            }
        }
    }
}
