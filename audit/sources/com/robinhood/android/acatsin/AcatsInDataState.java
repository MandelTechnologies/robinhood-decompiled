package com.robinhood.android.acatsin;

import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.borrowingfee.UiShortPositionFeeData;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.acatsin.util.PlaidBrokerAssetsHelper;
import com.robinhood.android.acatsin.util.names.NamesOnAccount;
import com.robinhood.android.acatsin.util.names.NamesOnAccount2;
import com.robinhood.models.acats.p299db.bonfire.AccountContentItem;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.EquityAsset;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets2;
import com.robinhood.models.acats.p299db.p300ui.CapabilityStatus;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo;
import com.robinhood.models.api.bonfire.ApiAccountContentItem;
import com.robinhood.models.api.bonfire.ApiAvailableDestinationsResponse;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.api.bonfire.plaid.brokerassets.TransferType;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.AcatsInContext;
import com.robinhood.utils.Either;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInDataState.kt */
@Metadata(m3635d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B·\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0019\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0019\u0012\b\b\u0002\u0010,\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\b\b\u0002\u0010.\u001a\u00020\u0005\u0012\b\b\u0002\u0010/\u001a\u00020\u0005\u0012\b\b\u0002\u00100\u001a\u00020\u0005\u0012\b\b\u0002\u00101\u001a\u00020\u0005\u0012\b\b\u0002\u00102\u001a\u00020\u0005\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00104\u001a\u00020\u0005\u0012\b\b\u0002\u00105\u001a\u00020\u0005\u0012\b\b\u0002\u00106\u001a\u00020\u0005\u0012\b\b\u0002\u00107\u001a\u00020\u0005¢\u0006\u0004\b8\u00109J\u0010\u0010y\u001a\u0004\u0018\u00010z2\u0006\u0010{\u001a\u00020zJ\b\u0010|\u001a\u00020\u0005H\u0002J\b\u0010}\u001a\u00020\u0005H\u0002J\b\u0010~\u001a\u00020\u0005H\u0002J\t\u0010\u0084\u0001\u001a\u00020\u0005H\u0002J\t\u0010\u0085\u0001\u001a\u00020\u0005H\u0002J\u0012\u0010\u0086\u0001\u001a\u00020z2\u0007\u0010\u0087\u0001\u001a\u00020zH\u0002J\n\u0010\u009e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0005HÆ\u0003J\u0018\u0010¡\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0012HÂ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0016HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019HÆ\u0003J\u0010\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019HÆ\u0003J\u0010\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010¯\u0001\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0019HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003J\n\u0010±\u0001\u001a\u00020$HÆ\u0003J\n\u0010²\u0001\u001a\u00020$HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010'HÆ\u0003J\n\u0010´\u0001\u001a\u00020)HÆ\u0003J\u0012\u0010µ\u0001\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0019HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0005HÆ\u0003J\u0010\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019HÂ\u0003J\n\u0010¸\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010À\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0005HÆ\u0003JÀ\u0003\u0010Â\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00192\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020)2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u00192\b\b\u0002\u0010,\u001a\u00020\u00052\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\b\b\u0002\u0010.\u001a\u00020\u00052\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00104\u001a\u00020\u00052\b\b\u0002\u00105\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u00020\u00052\b\b\u0002\u00107\u001a\u00020\u0005HÆ\u0001J\u0015\u0010Ã\u0001\u001a\u00020\u00052\t\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010Å\u0001\u001a\u00030Æ\u0001HÖ\u0001J\n\u0010Ç\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010=R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010;R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010;R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010;R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010;R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019¢\u0006\b\n\u0000\u001a\u0004\bO\u0010NR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\bP\u0010NR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010;R\u0019\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bR\u0010NR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0011\u0010%\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\bW\u0010VR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0019\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010NR\u0011\u0010,\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u0010=R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b^\u0010=R\u0011\u0010/\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010=R\u0011\u00100\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010=R\u0011\u00101\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010=R\u0011\u00102\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010=R\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010;R\u0011\u00104\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b`\u0010=R\u0011\u00105\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010=R\u0011\u00106\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\ba\u0010=R\u0011\u00107\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bb\u0010=R\u0011\u0010c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bd\u0010=R\u0013\u0010e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bf\u0010DR\u0013\u0010g\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bh\u0010;R\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198F¢\u0006\u0006\u001a\u0004\bj\u0010NR\u0013\u0010k\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bl\u0010DR\u0017\u0010m\u001a\b\u0012\u0004\u0012\u00020\u001c0n8F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0019\u0010q\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\br\u0010NR\u0014\u0010s\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010=R\u0014\u0010u\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010=R\u0014\u0010w\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010=R\u0019\u0010\u007f\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u00198F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010NR\u0013\u0010\u0082\u0001\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010=R\u001d\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010\u00198BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010NR\u0015\u0010\u008b\u0001\u001a\u00030\u008c\u00018F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0013\u0010\u008f\u0001\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010=R\u0015\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010;R\u0013\u0010\u0093\u0001\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010=R\u0015\u0010\u0094\u0001\u001a\u00030\u0095\u00018F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0015\u0010\u0098\u0001\u001a\u00030\u0095\u00018F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u0097\u0001R\u0013\u0010\u009a\u0001\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010=R\u0013\u0010\u009c\u0001\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010=¨\u0006È\u0001"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInDataState;", "", "source", "", "skipIntro", "", "introShown", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "availableDestinations", "Lcom/robinhood/models/api/bonfire/ApiAvailableDestinationsResponse;", "selectedRhsAccount", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "plaidLinkToken", "contraAccountNumber", "plaidAccessTokenId", "plaidBrokerAssets", "Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssets;", "accountNames", "Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "plaidTransferType", "Lcom/robinhood/models/api/bonfire/plaid/brokerassets/TransferType;", "accountName", "accountContents", "", "Lcom/robinhood/models/acats/db/bonfire/AccountContentItem;", "supportedContentTypes", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountContentsResponse$SupportedContentType;", "unsupportedContentTypes", "buildPartialBannerContentfulId", "assets", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "submittedAcatsTransferId", "Ljava/util/UUID;", "optionsCapabilityStatus", "Lcom/robinhood/models/acats/db/ui/CapabilityStatus;", "marginCapabilityStatus", "acatsBonusPromoInfo", "Lcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;", "selectedAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "slipAgreements", "Lcom/robinhood/models/ui/UiSlipAgreements$Agreement;", "plaidHasErrored", "dtcsRequiringCoOwnerSignature", "matchRateSelected", "isAccountPreselected", "isOptionsSupported", "isMarginSupported", "isAcatsBrokerageMatchSupported", "acatsInSbExperimentVariant", "continueWithPlaid", "isGoldUser", "inAcatsRejectedImprovementsExperiment", "inSubzeroExperiment", "<init>", "(Ljava/lang/String;ZZLcom/robinhood/utils/Either;Lcom/robinhood/models/api/bonfire/ApiAvailableDestinationsResponse;Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssets;Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;Lcom/robinhood/models/api/bonfire/plaid/brokerassets/TransferType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/UUID;Lcom/robinhood/models/acats/db/ui/CapabilityStatus;Lcom/robinhood/models/acats/db/ui/CapabilityStatus;Lcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/List;ZLjava/util/List;ZZZZZLjava/lang/String;ZZZZ)V", "getSource", "()Ljava/lang/String;", "getSkipIntro", "()Z", "getIntroShown", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getAvailableDestinations", "()Lcom/robinhood/models/api/bonfire/ApiAvailableDestinationsResponse;", "getSelectedRhsAccount", "()Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "getPlaidLinkToken", "getContraAccountNumber", "getPlaidAccessTokenId", "getAccountNames", "()Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "getPlaidTransferType", "()Lcom/robinhood/models/api/bonfire/plaid/brokerassets/TransferType;", "getAccountName", "getAccountContents", "()Ljava/util/List;", "getSupportedContentTypes", "getUnsupportedContentTypes", "getBuildPartialBannerContentfulId", "getAssets", "getSubmittedAcatsTransferId", "()Ljava/util/UUID;", "getOptionsCapabilityStatus", "()Lcom/robinhood/models/acats/db/ui/CapabilityStatus;", "getMarginCapabilityStatus", "getAcatsBonusPromoInfo", "()Lcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;", "getSelectedAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSlipAgreements", "getPlaidHasErrored", "getMatchRateSelected", "getAcatsInSbExperimentVariant", "getContinueWithPlaid", "getInAcatsRejectedImprovementsExperiment", "getInSubzeroExperiment", "hasPlaidAssets", "getHasPlaidAssets", "rhsAccount", "getRhsAccount", "taxableAccountBonusRateString", "getTaxableAccountBonusRateString", "selectedPartialAccountContents", "getSelectedPartialAccountContents", "defaultRhsAccount", "getDefaultRhsAccount", "plaidSupportedContentTypes", "", "getPlaidSupportedContentTypes", "()Ljava/util/Set;", "assetsToSubmit", "getAssetsToSubmit", "hasPartialAccountContents", "getHasPartialAccountContents", "hasMarginAccountContents", "getHasMarginAccountContents", "hasOptionAccountContents", "getHasOptionAccountContents", "getNextFlowStep", "Lcom/robinhood/android/acatsin/util/AcatsFlowStep;", "completedStep", "isPlaidFullTransferFromPartial", "isFullTransfer", "hasShortPositions", "shortPositionFeeData", "Lcom/robinhood/android/acatsin/borrowingfee/UiShortPositionFeeData;", "getShortPositionFeeData", "hasShortEquityPositions", "getHasShortEquityPositions", "showEnableMarginStep", "showEnableOptionsStep", "nextCheckedTransferStep", "nonPlaidAssetsStep", "loggingContents", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$AccountContents;", "getLoggingContents", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "activeBonus", "getActiveBonus", "promoId", "getPromoId", "isPersonalizedPromo", "confirmationTitle", "Lcom/robinhood/utils/resource/StringResource;", "getConfirmationTitle", "()Lcom/robinhood/utils/resource/StringResource;", "confirmationDescription", "getConfirmationDescription", "showGoldConfirmationScreen", "getShowGoldConfirmationScreen", "requiresCoOwnerSignature", "getRequiresCoOwnerSignature", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "copy", "equals", "other", "hashCode", "", "toString", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AcatsInDataState {
    public static final int $stable = 8;
    private final ApiAcatsBonusPromoInfo acatsBonusPromoInfo;
    private final String acatsInSbExperimentVariant;
    private final List<AccountContentItem> accountContents;
    private final String accountName;
    private final NamesOnAccount accountNames;
    private final List<UiAcatsAsset> assets;
    private final ApiAvailableDestinationsResponse availableDestinations;
    private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
    private final String buildPartialBannerContentfulId;
    private final boolean continueWithPlaid;
    private final String contraAccountNumber;
    private final List<String> dtcsRequiringCoOwnerSignature;
    private final boolean inAcatsRejectedImprovementsExperiment;
    private final boolean inSubzeroExperiment;
    private final boolean introShown;
    private final boolean isAcatsBrokerageMatchSupported;
    private final boolean isAccountPreselected;
    private final boolean isGoldUser;
    private final boolean isMarginSupported;
    private final boolean isOptionsSupported;
    private final CapabilityStatus marginCapabilityStatus;
    private final boolean matchRateSelected;
    private final CapabilityStatus optionsCapabilityStatus;
    private final String plaidAccessTokenId;
    private final PlaidBrokerAssets plaidBrokerAssets;
    private final boolean plaidHasErrored;
    private final String plaidLinkToken;
    private final TransferType plaidTransferType;
    private final BrokerageAccountType selectedAccountType;
    private final AvailableAccount selectedRhsAccount;
    private final boolean skipIntro;
    private final List<UiSlipAgreements.Agreement> slipAgreements;
    private final String source;
    private final UUID submittedAcatsTransferId;
    private final List<ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes;
    private final List<String> unsupportedContentTypes;

    /* compiled from: AcatsInDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AcatsFlowStep.values().length];
            try {
                iArr[AcatsFlowStep.INTRO_SWIPIES_BONUS_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AcatsFlowStep.INTRO_SWIPIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AcatsFlowStep.INTRO_CONSOLIDATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AcatsFlowStep.BROKERAGE_SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AcatsFlowStep.MANUAL_BROKERAGE_ENTRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AcatsFlowStep.AVAILABLE_DESTINATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AcatsFlowStep.PLAID_INTRO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AcatsFlowStep.ENTER_ACCOUNT_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AcatsFlowStep.PLAID_ACCOUNT_NUMBER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AcatsFlowStep.CONFIRM_ACCOUNT_NAME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AcatsFlowStep.ACCOUNT_CONTENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AcatsFlowStep.POSITION_CHECKLIST_INELIGIBLE_ALTERNATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AcatsFlowStep.POSITION_CHECKLIST_NOT_SURE_ALTERNATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AcatsFlowStep.CONFIRM_ELIGIBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AcatsFlowStep.RECONFIRM_ELIGIBLE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AcatsFlowStep.ENABLE_OPTIONS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AcatsFlowStep.ENABLE_MARGIN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AcatsFlowStep.PLAID_PARTIAL_TRANSFER_SUPPORTED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[AcatsFlowStep.PARTIAL_TRANSFER_FLOW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[AcatsFlowStep.PLAID_PARTIAL_TRANSFER_EDIT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[AcatsFlowStep.AGREEMENT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[AcatsFlowStep.REVIEW_AND_SUBMIT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[AcatsFlowStep.CANNOT_COMPLETE_CONFIRMATION.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[AcatsFlowStep.CONFIRMATION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PlaidBrokerAssets2.values().length];
            try {
                iArr2[PlaidBrokerAssets2.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[PlaidBrokerAssets2.PARTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[PlaidBrokerAssets2.UNSUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[PlaidBrokerAssets2.OPTIONS_UPGRADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[PlaidBrokerAssets2.MARGIN_UPGRADE.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[PlaidBrokerAssets2.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component10, reason: from getter */
    private final PlaidBrokerAssets getPlaidBrokerAssets() {
        return this.plaidBrokerAssets;
    }

    private final List<String> component26() {
        return this.dtcsRequiringCoOwnerSignature;
    }

    public static /* synthetic */ AcatsInDataState copy$default(AcatsInDataState acatsInDataState, String str, boolean z, boolean z2, Either either, ApiAvailableDestinationsResponse apiAvailableDestinationsResponse, AvailableAccount availableAccount, String str2, String str3, String str4, PlaidBrokerAssets plaidBrokerAssets, NamesOnAccount namesOnAccount, TransferType transferType, String str5, List list, List list2, List list3, String str6, List list4, UUID uuid, CapabilityStatus capabilityStatus, CapabilityStatus capabilityStatus2, ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo, BrokerageAccountType brokerageAccountType, List list5, boolean z3, List list6, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str7, boolean z9, boolean z10, boolean z11, boolean z12, int i, int i2, Object obj) {
        boolean z13;
        boolean z14;
        CapabilityStatus capabilityStatus3;
        CapabilityStatus capabilityStatus4;
        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo2;
        BrokerageAccountType brokerageAccountType2;
        List list7;
        boolean z15;
        List list8;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        String str8;
        boolean z21;
        boolean z22;
        List list9;
        ApiAvailableDestinationsResponse apiAvailableDestinationsResponse2;
        AvailableAccount availableAccount2;
        String str9;
        String str10;
        String str11;
        PlaidBrokerAssets plaidBrokerAssets2;
        NamesOnAccount namesOnAccount2;
        TransferType transferType2;
        String str12;
        List list10;
        List list11;
        String str13;
        List list12;
        UUID uuid2;
        boolean z23;
        boolean z24;
        Either either2;
        String str14 = (i & 1) != 0 ? acatsInDataState.source : str;
        boolean z25 = (i & 2) != 0 ? acatsInDataState.skipIntro : z;
        boolean z26 = (i & 4) != 0 ? acatsInDataState.introShown : z2;
        Either either3 = (i & 8) != 0 ? acatsInDataState.brokerageOrDtcNumber : either;
        ApiAvailableDestinationsResponse apiAvailableDestinationsResponse3 = (i & 16) != 0 ? acatsInDataState.availableDestinations : apiAvailableDestinationsResponse;
        AvailableAccount availableAccount3 = (i & 32) != 0 ? acatsInDataState.selectedRhsAccount : availableAccount;
        String str15 = (i & 64) != 0 ? acatsInDataState.plaidLinkToken : str2;
        String str16 = (i & 128) != 0 ? acatsInDataState.contraAccountNumber : str3;
        String str17 = (i & 256) != 0 ? acatsInDataState.plaidAccessTokenId : str4;
        PlaidBrokerAssets plaidBrokerAssets3 = (i & 512) != 0 ? acatsInDataState.plaidBrokerAssets : plaidBrokerAssets;
        NamesOnAccount namesOnAccount3 = (i & 1024) != 0 ? acatsInDataState.accountNames : namesOnAccount;
        TransferType transferType3 = (i & 2048) != 0 ? acatsInDataState.plaidTransferType : transferType;
        String str18 = (i & 4096) != 0 ? acatsInDataState.accountName : str5;
        List list13 = (i & 8192) != 0 ? acatsInDataState.accountContents : list;
        String str19 = str14;
        List list14 = (i & 16384) != 0 ? acatsInDataState.supportedContentTypes : list2;
        List list15 = (i & 32768) != 0 ? acatsInDataState.unsupportedContentTypes : list3;
        String str20 = (i & 65536) != 0 ? acatsInDataState.buildPartialBannerContentfulId : str6;
        List list16 = (i & 131072) != 0 ? acatsInDataState.assets : list4;
        UUID uuid3 = (i & 262144) != 0 ? acatsInDataState.submittedAcatsTransferId : uuid;
        CapabilityStatus capabilityStatus5 = (i & 524288) != 0 ? acatsInDataState.optionsCapabilityStatus : capabilityStatus;
        CapabilityStatus capabilityStatus6 = (i & 1048576) != 0 ? acatsInDataState.marginCapabilityStatus : capabilityStatus2;
        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo3 = (i & 2097152) != 0 ? acatsInDataState.acatsBonusPromoInfo : apiAcatsBonusPromoInfo;
        BrokerageAccountType brokerageAccountType3 = (i & 4194304) != 0 ? acatsInDataState.selectedAccountType : brokerageAccountType;
        List list17 = (i & 8388608) != 0 ? acatsInDataState.slipAgreements : list5;
        boolean z27 = (i & 16777216) != 0 ? acatsInDataState.plaidHasErrored : z3;
        List list18 = (i & 33554432) != 0 ? acatsInDataState.dtcsRequiringCoOwnerSignature : list6;
        boolean z28 = (i & 67108864) != 0 ? acatsInDataState.matchRateSelected : z4;
        boolean z29 = (i & 134217728) != 0 ? acatsInDataState.isAccountPreselected : z5;
        boolean z30 = (i & 268435456) != 0 ? acatsInDataState.isOptionsSupported : z6;
        boolean z31 = (i & 536870912) != 0 ? acatsInDataState.isMarginSupported : z7;
        boolean z32 = (i & 1073741824) != 0 ? acatsInDataState.isAcatsBrokerageMatchSupported : z8;
        String str21 = (i & Integer.MIN_VALUE) != 0 ? acatsInDataState.acatsInSbExperimentVariant : str7;
        boolean z33 = (i2 & 1) != 0 ? acatsInDataState.continueWithPlaid : z9;
        boolean z34 = (i2 & 2) != 0 ? acatsInDataState.isGoldUser : z10;
        boolean z35 = (i2 & 4) != 0 ? acatsInDataState.inAcatsRejectedImprovementsExperiment : z11;
        if ((i2 & 8) != 0) {
            z14 = z35;
            z13 = acatsInDataState.inSubzeroExperiment;
            capabilityStatus4 = capabilityStatus6;
            apiAcatsBonusPromoInfo2 = apiAcatsBonusPromoInfo3;
            brokerageAccountType2 = brokerageAccountType3;
            list7 = list17;
            z15 = z27;
            list8 = list18;
            z16 = z28;
            z17 = z29;
            z18 = z30;
            z19 = z31;
            z20 = z32;
            str8 = str21;
            z21 = z33;
            z22 = z34;
            list9 = list14;
            availableAccount2 = availableAccount3;
            str9 = str15;
            str10 = str16;
            str11 = str17;
            plaidBrokerAssets2 = plaidBrokerAssets3;
            namesOnAccount2 = namesOnAccount3;
            transferType2 = transferType3;
            str12 = str18;
            list10 = list13;
            list11 = list15;
            str13 = str20;
            list12 = list16;
            uuid2 = uuid3;
            capabilityStatus3 = capabilityStatus5;
            z23 = z25;
            z24 = z26;
            either2 = either3;
            apiAvailableDestinationsResponse2 = apiAvailableDestinationsResponse3;
        } else {
            z13 = z12;
            z14 = z35;
            capabilityStatus3 = capabilityStatus5;
            capabilityStatus4 = capabilityStatus6;
            apiAcatsBonusPromoInfo2 = apiAcatsBonusPromoInfo3;
            brokerageAccountType2 = brokerageAccountType3;
            list7 = list17;
            z15 = z27;
            list8 = list18;
            z16 = z28;
            z17 = z29;
            z18 = z30;
            z19 = z31;
            z20 = z32;
            str8 = str21;
            z21 = z33;
            z22 = z34;
            list9 = list14;
            apiAvailableDestinationsResponse2 = apiAvailableDestinationsResponse3;
            availableAccount2 = availableAccount3;
            str9 = str15;
            str10 = str16;
            str11 = str17;
            plaidBrokerAssets2 = plaidBrokerAssets3;
            namesOnAccount2 = namesOnAccount3;
            transferType2 = transferType3;
            str12 = str18;
            list10 = list13;
            list11 = list15;
            str13 = str20;
            list12 = list16;
            uuid2 = uuid3;
            z23 = z25;
            z24 = z26;
            either2 = either3;
        }
        return acatsInDataState.copy(str19, z23, z24, either2, apiAvailableDestinationsResponse2, availableAccount2, str9, str10, str11, plaidBrokerAssets2, namesOnAccount2, transferType2, str12, list10, list9, list11, str13, list12, uuid2, capabilityStatus3, capabilityStatus4, apiAcatsBonusPromoInfo2, brokerageAccountType2, list7, z15, list8, z16, z17, z18, z19, z20, str8, z21, z22, z14, z13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component11, reason: from getter */
    public final NamesOnAccount getAccountNames() {
        return this.accountNames;
    }

    /* renamed from: component12, reason: from getter */
    public final TransferType getPlaidTransferType() {
        return this.plaidTransferType;
    }

    /* renamed from: component13, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    public final List<AccountContentItem> component14() {
        return this.accountContents;
    }

    public final List<ApiAcatsAccountContentsResponse.SupportedContentType> component15() {
        return this.supportedContentTypes;
    }

    public final List<String> component16() {
        return this.unsupportedContentTypes;
    }

    /* renamed from: component17, reason: from getter */
    public final String getBuildPartialBannerContentfulId() {
        return this.buildPartialBannerContentfulId;
    }

    public final List<UiAcatsAsset> component18() {
        return this.assets;
    }

    /* renamed from: component19, reason: from getter */
    public final UUID getSubmittedAcatsTransferId() {
        return this.submittedAcatsTransferId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSkipIntro() {
        return this.skipIntro;
    }

    /* renamed from: component20, reason: from getter */
    public final CapabilityStatus getOptionsCapabilityStatus() {
        return this.optionsCapabilityStatus;
    }

    /* renamed from: component21, reason: from getter */
    public final CapabilityStatus getMarginCapabilityStatus() {
        return this.marginCapabilityStatus;
    }

    /* renamed from: component22, reason: from getter */
    public final ApiAcatsBonusPromoInfo getAcatsBonusPromoInfo() {
        return this.acatsBonusPromoInfo;
    }

    /* renamed from: component23, reason: from getter */
    public final BrokerageAccountType getSelectedAccountType() {
        return this.selectedAccountType;
    }

    public final List<UiSlipAgreements.Agreement> component24() {
        return this.slipAgreements;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getPlaidHasErrored() {
        return this.plaidHasErrored;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getMatchRateSelected() {
        return this.matchRateSelected;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getIsAccountPreselected() {
        return this.isAccountPreselected;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getIsOptionsSupported() {
        return this.isOptionsSupported;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIntroShown() {
        return this.introShown;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getIsMarginSupported() {
        return this.isMarginSupported;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getIsAcatsBrokerageMatchSupported() {
        return this.isAcatsBrokerageMatchSupported;
    }

    /* renamed from: component32, reason: from getter */
    public final String getAcatsInSbExperimentVariant() {
        return this.acatsInSbExperimentVariant;
    }

    /* renamed from: component33, reason: from getter */
    public final boolean getContinueWithPlaid() {
        return this.continueWithPlaid;
    }

    /* renamed from: component34, reason: from getter */
    public final boolean getIsGoldUser() {
        return this.isGoldUser;
    }

    /* renamed from: component35, reason: from getter */
    public final boolean getInAcatsRejectedImprovementsExperiment() {
        return this.inAcatsRejectedImprovementsExperiment;
    }

    /* renamed from: component36, reason: from getter */
    public final boolean getInSubzeroExperiment() {
        return this.inSubzeroExperiment;
    }

    public final Either<ApiBrokerage, String> component4() {
        return this.brokerageOrDtcNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiAvailableDestinationsResponse getAvailableDestinations() {
        return this.availableDestinations;
    }

    /* renamed from: component6, reason: from getter */
    public final AvailableAccount getSelectedRhsAccount() {
        return this.selectedRhsAccount;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPlaidLinkToken() {
        return this.plaidLinkToken;
    }

    /* renamed from: component8, reason: from getter */
    public final String getContraAccountNumber() {
        return this.contraAccountNumber;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPlaidAccessTokenId() {
        return this.plaidAccessTokenId;
    }

    public final AcatsInDataState copy(String source, boolean skipIntro, boolean introShown, Either<ApiBrokerage, String> brokerageOrDtcNumber, ApiAvailableDestinationsResponse availableDestinations, AvailableAccount selectedRhsAccount, String plaidLinkToken, String contraAccountNumber, String plaidAccessTokenId, PlaidBrokerAssets plaidBrokerAssets, NamesOnAccount accountNames, TransferType plaidTransferType, String accountName, List<AccountContentItem> accountContents, List<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, List<String> unsupportedContentTypes, String buildPartialBannerContentfulId, List<? extends UiAcatsAsset> assets, UUID submittedAcatsTransferId, CapabilityStatus optionsCapabilityStatus, CapabilityStatus marginCapabilityStatus, ApiAcatsBonusPromoInfo acatsBonusPromoInfo, BrokerageAccountType selectedAccountType, List<UiSlipAgreements.Agreement> slipAgreements, boolean plaidHasErrored, List<String> dtcsRequiringCoOwnerSignature, boolean matchRateSelected, boolean isAccountPreselected, boolean isOptionsSupported, boolean isMarginSupported, boolean isAcatsBrokerageMatchSupported, String acatsInSbExperimentVariant, boolean continueWithPlaid, boolean isGoldUser, boolean inAcatsRejectedImprovementsExperiment, boolean inSubzeroExperiment) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(plaidTransferType, "plaidTransferType");
        Intrinsics.checkNotNullParameter(accountContents, "accountContents");
        Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
        Intrinsics.checkNotNullParameter(unsupportedContentTypes, "unsupportedContentTypes");
        Intrinsics.checkNotNullParameter(optionsCapabilityStatus, "optionsCapabilityStatus");
        Intrinsics.checkNotNullParameter(marginCapabilityStatus, "marginCapabilityStatus");
        Intrinsics.checkNotNullParameter(selectedAccountType, "selectedAccountType");
        Intrinsics.checkNotNullParameter(dtcsRequiringCoOwnerSignature, "dtcsRequiringCoOwnerSignature");
        return new AcatsInDataState(source, skipIntro, introShown, brokerageOrDtcNumber, availableDestinations, selectedRhsAccount, plaidLinkToken, contraAccountNumber, plaidAccessTokenId, plaidBrokerAssets, accountNames, plaidTransferType, accountName, accountContents, supportedContentTypes, unsupportedContentTypes, buildPartialBannerContentfulId, assets, submittedAcatsTransferId, optionsCapabilityStatus, marginCapabilityStatus, acatsBonusPromoInfo, selectedAccountType, slipAgreements, plaidHasErrored, dtcsRequiringCoOwnerSignature, matchRateSelected, isAccountPreselected, isOptionsSupported, isMarginSupported, isAcatsBrokerageMatchSupported, acatsInSbExperimentVariant, continueWithPlaid, isGoldUser, inAcatsRejectedImprovementsExperiment, inSubzeroExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInDataState)) {
            return false;
        }
        AcatsInDataState acatsInDataState = (AcatsInDataState) other;
        return Intrinsics.areEqual(this.source, acatsInDataState.source) && this.skipIntro == acatsInDataState.skipIntro && this.introShown == acatsInDataState.introShown && Intrinsics.areEqual(this.brokerageOrDtcNumber, acatsInDataState.brokerageOrDtcNumber) && Intrinsics.areEqual(this.availableDestinations, acatsInDataState.availableDestinations) && Intrinsics.areEqual(this.selectedRhsAccount, acatsInDataState.selectedRhsAccount) && Intrinsics.areEqual(this.plaidLinkToken, acatsInDataState.plaidLinkToken) && Intrinsics.areEqual(this.contraAccountNumber, acatsInDataState.contraAccountNumber) && Intrinsics.areEqual(this.plaidAccessTokenId, acatsInDataState.plaidAccessTokenId) && Intrinsics.areEqual(this.plaidBrokerAssets, acatsInDataState.plaidBrokerAssets) && Intrinsics.areEqual(this.accountNames, acatsInDataState.accountNames) && this.plaidTransferType == acatsInDataState.plaidTransferType && Intrinsics.areEqual(this.accountName, acatsInDataState.accountName) && Intrinsics.areEqual(this.accountContents, acatsInDataState.accountContents) && Intrinsics.areEqual(this.supportedContentTypes, acatsInDataState.supportedContentTypes) && Intrinsics.areEqual(this.unsupportedContentTypes, acatsInDataState.unsupportedContentTypes) && Intrinsics.areEqual(this.buildPartialBannerContentfulId, acatsInDataState.buildPartialBannerContentfulId) && Intrinsics.areEqual(this.assets, acatsInDataState.assets) && Intrinsics.areEqual(this.submittedAcatsTransferId, acatsInDataState.submittedAcatsTransferId) && this.optionsCapabilityStatus == acatsInDataState.optionsCapabilityStatus && this.marginCapabilityStatus == acatsInDataState.marginCapabilityStatus && Intrinsics.areEqual(this.acatsBonusPromoInfo, acatsInDataState.acatsBonusPromoInfo) && this.selectedAccountType == acatsInDataState.selectedAccountType && Intrinsics.areEqual(this.slipAgreements, acatsInDataState.slipAgreements) && this.plaidHasErrored == acatsInDataState.plaidHasErrored && Intrinsics.areEqual(this.dtcsRequiringCoOwnerSignature, acatsInDataState.dtcsRequiringCoOwnerSignature) && this.matchRateSelected == acatsInDataState.matchRateSelected && this.isAccountPreselected == acatsInDataState.isAccountPreselected && this.isOptionsSupported == acatsInDataState.isOptionsSupported && this.isMarginSupported == acatsInDataState.isMarginSupported && this.isAcatsBrokerageMatchSupported == acatsInDataState.isAcatsBrokerageMatchSupported && Intrinsics.areEqual(this.acatsInSbExperimentVariant, acatsInDataState.acatsInSbExperimentVariant) && this.continueWithPlaid == acatsInDataState.continueWithPlaid && this.isGoldUser == acatsInDataState.isGoldUser && this.inAcatsRejectedImprovementsExperiment == acatsInDataState.inAcatsRejectedImprovementsExperiment && this.inSubzeroExperiment == acatsInDataState.inSubzeroExperiment;
    }

    public int hashCode() {
        int iHashCode = ((((this.source.hashCode() * 31) + Boolean.hashCode(this.skipIntro)) * 31) + Boolean.hashCode(this.introShown)) * 31;
        Either<ApiBrokerage, String> either = this.brokerageOrDtcNumber;
        int iHashCode2 = (iHashCode + (either == null ? 0 : either.hashCode())) * 31;
        ApiAvailableDestinationsResponse apiAvailableDestinationsResponse = this.availableDestinations;
        int iHashCode3 = (iHashCode2 + (apiAvailableDestinationsResponse == null ? 0 : apiAvailableDestinationsResponse.hashCode())) * 31;
        AvailableAccount availableAccount = this.selectedRhsAccount;
        int iHashCode4 = (iHashCode3 + (availableAccount == null ? 0 : availableAccount.hashCode())) * 31;
        String str = this.plaidLinkToken;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contraAccountNumber;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.plaidAccessTokenId;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PlaidBrokerAssets plaidBrokerAssets = this.plaidBrokerAssets;
        int iHashCode8 = (iHashCode7 + (plaidBrokerAssets == null ? 0 : plaidBrokerAssets.hashCode())) * 31;
        NamesOnAccount namesOnAccount = this.accountNames;
        int iHashCode9 = (((iHashCode8 + (namesOnAccount == null ? 0 : namesOnAccount.hashCode())) * 31) + this.plaidTransferType.hashCode()) * 31;
        String str4 = this.accountName;
        int iHashCode10 = (((((((iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.accountContents.hashCode()) * 31) + this.supportedContentTypes.hashCode()) * 31) + this.unsupportedContentTypes.hashCode()) * 31;
        String str5 = this.buildPartialBannerContentfulId;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<UiAcatsAsset> list = this.assets;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        UUID uuid = this.submittedAcatsTransferId;
        int iHashCode13 = (((((iHashCode12 + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.optionsCapabilityStatus.hashCode()) * 31) + this.marginCapabilityStatus.hashCode()) * 31;
        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo = this.acatsBonusPromoInfo;
        int iHashCode14 = (((iHashCode13 + (apiAcatsBonusPromoInfo == null ? 0 : apiAcatsBonusPromoInfo.hashCode())) * 31) + this.selectedAccountType.hashCode()) * 31;
        List<UiSlipAgreements.Agreement> list2 = this.slipAgreements;
        int iHashCode15 = (((((((((((((((iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31) + Boolean.hashCode(this.plaidHasErrored)) * 31) + this.dtcsRequiringCoOwnerSignature.hashCode()) * 31) + Boolean.hashCode(this.matchRateSelected)) * 31) + Boolean.hashCode(this.isAccountPreselected)) * 31) + Boolean.hashCode(this.isOptionsSupported)) * 31) + Boolean.hashCode(this.isMarginSupported)) * 31) + Boolean.hashCode(this.isAcatsBrokerageMatchSupported)) * 31;
        String str6 = this.acatsInSbExperimentVariant;
        return ((((((((iHashCode15 + (str6 != null ? str6.hashCode() : 0)) * 31) + Boolean.hashCode(this.continueWithPlaid)) * 31) + Boolean.hashCode(this.isGoldUser)) * 31) + Boolean.hashCode(this.inAcatsRejectedImprovementsExperiment)) * 31) + Boolean.hashCode(this.inSubzeroExperiment);
    }

    public String toString() {
        return "AcatsInDataState(source=" + this.source + ", skipIntro=" + this.skipIntro + ", introShown=" + this.introShown + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", availableDestinations=" + this.availableDestinations + ", selectedRhsAccount=" + this.selectedRhsAccount + ", plaidLinkToken=" + this.plaidLinkToken + ", contraAccountNumber=" + this.contraAccountNumber + ", plaidAccessTokenId=" + this.plaidAccessTokenId + ", plaidBrokerAssets=" + this.plaidBrokerAssets + ", accountNames=" + this.accountNames + ", plaidTransferType=" + this.plaidTransferType + ", accountName=" + this.accountName + ", accountContents=" + this.accountContents + ", supportedContentTypes=" + this.supportedContentTypes + ", unsupportedContentTypes=" + this.unsupportedContentTypes + ", buildPartialBannerContentfulId=" + this.buildPartialBannerContentfulId + ", assets=" + this.assets + ", submittedAcatsTransferId=" + this.submittedAcatsTransferId + ", optionsCapabilityStatus=" + this.optionsCapabilityStatus + ", marginCapabilityStatus=" + this.marginCapabilityStatus + ", acatsBonusPromoInfo=" + this.acatsBonusPromoInfo + ", selectedAccountType=" + this.selectedAccountType + ", slipAgreements=" + this.slipAgreements + ", plaidHasErrored=" + this.plaidHasErrored + ", dtcsRequiringCoOwnerSignature=" + this.dtcsRequiringCoOwnerSignature + ", matchRateSelected=" + this.matchRateSelected + ", isAccountPreselected=" + this.isAccountPreselected + ", isOptionsSupported=" + this.isOptionsSupported + ", isMarginSupported=" + this.isMarginSupported + ", isAcatsBrokerageMatchSupported=" + this.isAcatsBrokerageMatchSupported + ", acatsInSbExperimentVariant=" + this.acatsInSbExperimentVariant + ", continueWithPlaid=" + this.continueWithPlaid + ", isGoldUser=" + this.isGoldUser + ", inAcatsRejectedImprovementsExperiment=" + this.inAcatsRejectedImprovementsExperiment + ", inSubzeroExperiment=" + this.inSubzeroExperiment + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsInDataState(String source, boolean z, boolean z2, Either<ApiBrokerage, String> either, ApiAvailableDestinationsResponse apiAvailableDestinationsResponse, AvailableAccount availableAccount, String str, String str2, String str3, PlaidBrokerAssets plaidBrokerAssets, NamesOnAccount namesOnAccount, TransferType plaidTransferType, String str4, List<AccountContentItem> accountContents, List<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, List<String> unsupportedContentTypes, String str5, List<? extends UiAcatsAsset> list, UUID uuid, CapabilityStatus optionsCapabilityStatus, CapabilityStatus marginCapabilityStatus, ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo, BrokerageAccountType selectedAccountType, List<UiSlipAgreements.Agreement> list2, boolean z3, List<String> dtcsRequiringCoOwnerSignature, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str6, boolean z9, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(plaidTransferType, "plaidTransferType");
        Intrinsics.checkNotNullParameter(accountContents, "accountContents");
        Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
        Intrinsics.checkNotNullParameter(unsupportedContentTypes, "unsupportedContentTypes");
        Intrinsics.checkNotNullParameter(optionsCapabilityStatus, "optionsCapabilityStatus");
        Intrinsics.checkNotNullParameter(marginCapabilityStatus, "marginCapabilityStatus");
        Intrinsics.checkNotNullParameter(selectedAccountType, "selectedAccountType");
        Intrinsics.checkNotNullParameter(dtcsRequiringCoOwnerSignature, "dtcsRequiringCoOwnerSignature");
        this.source = source;
        this.skipIntro = z;
        this.introShown = z2;
        this.brokerageOrDtcNumber = either;
        this.availableDestinations = apiAvailableDestinationsResponse;
        this.selectedRhsAccount = availableAccount;
        this.plaidLinkToken = str;
        this.contraAccountNumber = str2;
        this.plaidAccessTokenId = str3;
        this.plaidBrokerAssets = plaidBrokerAssets;
        this.accountNames = namesOnAccount;
        this.plaidTransferType = plaidTransferType;
        this.accountName = str4;
        this.accountContents = accountContents;
        this.supportedContentTypes = supportedContentTypes;
        this.unsupportedContentTypes = unsupportedContentTypes;
        this.buildPartialBannerContentfulId = str5;
        this.assets = list;
        this.submittedAcatsTransferId = uuid;
        this.optionsCapabilityStatus = optionsCapabilityStatus;
        this.marginCapabilityStatus = marginCapabilityStatus;
        this.acatsBonusPromoInfo = apiAcatsBonusPromoInfo;
        this.selectedAccountType = selectedAccountType;
        this.slipAgreements = list2;
        this.plaidHasErrored = z3;
        this.dtcsRequiringCoOwnerSignature = dtcsRequiringCoOwnerSignature;
        this.matchRateSelected = z4;
        this.isAccountPreselected = z5;
        this.isOptionsSupported = z6;
        this.isMarginSupported = z7;
        this.isAcatsBrokerageMatchSupported = z8;
        this.acatsInSbExperimentVariant = str6;
        this.continueWithPlaid = z9;
        this.isGoldUser = z10;
        this.inAcatsRejectedImprovementsExperiment = z11;
        this.inSubzeroExperiment = z12;
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getSkipIntro() {
        return this.skipIntro;
    }

    public final boolean getIntroShown() {
        return this.introShown;
    }

    public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
        return this.brokerageOrDtcNumber;
    }

    public final ApiAvailableDestinationsResponse getAvailableDestinations() {
        return this.availableDestinations;
    }

    public final AvailableAccount getSelectedRhsAccount() {
        return this.selectedRhsAccount;
    }

    public final String getPlaidLinkToken() {
        return this.plaidLinkToken;
    }

    public final String getContraAccountNumber() {
        return this.contraAccountNumber;
    }

    public final String getPlaidAccessTokenId() {
        return this.plaidAccessTokenId;
    }

    public final NamesOnAccount getAccountNames() {
        return this.accountNames;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AcatsInDataState(java.lang.String r41, boolean r42, boolean r43, com.robinhood.utils.Either r44, com.robinhood.models.api.bonfire.ApiAvailableDestinationsResponse r45, com.robinhood.models.acats.p299db.bonfire.AvailableAccount r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets r50, com.robinhood.android.acatsin.util.names.NamesOnAccount r51, com.robinhood.models.api.bonfire.plaid.brokerassets.TransferType r52, java.lang.String r53, java.util.List r54, java.util.List r55, java.util.List r56, java.lang.String r57, java.util.List r58, java.util.UUID r59, com.robinhood.models.acats.p299db.p300ui.CapabilityStatus r60, com.robinhood.models.acats.p299db.p300ui.CapabilityStatus r61, com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo r62, com.robinhood.models.api.BrokerageAccountType r63, java.util.List r64, boolean r65, java.util.List r66, boolean r67, boolean r68, boolean r69, boolean r70, boolean r71, java.lang.String r72, boolean r73, boolean r74, boolean r75, boolean r76, int r77, int r78, kotlin.jvm.internal.DefaultConstructorMarker r79) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.acatsin.AcatsInDataState.<init>(java.lang.String, boolean, boolean, com.robinhood.utils.Either, com.robinhood.models.api.bonfire.ApiAvailableDestinationsResponse, com.robinhood.models.acats.db.bonfire.AvailableAccount, java.lang.String, java.lang.String, java.lang.String, com.robinhood.models.acats.db.bonfire.plaid.brokerassets.PlaidBrokerAssets, com.robinhood.android.acatsin.util.names.NamesOnAccount, com.robinhood.models.api.bonfire.plaid.brokerassets.TransferType, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, java.util.List, java.util.UUID, com.robinhood.models.acats.db.ui.CapabilityStatus, com.robinhood.models.acats.db.ui.CapabilityStatus, com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo, com.robinhood.models.api.BrokerageAccountType, java.util.List, boolean, java.util.List, boolean, boolean, boolean, boolean, boolean, java.lang.String, boolean, boolean, boolean, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final TransferType getPlaidTransferType() {
        return this.plaidTransferType;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final List<AccountContentItem> getAccountContents() {
        return this.accountContents;
    }

    public final List<ApiAcatsAccountContentsResponse.SupportedContentType> getSupportedContentTypes() {
        return this.supportedContentTypes;
    }

    public final List<String> getUnsupportedContentTypes() {
        return this.unsupportedContentTypes;
    }

    public final String getBuildPartialBannerContentfulId() {
        return this.buildPartialBannerContentfulId;
    }

    public final List<UiAcatsAsset> getAssets() {
        return this.assets;
    }

    public final UUID getSubmittedAcatsTransferId() {
        return this.submittedAcatsTransferId;
    }

    public final CapabilityStatus getOptionsCapabilityStatus() {
        return this.optionsCapabilityStatus;
    }

    public final CapabilityStatus getMarginCapabilityStatus() {
        return this.marginCapabilityStatus;
    }

    public final ApiAcatsBonusPromoInfo getAcatsBonusPromoInfo() {
        return this.acatsBonusPromoInfo;
    }

    public final BrokerageAccountType getSelectedAccountType() {
        return this.selectedAccountType;
    }

    public final List<UiSlipAgreements.Agreement> getSlipAgreements() {
        return this.slipAgreements;
    }

    public final boolean getPlaidHasErrored() {
        return this.plaidHasErrored;
    }

    public final boolean getMatchRateSelected() {
        return this.matchRateSelected;
    }

    public final boolean isAccountPreselected() {
        return this.isAccountPreselected;
    }

    public final boolean isOptionsSupported() {
        return this.isOptionsSupported;
    }

    public final boolean isMarginSupported() {
        return this.isMarginSupported;
    }

    public final boolean isAcatsBrokerageMatchSupported() {
        return this.isAcatsBrokerageMatchSupported;
    }

    public final String getAcatsInSbExperimentVariant() {
        return this.acatsInSbExperimentVariant;
    }

    public final boolean getContinueWithPlaid() {
        return this.continueWithPlaid;
    }

    public final boolean isGoldUser() {
        return this.isGoldUser;
    }

    public final boolean getInAcatsRejectedImprovementsExperiment() {
        return this.inAcatsRejectedImprovementsExperiment;
    }

    public final boolean getInSubzeroExperiment() {
        return this.inSubzeroExperiment;
    }

    public final boolean getHasPlaidAssets() {
        return this.plaidBrokerAssets != null;
    }

    public final AvailableAccount getRhsAccount() {
        AvailableAccount availableAccount = this.selectedRhsAccount;
        return availableAccount == null ? getDefaultRhsAccount() : availableAccount;
    }

    public final String getTaxableAccountBonusRateString() {
        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo = this.acatsBonusPromoInfo;
        if (apiAcatsBonusPromoInfo != null) {
            String matchPercentString = apiAcatsBonusPromoInfo.getMatchPercentString();
            if ((!apiAcatsBonusPromoInfo.is_gold_only() || this.isGoldUser) && this.isAcatsBrokerageMatchSupported) {
                return matchPercentString;
            }
        }
        return null;
    }

    public final List<AccountContentItem> getSelectedPartialAccountContents() {
        List<AccountContentItem> list = this.accountContents;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AccountContentItem) obj).getFlowType() == ApiAccountContentItem.FlowType.PARTIAL) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final AvailableAccount getDefaultRhsAccount() {
        ApiAvailableDestinationsResponse apiAvailableDestinationsResponse = this.availableDestinations;
        if (apiAvailableDestinationsResponse != null) {
            return AcatsInDataState2.getDefaultAccount(apiAvailableDestinationsResponse);
        }
        return null;
    }

    public final Set<ApiAcatsAccountContentsResponse.SupportedContentType> getPlaidSupportedContentTypes() {
        ApiAcatsAccountContentsResponse.SupportedContentType supportedContentType = ApiAcatsAccountContentsResponse.SupportedContentType.CASH;
        ApiAcatsAccountContentsResponse.SupportedContentType supportedContentType2 = ApiAcatsAccountContentsResponse.SupportedContentType.MARGIN;
        CapabilityStatus capabilityStatus = this.marginCapabilityStatus;
        CapabilityStatus capabilityStatus2 = CapabilityStatus.ENABLED;
        if (capabilityStatus != capabilityStatus2) {
            supportedContentType2 = null;
        }
        return SetsKt.setOfNotNull((Object[]) new ApiAcatsAccountContentsResponse.SupportedContentType[]{supportedContentType, supportedContentType2, ApiAcatsAccountContentsResponse.SupportedContentType.STOCKS_ETFS, this.optionsCapabilityStatus == capabilityStatus2 ? ApiAcatsAccountContentsResponse.SupportedContentType.OPTIONS : null});
    }

    public final List<UiAcatsAsset> getAssetsToSubmit() {
        if (isPlaidFullTransferFromPartial()) {
            return null;
        }
        return this.assets;
    }

    private final boolean getHasPartialAccountContents() {
        List<AccountContentItem> list = this.accountContents;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((AccountContentItem) it.next()).getFlowType() == ApiAccountContentItem.FlowType.PARTIAL) {
                return true;
            }
        }
        return false;
    }

    private final boolean getHasMarginAccountContents() {
        List<AccountContentItem> list = this.accountContents;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((AccountContentItem) it.next()).getFlowType() == ApiAccountContentItem.FlowType.MARGIN) {
                return true;
            }
        }
        return false;
    }

    private final boolean getHasOptionAccountContents() {
        List<AccountContentItem> list = this.accountContents;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((AccountContentItem) it.next()).getFlowType() == ApiAccountContentItem.FlowType.OPTIONS) {
                return true;
            }
        }
        return false;
    }

    public final AcatsFlowStep getNextFlowStep(AcatsFlowStep completedStep) {
        AcatsFlowStep acatsFlowStep;
        AcatsFlowStep acatsFlowStep2;
        Intrinsics.checkNotNullParameter(completedStep, "completedStep");
        switch (WhenMappings.$EnumSwitchMapping$0[completedStep.ordinal()]) {
            case 1:
            case 2:
            case 3:
                if (getDefaultRhsAccount() == null) {
                    return AcatsFlowStep.AVAILABLE_DESTINATIONS;
                }
                return AcatsFlowStep.BROKERAGE_SEARCH;
            case 4:
            case 5:
                Either<ApiBrokerage, String> either = this.brokerageOrDtcNumber;
                if (either != null && Eithers.canUsePlaid(either) && !this.plaidHasErrored) {
                    return AcatsFlowStep.PLAID_INTRO;
                }
                return AcatsFlowStep.ENTER_ACCOUNT_NUMBER;
            case 6:
                return AcatsFlowStep.BROKERAGE_SEARCH;
            case 7:
                if (this.continueWithPlaid) {
                    return AcatsFlowStep.PLAID_ACCOUNT_NUMBER;
                }
                return AcatsFlowStep.ENTER_ACCOUNT_NUMBER;
            case 8:
                return AcatsFlowStep.CONFIRM_ACCOUNT_NAME;
            case 9:
                if (Intrinsics.areEqual(this.acatsInSbExperimentVariant, KaizenExperiment.VARIATION_MEMBER)) {
                    return nextCheckedTransferStep(AcatsFlowStep.ACCOUNT_CONTENTS);
                }
                return AcatsFlowStep.CONFIRM_ACCOUNT_NAME;
            case 10:
                return nextCheckedTransferStep(AcatsFlowStep.ACCOUNT_CONTENTS);
            case 11:
                if (getHasPartialAccountContents()) {
                    return AcatsFlowStep.POSITION_CHECKLIST_INELIGIBLE_ALTERNATE;
                }
                return AcatsFlowStep.CONFIRM_ELIGIBLE;
            case 12:
                return AcatsFlowStep.AGREEMENT;
            case 13:
                return AcatsFlowStep.AGREEMENT;
            case 14:
                return showEnableOptionsStep() ? AcatsFlowStep.ENABLE_OPTIONS : showEnableMarginStep() ? AcatsFlowStep.ENABLE_MARGIN : AcatsFlowStep.AGREEMENT;
            case 15:
                return AcatsFlowStep.AGREEMENT;
            case 16:
                CapabilityStatus capabilityStatus = this.optionsCapabilityStatus;
                CapabilityStatus capabilityStatus2 = CapabilityStatus.ENABLED;
                if (capabilityStatus == capabilityStatus2 && showEnableMarginStep()) {
                    acatsFlowStep = AcatsFlowStep.ENABLE_MARGIN;
                } else if (this.optionsCapabilityStatus == capabilityStatus2) {
                    acatsFlowStep = AcatsFlowStep.AGREEMENT;
                } else {
                    acatsFlowStep = AcatsFlowStep.PARTIAL_TRANSFER_FLOW;
                }
                return nextCheckedTransferStep(acatsFlowStep);
            case 17:
                if (this.marginCapabilityStatus == CapabilityStatus.ENABLED) {
                    acatsFlowStep2 = AcatsFlowStep.AGREEMENT;
                } else {
                    acatsFlowStep2 = AcatsFlowStep.PARTIAL_TRANSFER_FLOW;
                }
                return nextCheckedTransferStep(acatsFlowStep2);
            case 18:
                return AcatsFlowStep.PLAID_PARTIAL_TRANSFER_EDIT;
            case 19:
                if (isPlaidFullTransferFromPartial()) {
                    return AcatsFlowStep.RECONFIRM_ELIGIBLE;
                }
                return AcatsFlowStep.AGREEMENT;
            case 20:
                return AcatsFlowStep.AGREEMENT;
            case 21:
                return AcatsFlowStep.REVIEW_AND_SUBMIT;
            case 22:
                return AcatsFlowStep.CONFIRMATION;
            case 23:
            case 24:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final boolean isPlaidFullTransferFromPartial() {
        return this.plaidBrokerAssets != null && this.assets != null && this.inAcatsRejectedImprovementsExperiment && isFullTransfer() && PlaidBrokerAssetsHelper.assetsEqualTo(this.plaidBrokerAssets, this.assets);
    }

    private final boolean isFullTransfer() {
        PlaidBrokerAssets plaidBrokerAssets = this.plaidBrokerAssets;
        return (plaidBrokerAssets != null ? plaidBrokerAssets.checkedTransferType(this.optionsCapabilityStatus, this.marginCapabilityStatus, this.isOptionsSupported, this.isMarginSupported) : null) == PlaidBrokerAssets2.FULL;
    }

    private final boolean hasShortPositions() {
        List<UiAcatsAsset> list = this.assets;
        if (list != null) {
            List<UiAcatsAsset> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (UiAcatsAsset uiAcatsAsset : list2) {
                    if ((uiAcatsAsset instanceof UiAcatsAsset.EquityAsset) && ((UiAcatsAsset.EquityAsset) uiAcatsAsset).isShortPosition()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final List<UiShortPositionFeeData> getShortPositionFeeData() {
        PlaidBrokerAssets plaidBrokerAssets = this.plaidBrokerAssets;
        if (plaidBrokerAssets == null) {
            return CollectionsKt.emptyList();
        }
        List<EquityAsset> equityAssets = plaidBrokerAssets.getEquityAssets();
        ArrayList<EquityAsset> arrayList = new ArrayList();
        for (Object obj : equityAssets) {
            EquityAsset equityAsset = (EquityAsset) obj;
            if (equityAsset.getQuantity().compareTo(BigDecimal.ZERO) < 0 && equityAsset.getBorrowFee() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (EquityAsset equityAsset2 : arrayList) {
            String name = equityAsset2.getName();
            BigDecimal borrowFee = equityAsset2.getBorrowFee();
            if (borrowFee == null) {
                borrowFee = BigDecimal.ZERO;
            }
            Intrinsics.checkNotNull(borrowFee);
            arrayList2.add(new UiShortPositionFeeData(name, borrowFee));
        }
        return arrayList2;
    }

    public final boolean getHasShortEquityPositions() {
        return !getShortPositionFeeData().isEmpty();
    }

    private final boolean showEnableMarginStep() {
        if (this.isMarginSupported && getHasMarginAccountContents() && this.marginCapabilityStatus != CapabilityStatus.ENABLED) {
            return true;
        }
        return this.isMarginSupported && hasShortPositions() && this.marginCapabilityStatus != CapabilityStatus.ENABLED;
    }

    private final boolean showEnableOptionsStep() {
        return this.isOptionsSupported && getHasOptionAccountContents() && this.optionsCapabilityStatus != CapabilityStatus.ENABLED;
    }

    private final AcatsFlowStep nextCheckedTransferStep(AcatsFlowStep nonPlaidAssetsStep) {
        PlaidBrokerAssets plaidBrokerAssets = this.plaidBrokerAssets;
        if (plaidBrokerAssets == null) {
            return nonPlaidAssetsStep;
        }
        switch (WhenMappings.$EnumSwitchMapping$1[plaidBrokerAssets.checkedTransferType(this.optionsCapabilityStatus, this.marginCapabilityStatus, this.isOptionsSupported, this.isMarginSupported).ordinal()]) {
            case 1:
                return AcatsFlowStep.CONFIRM_ELIGIBLE;
            case 2:
                return AcatsFlowStep.PLAID_PARTIAL_TRANSFER_SUPPORTED;
            case 3:
                return AcatsFlowStep.CANNOT_COMPLETE_CONFIRMATION;
            case 4:
                return AcatsFlowStep.ENABLE_OPTIONS;
            case 5:
                return AcatsFlowStep.ENABLE_MARGIN;
            case 6:
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("MarginChecked transfer type is unknown"), false, null, 6, null);
                return nonPlaidAssetsStep;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final List<AcatsInContext.AccountContents> getLoggingContents() {
        List<AccountContentItem> list = this.accountContents;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AcatsInContext.AccountContents loggingContent = AcatsInDataState2.toLoggingContent((AccountContentItem) it.next());
            if (loggingContent != null) {
                arrayList.add(loggingContent);
            }
        }
        return arrayList;
    }

    public final AcatsInScreenContext getScreenContext() {
        String dtcNumber;
        String str = this.source;
        boolean z = this.skipIntro;
        boolean z2 = this.introShown;
        rosetta.account.BrokerageAccountType protobuf = BrokerageAccountTypes3.toProtobuf(this.selectedAccountType);
        List<AcatsInContext.AccountContents> loggingContents = getLoggingContents();
        Either<ApiBrokerage, String> either = this.brokerageOrDtcNumber;
        if (either == null || (dtcNumber = Eithers.getDtcNumber(either)) == null) {
            dtcNumber = "";
        }
        return new AcatsInScreenContext(str, z, z2, protobuf, loggingContents, null, false, dtcNumber, this.plaidAccessTokenId != null, 96, null);
    }

    public final boolean getActiveBonus() {
        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo = this.acatsBonusPromoInfo;
        return apiAcatsBonusPromoInfo != null && apiAcatsBonusPromoInfo.is_active();
    }

    public final String getPromoId() {
        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo = this.acatsBonusPromoInfo;
        if (apiAcatsBonusPromoInfo != null) {
            return apiAcatsBonusPromoInfo.getPromo_id();
        }
        return null;
    }

    public final boolean isPersonalizedPromo() {
        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo = this.acatsBonusPromoInfo;
        if (apiAcatsBonusPromoInfo != null) {
            return Intrinsics.areEqual(apiAcatsBonusPromoInfo.is_personalized_promo(), Boolean.TRUE);
        }
        return false;
    }

    public final StringResource getConfirmationTitle() {
        NamesOnAccount2 coOwnerName;
        NamesOnAccount namesOnAccount = this.accountNames;
        String firstName = (namesOnAccount == null || (coOwnerName = namesOnAccount.getCoOwnerName()) == null) ? null : coOwnerName.getFirstName();
        if (getRequiresCoOwnerSignature() && firstName != null) {
            return StringResource.INSTANCE.invoke(C7725R.string.acats_in_confirmation_co_owner_initiator_title_with_name, firstName);
        }
        if (getRequiresCoOwnerSignature()) {
            return StringResource.INSTANCE.invoke(C7725R.string.acats_in_confirmation_co_owner_initiator_title_without_name, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C7686R.string.acats_in_confirmation_title, new Object[0]);
    }

    public final StringResource getConfirmationDescription() {
        if (getRequiresCoOwnerSignature()) {
            if (getActiveBonus() && getTaxableAccountBonusRateString() != null) {
                return StringResource.INSTANCE.invoke(C7725R.string.acats_in_confirmation_co_owner_initiator_description_bonus, getTaxableAccountBonusRateString());
            }
            return StringResource.INSTANCE.invoke(C7725R.string.acats_in_confirmation_co_owner_initiator_description, new Object[0]);
        }
        if (getActiveBonus() && getTaxableAccountBonusRateString() != null) {
            return StringResource.INSTANCE.invoke(C7725R.string.acats_in_confirmation_description_bonus, getTaxableAccountBonusRateString());
        }
        return StringResource.INSTANCE.invoke(C7686R.string.acats_in_confirmation_description, new Object[0]);
    }

    public final boolean getShowGoldConfirmationScreen() {
        return getActiveBonus() && getTaxableAccountBonusRateString() != null && this.isGoldUser;
    }

    public final boolean getRequiresCoOwnerSignature() {
        Either<ApiBrokerage, String> either;
        AvailableAccount rhsAccount = getRhsAccount();
        return (rhsAccount != null ? rhsAccount.getBrokerageAccountType() : null) == BrokerageAccountType.JOINT_TENANCY_WITH_ROS && (either = this.brokerageOrDtcNumber) != null && Eithers.requiresCoOwnerSignature(either, this.dtcsRequiringCoOwnerSignature);
    }
}
