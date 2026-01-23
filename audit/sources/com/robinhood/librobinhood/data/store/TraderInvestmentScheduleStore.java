package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.api.recurring.retrofit.RecurringApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiInvestmentScheduleBulkUpdateRequest;
import com.robinhood.models.api.ApiInvestmentScheduleUpdateRequest;
import com.robinhood.models.api.ApiInvestmentScheduleUpdateRequest2;
import com.robinhood.models.api.ApiRecurringHookStartDate;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.recurring.UiInvestmentSchedule;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.RecurringInvestmentsConstants;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.api.ApiInvestmentScheduleRequest;
import com.robinhood.recurring.models.api.ApiNextInvestmentDate;
import com.robinhood.recurring.models.dao.InvestmentScheduleDao;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule2;
import com.robinhood.recurring.models.p366ui.InvestmentScheduleWithAccountType;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.InvestmentScheduleTransaction;
import com.robinhood.shared.models.history.InvestmentScheduleWithAccountTypeTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.base.InvestmentScheduleStore;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.resource.StringResource;
import idl.recurring.proto.p474v1.GetScheduleConfigRequestDto;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.LocalDate;
import timber.log.Timber;

/* compiled from: TraderInvestmentScheduleStore.kt */
@Metadata(m3635d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001c0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010$J\u001d\u0010'\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b)\u0010#J+\u0010.\u001a\u00020-2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u0017¢\u0006\u0004\b.\u0010/J?\u00103\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b3\u00104J-\u00108\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0018\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u00010\u00172\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J \u0010>\u001a\u00020=2\u0006\u0010:\u001a\u00020\u00172\u0006\u0010<\u001a\u00020;H\u0096@¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020=2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020=2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ{\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F2\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b>\u0010LJ{\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u00132\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F2\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bN\u0010LJ\u001b\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\bO\u0010\u001aJ+\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\u00132\u0006\u0010Q\u001a\u00020P2\u0006\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bS\u0010TJ#\u0010V\u001a\b\u0012\u0004\u0012\u00020U0\u00132\u0006\u0010Q\u001a\u00020P2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bV\u0010WJ\u0013\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001f0X¢\u0006\u0004\bY\u0010ZJ\u001b\u0010]\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\\0[0\u001b¢\u0006\u0004\b]\u0010\u001eJ#\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001c0\u001b2\u0006\u0010^\u001a\u00020\u0017H\u0016¢\u0006\u0004\b_\u0010`J#\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001c0\u001b2\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bc\u0010dJ\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b2\u0006\u0010:\u001a\u00020\u0017H\u0016¢\u0006\u0004\be\u0010`J\u0017\u0010g\u001a\u00020=2\u0006\u0010f\u001a\u00020PH\u0016¢\u0006\u0004\bg\u0010hR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010iR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010jR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010kR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010lR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010mR \u0010p\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020o0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR \u0010s\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\\0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR \u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\\0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR)\u0010y\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001c0x8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R)\u0010}\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001c0x8\u0006¢\u0006\f\n\u0004\b}\u0010z\u001a\u0004\b~\u0010|R*\u0010\u007f\u001a\u0014\u0012\u0004\u0012\u00020o\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001c0x8\u0006¢\u0006\r\n\u0004\b\u007f\u0010z\u001a\u0005\b\u0080\u0001\u0010|R&\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001f0x8\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010z\u001a\u0005\b\u0082\u0001\u0010|R,\u0010\u0083\u0001\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001c0x8\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010z\u001a\u0005\b\u0084\u0001\u0010|R&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020o\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001c0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010zR&\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140x8\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010z\u001a\u0005\b\u0086\u0001\u0010|R&\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020M0x8\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010z\u001a\u0005\b\u0088\u0001\u0010|R,\u0010\u0089\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001c0x8\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010z\u001a\u0005\b\u008a\u0001\u0010|R9\u0010\u008c\u0001\u001a!\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020%0\u008b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001c0x8\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010z\u001a\u0005\b\u008d\u0001\u0010|R(\u0010\u008e\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001c0x8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010zR(\u0010\u0090\u0001\u001a\u0013\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010\\0\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u0092\u0001\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\\0[0r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010tR\"\u0010\u0093\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\\0r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010tR&\u0010\u0094\u0001\u001a\u0011\u0012\u0004\u0012\u00020o\u0012\u0006\u0012\u0004\u0018\u00010\\0\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0091\u0001R\u001d\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001d\u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0097\u0001\u001a\u0006\b\u009b\u0001\u0010\u0099\u0001¨\u0006\u009c\u0001"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "Lcom/robinhood/android/api/recurring/retrofit/RecurringApi;", "recurringApi", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoAccountProvider", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/recurring/models/dao/InvestmentScheduleDao;", "dao", "<init>", "(Lcom/robinhood/android/api/recurring/retrofit/RecurringApi;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/recurring/models/dao/InvestmentScheduleDao;)V", "Lcom/robinhood/recurring/models/api/ApiInvestmentScheduleRequest;", "request", "Lio/reactivex/Single;", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "postInvestmentSchedule", "(Lcom/robinhood/recurring/models/api/ApiInvestmentScheduleRequest;)Lio/reactivex/Single;", "Ljava/util/UUID;", "investmentScheduleId", "fetchInvestmentSchedule", "(Ljava/util/UUID;)Lio/reactivex/Single;", "Lkotlinx/coroutines/flow/Flow;", "", "streamCryptoInvestmentSchedules", "()Lkotlinx/coroutines/flow/Flow;", "", "force", "Lkotlinx/coroutines/Job;", "refresh", "(Z)Lkotlinx/coroutines/Job;", "(ZLjava/util/UUID;)Lkotlinx/coroutines/Job;", "", "accountNumber", "refreshAccount", "(ZLjava/lang/String;)Lkotlinx/coroutines/Job;", "refreshAllAccounts", "investmentScheduleIds", "isBackupEnabled", "achRelationshipId", "Lio/reactivex/Completable;", "bulkUpdateInvestmentSchedule", "(Ljava/util/List;ZLjava/util/UUID;)Lio/reactivex/Completable;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "sourceOfFunds", "backupPaymentMethodId", "updateInvestmentScheduleBackup", "(Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Ljava/util/UUID;Ljava/util/UUID;)Lio/reactivex/Single;", "directDepositRelationshipId", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "amount", "updateInvestmentScheduleAmount", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/recurring/models/InvestmentScheduleAmount;)Lio/reactivex/Single;", "id", "Lcom/robinhood/models/api/ApiInvestmentScheduleUpdateRequest;", "update", "", "updateInvestmentSchedule", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiInvestmentScheduleUpdateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitInvestmentSchedule", "(Lcom/robinhood/recurring/models/api/ApiInvestmentScheduleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lidl/recurring/proto/v1/GetScheduleConfigRequestDto;", "requestDto", "getConfig", "(Lidl/recurring/proto/v1/GetScheduleConfigRequestDto;)Ljava/lang/Void;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$State;", "state", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "(Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$State;Lcom/robinhood/recurring/models/InvestmentScheduleAmount;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Ljava/util/UUID;)Lio/reactivex/Single;", "Lcom/robinhood/models/ui/recurring/UiInvestmentSchedule;", "updateUiInvestmentSchedule", "deleteInvestmentSchedule", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "type", "Lcom/robinhood/recurring/models/api/ApiNextInvestmentDate;", "getNextInvestmentDate", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)Lio/reactivex/Single;", "Lcom/robinhood/models/api/ApiRecurringHookStartDate;", "getRecurringHookStartDate", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)Lio/reactivex/Single;", "Lio/reactivex/Observable;", "getHasPaycheckInvestmentSchedules", "()Lio/reactivex/Observable;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule;", "pollIndividualAccount", "currencyPairId", "streamInvestmentSchedulesByCurrencyPairId", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;", "location", "streamInvestmentSchedulesBySelectedAccount", "(Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;)Lkotlinx/coroutines/flow/Flow;", "streamInvestmentScheduleById", "assetType", "streamInvestmentSchedulesForType", "(Lcom/robinhood/recurring/models/api/ApiAssetType;)Ljava/lang/Void;", "Lcom/robinhood/android/api/recurring/retrofit/RecurringApi;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "Lcom/robinhood/recurring/models/dao/InvestmentScheduleDao;", "Lkotlin/Function1;", "", "saveAction", "Lkotlin/jvm/functions/Function1;", "Lcom/robinhood/android/moria/network/Endpoint;", "fetchInvestmentScheduleEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/network/PostEndpoint;", "postInvestmentScheduleEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/android/moria/db/Query;", "streamBuyingPowerInvestmentSchedulesWithoutBackup", "Lcom/robinhood/android/moria/db/Query;", "getStreamBuyingPowerInvestmentSchedulesWithoutBackup", "()Lcom/robinhood/android/moria/db/Query;", "streamAccountInvestmentSchedules", "getStreamAccountInvestmentSchedules", "streamAllInvestmentSchedules", "getStreamAllInvestmentSchedules", "streamHasPaycheckInvestmentSchedules", "getStreamHasPaycheckInvestmentSchedules", "streamAccountNonPaycheckInvestmentSchedules", "getStreamAccountNonPaycheckInvestmentSchedules", "streamInvestmentSchedule", "getStreamInvestmentSchedule", "streamUiInvestmentSchedule", "getStreamUiInvestmentSchedule", "streamInvestmentSchedulesByInstrumentId", "getStreamInvestmentSchedulesByInstrumentId", "Lkotlin/Pair;", "streamInvestmentSchedulesByInstrumentIdAndAccountNumber", "getStreamInvestmentSchedulesByInstrumentIdAndAccountNumber", "streamInvestmentSchedulesByUiCurrencyPairId", "Lcom/robinhood/api/PaginatedEndpoint;", "getIndividualAccountInvestmentSchedules", "Lcom/robinhood/api/PaginatedEndpoint;", "getSelectedAccountInvestmentSchedules", "getInvestmentSchedule", "getInvestmentSchedulesAllAccounts", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "investmentScheduleTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getInvestmentScheduleTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "investmentScheduleWithAccountTypeTransactionLoader", "getInvestmentScheduleWithAccountTypeTransactionLoader", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TraderInvestmentScheduleStore extends Store implements InvestmentScheduleStore {
    private final AccountProvider accountProvider;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final InvestmentScheduleDao dao;
    private final Endpoint<UUID, ApiInvestmentSchedule> fetchInvestmentScheduleEndpoint;
    private final PaginatedEndpoint<String, ApiInvestmentSchedule> getIndividualAccountInvestmentSchedules;
    private final Endpoint<UUID, ApiInvestmentSchedule> getInvestmentSchedule;
    private final PaginatedEndpoint<Unit, ApiInvestmentSchedule> getInvestmentSchedulesAllAccounts;
    private final Endpoint<String, PaginatedResult<ApiInvestmentSchedule>> getSelectedAccountInvestmentSchedules;
    private final HistoryTransactionLoader investmentScheduleTransactionLoader;
    private final HistoryTransactionLoader investmentScheduleWithAccountTypeTransactionLoader;
    private final PostEndpoint<ApiInvestmentScheduleRequest, ApiInvestmentSchedule> postInvestmentScheduleEndpoint;
    private final RecurringApi recurringApi;
    private final Function1<ApiInvestmentSchedule, Unit> saveAction;
    private final Query<String, List<InvestmentSchedule>> streamAccountInvestmentSchedules;
    private final Query<String, List<InvestmentSchedule>> streamAccountNonPaycheckInvestmentSchedules;
    private final Query<Unit, List<InvestmentSchedule>> streamAllInvestmentSchedules;
    private final Query<String, List<InvestmentSchedule>> streamBuyingPowerInvestmentSchedulesWithoutBackup;
    private final Query<Unit, List<InvestmentSchedule>> streamCryptoInvestmentSchedules;
    private final Query<String, Boolean> streamHasPaycheckInvestmentSchedules;
    private final Query<UUID, InvestmentSchedule> streamInvestmentSchedule;
    private final Query<UUID, List<InvestmentSchedule>> streamInvestmentSchedulesByInstrumentId;
    private final Query<Tuples2<UUID, String>, List<InvestmentSchedule>> streamInvestmentSchedulesByInstrumentIdAndAccountNumber;
    private final Query<UUID, List<InvestmentSchedule>> streamInvestmentSchedulesByUiCurrencyPairId;
    private final Query<UUID, UiInvestmentSchedule> streamUiInvestmentSchedule;

    /* compiled from: TraderInvestmentScheduleStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.store.base.InvestmentScheduleStore
    /* renamed from: getConfig, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Flow mo22734getConfig(GetScheduleConfigRequestDto getScheduleConfigRequestDto) {
        return (Flow) getConfig(getScheduleConfigRequestDto);
    }

    @Override // com.robinhood.store.base.InvestmentScheduleStore
    /* renamed from: streamInvestmentSchedulesForType, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Flow mo22735streamInvestmentSchedulesForType(ApiAssetType apiAssetType) {
        return (Flow) streamInvestmentSchedulesForType(apiAssetType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraderInvestmentScheduleStore(RecurringApi recurringApi, AccountProvider accountProvider, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, StoreBundle storeBundle, final InvestmentScheduleDao dao) {
        super(storeBundle, InvestmentSchedule.INSTANCE);
        Intrinsics.checkNotNullParameter(recurringApi, "recurringApi");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.recurringApi = recurringApi;
        this.accountProvider = accountProvider;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.dao = dao;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<ApiInvestmentSchedule, Unit>() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiInvestmentSchedule apiInvestmentSchedule) {
                m22736invoke(apiInvestmentSchedule);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22736invoke(ApiInvestmentSchedule apiInvestmentSchedule) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(apiInvestmentSchedule);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.fetchInvestmentScheduleEndpoint = companion.create(new TraderInvestmentScheduleStore$fetchInvestmentScheduleEndpoint$1(recurringApi), getLogoutKillswitch(), new TraderInvestmentScheduleStore$fetchInvestmentScheduleEndpoint$2(dao), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getONE_MINUTE(), storeBundle.getClock()));
        this.postInvestmentScheduleEndpoint = PostEndpoint.INSTANCE.create(new TraderInvestmentScheduleStore$postInvestmentScheduleEndpoint$1(recurringApi), new TraderInvestmentScheduleStore$postInvestmentScheduleEndpoint$2(dao));
        Query.Companion companion2 = Query.INSTANCE;
        this.streamBuyingPowerInvestmentSchedulesWithoutBackup = Store.create$default(this, companion2, "streamAllInvestmentSchedulesWithoutBackup", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleStore.streamBuyingPowerInvestmentSchedulesWithoutBackup$lambda$3(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.streamAccountInvestmentSchedules = Store.create$default(this, companion2, "streamAccountInvestmentSchedules", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleStore.streamAccountInvestmentSchedules$lambda$4(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.streamAllInvestmentSchedules = Store.create$default(this, companion2, "streamAllInvestmentSchedules", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleStore.streamAllInvestmentSchedules$lambda$5(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.streamHasPaycheckInvestmentSchedules = Store.create$default(this, companion2, "streamHasPaycheckInvestmentSchedules", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleStore.streamHasPaycheckInvestmentSchedules$lambda$6(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleStore.streamHasPaycheckInvestmentSchedules$lambda$7(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.streamAccountNonPaycheckInvestmentSchedules = Store.create$default(this, companion2, "streamAccountNonPaycheckInvestmentSchedules", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleStore.streamAccountNonPaycheckInvestmentSchedules$lambda$8(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.streamCryptoInvestmentSchedules = Store.create$default(this, companion2, "streamCryptoInvestmentSchedules", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleStore.streamCryptoInvestmentSchedules$lambda$9(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.streamInvestmentSchedule = Store.create$default(this, companion2, "streamAllInvestmentSchedule", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleStore.streamInvestmentSchedule$lambda$10(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.streamUiInvestmentSchedule = Store.create$default(this, companion2, "streamAllUiInvestmentSchedule", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleStore.streamUiInvestmentSchedule$lambda$11(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.streamInvestmentSchedulesByInstrumentId = Store.create$default(this, companion2, "streamInvestmentScheduleByInstrumentId", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleStore.streamInvestmentSchedulesByInstrumentId$lambda$12(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.streamInvestmentSchedulesByInstrumentIdAndAccountNumber = Store.create$default(this, companion2, "streamInvestmentScheduleByInstrumentIdAndAccountNumber", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleStore.m2623x7c450bdc(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleStore.m2624x7c450bdd(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
        this.streamInvestmentSchedulesByUiCurrencyPairId = Store.create$default(this, companion2, "streamInvestmentSchedulesByUiCurrencyPairId", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleStore.streamInvestmentSchedulesByUiCurrencyPairId$lambda$15(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderInvestmentScheduleStore.streamInvestmentSchedulesByUiCurrencyPairId$lambda$16(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        PaginatedEndpoint.Companion companion3 = PaginatedEndpoint.INSTANCE;
        this.getIndividualAccountInvestmentSchedules = PaginatedEndpoint.Companion.create$default(companion3, new C34408x7924097d(this, null), getLogoutKillswitch(), new C34409x7924097e(this, null), storeBundle.getClock(), null, 16, null);
        this.getSelectedAccountInvestmentSchedules = Endpoint.Companion.createWithParams$default(companion, new C34414xfcf253f(this, null), getLogoutKillswitch(), new C34416xfcf2540(this, null), storeBundle.getClock(), null, 16, null);
        this.getInvestmentSchedule = Endpoint.Companion.create$default(companion, new TraderInvestmentScheduleStore$getInvestmentSchedule$1(this, null), getLogoutKillswitch(), new TraderInvestmentScheduleStore$getInvestmentSchedule$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getInvestmentSchedulesAllAccounts = PaginatedEndpoint.Companion.create$default(companion3, new C34410xa9e20c06(this, null), getLogoutKillswitch(), new C34411xa9e20c07(this, null), storeBundle.getClock(), null, 16, null);
        this.investmentScheduleTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$investmentScheduleTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.INVESTMENT_SCHEDULE);
                final Flow<InvestmentSchedule> flowAsFlow = this.this$0.getStreamInvestmentSchedule().asFlow(reference.getSourceId());
                return new Flow<InvestmentScheduleTransaction>() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$investmentScheduleTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super InvestmentScheduleTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$investmentScheduleTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$investmentScheduleTransactionLoader$1$load$$inlined$map$1$2", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$investmentScheduleTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                InvestmentScheduleTransaction investmentScheduleTransaction = new InvestmentScheduleTransaction((InvestmentSchedule) obj, null, 2, null);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(investmentScheduleTransaction, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
        };
        this.investmentScheduleWithAccountTypeTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$investmentScheduleWithAccountTypeTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.INVESTMENT_SCHEDULE_WITH_ACCOUNT_TYPE);
                return FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamAllSelfDirectedAccounts()), Integer.MAX_VALUE, null, 2, null), this.this$0.getStreamInvestmentSchedule().asFlow(reference.getSourceId()), new AnonymousClass1(null));
            }

            /* compiled from: TraderInvestmentScheduleStore.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "accounts", "", "Lcom/robinhood/models/db/Account;", "investmentSchedule", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$investmentScheduleWithAccountTypeTransactionLoader$1$1", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$investmentScheduleWithAccountTypeTransactionLoader$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<List<? extends Account>, InvestmentSchedule, Continuation<? super MinervaTransaction>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(List<? extends Account> list, InvestmentSchedule investmentSchedule, Continuation<? super MinervaTransaction> continuation) {
                    return invoke2((List<Account>) list, investmentSchedule, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<Account> list, InvestmentSchedule investmentSchedule, Continuation<? super MinervaTransaction> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = list;
                    anonymousClass1.L$1 = investmentSchedule;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object next;
                    DisplayName displayName;
                    DisplayName.Variants variants;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        List list = (List) this.L$0;
                        InvestmentSchedule investmentSchedule = (InvestmentSchedule) this.L$1;
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.areEqual(((Account) next).getAccountNumber(), investmentSchedule.getAccountNumber())) {
                                break;
                            }
                        }
                        Account account = (Account) next;
                        StringResource title = (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (variants = displayName.getShort()) == null) ? null : variants.getTitle();
                        if (title != null) {
                            return new InvestmentScheduleWithAccountTypeTransaction(new InvestmentScheduleWithAccountType(title, investmentSchedule));
                        }
                        return new InvestmentScheduleTransaction(investmentSchedule, null, 2, null);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object fetchInvestmentScheduleEndpoint$insert(InvestmentScheduleDao investmentScheduleDao, ApiInvestmentSchedule apiInvestmentSchedule, Continuation continuation) {
        investmentScheduleDao.insert(apiInvestmentSchedule);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object postInvestmentScheduleEndpoint$insert$0(InvestmentScheduleDao investmentScheduleDao, ApiInvestmentSchedule apiInvestmentSchedule, Continuation continuation) {
        investmentScheduleDao.insert(apiInvestmentSchedule);
        return Unit.INSTANCE;
    }

    public final Single<InvestmentSchedule> postInvestmentSchedule(ApiInvestmentScheduleRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        int i = WhenMappings.$EnumSwitchMapping$0[request.getFrequency().ordinal()];
        if (i == 1) {
            Money amount = request.getAmount();
            RecurringInvestmentsConstants recurringInvestmentsConstants = RecurringInvestmentsConstants.INSTANCE;
            if (!(Intrinsics.areEqual(amount, recurringInvestmentsConstants.getZERO_AMOUNT_USD()) ^ Intrinsics.areEqual(request.getPercentage_of_direct_deposit(), recurringInvestmentsConstants.getZERO_PERCENT()))) {
                throw new IllegalStateException("Either amount or percentage_of_direct_deposit has to be 0 for paycheck recurring investments!");
            }
        } else {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (request.getPercentage_of_direct_deposit() != null) {
                throw new IllegalStateException("percentage_of_direct_deposit must be null for non-paycheck recurring investments!");
            }
        }
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C344193(request, null), 1, null);
    }

    /* compiled from: TraderInvestmentScheduleStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$postInvestmentSchedule$3", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {110}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$postInvestmentSchedule$3 */
    static final class C344193 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super InvestmentSchedule>, Object> {
        final /* synthetic */ ApiInvestmentScheduleRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344193(ApiInvestmentScheduleRequest apiInvestmentScheduleRequest, Continuation<? super C344193> continuation) {
            super(2, continuation);
            this.$request = apiInvestmentScheduleRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderInvestmentScheduleStore.this.new C344193(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InvestmentSchedule> continuation) {
            return ((C344193) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = TraderInvestmentScheduleStore.this.postInvestmentScheduleEndpoint;
                ApiInvestmentScheduleRequest apiInvestmentScheduleRequest = this.$request;
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiInvestmentScheduleRequest, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return InvestmentSchedule2.toDbModel((ApiInvestmentSchedule) obj);
        }
    }

    /* compiled from: TraderInvestmentScheduleStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$fetchInvestmentSchedule$1", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {117}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$fetchInvestmentSchedule$1 */
    static final class C344061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super InvestmentSchedule>, Object> {
        final /* synthetic */ UUID $investmentScheduleId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344061(UUID uuid, Continuation<? super C344061> continuation) {
            super(2, continuation);
            this.$investmentScheduleId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderInvestmentScheduleStore.this.new C344061(this.$investmentScheduleId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InvestmentSchedule> continuation) {
            return ((C344061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = TraderInvestmentScheduleStore.this.fetchInvestmentScheduleEndpoint;
                UUID uuid = this.$investmentScheduleId;
                this.label = 1;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return InvestmentSchedule2.toDbModel((ApiInvestmentSchedule) obj);
        }
    }

    public final Single<InvestmentSchedule> fetchInvestmentSchedule(UUID investmentScheduleId) {
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C344061(investmentScheduleId, null), 1, null);
    }

    public final Query<String, List<InvestmentSchedule>> getStreamBuyingPowerInvestmentSchedulesWithoutBackup() {
        return this.streamBuyingPowerInvestmentSchedulesWithoutBackup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamBuyingPowerInvestmentSchedulesWithoutBackup$lambda$3(TraderInvestmentScheduleStore traderInvestmentScheduleStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return traderInvestmentScheduleStore.dao.getBuyingPowerInvestmentSchedulesWithoutBackup(it);
    }

    public final Query<String, List<InvestmentSchedule>> getStreamAccountInvestmentSchedules() {
        return this.streamAccountInvestmentSchedules;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamAccountInvestmentSchedules$lambda$4(TraderInvestmentScheduleStore traderInvestmentScheduleStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return traderInvestmentScheduleStore.dao.getInvestmentSchedules(it);
    }

    public final Query<Unit, List<InvestmentSchedule>> getStreamAllInvestmentSchedules() {
        return this.streamAllInvestmentSchedules;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamAllInvestmentSchedules$lambda$5(TraderInvestmentScheduleStore traderInvestmentScheduleStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return traderInvestmentScheduleStore.dao.getAllInvestmentSchedules();
    }

    public final Query<String, Boolean> getStreamHasPaycheckInvestmentSchedules() {
        return this.streamHasPaycheckInvestmentSchedules;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamHasPaycheckInvestmentSchedules$lambda$6(TraderInvestmentScheduleStore traderInvestmentScheduleStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return traderInvestmentScheduleStore.getIndividualAccountInvestmentSchedules.pollAllPages(null, InvestmentSchedule.INSTANCE.getNormalStaleTimeout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamHasPaycheckInvestmentSchedules$lambda$7(TraderInvestmentScheduleStore traderInvestmentScheduleStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return FlowKt.filterNotNull(traderInvestmentScheduleStore.dao.getHasPaycheckInvestmentSchedules(accountNumber));
    }

    public final Query<String, List<InvestmentSchedule>> getStreamAccountNonPaycheckInvestmentSchedules() {
        return this.streamAccountNonPaycheckInvestmentSchedules;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamAccountNonPaycheckInvestmentSchedules$lambda$8(TraderInvestmentScheduleStore traderInvestmentScheduleStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return traderInvestmentScheduleStore.dao.getAccountNonPaycheckInvestmentSchedules(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamCryptoInvestmentSchedules$lambda$9(TraderInvestmentScheduleStore traderInvestmentScheduleStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return traderInvestmentScheduleStore.dao.getCryptoInvestmentSchedules();
    }

    @Override // com.robinhood.store.base.InvestmentScheduleStore
    public Flow<List<InvestmentSchedule>> streamCryptoInvestmentSchedules() {
        return this.streamCryptoInvestmentSchedules.asFlow(Unit.INSTANCE);
    }

    @Override // com.robinhood.store.base.InvestmentScheduleStore
    public Job refresh(boolean force) {
        return this.getIndividualAccountInvestmentSchedules.refreshAllPages(null, force);
    }

    public final Job refresh(boolean force, UUID investmentScheduleId) {
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        return Endpoint.DefaultImpls.refresh$default(this.getInvestmentSchedule, investmentScheduleId, force, null, 4, null);
    }

    public final Job refreshAccount(boolean force, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.refresh$default(this.getSelectedAccountInvestmentSchedules, accountNumber, force, null, 4, null);
    }

    public final Job refreshAllAccounts(boolean force) {
        return PaginatedEndpointKt.refreshAllPages(this.getInvestmentSchedulesAllAccounts, force);
    }

    public final Query<UUID, InvestmentSchedule> getStreamInvestmentSchedule() {
        return this.streamInvestmentSchedule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamInvestmentSchedule$lambda$10(TraderInvestmentScheduleStore traderInvestmentScheduleStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return traderInvestmentScheduleStore.dao.getInvestmentSchedule(it);
    }

    public final Query<UUID, UiInvestmentSchedule> getStreamUiInvestmentSchedule() {
        return this.streamUiInvestmentSchedule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamUiInvestmentSchedule$lambda$11(TraderInvestmentScheduleStore traderInvestmentScheduleStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return traderInvestmentScheduleStore.dao.getUiInvestmentSchedule(it);
    }

    public final Query<UUID, List<InvestmentSchedule>> getStreamInvestmentSchedulesByInstrumentId() {
        return this.streamInvestmentSchedulesByInstrumentId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamInvestmentSchedulesByInstrumentId$lambda$12(TraderInvestmentScheduleStore traderInvestmentScheduleStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return traderInvestmentScheduleStore.dao.getInvestmentScheduleByInstrumentId(it);
    }

    public final Query<Tuples2<UUID, String>, List<InvestmentSchedule>> getStreamInvestmentSchedulesByInstrumentIdAndAccountNumber() {
        return this.streamInvestmentSchedulesByInstrumentIdAndAccountNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: streamInvestmentSchedulesByInstrumentIdAndAccountNumber$lambda$13 */
    public static final Job m2623x7c450bdc(TraderInvestmentScheduleStore traderInvestmentScheduleStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return PaginatedEndpoint.DefaultImpls.refreshAllPages$default(traderInvestmentScheduleStore.getIndividualAccountInvestmentSchedules, (String) tuples2.component2(), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: streamInvestmentSchedulesByInstrumentIdAndAccountNumber$lambda$14 */
    public static final Flow m2624x7c450bdd(TraderInvestmentScheduleStore traderInvestmentScheduleStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return traderInvestmentScheduleStore.dao.getInvestmentScheduleByInstrumentIdAndAccountNumber((UUID) tuples2.component1(), (String) tuples2.component2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamInvestmentSchedulesByUiCurrencyPairId$lambda$15(TraderInvestmentScheduleStore traderInvestmentScheduleStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PaginatedEndpoint.DefaultImpls.refreshAllPages$default(traderInvestmentScheduleStore.getIndividualAccountInvestmentSchedules, null, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamInvestmentSchedulesByUiCurrencyPairId$lambda$16(TraderInvestmentScheduleStore traderInvestmentScheduleStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return traderInvestmentScheduleStore.dao.getInvestmentScheduleByInstrumentId(it);
    }

    /* compiled from: TraderInvestmentScheduleStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$bulkUpdateInvestmentSchedule$1", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {224}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$bulkUpdateInvestmentSchedule$1 */
    static final class C344021 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $achRelationshipId;
        final /* synthetic */ List<UUID> $investmentScheduleIds;
        final /* synthetic */ boolean $isBackupEnabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344021(List<UUID> list, boolean z, UUID uuid, Continuation<? super C344021> continuation) {
            super(2, continuation);
            this.$investmentScheduleIds = list;
            this.$isBackupEnabled = z;
            this.$achRelationshipId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderInvestmentScheduleStore.this.new C344021(this.$investmentScheduleIds, this.$isBackupEnabled, this.$achRelationshipId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C344021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RecurringApi recurringApi = TraderInvestmentScheduleStore.this.recurringApi;
                ApiInvestmentScheduleBulkUpdateRequest apiInvestmentScheduleBulkUpdateRequest = new ApiInvestmentScheduleBulkUpdateRequest(this.$investmentScheduleIds, this.$isBackupEnabled, this.$achRelationshipId);
                this.label = 1;
                if (recurringApi.bulkUpdateInvestmentSchedule(apiInvestmentScheduleBulkUpdateRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Completable bulkUpdateInvestmentSchedule(List<UUID> investmentScheduleIds, boolean isBackupEnabled, UUID achRelationshipId) {
        Intrinsics.checkNotNullParameter(investmentScheduleIds, "investmentScheduleIds");
        Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C344021(investmentScheduleIds, isBackupEnabled, achRelationshipId, null), 1, null);
    }

    public static /* synthetic */ Single updateInvestmentScheduleBackup$default(TraderInvestmentScheduleStore traderInvestmentScheduleStore, UUID uuid, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid2, UUID uuid3, int i, Object obj) {
        if ((i & 2) != 0) {
            sourceOfFunds = null;
        }
        if ((i & 4) != 0) {
            uuid2 = null;
        }
        if ((i & 8) != 0) {
            uuid3 = null;
        }
        return traderInvestmentScheduleStore.updateInvestmentScheduleBackup(uuid, sourceOfFunds, uuid2, uuid3);
    }

    /* compiled from: TraderInvestmentScheduleStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$updateInvestmentScheduleBackup$1", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {EnumC7081g.f2778x3356acf6}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$updateInvestmentScheduleBackup$1 */
    static final class C344251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiInvestmentSchedule>, Object> {
        final /* synthetic */ UUID $achRelationshipId;
        final /* synthetic */ UUID $backupPaymentMethodId;
        final /* synthetic */ UUID $investmentScheduleId;
        final /* synthetic */ boolean $isBackupEnabled;
        final /* synthetic */ ApiInvestmentSchedule.SourceOfFunds $sourceOfFunds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344251(UUID uuid, boolean z, UUID uuid2, UUID uuid3, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, Continuation<? super C344251> continuation) {
            super(2, continuation);
            this.$investmentScheduleId = uuid;
            this.$isBackupEnabled = z;
            this.$backupPaymentMethodId = uuid2;
            this.$achRelationshipId = uuid3;
            this.$sourceOfFunds = sourceOfFunds;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderInvestmentScheduleStore.this.new C344251(this.$investmentScheduleId, this.$isBackupEnabled, this.$backupPaymentMethodId, this.$achRelationshipId, this.$sourceOfFunds, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiInvestmentSchedule> continuation) {
            return ((C344251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            RecurringApi recurringApi = TraderInvestmentScheduleStore.this.recurringApi;
            UUID uuid = this.$investmentScheduleId;
            boolean z = this.$isBackupEnabled;
            ApiInvestmentScheduleUpdateRequest2 apiInvestmentScheduleUpdateRequest2 = new ApiInvestmentScheduleUpdateRequest2(null, this.$sourceOfFunds, z ? this.$backupPaymentMethodId : this.$achRelationshipId, boxing.boxBoolean(z), 1, null);
            this.label = 1;
            Object objUpdateInvestmentScheduleBackup = recurringApi.updateInvestmentScheduleBackup(uuid, apiInvestmentScheduleUpdateRequest2, this);
            return objUpdateInvestmentScheduleBackup == coroutine_suspended ? coroutine_suspended : objUpdateInvestmentScheduleBackup;
        }
    }

    public final Single<InvestmentSchedule> updateInvestmentScheduleBackup(UUID investmentScheduleId, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID achRelationshipId, UUID backupPaymentMethodId) {
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        Single<InvestmentSchedule> singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C344251(investmentScheduleId, sourceOfFunds == ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER && backupPaymentMethodId != null, backupPaymentMethodId, achRelationshipId, sourceOfFunds, null), 1, null).doOnSuccess(new C34420xd8dde91f(this.saveAction)).map(new Function() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore.updateInvestmentScheduleBackup.2
            @Override // io.reactivex.functions.Function
            public final InvestmentSchedule apply(ApiInvestmentSchedule p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return InvestmentSchedule2.toDbModel(p0);
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }

    /* compiled from: TraderInvestmentScheduleStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$updateInvestmentScheduleAmount$1", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$updateInvestmentScheduleAmount$1 */
    static final class C344231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super InvestmentSchedule>, Object> {
        final /* synthetic */ UUID $investmentScheduleId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344231(UUID uuid, Continuation<? super C344231> continuation) {
            super(2, continuation);
            this.$investmentScheduleId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderInvestmentScheduleStore.this.new C344231(this.$investmentScheduleId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InvestmentSchedule> continuation) {
            return ((C344231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<InvestmentSchedule> investmentSchedule = TraderInvestmentScheduleStore.this.dao.getInvestmentSchedule(this.$investmentScheduleId);
                this.label = 1;
                obj = FlowKt.first(investmentSchedule, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Intrinsics.checkNotNull(obj);
            return obj;
        }
    }

    public final Single<InvestmentSchedule> updateInvestmentScheduleAmount(final UUID investmentScheduleId, final UUID directDepositRelationshipId, final InvestmentScheduleAmount amount) {
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Single<InvestmentSchedule> singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C344231(investmentScheduleId, null), 1, null).subscribeOn(Schedulers.m3346io()).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore.updateInvestmentScheduleAmount.2

            /* compiled from: TraderInvestmentScheduleStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$updateInvestmentScheduleAmount$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ApiInvestmentSchedule.Frequency.values().length];
                    try {
                        iArr[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends InvestmentSchedule> apply(InvestmentSchedule investmentSchedule) {
                ApiInvestmentScheduleUpdateRequest apiInvestmentScheduleUpdateRequest;
                Intrinsics.checkNotNullParameter(investmentSchedule, "investmentSchedule");
                int i = WhenMappings.$EnumSwitchMapping$0[investmentSchedule.getFrequency().ordinal()];
                if (i == 1) {
                    apiInvestmentScheduleUpdateRequest = new ApiInvestmentScheduleUpdateRequest(null, amount.getDollarAmount(), amount.getPercentageAmount(), ApiInvestmentSchedule.SourceOfFunds.DIRECT_DEPOSIT, null, directDepositRelationshipId, null, null, null, 465, null);
                } else {
                    if (i != 2 && i != 3 && i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    apiInvestmentScheduleUpdateRequest = new ApiInvestmentScheduleUpdateRequest(null, amount.getDollarAmount(), null, null, null, null, null, null, null, 509, null);
                }
                TraderInvestmentScheduleStore traderInvestmentScheduleStore = this;
                return RxFactory.DefaultImpls.rxSingle$default(traderInvestmentScheduleStore, null, new AnonymousClass1(traderInvestmentScheduleStore, investmentScheduleId, apiInvestmentScheduleUpdateRequest, null), 1, null).doOnSuccess(new C34420xd8dde91f(this.saveAction)).map(new Function() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore.updateInvestmentScheduleAmount.2.2
                    @Override // io.reactivex.functions.Function
                    public final InvestmentSchedule apply(ApiInvestmentSchedule p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        return InvestmentSchedule2.toDbModel(p0);
                    }
                });
            }

            /* compiled from: TraderInvestmentScheduleStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$updateInvestmentScheduleAmount$2$1", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$updateInvestmentScheduleAmount$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiInvestmentSchedule>, Object> {
                final /* synthetic */ UUID $investmentScheduleId;
                final /* synthetic */ ApiInvestmentScheduleUpdateRequest $request;
                int label;
                final /* synthetic */ TraderInvestmentScheduleStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TraderInvestmentScheduleStore traderInvestmentScheduleStore, UUID uuid, ApiInvestmentScheduleUpdateRequest apiInvestmentScheduleUpdateRequest, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = traderInvestmentScheduleStore;
                    this.$investmentScheduleId = uuid;
                    this.$request = apiInvestmentScheduleUpdateRequest;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$investmentScheduleId, this.$request, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiInvestmentSchedule> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    RecurringApi recurringApi = this.this$0.recurringApi;
                    UUID uuid = this.$investmentScheduleId;
                    ApiInvestmentScheduleUpdateRequest apiInvestmentScheduleUpdateRequest = this.$request;
                    this.label = 1;
                    Object objUpdateInvestmentSchedule = recurringApi.updateInvestmentSchedule(uuid, apiInvestmentScheduleUpdateRequest, this);
                    return objUpdateInvestmentSchedule == coroutine_suspended ? coroutine_suspended : objUpdateInvestmentSchedule;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    @Override // com.robinhood.store.base.InvestmentScheduleStore
    public Object updateInvestmentSchedule(UUID uuid, ApiInvestmentScheduleUpdateRequest apiInvestmentScheduleUpdateRequest, Continuation<?> continuation) {
        throw new IllegalStateException("Not yet implemented");
    }

    @Override // com.robinhood.store.base.InvestmentScheduleStore
    public Object submitInvestmentSchedule(ApiInvestmentScheduleRequest apiInvestmentScheduleRequest, Continuation<?> continuation) {
        throw new IllegalStateException("Not yet implemented");
    }

    public Void getConfig(GetScheduleConfigRequestDto requestDto) {
        Intrinsics.checkNotNullParameter(requestDto, "requestDto");
        throw new IllegalStateException("Not yet implemented");
    }

    public static /* synthetic */ Single updateInvestmentSchedule$default(TraderInvestmentScheduleStore traderInvestmentScheduleStore, UUID uuid, ApiInvestmentSchedule.State state, InvestmentScheduleAmount investmentScheduleAmount, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid2, UUID uuid3, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, UUID uuid4, int i, Object obj) {
        if ((i & 2) != 0) {
            state = null;
        }
        if ((i & 4) != 0) {
            investmentScheduleAmount = null;
        }
        if ((i & 8) != 0) {
            sourceOfFunds = null;
        }
        if ((i & 16) != 0) {
            uuid2 = null;
        }
        if ((i & 32) != 0) {
            uuid3 = null;
        }
        if ((i & 64) != 0) {
            frequency = null;
        }
        if ((i & 128) != 0) {
            localDate = null;
        }
        if ((i & 256) != 0) {
            uuid4 = null;
        }
        return traderInvestmentScheduleStore.updateInvestmentSchedule(uuid, state, investmentScheduleAmount, sourceOfFunds, uuid2, uuid3, frequency, localDate, uuid4);
    }

    public final Single<InvestmentSchedule> updateInvestmentSchedule(UUID investmentScheduleId, ApiInvestmentSchedule.State state, InvestmentScheduleAmount amount, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID achRelationshipId, UUID directDepositRelationshipId, ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, UUID backupPaymentMethodId) {
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        boolean z = sourceOfFunds == ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER && backupPaymentMethodId != null;
        Single<InvestmentSchedule> singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C344212(investmentScheduleId, amount, (sourceOfFunds == null && backupPaymentMethodId == null) ? null : z ? backupPaymentMethodId : achRelationshipId, z, state, sourceOfFunds, directDepositRelationshipId, frequency, startDate, null), 1, null).doOnSuccess(new C34420xd8dde91f(this.saveAction)).map(new Function() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore.updateInvestmentSchedule.3
            @Override // io.reactivex.functions.Function
            public final InvestmentSchedule apply(ApiInvestmentSchedule p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return InvestmentSchedule2.toDbModel(p0);
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }

    /* compiled from: TraderInvestmentScheduleStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$updateInvestmentSchedule$2", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {349}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$updateInvestmentSchedule$2 */
    static final class C344212 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiInvestmentSchedule>, Object> {
        final /* synthetic */ UUID $achId;
        final /* synthetic */ InvestmentScheduleAmount $amount;
        final /* synthetic */ UUID $directDepositRelationshipId;
        final /* synthetic */ ApiInvestmentSchedule.Frequency $frequency;
        final /* synthetic */ UUID $investmentScheduleId;
        final /* synthetic */ boolean $isBackupEnabled;
        final /* synthetic */ ApiInvestmentSchedule.SourceOfFunds $sourceOfFunds;
        final /* synthetic */ LocalDate $startDate;
        final /* synthetic */ ApiInvestmentSchedule.State $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344212(UUID uuid, InvestmentScheduleAmount investmentScheduleAmount, UUID uuid2, boolean z, ApiInvestmentSchedule.State state, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid3, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, Continuation<? super C344212> continuation) {
            super(2, continuation);
            this.$investmentScheduleId = uuid;
            this.$amount = investmentScheduleAmount;
            this.$achId = uuid2;
            this.$isBackupEnabled = z;
            this.$state = state;
            this.$sourceOfFunds = sourceOfFunds;
            this.$directDepositRelationshipId = uuid3;
            this.$frequency = frequency;
            this.$startDate = localDate;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderInvestmentScheduleStore.this.new C344212(this.$investmentScheduleId, this.$amount, this.$achId, this.$isBackupEnabled, this.$state, this.$sourceOfFunds, this.$directDepositRelationshipId, this.$frequency, this.$startDate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiInvestmentSchedule> continuation) {
            return ((C344212) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            RecurringApi recurringApi = TraderInvestmentScheduleStore.this.recurringApi;
            UUID uuid = this.$investmentScheduleId;
            InvestmentScheduleAmount investmentScheduleAmount = this.$amount;
            Money dollarAmount = investmentScheduleAmount != null ? investmentScheduleAmount.getDollarAmount() : null;
            InvestmentScheduleAmount investmentScheduleAmount2 = this.$amount;
            ApiInvestmentScheduleUpdateRequest apiInvestmentScheduleUpdateRequest = new ApiInvestmentScheduleUpdateRequest(this.$state, dollarAmount, investmentScheduleAmount2 != null ? investmentScheduleAmount2.getPercentageAmount() : null, this.$sourceOfFunds, this.$achId, this.$directDepositRelationshipId, this.$achId != null ? boxing.boxBoolean(this.$isBackupEnabled) : null, this.$frequency, this.$startDate);
            this.label = 1;
            Object objUpdateInvestmentSchedule = recurringApi.updateInvestmentSchedule(uuid, apiInvestmentScheduleUpdateRequest, this);
            return objUpdateInvestmentSchedule == coroutine_suspended ? coroutine_suspended : objUpdateInvestmentSchedule;
        }
    }

    public static /* synthetic */ Single updateUiInvestmentSchedule$default(TraderInvestmentScheduleStore traderInvestmentScheduleStore, UUID uuid, ApiInvestmentSchedule.State state, InvestmentScheduleAmount investmentScheduleAmount, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID uuid2, UUID uuid3, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, UUID uuid4, int i, Object obj) {
        if ((i & 2) != 0) {
            state = null;
        }
        if ((i & 4) != 0) {
            investmentScheduleAmount = null;
        }
        if ((i & 8) != 0) {
            sourceOfFunds = null;
        }
        if ((i & 16) != 0) {
            uuid2 = null;
        }
        if ((i & 32) != 0) {
            uuid3 = null;
        }
        if ((i & 64) != 0) {
            frequency = null;
        }
        if ((i & 128) != 0) {
            localDate = null;
        }
        if ((i & 256) != 0) {
            uuid4 = null;
        }
        return traderInvestmentScheduleStore.updateUiInvestmentSchedule(uuid, state, investmentScheduleAmount, sourceOfFunds, uuid2, uuid3, frequency, localDate, uuid4);
    }

    public final Single<UiInvestmentSchedule> updateUiInvestmentSchedule(final UUID investmentScheduleId, ApiInvestmentSchedule.State state, InvestmentScheduleAmount amount, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID achRelationshipId, UUID directDepositRelationshipId, ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, UUID backupPaymentMethodId) {
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        Single singleFlatMap = updateInvestmentSchedule(investmentScheduleId, state, amount, sourceOfFunds, achRelationshipId, directDepositRelationshipId, frequency, startDate, backupPaymentMethodId).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore.updateUiInvestmentSchedule.1

            /* compiled from: TraderInvestmentScheduleStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/recurring/UiInvestmentSchedule;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$updateUiInvestmentSchedule$1$1", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {392}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$updateUiInvestmentSchedule$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiInvestmentSchedule>, Object> {
                final /* synthetic */ UUID $investmentScheduleId;
                int label;
                final /* synthetic */ TraderInvestmentScheduleStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TraderInvestmentScheduleStore traderInvestmentScheduleStore, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = traderInvestmentScheduleStore;
                    this.$investmentScheduleId = uuid;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$investmentScheduleId, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiInvestmentSchedule> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow<UiInvestmentSchedule> uiInvestmentSchedule = this.this$0.dao.getUiInvestmentSchedule(this.$investmentScheduleId);
                        this.label = 1;
                        obj = FlowKt.first(uiInvestmentSchedule, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Intrinsics.checkNotNull(obj);
                    return obj;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends UiInvestmentSchedule> apply(InvestmentSchedule it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TraderInvestmentScheduleStore traderInvestmentScheduleStore = TraderInvestmentScheduleStore.this;
                return RxFactory.DefaultImpls.rxSingle$default(traderInvestmentScheduleStore, null, new AnonymousClass1(traderInvestmentScheduleStore, investmentScheduleId, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    /* compiled from: TraderInvestmentScheduleStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$deleteInvestmentSchedule$1", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {399}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$deleteInvestmentSchedule$1 */
    static final class C344031 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiInvestmentSchedule>, Object> {
        final /* synthetic */ UUID $investmentScheduleId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344031(UUID uuid, Continuation<? super C344031> continuation) {
            super(2, continuation);
            this.$investmentScheduleId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderInvestmentScheduleStore.this.new C344031(this.$investmentScheduleId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiInvestmentSchedule> continuation) {
            return ((C344031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            RecurringApi recurringApi = TraderInvestmentScheduleStore.this.recurringApi;
            UUID uuid = this.$investmentScheduleId;
            ApiInvestmentScheduleUpdateRequest apiInvestmentScheduleUpdateRequest = new ApiInvestmentScheduleUpdateRequest(ApiInvestmentSchedule.State.DELETED, null, null, null, null, null, null, null, null, 510, null);
            this.label = 1;
            Object objUpdateInvestmentSchedule = recurringApi.updateInvestmentSchedule(uuid, apiInvestmentScheduleUpdateRequest, this);
            return objUpdateInvestmentSchedule == coroutine_suspended ? coroutine_suspended : objUpdateInvestmentSchedule;
        }
    }

    public final Single<InvestmentSchedule> deleteInvestmentSchedule(UUID investmentScheduleId) {
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        Single<InvestmentSchedule> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C344031(investmentScheduleId, null), 1, null).doOnSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore.deleteInvestmentSchedule.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiInvestmentSchedule apiInvestmentSchedule) {
                TraderInvestmentScheduleStore.this.refreshAccount(true, apiInvestmentSchedule.getAccount_number());
            }
        }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore.deleteInvestmentSchedule.3
            @Override // io.reactivex.functions.Function
            public final InvestmentSchedule apply(ApiInvestmentSchedule p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return InvestmentSchedule2.toDbModel(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* compiled from: TraderInvestmentScheduleStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recurring/models/api/ApiNextInvestmentDate;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getNextInvestmentDate$1", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {417}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getNextInvestmentDate$1 */
    static final class C344121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiNextInvestmentDate>, Object> {
        final /* synthetic */ ApiInvestmentSchedule.Frequency $frequency;
        final /* synthetic */ LocalDate $startDate;
        final /* synthetic */ ApiAssetType $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344121(ApiAssetType apiAssetType, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, Continuation<? super C344121> continuation) {
            super(2, continuation);
            this.$type = apiAssetType;
            this.$frequency = frequency;
            this.$startDate = localDate;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderInvestmentScheduleStore.this.new C344121(this.$type, this.$frequency, this.$startDate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiNextInvestmentDate> continuation) {
            return ((C344121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            RecurringApi recurringApi = TraderInvestmentScheduleStore.this.recurringApi;
            ApiAssetType apiAssetType = this.$type;
            ApiInvestmentSchedule.Frequency frequency = this.$frequency;
            LocalDate localDate = this.$startDate;
            this.label = 1;
            Object nextInvestmentDate = recurringApi.getNextInvestmentDate(apiAssetType, frequency, localDate, this);
            return nextInvestmentDate == coroutine_suspended ? coroutine_suspended : nextInvestmentDate;
        }
    }

    public final Single<ApiNextInvestmentDate> getNextInvestmentDate(ApiAssetType type2, LocalDate startDate, ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C344121(type2, frequency, startDate, null), 1, null);
    }

    /* compiled from: TraderInvestmentScheduleStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiRecurringHookStartDate;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getRecurringHookStartDate$1", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {428}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getRecurringHookStartDate$1 */
    static final class C344131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiRecurringHookStartDate>, Object> {
        final /* synthetic */ ApiInvestmentSchedule.Frequency $frequency;
        final /* synthetic */ ApiAssetType $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344131(ApiAssetType apiAssetType, ApiInvestmentSchedule.Frequency frequency, Continuation<? super C344131> continuation) {
            super(2, continuation);
            this.$type = apiAssetType;
            this.$frequency = frequency;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TraderInvestmentScheduleStore.this.new C344131(this.$type, this.$frequency, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiRecurringHookStartDate> continuation) {
            return ((C344131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            RecurringApi recurringApi = TraderInvestmentScheduleStore.this.recurringApi;
            ApiAssetType apiAssetType = this.$type;
            ApiInvestmentSchedule.Frequency frequency = this.$frequency;
            this.label = 1;
            Object recurringHookStartDate = recurringApi.getRecurringHookStartDate(apiAssetType, frequency, this);
            return recurringHookStartDate == coroutine_suspended ? coroutine_suspended : recurringHookStartDate;
        }
    }

    public final Single<ApiRecurringHookStartDate> getRecurringHookStartDate(ApiAssetType type2, ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C344131(type2, frequency, null), 1, null);
    }

    public final Observable<Boolean> getHasPaycheckInvestmentSchedules() {
        Observable observableSwitchMap = this.accountProvider.streamAllSelfDirectedAccounts().switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore.getHasPaycheckInvestmentSchedules.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(List<Account> accounts2) {
                T next;
                T next2;
                T next3;
                Observable<Boolean> observableAsObservable;
                Observable<Boolean> observableAsObservable2;
                Observable<Boolean> observableAsObservable3;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                List<Account> list = accounts2;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (((Account) next).getBrokerageAccountType() == BrokerageAccountType.IRA_ROTH) {
                        break;
                    }
                }
                Account account = next;
                String accountNumber = account != null ? account.getAccountNumber() : null;
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = (T) null;
                        break;
                    }
                    next2 = it2.next();
                    if (((Account) next2).getBrokerageAccountType() == BrokerageAccountType.IRA_TRADITIONAL) {
                        break;
                    }
                }
                Account account2 = next2;
                String accountNumber2 = account2 != null ? account2.getAccountNumber() : null;
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = (T) null;
                        break;
                    }
                    next3 = it3.next();
                    if (((Account) next3).getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL) {
                        break;
                    }
                }
                Account account3 = next3;
                String accountNumber3 = account3 != null ? account3.getAccountNumber() : null;
                Observables observables = Observables.INSTANCE;
                if (accountNumber == null) {
                    observableAsObservable = Observable.just(Boolean.FALSE);
                    Intrinsics.checkNotNull(observableAsObservable);
                } else {
                    observableAsObservable = TraderInvestmentScheduleStore.this.getStreamHasPaycheckInvestmentSchedules().asObservable(accountNumber);
                }
                if (accountNumber2 == null) {
                    observableAsObservable2 = Observable.just(Boolean.FALSE);
                    Intrinsics.checkNotNull(observableAsObservable2);
                } else {
                    observableAsObservable2 = TraderInvestmentScheduleStore.this.getStreamHasPaycheckInvestmentSchedules().asObservable(accountNumber2);
                }
                if (accountNumber3 == null) {
                    observableAsObservable3 = Observable.just(Boolean.FALSE);
                    Intrinsics.checkNotNull(observableAsObservable3);
                } else {
                    observableAsObservable3 = TraderInvestmentScheduleStore.this.getStreamHasPaycheckInvestmentSchedules().asObservable(accountNumber3);
                }
                return observables.zip(observableAsObservable, observableAsObservable2, observableAsObservable3).map(new Function() { // from class: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore.getHasPaycheckInvestmentSchedules.1.1
                    @Override // io.reactivex.functions.Function
                    public final Boolean apply(Tuples3<Boolean, Boolean, Boolean> tuples3) {
                        Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                        return Boolean.valueOf(tuples3.component1().booleanValue() || tuples3.component2().booleanValue() || tuples3.component3().booleanValue());
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Flow<PaginatedResult<ApiInvestmentSchedule>> pollIndividualAccount() {
        return this.getIndividualAccountInvestmentSchedules.pollAllPages(null, InvestmentSchedule.INSTANCE.getNormalStaleTimeout());
    }

    @Override // com.robinhood.store.base.InvestmentScheduleStore
    public Flow<List<InvestmentSchedule>> streamInvestmentSchedulesByCurrencyPairId(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return this.streamInvestmentSchedulesByUiCurrencyPairId.asFlow(currencyPairId);
    }

    @Override // com.robinhood.store.base.InvestmentScheduleStore
    public Flow<List<InvestmentSchedule>> streamInvestmentSchedulesBySelectedAccount(CryptoAccountSwitcherLocation.WithCurrencyPair location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return FlowKt.transformLatest(this.cryptoExperimentsStore.streamCryptoMibExperiment(), new C34400xa54eb531(null, this, location));
    }

    @Override // com.robinhood.store.base.InvestmentScheduleStore
    public Flow<InvestmentSchedule> streamInvestmentScheduleById(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.streamInvestmentSchedule.asFlow(id);
    }

    public Void streamInvestmentSchedulesForType(ApiAssetType assetType) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        throw new IllegalStateException("Not yet implemented");
    }

    public final HistoryTransactionLoader getInvestmentScheduleTransactionLoader() {
        return this.investmentScheduleTransactionLoader;
    }

    public final HistoryTransactionLoader getInvestmentScheduleWithAccountTypeTransactionLoader() {
        return this.investmentScheduleWithAccountTypeTransactionLoader;
    }
}
