package com.robinhood.android.search.search;

import android.net.Uri;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.eventcontracts.models.event.api.bonfire.ApiEventContractSearchItem;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.models.futures.api.bonfire.ApiFuturesContractSearchItem;
import com.robinhood.android.models.futures.api.bonfire.ApiFuturesProductSearchItem;
import com.robinhood.android.models.futures.api.bonfire.FuturesSearchItem;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.p189db.UiFuturesPosition;
import com.robinhood.android.newsfeed.extensions.NewsFeedElements;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.search.SearchItem;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.models.api.search.ApiCuratedListSearchItem;
import com.robinhood.models.api.search.ApiDeeplinkSearchItem;
import com.robinhood.models.api.search.ApiEducationSearchItem;
import com.robinhood.models.api.search.SearchResponse;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Security;
import com.robinhood.models.p320db.recentSearch.RecentSearch;
import com.robinhood.rosetta.eventlogging.SearchResultItem;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SearchViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b3\b\u0087\b\u0018\u0000 º\u00012\u00020\u0001:\u0006¸\u0001¹\u0001º\u0001Bµ\u0004\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\u001e\b\u0002\u0010\u0016\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u0006\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"\u0012\u001c\b\u0002\u0010'\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020#0(\u0018\u00010\"\u0012\u001c\b\u0002\u0010)\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020#0(\u0018\u00010\"\u0012\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\"\u0012\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0012\b\b\u0002\u0010-\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0003\u0012\b\b\u0002\u00100\u001a\u00020\u0006\u0012\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\"\u0012\b\b\u0002\u00102\u001a\u000203\u0012\u0016\b\u0002\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001905\u0018\u00010\"\u0012\b\b\u0002\u00106\u001a\u000207\u0012\b\b\u0002\u00108\u001a\u00020\u0006\u0012\b\b\u0002\u00109\u001a\u00020\u0006\u0012\b\b\u0002\u0010:\u001a\u00020\u0006\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00130\u001f¢\u0006\u0004\b>\u0010?J\u0016\u0010q\u001a\b\u0012\u0004\u0012\u00020r0\u00032\u0006\u0010s\u001a\u00020tH\u0002J\u0016\u0010u\u001a\b\u0012\u0004\u0012\u00020e0\u00032\u0006\u0010s\u001a\u00020vH\u0002J\u0016\u0010w\u001a\b\u0012\u0004\u0012\u00020e0\u00032\u0006\u0010s\u001a\u00020xH\u0002J\u0016\u0010y\u001a\b\u0012\u0004\u0012\u00020e0\u00032\u0006\u0010s\u001a\u00020zH\u0002J\u0016\u0010{\u001a\b\u0012\u0004\u0012\u00020e0\u00032\u0006\u0010s\u001a\u00020|H\u0002J\u0016\u0010}\u001a\b\u0012\u0004\u0012\u00020e0\u00032\u0006\u0010s\u001a\u00020~H\u0002J\u0017\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020e0\u00032\u0007\u0010s\u001a\u00030\u0080\u0001H\u0002J\u0018\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020e0\u00032\u0007\u0010s\u001a\u00030\u0082\u0001H\u0002J\u0019\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\u00032\u0007\u0010\u0089\u0001\u001a\u00020\u0019H\u0002J2\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003*\b\u0012\u0004\u0012\u00020\u00150\u00032\u0007\u0010\u008b\u0001\u001a\u00020\u00192\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H\u0002J\u0010\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0006HÂ\u0003J\u0016\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\bHÀ\u0003¢\u0006\u0003\b\u0091\u0001J\u001c\u0010\u0092\u0001\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bHÀ\u0003¢\u0006\u0003\b\u0093\u0001J\u001c\u0010\u0094\u0001\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\u000bHÀ\u0003¢\u0006\u0003\b\u0095\u0001J\u0016\u0010\u0096\u0001\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010HÂ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0013HÂ\u0003J\u0010\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003HÂ\u0003J \u0010\u0099\u0001\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0017HÂ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0013HÆ\u0003J\u0010\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u0010\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u0010\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u0010\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u001fHÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0006HÆ\u0003J\u0012\u0010 \u0001\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"HÆ\u0003J\u0012\u0010¡\u0001\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"HÆ\u0003J\u0012\u0010¢\u0001\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"HÆ\u0003J\u001e\u0010£\u0001\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020#0(\u0018\u00010\"HÆ\u0003J\u001e\u0010¤\u0001\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020#0(\u0018\u00010\"HÆ\u0003J\u0012\u0010¥\u0001\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\"HÆ\u0003J\u0012\u0010¦\u0001\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0006HÆ\u0003J\u0010\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020/0\u0003HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0006HÆ\u0003J\u0012\u0010ª\u0001\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\"HÆ\u0003J\n\u0010«\u0001\u001a\u000203HÆ\u0003J\u0018\u0010¬\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001905\u0018\u00010\"HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u000207HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0006HÂ\u0003J\n\u0010°\u0001\u001a\u00020\u0006HÂ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010<HÂ\u0003J\u0010\u0010²\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u001fHÆ\u0003J¸\u0004\u0010³\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u001e\b\u0002\u0010\u0016\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\b\b\u0002\u0010 \u001a\u00020\u00062\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"2\u001c\b\u0002\u0010'\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020#0(\u0018\u00010\"2\u001c\b\u0002\u0010)\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020#0(\u0018\u00010\"2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\"2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\b\b\u0002\u0010-\u001a\u00020\u00062\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\b\b\u0002\u00100\u001a\u00020\u00062\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\"2\b\b\u0002\u00102\u001a\u0002032\u0016\b\u0002\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001905\u0018\u00010\"2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u00020\u00062\b\b\u0002\u00109\u001a\u00020\u00062\b\b\u0002\u0010:\u001a\u00020\u00062\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00130\u001fHÆ\u0001J\u0015\u0010´\u0001\u001a\u00020\u00062\t\u0010µ\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¶\u0001\u001a\u00020\u0019HÖ\u0001J\n\u0010·\u0001\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\u000b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010CR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010HR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010HR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001f¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010 \u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0019\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0019\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010PR\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bR\u0010PR%\u0010'\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020#0(\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bS\u0010PR%\u0010)\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020#0(\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bT\u0010PR\u0019\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bU\u0010PR\u0019\u0010,\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bV\u0010PR\u0011\u0010-\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bW\u0010NR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010HR\u0011\u00100\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bY\u0010NR\u0019\u00101\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010PR\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R(\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001905\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010P\"\u0004\b^\u0010_R\u0011\u00106\u001a\u000207¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0011\u00108\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bb\u0010NR\u000e\u00109\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00130\u001f¢\u0006\b\n\u0000\u001a\u0004\bc\u0010LR\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020e0\u00038F¢\u0006\u0006\u001a\u0004\bf\u0010HR\u0011\u0010g\u001a\u00020h¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020l0\u00038F¢\u0006\u0006\u001a\u0004\bm\u0010HR\u0016\u0010n\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0019\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010HR\u0019\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010HR\u001b\u0010\u008c\u0001\u001a\u00020\u0006*\u00020%8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006»\u0001"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchViewState;", "", "searchResponses", "", "Lcom/robinhood/models/api/search/SearchResponse;", "isInDefaultSearch", "", "listItemIdsInUserLists", "", "Ljava/util/UUID;", "positions", "", "Lcom/robinhood/models/db/Position;", "cryptoHoldings", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "futuresPositions", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/android/models/futures/db/UiFuturesPosition;", "accountNumber", "", "feedElements", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "getScrollTargetIndex", "Lkotlin/Function1;", "Lcom/robinhood/android/newsfeed/model/Element;", "", "query", "instrumentIdsInList", "cryptoIdsInList", "futuresContractIdsInList", "indexIdsInList", "Lkotlinx/collections/immutable/ImmutableList;", "showProgressBar", "throwable", "Lcom/robinhood/udf/UiEvent;", "", "addedToList", "Lcom/robinhood/models/db/Security;", "removedFromList", "addedToListError", "Lkotlin/Pair;", "removedFromListError", "manualRefreshCompleteEvent", "", "manualRefreshErrorEvent", "shouldShowRecommendationsCard", "recentSearchItems", "Lcom/robinhood/models/db/recentSearch/RecentSearch$RecentSearchResult;", "displayRecentSearchWithInfoTabsChange", "deleteRecentSearchError", "screenersData", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$ScreenersData;", "scrollToTargetEvent", "Lcom/robinhood/utils/Optional;", "recyclerViewItemsFetched", "Lcom/robinhood/android/search/search/SearchViewState$RecyclerViewItemsFetched;", "showIndexOptionsListBadge", "isInCryptoRegionGate", "isInEtfRegionGate", "appType", "Lcom/robinhood/shared/app/type/AppType;", "excludedTemplates", "<init>", "(Ljava/util/List;ZLjava/util/Set;Ljava/util/Map;Ljava/util/Map;Lkotlinx/collections/immutable/ImmutableMap;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZLjava/util/List;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$ScreenersData;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/search/search/SearchViewState$RecyclerViewItemsFetched;ZZZLcom/robinhood/shared/app/type/AppType;Lkotlinx/collections/immutable/ImmutableList;)V", "getListItemIdsInUserLists$feature_search_externalRelease", "()Ljava/util/Set;", "getPositions$feature_search_externalRelease", "()Ljava/util/Map;", "getCryptoHoldings$feature_search_externalRelease", "getQuery", "()Ljava/lang/String;", "getInstrumentIdsInList", "()Ljava/util/List;", "getCryptoIdsInList", "getFuturesContractIdsInList", "getIndexIdsInList", "()Lkotlinx/collections/immutable/ImmutableList;", "getShowProgressBar", "()Z", "getThrowable", "()Lcom/robinhood/udf/UiEvent;", "getAddedToList", "getRemovedFromList", "getAddedToListError", "getRemovedFromListError", "getManualRefreshCompleteEvent", "getManualRefreshErrorEvent", "getShouldShowRecommendationsCard", "getRecentSearchItems", "getDisplayRecentSearchWithInfoTabsChange", "getDeleteRecentSearchError", "getScreenersData", "()Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$ScreenersData;", "getScrollToTargetEvent", "setScrollToTargetEvent", "(Lcom/robinhood/udf/UiEvent;)V", "getRecyclerViewItemsFetched", "()Lcom/robinhood/android/search/search/SearchViewState$RecyclerViewItemsFetched;", "getShowIndexOptionsListBadge", "getExcludedTemplates", "searchResult", "Lcom/robinhood/android/search/search/SearchItem;", "getSearchResult", "displayMode", "Lcom/robinhood/android/search/search/SearchViewState$DisplayMode;", "getDisplayMode", "()Lcom/robinhood/android/search/search/SearchViewState$DisplayMode;", "recentSearchItemsWithHeader", "Lcom/robinhood/models/db/recentSearch/RecentSearch;", "getRecentSearchItemsWithHeader", "emptyRecentSearchTextResId", "getEmptyRecentSearchTextResId", "()I", "createCuratedListCarousel", "Lcom/robinhood/android/search/search/SearchItem$CuratedListCarousel;", "response", "Lcom/robinhood/models/api/search/SearchResponse$CuratedLists;", "createCryptoRows", "Lcom/robinhood/models/api/search/SearchResponse$CurrencyPairs;", "createInstrumentRows", "Lcom/robinhood/models/api/search/SearchResponse$Instruments;", "createDeeplinkRows", "Lcom/robinhood/models/api/search/SearchResponse$Deeplinks;", "createEducationRows", "Lcom/robinhood/models/api/search/SearchResponse$Education;", "createFuturesRows", "Lcom/robinhood/models/api/search/SearchResponse$FuturesResponse;", "createEventContractRows", "Lcom/robinhood/models/api/search/SearchResponse$EventContracts;", "createMarketIndexesRows", "Lcom/robinhood/models/api/search/SearchResponse$MarketIndexes;", "elements", "getElements", "recommendationsCard", "getRecommendationsCard", "getRecommendationsCardElement", "Lcom/robinhood/android/newsfeed/model/Element$RecommendationsCard;", "rank", "toElements", "rankOffset", "isInUserList", "(Lcom/robinhood/models/db/Security;)Z", "component1", "component2", "component3", "component3$feature_search_externalRelease", "component4", "component4$feature_search_externalRelease", "component5", "component5$feature_search_externalRelease", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "copy", "equals", "other", "hashCode", "toString", "RecyclerViewItemsFetched", "DisplayMode", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class SearchViewState {
    private static final int DEFAULT_CAROUSEL_ID = 2000;
    private static final String EDUCATION_HOME_DEEPLINK = "robinhood://education_home?source=search";
    private final String accountNumber;
    private final UiEvent<Security> addedToList;
    private final UiEvent<Tuples2<Security, Throwable>> addedToListError;
    private final AppType appType;
    private final Map<UUID, UiCryptoHolding> cryptoHoldings;
    private final List<UUID> cryptoIdsInList;
    private final UiEvent<Unit> deleteRecentSearchError;
    private final DisplayMode displayMode;
    private final boolean displayRecentSearchWithInfoTabsChange;
    private final List<Element> elements;
    private final int emptyRecentSearchTextResId;
    private final ImmutableList<String> excludedTemplates;
    private final List<NewsFeedElement> feedElements;
    private final List<UUID> futuresContractIdsInList;
    private final ImmutableMap<UUID, UiFuturesPosition> futuresPositions;
    private final Function1<List<? extends Element>, Integer> getScrollTargetIndex;
    private final ImmutableList<UUID> indexIdsInList;
    private final List<UUID> instrumentIdsInList;
    private final boolean isInCryptoRegionGate;
    private final boolean isInDefaultSearch;
    private final boolean isInEtfRegionGate;
    private final Set<UUID> listItemIdsInUserLists;
    private final UiEvent<Unit> manualRefreshCompleteEvent;
    private final UiEvent<Throwable> manualRefreshErrorEvent;
    private final Map<UUID, Position> positions;
    private final String query;
    private final List<RecentSearch.RecentSearchResult> recentSearchItems;
    private final List<Element> recommendationsCard;
    private final RecyclerViewItemsFetched recyclerViewItemsFetched;
    private final UiEvent<Security> removedFromList;
    private final UiEvent<Tuples2<Security, Throwable>> removedFromListError;
    private final ScreenersStore.ScreenersData screenersData;
    private UiEvent<Optional<Integer>> scrollToTargetEvent;
    private final List<SearchResponse> searchResponses;
    private final boolean shouldShowRecommendationsCard;
    private final boolean showIndexOptionsListBadge;
    private final boolean showProgressBar;
    private final UiEvent<Throwable> throwable;
    public static final int $stable = 8;

    public SearchViewState() {
        this(null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, false, false, false, null, null, -1, 3, null);
    }

    private final List<SearchResponse> component1() {
        return this.searchResponses;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getIsInDefaultSearch() {
        return this.isInDefaultSearch;
    }

    /* renamed from: component31, reason: from getter */
    private final boolean getIsInCryptoRegionGate() {
        return this.isInCryptoRegionGate;
    }

    /* renamed from: component32, reason: from getter */
    private final boolean getIsInEtfRegionGate() {
        return this.isInEtfRegionGate;
    }

    /* renamed from: component33, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    private final ImmutableMap<UUID, UiFuturesPosition> component6() {
        return this.futuresPositions;
    }

    /* renamed from: component7, reason: from getter */
    private final String getAccountNumber() {
        return this.accountNumber;
    }

    private final List<NewsFeedElement> component8() {
        return this.feedElements;
    }

    private final Function1<List<? extends Element>, Integer> component9() {
        return this.getScrollTargetIndex;
    }

    public static /* synthetic */ SearchViewState copy$default(SearchViewState searchViewState, List list, boolean z, Set set, Map map, Map map2, ImmutableMap immutableMap, String str, List list2, Function1 function1, String str2, List list3, List list4, List list5, ImmutableList immutableList, boolean z2, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, UiEvent uiEvent6, UiEvent uiEvent7, boolean z3, List list6, boolean z4, UiEvent uiEvent8, ScreenersStore.ScreenersData screenersData, UiEvent uiEvent9, RecyclerViewItemsFetched recyclerViewItemsFetched, boolean z5, boolean z6, boolean z7, AppType appType, ImmutableList immutableList2, int i, int i2, Object obj) {
        ImmutableList immutableList3;
        AppType appType2;
        UiEvent uiEvent10;
        UiEvent uiEvent11;
        UiEvent uiEvent12;
        UiEvent uiEvent13;
        UiEvent uiEvent14;
        boolean z8;
        List list7;
        boolean z9;
        UiEvent uiEvent15;
        ScreenersStore.ScreenersData screenersData2;
        UiEvent uiEvent16;
        RecyclerViewItemsFetched recyclerViewItemsFetched2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Set set2;
        Map map3;
        Map map4;
        ImmutableMap immutableMap2;
        String str3;
        List list8;
        Function1 function12;
        String str4;
        List list9;
        List list10;
        List list11;
        ImmutableList immutableList4;
        UiEvent uiEvent17;
        UiEvent uiEvent18;
        boolean z14;
        List list12 = (i & 1) != 0 ? searchViewState.searchResponses : list;
        boolean z15 = (i & 2) != 0 ? searchViewState.isInDefaultSearch : z;
        Set set3 = (i & 4) != 0 ? searchViewState.listItemIdsInUserLists : set;
        Map map5 = (i & 8) != 0 ? searchViewState.positions : map;
        Map map6 = (i & 16) != 0 ? searchViewState.cryptoHoldings : map2;
        ImmutableMap immutableMap3 = (i & 32) != 0 ? searchViewState.futuresPositions : immutableMap;
        String str5 = (i & 64) != 0 ? searchViewState.accountNumber : str;
        List list13 = (i & 128) != 0 ? searchViewState.feedElements : list2;
        Function1 function13 = (i & 256) != 0 ? searchViewState.getScrollTargetIndex : function1;
        String str6 = (i & 512) != 0 ? searchViewState.query : str2;
        List list14 = (i & 1024) != 0 ? searchViewState.instrumentIdsInList : list3;
        List list15 = (i & 2048) != 0 ? searchViewState.cryptoIdsInList : list4;
        List list16 = (i & 4096) != 0 ? searchViewState.futuresContractIdsInList : list5;
        ImmutableList immutableList5 = (i & 8192) != 0 ? searchViewState.indexIdsInList : immutableList;
        List list17 = list12;
        boolean z16 = (i & 16384) != 0 ? searchViewState.showProgressBar : z2;
        UiEvent uiEvent19 = (i & 32768) != 0 ? searchViewState.throwable : uiEvent;
        UiEvent uiEvent20 = (i & 65536) != 0 ? searchViewState.addedToList : uiEvent2;
        UiEvent uiEvent21 = (i & 131072) != 0 ? searchViewState.removedFromList : uiEvent3;
        UiEvent uiEvent22 = (i & 262144) != 0 ? searchViewState.addedToListError : uiEvent4;
        UiEvent uiEvent23 = (i & 524288) != 0 ? searchViewState.removedFromListError : uiEvent5;
        UiEvent uiEvent24 = (i & 1048576) != 0 ? searchViewState.manualRefreshCompleteEvent : uiEvent6;
        UiEvent uiEvent25 = (i & 2097152) != 0 ? searchViewState.manualRefreshErrorEvent : uiEvent7;
        boolean z17 = (i & 4194304) != 0 ? searchViewState.shouldShowRecommendationsCard : z3;
        List list18 = (i & 8388608) != 0 ? searchViewState.recentSearchItems : list6;
        boolean z18 = (i & 16777216) != 0 ? searchViewState.displayRecentSearchWithInfoTabsChange : z4;
        UiEvent uiEvent26 = (i & 33554432) != 0 ? searchViewState.deleteRecentSearchError : uiEvent8;
        ScreenersStore.ScreenersData screenersData3 = (i & 67108864) != 0 ? searchViewState.screenersData : screenersData;
        UiEvent uiEvent27 = (i & 134217728) != 0 ? searchViewState.scrollToTargetEvent : uiEvent9;
        RecyclerViewItemsFetched recyclerViewItemsFetched3 = (i & 268435456) != 0 ? searchViewState.recyclerViewItemsFetched : recyclerViewItemsFetched;
        boolean z19 = (i & 536870912) != 0 ? searchViewState.showIndexOptionsListBadge : z5;
        boolean z20 = (i & 1073741824) != 0 ? searchViewState.isInCryptoRegionGate : z6;
        boolean z21 = (i & Integer.MIN_VALUE) != 0 ? searchViewState.isInEtfRegionGate : z7;
        AppType appType3 = (i2 & 1) != 0 ? searchViewState.appType : appType;
        if ((i2 & 2) != 0) {
            appType2 = appType3;
            immutableList3 = searchViewState.excludedTemplates;
            uiEvent11 = uiEvent22;
            uiEvent12 = uiEvent23;
            uiEvent13 = uiEvent24;
            uiEvent14 = uiEvent25;
            z8 = z17;
            list7 = list18;
            z9 = z18;
            uiEvent15 = uiEvent26;
            screenersData2 = screenersData3;
            uiEvent16 = uiEvent27;
            recyclerViewItemsFetched2 = recyclerViewItemsFetched3;
            z10 = z19;
            z11 = z20;
            z12 = z21;
            z13 = z16;
            map3 = map5;
            map4 = map6;
            immutableMap2 = immutableMap3;
            str3 = str5;
            list8 = list13;
            function12 = function13;
            str4 = str6;
            list9 = list14;
            list10 = list15;
            list11 = list16;
            immutableList4 = immutableList5;
            uiEvent17 = uiEvent19;
            uiEvent18 = uiEvent20;
            uiEvent10 = uiEvent21;
            z14 = z15;
            set2 = set3;
        } else {
            immutableList3 = immutableList2;
            appType2 = appType3;
            uiEvent10 = uiEvent21;
            uiEvent11 = uiEvent22;
            uiEvent12 = uiEvent23;
            uiEvent13 = uiEvent24;
            uiEvent14 = uiEvent25;
            z8 = z17;
            list7 = list18;
            z9 = z18;
            uiEvent15 = uiEvent26;
            screenersData2 = screenersData3;
            uiEvent16 = uiEvent27;
            recyclerViewItemsFetched2 = recyclerViewItemsFetched3;
            z10 = z19;
            z11 = z20;
            z12 = z21;
            z13 = z16;
            set2 = set3;
            map3 = map5;
            map4 = map6;
            immutableMap2 = immutableMap3;
            str3 = str5;
            list8 = list13;
            function12 = function13;
            str4 = str6;
            list9 = list14;
            list10 = list15;
            list11 = list16;
            immutableList4 = immutableList5;
            uiEvent17 = uiEvent19;
            uiEvent18 = uiEvent20;
            z14 = z15;
        }
        return searchViewState.copy(list17, z14, set2, map3, map4, immutableMap2, str3, list8, function12, str4, list9, list10, list11, immutableList4, z13, uiEvent17, uiEvent18, uiEvent10, uiEvent11, uiEvent12, uiEvent13, uiEvent14, z8, list7, z9, uiEvent15, screenersData2, uiEvent16, recyclerViewItemsFetched2, z10, z11, z12, appType2, immutableList3);
    }

    /* renamed from: component10, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final List<UUID> component11() {
        return this.instrumentIdsInList;
    }

    public final List<UUID> component12() {
        return this.cryptoIdsInList;
    }

    public final List<UUID> component13() {
        return this.futuresContractIdsInList;
    }

    public final ImmutableList<UUID> component14() {
        return this.indexIdsInList;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    public final UiEvent<Throwable> component16() {
        return this.throwable;
    }

    public final UiEvent<Security> component17() {
        return this.addedToList;
    }

    public final UiEvent<Security> component18() {
        return this.removedFromList;
    }

    public final UiEvent<Tuples2<Security, Throwable>> component19() {
        return this.addedToListError;
    }

    public final UiEvent<Tuples2<Security, Throwable>> component20() {
        return this.removedFromListError;
    }

    public final UiEvent<Unit> component21() {
        return this.manualRefreshCompleteEvent;
    }

    public final UiEvent<Throwable> component22() {
        return this.manualRefreshErrorEvent;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getShouldShowRecommendationsCard() {
        return this.shouldShowRecommendationsCard;
    }

    public final List<RecentSearch.RecentSearchResult> component24() {
        return this.recentSearchItems;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getDisplayRecentSearchWithInfoTabsChange() {
        return this.displayRecentSearchWithInfoTabsChange;
    }

    public final UiEvent<Unit> component26() {
        return this.deleteRecentSearchError;
    }

    /* renamed from: component27, reason: from getter */
    public final ScreenersStore.ScreenersData getScreenersData() {
        return this.screenersData;
    }

    public final UiEvent<Optional<Integer>> component28() {
        return this.scrollToTargetEvent;
    }

    /* renamed from: component29, reason: from getter */
    public final RecyclerViewItemsFetched getRecyclerViewItemsFetched() {
        return this.recyclerViewItemsFetched;
    }

    public final Set<UUID> component3$feature_search_externalRelease() {
        return this.listItemIdsInUserLists;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getShowIndexOptionsListBadge() {
        return this.showIndexOptionsListBadge;
    }

    public final ImmutableList<String> component34() {
        return this.excludedTemplates;
    }

    public final Map<UUID, Position> component4$feature_search_externalRelease() {
        return this.positions;
    }

    public final Map<UUID, UiCryptoHolding> component5$feature_search_externalRelease() {
        return this.cryptoHoldings;
    }

    public final SearchViewState copy(List<? extends SearchResponse> searchResponses, boolean isInDefaultSearch, Set<UUID> listItemIdsInUserLists, Map<UUID, Position> positions, Map<UUID, UiCryptoHolding> cryptoHoldings, ImmutableMap<UUID, UiFuturesPosition> futuresPositions, String accountNumber, List<NewsFeedElement> feedElements, Function1<? super List<? extends Element>, Integer> getScrollTargetIndex, String query, List<UUID> instrumentIdsInList, List<UUID> cryptoIdsInList, List<UUID> futuresContractIdsInList, ImmutableList<UUID> indexIdsInList, boolean showProgressBar, UiEvent<Throwable> throwable, UiEvent<Security> addedToList, UiEvent<Security> removedFromList, UiEvent<Tuples2<Security, Throwable>> addedToListError, UiEvent<Tuples2<Security, Throwable>> removedFromListError, UiEvent<Unit> manualRefreshCompleteEvent, UiEvent<Throwable> manualRefreshErrorEvent, boolean shouldShowRecommendationsCard, List<RecentSearch.RecentSearchResult> recentSearchItems, boolean displayRecentSearchWithInfoTabsChange, UiEvent<Unit> deleteRecentSearchError, ScreenersStore.ScreenersData screenersData, UiEvent<Optional<Integer>> scrollToTargetEvent, RecyclerViewItemsFetched recyclerViewItemsFetched, boolean showIndexOptionsListBadge, boolean isInCryptoRegionGate, boolean isInEtfRegionGate, AppType appType, ImmutableList<String> excludedTemplates) {
        Intrinsics.checkNotNullParameter(searchResponses, "searchResponses");
        Intrinsics.checkNotNullParameter(listItemIdsInUserLists, "listItemIdsInUserLists");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(cryptoHoldings, "cryptoHoldings");
        Intrinsics.checkNotNullParameter(futuresPositions, "futuresPositions");
        Intrinsics.checkNotNullParameter(feedElements, "feedElements");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(instrumentIdsInList, "instrumentIdsInList");
        Intrinsics.checkNotNullParameter(cryptoIdsInList, "cryptoIdsInList");
        Intrinsics.checkNotNullParameter(futuresContractIdsInList, "futuresContractIdsInList");
        Intrinsics.checkNotNullParameter(indexIdsInList, "indexIdsInList");
        Intrinsics.checkNotNullParameter(recentSearchItems, "recentSearchItems");
        Intrinsics.checkNotNullParameter(screenersData, "screenersData");
        Intrinsics.checkNotNullParameter(recyclerViewItemsFetched, "recyclerViewItemsFetched");
        Intrinsics.checkNotNullParameter(excludedTemplates, "excludedTemplates");
        return new SearchViewState(searchResponses, isInDefaultSearch, listItemIdsInUserLists, positions, cryptoHoldings, futuresPositions, accountNumber, feedElements, getScrollTargetIndex, query, instrumentIdsInList, cryptoIdsInList, futuresContractIdsInList, indexIdsInList, showProgressBar, throwable, addedToList, removedFromList, addedToListError, removedFromListError, manualRefreshCompleteEvent, manualRefreshErrorEvent, shouldShowRecommendationsCard, recentSearchItems, displayRecentSearchWithInfoTabsChange, deleteRecentSearchError, screenersData, scrollToTargetEvent, recyclerViewItemsFetched, showIndexOptionsListBadge, isInCryptoRegionGate, isInEtfRegionGate, appType, excludedTemplates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchViewState)) {
            return false;
        }
        SearchViewState searchViewState = (SearchViewState) other;
        return Intrinsics.areEqual(this.searchResponses, searchViewState.searchResponses) && this.isInDefaultSearch == searchViewState.isInDefaultSearch && Intrinsics.areEqual(this.listItemIdsInUserLists, searchViewState.listItemIdsInUserLists) && Intrinsics.areEqual(this.positions, searchViewState.positions) && Intrinsics.areEqual(this.cryptoHoldings, searchViewState.cryptoHoldings) && Intrinsics.areEqual(this.futuresPositions, searchViewState.futuresPositions) && Intrinsics.areEqual(this.accountNumber, searchViewState.accountNumber) && Intrinsics.areEqual(this.feedElements, searchViewState.feedElements) && Intrinsics.areEqual(this.getScrollTargetIndex, searchViewState.getScrollTargetIndex) && Intrinsics.areEqual(this.query, searchViewState.query) && Intrinsics.areEqual(this.instrumentIdsInList, searchViewState.instrumentIdsInList) && Intrinsics.areEqual(this.cryptoIdsInList, searchViewState.cryptoIdsInList) && Intrinsics.areEqual(this.futuresContractIdsInList, searchViewState.futuresContractIdsInList) && Intrinsics.areEqual(this.indexIdsInList, searchViewState.indexIdsInList) && this.showProgressBar == searchViewState.showProgressBar && Intrinsics.areEqual(this.throwable, searchViewState.throwable) && Intrinsics.areEqual(this.addedToList, searchViewState.addedToList) && Intrinsics.areEqual(this.removedFromList, searchViewState.removedFromList) && Intrinsics.areEqual(this.addedToListError, searchViewState.addedToListError) && Intrinsics.areEqual(this.removedFromListError, searchViewState.removedFromListError) && Intrinsics.areEqual(this.manualRefreshCompleteEvent, searchViewState.manualRefreshCompleteEvent) && Intrinsics.areEqual(this.manualRefreshErrorEvent, searchViewState.manualRefreshErrorEvent) && this.shouldShowRecommendationsCard == searchViewState.shouldShowRecommendationsCard && Intrinsics.areEqual(this.recentSearchItems, searchViewState.recentSearchItems) && this.displayRecentSearchWithInfoTabsChange == searchViewState.displayRecentSearchWithInfoTabsChange && Intrinsics.areEqual(this.deleteRecentSearchError, searchViewState.deleteRecentSearchError) && Intrinsics.areEqual(this.screenersData, searchViewState.screenersData) && Intrinsics.areEqual(this.scrollToTargetEvent, searchViewState.scrollToTargetEvent) && Intrinsics.areEqual(this.recyclerViewItemsFetched, searchViewState.recyclerViewItemsFetched) && this.showIndexOptionsListBadge == searchViewState.showIndexOptionsListBadge && this.isInCryptoRegionGate == searchViewState.isInCryptoRegionGate && this.isInEtfRegionGate == searchViewState.isInEtfRegionGate && this.appType == searchViewState.appType && Intrinsics.areEqual(this.excludedTemplates, searchViewState.excludedTemplates);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.searchResponses.hashCode() * 31) + Boolean.hashCode(this.isInDefaultSearch)) * 31) + this.listItemIdsInUserLists.hashCode()) * 31) + this.positions.hashCode()) * 31) + this.cryptoHoldings.hashCode()) * 31) + this.futuresPositions.hashCode()) * 31;
        String str = this.accountNumber;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.feedElements.hashCode()) * 31;
        Function1<List<? extends Element>, Integer> function1 = this.getScrollTargetIndex;
        int iHashCode3 = (((((((((((((iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31) + this.query.hashCode()) * 31) + this.instrumentIdsInList.hashCode()) * 31) + this.cryptoIdsInList.hashCode()) * 31) + this.futuresContractIdsInList.hashCode()) * 31) + this.indexIdsInList.hashCode()) * 31) + Boolean.hashCode(this.showProgressBar)) * 31;
        UiEvent<Throwable> uiEvent = this.throwable;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Security> uiEvent2 = this.addedToList;
        int iHashCode5 = (iHashCode4 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Security> uiEvent3 = this.removedFromList;
        int iHashCode6 = (iHashCode5 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Tuples2<Security, Throwable>> uiEvent4 = this.addedToListError;
        int iHashCode7 = (iHashCode6 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        UiEvent<Tuples2<Security, Throwable>> uiEvent5 = this.removedFromListError;
        int iHashCode8 = (iHashCode7 + (uiEvent5 == null ? 0 : uiEvent5.hashCode())) * 31;
        UiEvent<Unit> uiEvent6 = this.manualRefreshCompleteEvent;
        int iHashCode9 = (iHashCode8 + (uiEvent6 == null ? 0 : uiEvent6.hashCode())) * 31;
        UiEvent<Throwable> uiEvent7 = this.manualRefreshErrorEvent;
        int iHashCode10 = (((((((iHashCode9 + (uiEvent7 == null ? 0 : uiEvent7.hashCode())) * 31) + Boolean.hashCode(this.shouldShowRecommendationsCard)) * 31) + this.recentSearchItems.hashCode()) * 31) + Boolean.hashCode(this.displayRecentSearchWithInfoTabsChange)) * 31;
        UiEvent<Unit> uiEvent8 = this.deleteRecentSearchError;
        int iHashCode11 = (((iHashCode10 + (uiEvent8 == null ? 0 : uiEvent8.hashCode())) * 31) + this.screenersData.hashCode()) * 31;
        UiEvent<Optional<Integer>> uiEvent9 = this.scrollToTargetEvent;
        int iHashCode12 = (((((((((iHashCode11 + (uiEvent9 == null ? 0 : uiEvent9.hashCode())) * 31) + this.recyclerViewItemsFetched.hashCode()) * 31) + Boolean.hashCode(this.showIndexOptionsListBadge)) * 31) + Boolean.hashCode(this.isInCryptoRegionGate)) * 31) + Boolean.hashCode(this.isInEtfRegionGate)) * 31;
        AppType appType = this.appType;
        return ((iHashCode12 + (appType != null ? appType.hashCode() : 0)) * 31) + this.excludedTemplates.hashCode();
    }

    public String toString() {
        return "SearchViewState(searchResponses=" + this.searchResponses + ", isInDefaultSearch=" + this.isInDefaultSearch + ", listItemIdsInUserLists=" + this.listItemIdsInUserLists + ", positions=" + this.positions + ", cryptoHoldings=" + this.cryptoHoldings + ", futuresPositions=" + this.futuresPositions + ", accountNumber=" + this.accountNumber + ", feedElements=" + this.feedElements + ", getScrollTargetIndex=" + this.getScrollTargetIndex + ", query=" + this.query + ", instrumentIdsInList=" + this.instrumentIdsInList + ", cryptoIdsInList=" + this.cryptoIdsInList + ", futuresContractIdsInList=" + this.futuresContractIdsInList + ", indexIdsInList=" + this.indexIdsInList + ", showProgressBar=" + this.showProgressBar + ", throwable=" + this.throwable + ", addedToList=" + this.addedToList + ", removedFromList=" + this.removedFromList + ", addedToListError=" + this.addedToListError + ", removedFromListError=" + this.removedFromListError + ", manualRefreshCompleteEvent=" + this.manualRefreshCompleteEvent + ", manualRefreshErrorEvent=" + this.manualRefreshErrorEvent + ", shouldShowRecommendationsCard=" + this.shouldShowRecommendationsCard + ", recentSearchItems=" + this.recentSearchItems + ", displayRecentSearchWithInfoTabsChange=" + this.displayRecentSearchWithInfoTabsChange + ", deleteRecentSearchError=" + this.deleteRecentSearchError + ", screenersData=" + this.screenersData + ", scrollToTargetEvent=" + this.scrollToTargetEvent + ", recyclerViewItemsFetched=" + this.recyclerViewItemsFetched + ", showIndexOptionsListBadge=" + this.showIndexOptionsListBadge + ", isInCryptoRegionGate=" + this.isInCryptoRegionGate + ", isInEtfRegionGate=" + this.isInEtfRegionGate + ", appType=" + this.appType + ", excludedTemplates=" + this.excludedTemplates + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchViewState(List<? extends SearchResponse> searchResponses, boolean z, Set<UUID> listItemIdsInUserLists, Map<UUID, Position> positions, Map<UUID, UiCryptoHolding> cryptoHoldings, ImmutableMap<UUID, UiFuturesPosition> futuresPositions, String str, List<NewsFeedElement> feedElements, Function1<? super List<? extends Element>, Integer> function1, String query, List<UUID> instrumentIdsInList, List<UUID> cryptoIdsInList, List<UUID> futuresContractIdsInList, ImmutableList<UUID> indexIdsInList, boolean z2, UiEvent<Throwable> uiEvent, UiEvent<Security> uiEvent2, UiEvent<Security> uiEvent3, UiEvent<Tuples2<Security, Throwable>> uiEvent4, UiEvent<Tuples2<Security, Throwable>> uiEvent5, UiEvent<Unit> uiEvent6, UiEvent<Throwable> uiEvent7, boolean z3, List<RecentSearch.RecentSearchResult> recentSearchItems, boolean z4, UiEvent<Unit> uiEvent8, ScreenersStore.ScreenersData screenersData, UiEvent<Optional<Integer>> uiEvent9, RecyclerViewItemsFetched recyclerViewItemsFetched, boolean z5, boolean z6, boolean z7, AppType appType, ImmutableList<String> excludedTemplates) {
        DisplayMode displayMode;
        int i;
        List<Element.RecommendationsCard> listEmptyList;
        Intrinsics.checkNotNullParameter(searchResponses, "searchResponses");
        Intrinsics.checkNotNullParameter(listItemIdsInUserLists, "listItemIdsInUserLists");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(cryptoHoldings, "cryptoHoldings");
        Intrinsics.checkNotNullParameter(futuresPositions, "futuresPositions");
        Intrinsics.checkNotNullParameter(feedElements, "feedElements");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(instrumentIdsInList, "instrumentIdsInList");
        Intrinsics.checkNotNullParameter(cryptoIdsInList, "cryptoIdsInList");
        Intrinsics.checkNotNullParameter(futuresContractIdsInList, "futuresContractIdsInList");
        Intrinsics.checkNotNullParameter(indexIdsInList, "indexIdsInList");
        Intrinsics.checkNotNullParameter(recentSearchItems, "recentSearchItems");
        Intrinsics.checkNotNullParameter(screenersData, "screenersData");
        Intrinsics.checkNotNullParameter(recyclerViewItemsFetched, "recyclerViewItemsFetched");
        Intrinsics.checkNotNullParameter(excludedTemplates, "excludedTemplates");
        this.searchResponses = searchResponses;
        this.isInDefaultSearch = z;
        this.listItemIdsInUserLists = listItemIdsInUserLists;
        this.positions = positions;
        this.cryptoHoldings = cryptoHoldings;
        this.futuresPositions = futuresPositions;
        this.accountNumber = str;
        this.feedElements = feedElements;
        this.getScrollTargetIndex = function1;
        this.query = query;
        this.instrumentIdsInList = instrumentIdsInList;
        this.cryptoIdsInList = cryptoIdsInList;
        this.futuresContractIdsInList = futuresContractIdsInList;
        this.indexIdsInList = indexIdsInList;
        this.showProgressBar = z2;
        this.throwable = uiEvent;
        this.addedToList = uiEvent2;
        this.removedFromList = uiEvent3;
        this.addedToListError = uiEvent4;
        this.removedFromListError = uiEvent5;
        this.manualRefreshCompleteEvent = uiEvent6;
        this.manualRefreshErrorEvent = uiEvent7;
        this.shouldShowRecommendationsCard = z3;
        this.recentSearchItems = recentSearchItems;
        this.displayRecentSearchWithInfoTabsChange = z4;
        this.deleteRecentSearchError = uiEvent8;
        this.screenersData = screenersData;
        this.scrollToTargetEvent = uiEvent9;
        this.recyclerViewItemsFetched = recyclerViewItemsFetched;
        this.showIndexOptionsListBadge = z5;
        this.isInCryptoRegionGate = z6;
        this.isInEtfRegionGate = z7;
        this.appType = appType;
        this.excludedTemplates = excludedTemplates;
        if (!searchResponses.isEmpty()) {
            displayMode = DisplayMode.RESULTS;
        } else if (!z4) {
            displayMode = DisplayMode.DISCOVER;
        } else if (recentSearchItems.isEmpty() || query.length() != 0) {
            displayMode = query.length() > 0 ? DisplayMode.EMPTY : DisplayMode.EMPTY_RECENT_SEARCH_LIST;
        } else {
            displayMode = DisplayMode.RECENT_SEARCHES;
        }
        this.displayMode = displayMode;
        if (appType == AppType.RHC || appType == AppType.NCW) {
            i = C27909R.string.gated_crypto_empty_recent_search_text_with_crypto;
        } else if (z6 && z7) {
            i = C27909R.string.empty_recent_search_text_with_stock_crypto_etf;
        } else if (z6) {
            i = C27909R.string.gated_crypto_empty_recent_search_text_with_stock_crypto;
        } else if (z7) {
            i = C27909R.string.gated_etf_empty_recent_search_text_with_stock_etf;
        } else {
            i = C27909R.string.empty_recent_search_text_with_stock;
        }
        this.emptyRecentSearchTextResId = i;
        List<Element> elements = toElements(feedElements, 0, excludedTemplates);
        this.elements = elements;
        if (z3) {
            listEmptyList = getRecommendationsCardElement(0);
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.recommendationsCard = listEmptyList;
        if (recyclerViewItemsFetched.getAllFetched()) {
            UiEvent<Optional<Integer>> uiEvent10 = this.scrollToTargetEvent;
            if (uiEvent10 == null) {
                uiEvent10 = new UiEvent<>(Optional3.asOptional(function1 != 0 ? (Integer) function1.invoke(elements) : null));
            }
            this.scrollToTargetEvent = uiEvent10;
        }
    }

    public /* synthetic */ SearchViewState(List list, boolean z, Set set, Map map, Map map2, ImmutableMap immutableMap, String str, List list2, Function1 function1, String str2, List list3, List list4, List list5, ImmutableList immutableList, boolean z2, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, UiEvent uiEvent6, UiEvent uiEvent7, boolean z3, List list6, boolean z4, UiEvent uiEvent8, ScreenersStore.ScreenersData screenersData, UiEvent uiEvent9, RecyclerViewItemsFetched recyclerViewItemsFetched, boolean z5, boolean z6, boolean z7, AppType appType, ImmutableList immutableList2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? SetsKt.emptySet() : set, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? MapsKt.emptyMap() : map2, (i & 32) != 0 ? extensions2.persistentMapOf() : immutableMap, (i & 64) != 0 ? null : str, (i & 128) != 0 ? CollectionsKt.emptyList() : list2, (i & 256) != 0 ? null : function1, (i & 512) != 0 ? "" : str2, (i & 1024) != 0 ? CollectionsKt.emptyList() : list3, (i & 2048) != 0 ? CollectionsKt.emptyList() : list4, (i & 4096) != 0 ? CollectionsKt.emptyList() : list5, (i & 8192) != 0 ? extensions2.toImmutableList(CollectionsKt.emptyList()) : immutableList, (i & 16384) != 0 ? false : z2, (i & 32768) != 0 ? null : uiEvent, (i & 65536) != 0 ? null : uiEvent2, (i & 131072) != 0 ? null : uiEvent3, (i & 262144) != 0 ? null : uiEvent4, (i & 524288) != 0 ? null : uiEvent5, (i & 1048576) != 0 ? null : uiEvent6, (i & 2097152) != 0 ? null : uiEvent7, (i & 4194304) != 0 ? false : z3, (i & 8388608) != 0 ? CollectionsKt.emptyList() : list6, (i & 16777216) != 0 ? false : z4, (i & 33554432) != 0 ? null : uiEvent8, (i & 67108864) != 0 ? new ScreenersStore.ScreenersData(null, null, false, 7, null) : screenersData, (i & 134217728) != 0 ? null : uiEvent9, (i & 268435456) != 0 ? new RecyclerViewItemsFetched(false, false, false, 7, null) : recyclerViewItemsFetched, (i & 536870912) != 0 ? false : z5, (i & 1073741824) != 0 ? false : z6, (i & Integer.MIN_VALUE) != 0 ? false : z7, (i2 & 1) != 0 ? null : appType, (i2 & 2) != 0 ? extensions2.persistentListOf() : immutableList2);
    }

    public final Set<UUID> getListItemIdsInUserLists$feature_search_externalRelease() {
        return this.listItemIdsInUserLists;
    }

    public final Map<UUID, Position> getPositions$feature_search_externalRelease() {
        return this.positions;
    }

    public final Map<UUID, UiCryptoHolding> getCryptoHoldings$feature_search_externalRelease() {
        return this.cryptoHoldings;
    }

    public final String getQuery() {
        return this.query;
    }

    public final List<UUID> getInstrumentIdsInList() {
        return this.instrumentIdsInList;
    }

    public final List<UUID> getCryptoIdsInList() {
        return this.cryptoIdsInList;
    }

    public final List<UUID> getFuturesContractIdsInList() {
        return this.futuresContractIdsInList;
    }

    public final ImmutableList<UUID> getIndexIdsInList() {
        return this.indexIdsInList;
    }

    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    public final UiEvent<Throwable> getThrowable() {
        return this.throwable;
    }

    public final UiEvent<Security> getAddedToList() {
        return this.addedToList;
    }

    public final UiEvent<Security> getRemovedFromList() {
        return this.removedFromList;
    }

    public final UiEvent<Tuples2<Security, Throwable>> getAddedToListError() {
        return this.addedToListError;
    }

    public final UiEvent<Tuples2<Security, Throwable>> getRemovedFromListError() {
        return this.removedFromListError;
    }

    public final UiEvent<Unit> getManualRefreshCompleteEvent() {
        return this.manualRefreshCompleteEvent;
    }

    public final UiEvent<Throwable> getManualRefreshErrorEvent() {
        return this.manualRefreshErrorEvent;
    }

    public final boolean getShouldShowRecommendationsCard() {
        return this.shouldShowRecommendationsCard;
    }

    public final List<RecentSearch.RecentSearchResult> getRecentSearchItems() {
        return this.recentSearchItems;
    }

    public final boolean getDisplayRecentSearchWithInfoTabsChange() {
        return this.displayRecentSearchWithInfoTabsChange;
    }

    public final UiEvent<Unit> getDeleteRecentSearchError() {
        return this.deleteRecentSearchError;
    }

    public final ScreenersStore.ScreenersData getScreenersData() {
        return this.screenersData;
    }

    public final UiEvent<Optional<Integer>> getScrollToTargetEvent() {
        return this.scrollToTargetEvent;
    }

    public final void setScrollToTargetEvent(UiEvent<Optional<Integer>> uiEvent) {
        this.scrollToTargetEvent = uiEvent;
    }

    public final RecyclerViewItemsFetched getRecyclerViewItemsFetched() {
        return this.recyclerViewItemsFetched;
    }

    public final boolean getShowIndexOptionsListBadge() {
        return this.showIndexOptionsListBadge;
    }

    public final ImmutableList<String> getExcludedTemplates() {
        return this.excludedTemplates;
    }

    /* compiled from: SearchViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchViewState$RecyclerViewItemsFetched;", "", "shouldShowRecommendationsCardFetched", "", "feedElementsFetched", "screenersDataFetched", "<init>", "(ZZZ)V", "getShouldShowRecommendationsCardFetched", "()Z", "getFeedElementsFetched", "getScreenersDataFetched", "allFetched", "getAllFetched", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RecyclerViewItemsFetched {
        public static final int $stable = 0;
        private final boolean feedElementsFetched;
        private final boolean screenersDataFetched;
        private final boolean shouldShowRecommendationsCardFetched;

        public RecyclerViewItemsFetched() {
            this(false, false, false, 7, null);
        }

        public static /* synthetic */ RecyclerViewItemsFetched copy$default(RecyclerViewItemsFetched recyclerViewItemsFetched, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = recyclerViewItemsFetched.shouldShowRecommendationsCardFetched;
            }
            if ((i & 2) != 0) {
                z2 = recyclerViewItemsFetched.feedElementsFetched;
            }
            if ((i & 4) != 0) {
                z3 = recyclerViewItemsFetched.screenersDataFetched;
            }
            return recyclerViewItemsFetched.copy(z, z2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShouldShowRecommendationsCardFetched() {
            return this.shouldShowRecommendationsCardFetched;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getFeedElementsFetched() {
            return this.feedElementsFetched;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getScreenersDataFetched() {
            return this.screenersDataFetched;
        }

        public final RecyclerViewItemsFetched copy(boolean shouldShowRecommendationsCardFetched, boolean feedElementsFetched, boolean screenersDataFetched) {
            return new RecyclerViewItemsFetched(shouldShowRecommendationsCardFetched, feedElementsFetched, screenersDataFetched);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecyclerViewItemsFetched)) {
                return false;
            }
            RecyclerViewItemsFetched recyclerViewItemsFetched = (RecyclerViewItemsFetched) other;
            return this.shouldShowRecommendationsCardFetched == recyclerViewItemsFetched.shouldShowRecommendationsCardFetched && this.feedElementsFetched == recyclerViewItemsFetched.feedElementsFetched && this.screenersDataFetched == recyclerViewItemsFetched.screenersDataFetched;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.shouldShowRecommendationsCardFetched) * 31) + Boolean.hashCode(this.feedElementsFetched)) * 31) + Boolean.hashCode(this.screenersDataFetched);
        }

        public String toString() {
            return "RecyclerViewItemsFetched(shouldShowRecommendationsCardFetched=" + this.shouldShowRecommendationsCardFetched + ", feedElementsFetched=" + this.feedElementsFetched + ", screenersDataFetched=" + this.screenersDataFetched + ")";
        }

        public RecyclerViewItemsFetched(boolean z, boolean z2, boolean z3) {
            this.shouldShowRecommendationsCardFetched = z;
            this.feedElementsFetched = z2;
            this.screenersDataFetched = z3;
        }

        public /* synthetic */ RecyclerViewItemsFetched(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
        }

        public final boolean getShouldShowRecommendationsCardFetched() {
            return this.shouldShowRecommendationsCardFetched;
        }

        public final boolean getFeedElementsFetched() {
            return this.feedElementsFetched;
        }

        public final boolean getScreenersDataFetched() {
            return this.screenersDataFetched;
        }

        public final boolean getAllFetched() {
            return this.shouldShowRecommendationsCardFetched && this.feedElementsFetched && this.screenersDataFetched;
        }
    }

    public final List<SearchItem> getSearchResult() {
        List<SearchItem> listEmptyList;
        List<SearchResponse> list = this.searchResponses;
        ArrayList arrayList = new ArrayList();
        for (SearchResponse searchResponse : list) {
            if (searchResponse instanceof SearchResponse.CuratedLists) {
                listEmptyList = createCuratedListCarousel((SearchResponse.CuratedLists) searchResponse);
            } else if (searchResponse instanceof SearchResponse.CurrencyPairs) {
                listEmptyList = createCryptoRows((SearchResponse.CurrencyPairs) searchResponse);
            } else if (searchResponse instanceof SearchResponse.Instruments) {
                listEmptyList = createInstrumentRows((SearchResponse.Instruments) searchResponse);
            } else if (searchResponse instanceof SearchResponse.Deeplinks) {
                listEmptyList = createDeeplinkRows((SearchResponse.Deeplinks) searchResponse);
            } else if (searchResponse instanceof SearchResponse.Education) {
                listEmptyList = createEducationRows((SearchResponse.Education) searchResponse);
            } else if (searchResponse instanceof SearchResponse.FuturesResponse) {
                listEmptyList = createFuturesRows((SearchResponse.FuturesResponse) searchResponse);
            } else if (searchResponse instanceof SearchResponse.EventContracts) {
                listEmptyList = createEventContractRows((SearchResponse.EventContracts) searchResponse);
            } else if (searchResponse instanceof SearchResponse.Crypto) {
                listEmptyList = CollectionsKt.emptyList();
            } else if (searchResponse instanceof SearchResponse.MarketIndexes) {
                listEmptyList = createMarketIndexesRows((SearchResponse.MarketIndexes) searchResponse);
            } else if (searchResponse instanceof SearchResponse.Perpetuals) {
                listEmptyList = CollectionsKt.emptyList();
            } else if (searchResponse instanceof SearchResponse.TokenizedStock) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                if (!(searchResponse instanceof SearchResponse.TokenizedEtf)) {
                    throw new NoWhenBranchMatchedException();
                }
                listEmptyList = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, listEmptyList);
        }
        return arrayList;
    }

    public final DisplayMode getDisplayMode() {
        return this.displayMode;
    }

    public final List<RecentSearch> getRecentSearchItemsWithHeader() {
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(new RecentSearch.RecentSearchHeader(C27909R.string.recent_search_title)), (Iterable) this.recentSearchItems);
    }

    public final int getEmptyRecentSearchTextResId() {
        return this.emptyRecentSearchTextResId;
    }

    private final List<SearchItem.CuratedListCarousel> createCuratedListCarousel(SearchResponse.CuratedLists response) {
        if (this.isInDefaultSearch && !response.getCuratedLists().isEmpty()) {
            List<ApiCuratedListSearchItem> curatedLists = response.getCuratedLists();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(curatedLists, 10));
            for (ApiCuratedListSearchItem apiCuratedListSearchItem : curatedLists) {
                arrayList.add(new CuratedListChipItem(apiCuratedListSearchItem.getId(), apiCuratedListSearchItem.getDisplay_name(), apiCuratedListSearchItem.getOwner_type(), apiCuratedListSearchItem.getImage_urls().toCircleDbModel(), null, apiCuratedListSearchItem.getItem_count(), null, false, this.showIndexOptionsListBadge && Intrinsics.areEqual(apiCuratedListSearchItem.getId(), CuratedList.INSTANCE.getINDEX_OPTIONS_LIST_ID()), new CuratedListKey.RhList(apiCuratedListSearchItem.getId(), null, this.accountNumber, null, 10, null), false, 1232, null));
            }
            return CollectionsKt.listOf(new SearchItem.CuratedListCarousel(2000, arrayList));
        }
        return CollectionsKt.emptyList();
    }

    private final List<SearchItem> createCryptoRows(SearchResponse.CurrencyPairs response) {
        List<UiCurrencyPair> currencyPairs = response.getCurrencyPairs();
        if (currencyPairs.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        SearchItem.Header header = new SearchItem.Header(response.getDisplayTitle(), C27909R.string.gated_crypto_search_header_cryptos);
        List<UiCurrencyPair> list = currencyPairs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) obj;
            arrayList.add(new SearchItem.SecurityRow.Crypto(uiCurrencyPair, new SearchResultEventData(SearchResultItem.ContentType.CRYPTO, this.query, i2, currencyPairs.size()), this.isInDefaultSearch, this.listItemIdsInUserLists.contains(uiCurrencyPair.getId()), isInUserList(uiCurrencyPair), this.cryptoHoldings.get(uiCurrencyPair.getId())));
            i = i2;
        }
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(header), (Iterable) arrayList);
    }

    private final List<SearchItem> createInstrumentRows(SearchResponse.Instruments response) {
        int i;
        List<Instrument> instruments = response.getInstruments();
        if (instruments.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        String displayTitle = response.getDisplayTitle();
        if (this.isInEtfRegionGate) {
            i = C27909R.string.gated_etf_search_header_instruments;
        } else {
            i = C27909R.string.search_header_instruments_without_etf;
        }
        SearchItem.Header header = new SearchItem.Header(displayTitle, i);
        List<Instrument> list = instruments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Instrument instrument = (Instrument) obj;
            SearchResultEventData searchResultEventData = new SearchResultEventData(SearchResultItem.ContentType.INSTRUMENT, this.query, i3, instruments.size());
            boolean z = this.isInDefaultSearch;
            boolean zContains = this.listItemIdsInUserLists.contains(instrument.getId());
            boolean zIsInUserList = isInUserList(instrument);
            Position position = this.positions.get(instrument.getId());
            arrayList.add(new SearchItem.SecurityRow.Instrument(instrument, searchResultEventData, z, zContains, zIsInUserList, position != null ? position.getDisplayQuantity() : null));
            i2 = i3;
        }
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(header), (Iterable) arrayList);
    }

    private final List<SearchItem> createDeeplinkRows(SearchResponse.Deeplinks response) {
        List<ApiDeeplinkSearchItem> deeplinks2 = response.getDeeplinks();
        if (!this.isInDefaultSearch || deeplinks2.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        SearchItem.Header header = new SearchItem.Header(response.getDisplayTitle(), C27909R.string.search_header_deeplinks);
        List<ApiDeeplinkSearchItem> list = deeplinks2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ApiDeeplinkSearchItem apiDeeplinkSearchItem = (ApiDeeplinkSearchItem) obj;
            arrayList.add(new SearchItem.DeeplinkRow(apiDeeplinkSearchItem.getId(), apiDeeplinkSearchItem.getTitle(), apiDeeplinkSearchItem.getSubtitle(), apiDeeplinkSearchItem.getIcon(), apiDeeplinkSearchItem.getUri(), new SearchResultEventData(SearchResultItem.ContentType.DEEPLINK, this.query, i2, deeplinks2.size())));
            i = i2;
        }
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(header), (Iterable) arrayList);
    }

    private final List<SearchItem> createEducationRows(SearchResponse.Education response) {
        List<ApiEducationSearchItem> educationItems = response.getEducationItems();
        if (!this.isInDefaultSearch || educationItems.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        int i = 0;
        SearchItem.HeaderWithAction headerWithAction = new SearchItem.HeaderWithAction(response.getDisplayTitle(), C27909R.string.search_header_learn, C27909R.string.search_header_see_all, Uri.parse(EDUCATION_HOME_DEEPLINK), UserInteractionEventData.Action.VIEW_EDUCATION_HOME, new SearchResultEventData(SearchResultItem.ContentType.EDUCATION, this.query, 0, educationItems.size()));
        List<ApiEducationSearchItem> list = educationItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ApiEducationSearchItem apiEducationSearchItem = (ApiEducationSearchItem) obj;
            arrayList.add(new SearchItem.EducationRow(apiEducationSearchItem.getId(), apiEducationSearchItem.getAnalytics_id(), apiEducationSearchItem.getTitle(), apiEducationSearchItem.getBlurb(), apiEducationSearchItem.getDeeplink(), new SearchResultEventData(SearchResultItem.ContentType.EDUCATION, this.query, i2, educationItems.size())));
            i = i2;
        }
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(headerWithAction), (Iterable) arrayList);
    }

    private final List<SearchItem> createFuturesRows(SearchResponse.FuturesResponse response) {
        Tuples2 tuples2M3642to;
        if (response.getFuturesItems().isEmpty()) {
            return CollectionsKt.emptyList();
        }
        if (response instanceof SearchResponse.FuturesResponse.ActiveFutures) {
            tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C27909R.string.search_header_active_futures), SearchResultItem.ContentType.ACTIVE_FUTURES);
        } else if (response instanceof SearchResponse.FuturesResponse.NonActiveFutures) {
            tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C27909R.string.search_header_non_active_futures), SearchResultItem.ContentType.NON_ACTIVE_FUTURES);
        } else if (response instanceof SearchResponse.FuturesResponse.FuturesContracts) {
            tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C27909R.string.search_header_futures_contracts), SearchResultItem.ContentType.FUTURES_CONTRACTS);
        } else {
            if (!(response instanceof SearchResponse.FuturesResponse.FuturesProducts)) {
                throw new NoWhenBranchMatchedException();
            }
            tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C27909R.string.search_header_futures_products), SearchResultItem.ContentType.FUTURES_PRODUCTS);
        }
        int iIntValue = ((Number) tuples2M3642to.component1()).intValue();
        SearchResultItem.ContentType contentType = (SearchResultItem.ContentType) tuples2M3642to.component2();
        SearchItem.Header header = new SearchItem.Header(response.getDisplayTitle(), iIntValue);
        List<FuturesSearchItem> futuresItems = response.getFuturesItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(futuresItems, 10));
        int i = 0;
        for (Object obj : futuresItems) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            FuturesSearchItem futuresSearchItem = (FuturesSearchItem) obj;
            arrayList.add(new SearchItem.SecurityRow.Futures(futuresSearchItem, new SearchResultEventData(contentType, this.query, i2, response.getFuturesItems().size()), this.isInDefaultSearch, this.listItemIdsInUserLists.contains(futuresSearchItem.getId()), isInUserList(futuresSearchItem), contentType != SearchResultItem.ContentType.ACTIVE_FUTURES, this.futuresPositions.get(futuresSearchItem.getId())));
            i = i2;
        }
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(header), (Iterable) arrayList);
    }

    private final List<SearchItem> createEventContractRows(SearchResponse.EventContracts response) {
        if (response.getEcItems().isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List listListOf = CollectionsKt.listOf(new SearchItem.Header(response.getDisplayTitle(), C27909R.string.search_header_event_contracts));
        List<ApiEventContractSearchItem> ecItems = response.getEcItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(ecItems, 10));
        int i = 0;
        for (Object obj : ecItems) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new SearchItem.SecurityRow.EventContract((ApiEventContractSearchItem) obj, new SearchResultEventData(SearchResultItem.ContentType.EVENT_CONTRACTS, this.query, i2, response.getEcItems().size())));
            i = i2;
        }
        return CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
    }

    private final List<SearchItem> createMarketIndexesRows(SearchResponse.MarketIndexes response) {
        List<Index> marketIndexes = response.getMarketIndexes();
        if (marketIndexes.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        SearchItem.Header header = new SearchItem.Header(response.getDisplayTitle(), C27909R.string.search_header_market_indexes);
        List<Index> list = marketIndexes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Index index = (Index) obj;
            arrayList.add(new SearchItem.SecurityRow.MarketIndex(index, new SearchResultEventData(SearchResultItem.ContentType.MARKET_INDEXES, this.query, i2, marketIndexes.size()), this.isInDefaultSearch, this.listItemIdsInUserLists.contains(index.getId()), isInUserList(index)));
            i = i2;
        }
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(header), (Iterable) arrayList);
    }

    public final List<Element> getElements() {
        return this.elements;
    }

    public final List<Element> getRecommendationsCard() {
        return this.recommendationsCard;
    }

    private final List<Element.RecommendationsCard> getRecommendationsCardElement(int rank) {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return CollectionsKt.listOf(new Element.RecommendationsCard(uuidRandomUUID, rank));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List toElements$default(SearchViewState searchViewState, List list, int i, List list2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return searchViewState.toElements(list, i, list2);
    }

    private final List<Element> toElements(List<NewsFeedElement> list, int i, List<String> list2) {
        List<Element> elements = NewsFeedElements.toElements(list, SetsKt.emptySet(), false, false, true, true, MapsKt.emptyMap(), SetsKt.emptySet(), MapsKt.emptyMap(), MapsKt.emptyMap(), i, list2);
        if (!this.showIndexOptionsListBadge) {
            return elements;
        }
        List<Element> list3 = elements;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (Object objCopy$default : list3) {
            if (objCopy$default instanceof Element.ListPreview) {
                Element.ListPreview listPreview = (Element.ListPreview) objCopy$default;
                List<Content.ListPreview> contents = listPreview.getContents();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(contents, 10));
                for (Content.ListPreview listPreviewCopy$default : contents) {
                    if (Intrinsics.areEqual(listPreviewCopy$default.getId(), CuratedList.INSTANCE.getINDEX_OPTIONS_LIST_ID())) {
                        listPreviewCopy$default = Content.ListPreview.copy$default(listPreviewCopy$default, null, 0, null, null, null, null, null, 0, true, 255, null);
                    }
                    arrayList2.add(listPreviewCopy$default);
                }
                objCopy$default = Element.ListPreview.copy$default(listPreview, null, 0, null, null, null, arrayList2, null, 95, null);
            }
            arrayList.add(objCopy$default);
        }
        return arrayList;
    }

    private final boolean isInUserList(Security security) {
        if (security instanceof Instrument) {
            return this.instrumentIdsInList.contains(((Instrument) security).getId());
        }
        if (security instanceof UiCurrencyPair) {
            return this.cryptoIdsInList.contains(((UiCurrencyPair) security).getId());
        }
        if ((security instanceof FuturesContract) || (security instanceof ApiFuturesContractSearchItem)) {
            return this.futuresContractIdsInList.contains(security.getId());
        }
        if (security instanceof ApiFuturesProductSearchItem) {
            return false;
        }
        if (security instanceof Index) {
            return this.indexIdsInList.contains(((Index) security).getId());
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(security);
        throw new ExceptionsH();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchViewState$DisplayMode;", "", "<init>", "(Ljava/lang/String;I)V", "RESULTS", "DISCOVER", "RECENT_SEARCHES", "EMPTY_RECENT_SEARCH_LIST", "EMPTY", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DisplayMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DisplayMode[] $VALUES;
        public static final DisplayMode RESULTS = new DisplayMode("RESULTS", 0);
        public static final DisplayMode DISCOVER = new DisplayMode("DISCOVER", 1);
        public static final DisplayMode RECENT_SEARCHES = new DisplayMode("RECENT_SEARCHES", 2);
        public static final DisplayMode EMPTY_RECENT_SEARCH_LIST = new DisplayMode("EMPTY_RECENT_SEARCH_LIST", 3);
        public static final DisplayMode EMPTY = new DisplayMode("EMPTY", 4);

        private static final /* synthetic */ DisplayMode[] $values() {
            return new DisplayMode[]{RESULTS, DISCOVER, RECENT_SEARCHES, EMPTY_RECENT_SEARCH_LIST, EMPTY};
        }

        public static EnumEntries<DisplayMode> getEntries() {
            return $ENTRIES;
        }

        private DisplayMode(String str, int i) {
        }

        static {
            DisplayMode[] displayModeArr$values = $values();
            $VALUES = displayModeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(displayModeArr$values);
        }

        public static DisplayMode valueOf(String str) {
            return (DisplayMode) Enum.valueOf(DisplayMode.class, str);
        }

        public static DisplayMode[] values() {
            return (DisplayMode[]) $VALUES.clone();
        }
    }
}
