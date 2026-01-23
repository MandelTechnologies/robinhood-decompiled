package com.robinhood.librobinhood.data.store;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.api.retrofit.CryptoTransfersApi;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.api.transfer.ApiCryptoTransferAccount;
import com.robinhood.models.api.transfer.ApiCryptoTransferDepositDetails;
import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment;
import com.robinhood.models.api.transfer.ApiCryptoTransferHistoryDetailResponse;
import com.robinhood.models.api.transfer.ApiCryptoTransferLimits;
import com.robinhood.models.api.transfer.ApiCryptoTransferOptions;
import com.robinhood.models.api.transfer.ApiCryptoTransferSuvWorkflow;
import com.robinhood.models.api.transfer.ApiCryptoTransferWithdrawal;
import com.robinhood.models.api.transfer.ApiCryptoVaspResponse;
import com.robinhood.models.api.transfer.ApiHigherWithdrawalLimitResponse;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoWithdrawalVerificationRequest;
import com.robinhood.models.crypto.dao.CryptoTransferAccountItemDao;
import com.robinhood.models.crypto.dao.CryptoTransferConfigDao;
import com.robinhood.models.crypto.dao.CryptoTransferHistoryItemDao;
import com.robinhood.models.crypto.dao.CryptoTransferLimitsDao;
import com.robinhood.models.crypto.dao.CryptoTransferOptionsDao;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferAccount;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferAccount2;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferHistoryItem;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferHistoryItem2;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferLimits;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferOptions;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferHistoryDetail;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferHistoryDetailResponse;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferHistoryDetailResponse2;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferWithdrawal;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferWithdrawal2;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferability;
import com.robinhood.models.crypto.p315ui.transfer.HigherWithdrawalLimit;
import com.robinhood.models.crypto.p315ui.transfer.HigherWithdrawalLimit2;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.CryptoTransferTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.StringsKt;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.math.BigDecimal;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0018\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\u0016\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\"H\u0086@¢\u0006\u0002\u0010&J\u000e\u0010)\u001a\u00020*H\u0086@¢\u0006\u0002\u0010\u001aJ\u0014\u00103\u001a\b\u0012\u0004\u0012\u000202042\u0006\u00105\u001a\u000206J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u0002090F2\u0006\u0010G\u001a\u000206H\u0002J\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020J0F2\u0006\u0010G\u001a\u000206J\u0016\u0010K\u001a\u00020I2\u0006\u0010G\u001a\u000206H\u0086@¢\u0006\u0002\u0010LJ\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020N042\u0006\u0010P\u001a\u000206J\f\u0010U\u001a\b\u0012\u0004\u0012\u00020T0VJ\f\u0010W\u001a\b\u0012\u0004\u0012\u00020T0FJ\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0F2\u0006\u0010[\u001a\u00020\"H\u0086@¢\u0006\u0002\u0010&J&\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u0002062\u0006\u0010c\u001a\u00020dH\u0086@¢\u0006\u0002\u0010eJ\u000e\u0010f\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001aJ\u000e\u0010g\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001aJ\u0016\u0010h\u001a\u00020\u001d2\u0006\u0010c\u001a\u00020 H\u0086@¢\u0006\u0002\u0010iJV\u0010+\u001a\b\u0012\u0004\u0012\u00020-042\u0006\u0010j\u001a\u00020\"2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020p2\b\b\u0002\u0010q\u001a\u00020n2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\"2\u0006\u0010t\u001a\u000206J \u0010.\u001a\b\u0012\u0004\u0012\u00020-042\n\b\u0002\u0010u\u001a\u0004\u0018\u0001062\u0006\u00105\u001a\u000206J\u001e\u0010y\u001a\b\u0012\u0004\u0012\u00020x042\u0006\u0010z\u001a\u00020{2\b\u0010j\u001a\u0004\u0018\u00010\"J \u0010|\u001a\u00020x2\u0006\u0010z\u001a\u00020{2\b\u0010j\u001a\u0004\u0018\u00010\"H\u0086@¢\u0006\u0002\u0010}J%\u0010\u0082\u0001\u001a\u00030\u0080\u00012\b\u0010z\u001a\u0004\u0018\u00010{2\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0086@¢\u0006\u0003\u0010\u0085\u0001J.\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010V2\b\u0010\u0083\u0001\u001a\u00030\u0084\u00012\n\b\u0002\u0010z\u001a\u0004\u0018\u00010{2\b\b\u0002\u0010%\u001a\u00020\"J.\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010F2\b\u0010\u0083\u0001\u001a\u00030\u0084\u00012\n\b\u0002\u0010z\u001a\u0004\u0018\u00010{2\b\b\u0002\u0010%\u001a\u00020\"J \u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010F2\u0006\u0010z\u001a\u00020{2\b\b\u0002\u0010%\u001a\u00020\"J0\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010F2\u0007\u0010\u0090\u0001\u001a\u00020\"2\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00012\u000b\b\u0002\u0010\u0091\u0001\u001a\u0004\u0018\u00010\"J3\u0010\u0092\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002090\u0093\u00010F2\b\u0010P\u001a\u0004\u0018\u00010\"2\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020(0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020-0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020908¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001a\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020B0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002090DX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010H\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020I0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010M\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020N0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020R0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020T0DX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020Y0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020^0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010v\u001a\u000e\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020x0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010~\u001a\u000f\u0012\u0004\u0012\u00020\u007f\u0012\u0005\u0012\u00030\u0080\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u007f\u0012\u0005\u0012\u00030\u0080\u00010DX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0088\u0001\u001a\u000f\u0012\u0004\u0012\u00020\"\u0012\u0005\u0012\u00030\u0080\u00010DX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u008a\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u008b\u0001\u0012\u0005\u0012\u00030\u008c\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u008d\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u008b\u0001\u0012\u0005\u0012\u00030\u008e\u00010DX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0097\u0001"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "accountDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferAccountItemDao;", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "cryptoTransferConfigDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferConfigDao;", "cryptoTransfersApi", "Lcom/robinhood/models/api/retrofit/CryptoTransfersApi;", "historyItemsDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferHistoryItemDao;", "limitsDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferLimitsDao;", "transferOptionsDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferOptionsDao;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/crypto/dao/CryptoTransferAccountItemDao;Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;Lcom/robinhood/models/crypto/dao/CryptoTransferConfigDao;Lcom/robinhood/models/api/retrofit/CryptoTransfersApi;Lcom/robinhood/models/crypto/dao/CryptoTransferHistoryItemDao;Lcom/robinhood/models/crypto/dao/CryptoTransferLimitsDao;Lcom/robinhood/models/crypto/dao/CryptoTransferOptionsDao;)V", "getAccountEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferAccount;", "fetchAccount", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferAccount;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateEnrollmentEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;", "getEnrollmentEndpoint", "finalizeEnrollment", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment$Request;", "getLatestDepositAddressEndpoint", "", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails;", "getDepositDetails", "currencyCode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestHigherWithdrawalLimitEndpoint", "Lcom/robinhood/models/api/transfer/ApiHigherWithdrawalLimitResponse;", "requestHigherWithdrawalLimit", "Lcom/robinhood/models/crypto/ui/transfer/HigherWithdrawalLimit;", "prepareWithdrawal", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferWithdrawal$PrepareRequest;", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "submitWithdrawal", "Lcom/robinhood/librobinhood/data/store/SubmitRequestWithChallengeId;", "recreateWorkflow", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferSuvWorkflow$Request;", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferSuvWorkflow;", "recreateSuvForWithdrawal", "Lio/reactivex/Single;", "withdrawalId", "Ljava/util/UUID;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferHistoryItem;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistory", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferHistoryDetailResponse;", "fetchHistoryItem", "Lcom/robinhood/android/moria/db/Query;", "getHistoryItem", "Lkotlinx/coroutines/flow/Flow;", "transferId", "getHistoryDetail", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferHistoryDetailResponse;", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferHistoryDetail;", "fetchHistoryDetail", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransferabilityEndpoint", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferability;", "getTransferability", "currencyPairId", "getLimitsEndpoint", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferLimits;", "getLimitsQuery", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferLimits;", "streamLimits", "Lio/reactivex/Observable;", "streamLimitsFlow", "getVaspsEndpoint", "Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse;", "getVasps", "query", "updateVerificationEndpoint", "Lcom/robinhood/librobinhood/data/store/UpdateVerificationRequest;", "Lcom/robinhood/models/api/transfer/verification/ApiCryptoVerificationResponse;", "updateVerification", "type", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferHistoryDetailResponse$Type;", "verificationId", "request", "Lcom/robinhood/models/api/transfer/verification/ApiCryptoWithdrawalVerificationRequest;", "(Lcom/robinhood/models/api/transfer/ApiCryptoTransferHistoryDetailResponse$Type;Ljava/util/UUID;Lcom/robinhood/models/api/transfer/verification/ApiCryptoWithdrawalVerificationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startEnrollment", "getEnrollment", "completeEnrollment", "(Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PlaceTypes.ADDRESS, "amount", "Ljava/math/BigDecimal;", "isAmountInFiat", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "isFeesAddedToAmount", "networkCode", "addressTag", "loggingSessionId", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "getSupportedNetworksEndpoint", "Lcom/robinhood/librobinhood/data/store/SupportedNetworksRequest;", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;", "getSupportNetworks", "currency", "Lcom/robinhood/models/crypto/db/Currency;", "getSupportNetworksCo", "(Lcom/robinhood/models/crypto/db/Currency;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transferConfigEndpoint", "Lcom/robinhood/librobinhood/data/store/CryptoTransferConfigRequest;", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "transferConfigQuery", "fetchTransferConfigCo", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "(Lcom/robinhood/models/crypto/db/Currency;Lcom/robinhood/models/api/transfer/CryptoTransferAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamTransferConfig", "streamTransferConfigCo", "transferConfigQueryCache", "getCachedTransferConfigForCurrency", "transferOptionsEndpoint", "Lcom/robinhood/librobinhood/data/store/TransferOptionsRequest;", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferOptions;", "transferOptionsQuery", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferOptions;", "streamTransferOptions", "accountNumber", "entryPointIdentifier", "streamPendingTransfers", "", "count", "", "refresh", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoTransfersStore extends Store {
    private final CryptoTransferAccountItemDao accountDao;
    private final CryptoBonfireApi cryptoBonfireApi;
    private final CryptoTransferConfigDao cryptoTransferConfigDao;
    private final CryptoTransfersApi cryptoTransfersApi;
    private final Query<UUID, CryptoTransferHistoryItem> fetchHistoryItem;
    private final PostEndpoint<ApiCryptoTransferEnrollment.Request, ApiCryptoTransferEnrollment> finalizeEnrollment;
    private final Endpoint<Unit, ApiCryptoTransferAccount> getAccountEndpoint;
    private final Endpoint<Unit, ApiCryptoTransferEnrollment> getEnrollmentEndpoint;
    private final PaginatedEndpoint<Unit, ApiCryptoTransferHistoryDetailResponse> getHistory;
    private final Endpoint<UUID, CryptoTransferHistoryDetailResponse> getHistoryDetail;
    private final PostEndpoint<String, ApiCryptoTransferDepositDetails> getLatestDepositAddressEndpoint;
    private final Endpoint<Unit, ApiCryptoTransferLimits> getLimitsEndpoint;
    private final Query<Unit, CryptoTransferLimits> getLimitsQuery;
    private final Endpoint<SupportedNetworksRequest, ApiCryptoSupportedNetworks> getSupportedNetworksEndpoint;
    private final Endpoint<UUID, CryptoTransferability> getTransferabilityEndpoint;
    private final Endpoint<String, ApiCryptoVaspResponse> getVaspsEndpoint;
    private final CryptoTransferHistoryItemDao historyItemsDao;
    private final HistoryLoader.Callbacks<CryptoTransferHistoryItem> historyLoaderCallbacks;
    private final HistoryTransactionLoader historyTransactionLoader;
    private final CryptoTransferLimitsDao limitsDao;
    private final PostEndpoint<ApiCryptoTransferWithdrawal.PrepareRequest, CryptoTransferWithdrawal> prepareWithdrawal;
    private final PostEndpoint<ApiCryptoTransferSuvWorkflow.Request, ApiCryptoTransferSuvWorkflow> recreateWorkflow;
    private final Endpoint<Unit, ApiHigherWithdrawalLimitResponse> requestHigherWithdrawalLimitEndpoint;
    private final PostEndpoint<SubmitRequestWithChallengeId, CryptoTransferWithdrawal> submitWithdrawal;
    private final Endpoint<CryptoTransferConfigRequest, CryptoTransferConfig> transferConfigEndpoint;
    private final Query<CryptoTransferConfigRequest, CryptoTransferConfig> transferConfigQuery;
    private final Query<String, CryptoTransferConfig> transferConfigQueryCache;
    private final CryptoTransferOptionsDao transferOptionsDao;
    private final Endpoint<TransferOptionsRequest, ApiCryptoTransferOptions> transferOptionsEndpoint;
    private final Query<TransferOptionsRequest, CryptoTransferOptions> transferOptionsQuery;
    private final PostEndpoint<Unit, ApiCryptoTransferEnrollment> updateEnrollmentEndpoint;
    private final PostEndpoint<UpdateVerificationRequest, ApiCryptoVerificationResponse> updateVerificationEndpoint;

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore", m3645f = "CryptoTransfersStore.kt", m3646l = {93}, m3647m = "fetchAccount")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$fetchAccount$1 */
    static final class C337681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C337681(Continuation<? super C337681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoTransfersStore.this.fetchAccount(this);
        }
    }

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore", m3645f = "CryptoTransfersStore.kt", m3646l = {354}, m3647m = "getVasps")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$getVasps$1 */
    static final class C337731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C337731(Continuation<? super C337731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoTransfersStore.this.getVasps(null, this);
        }
    }

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore", m3645f = "CryptoTransfersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "requestHigherWithdrawalLimit")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$requestHigherWithdrawalLimit$1 */
    static final class C337781 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C337781(Continuation<? super C337781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoTransfersStore.this.requestHigherWithdrawalLimit(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTransfersStore(StoreBundle storeBundle, CryptoTransferAccountItemDao accountDao, CryptoBonfireApi cryptoBonfireApi, CryptoTransferConfigDao cryptoTransferConfigDao, CryptoTransfersApi cryptoTransfersApi, CryptoTransferHistoryItemDao historyItemsDao, CryptoTransferLimitsDao limitsDao, CryptoTransferOptionsDao transferOptionsDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(accountDao, "accountDao");
        Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
        Intrinsics.checkNotNullParameter(cryptoTransferConfigDao, "cryptoTransferConfigDao");
        Intrinsics.checkNotNullParameter(cryptoTransfersApi, "cryptoTransfersApi");
        Intrinsics.checkNotNullParameter(historyItemsDao, "historyItemsDao");
        Intrinsics.checkNotNullParameter(limitsDao, "limitsDao");
        Intrinsics.checkNotNullParameter(transferOptionsDao, "transferOptionsDao");
        this.accountDao = accountDao;
        this.cryptoBonfireApi = cryptoBonfireApi;
        this.cryptoTransferConfigDao = cryptoTransferConfigDao;
        this.cryptoTransfersApi = cryptoTransfersApi;
        this.historyItemsDao = historyItemsDao;
        this.limitsDao = limitsDao;
        this.transferOptionsDao = transferOptionsDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getAccountEndpoint = Endpoint.Companion.create$default(companion, new CryptoTransfersStore$getAccountEndpoint$1(this, null), getLogoutKillswitch(), new CryptoTransfersStore$getAccountEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        PostEndpoint.Companion companion2 = PostEndpoint.INSTANCE;
        this.updateEnrollmentEndpoint = companion2.create(new CryptoTransfersStore$updateEnrollmentEndpoint$1(this, null), new CryptoTransfersStore$updateEnrollmentEndpoint$2(null));
        this.getEnrollmentEndpoint = Endpoint.Companion.create$default(companion, new CryptoTransfersStore$getEnrollmentEndpoint$1(this, null), getLogoutKillswitch(), new CryptoTransfersStore$getEnrollmentEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.finalizeEnrollment = companion2.create(new CryptoTransfersStore$finalizeEnrollment$1(this, null), new CryptoTransfersStore$finalizeEnrollment$2(null));
        this.getLatestDepositAddressEndpoint = companion2.create(new CryptoTransfersStore$getLatestDepositAddressEndpoint$1(this, null), new CryptoTransfersStore$getLatestDepositAddressEndpoint$2(null));
        this.requestHigherWithdrawalLimitEndpoint = Endpoint.Companion.create$default(companion, new CryptoTransfersStore$requestHigherWithdrawalLimitEndpoint$1(this, null), getLogoutKillswitch(), new CryptoTransfersStore$requestHigherWithdrawalLimitEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.prepareWithdrawal = companion2.create(new C337741(null), new C337752(null));
        this.submitWithdrawal = companion2.create(new C337791(null), new C337802(null));
        this.recreateWorkflow = companion2.create(new CryptoTransfersStore$recreateWorkflow$1(cryptoTransfersApi), new CryptoTransfersStore$recreateWorkflow$2(null));
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<CryptoTransferHistoryItem>() { // from class: com.robinhood.librobinhood.data.store.CryptoTransfersStore$historyLoaderCallbacks$1
            private final EnumSet<HistoryTransactionType> supportedTransactionTypes = EnumSet.of(HistoryTransactionType.CRYPTO_TRANSFER);
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes = SetsKt.emptySet();

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public EnumSet<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                refreshPaginated();
                return FlowKt.filterNotNull(this.this$0.historyItemsDao.countTotal(CryptoTransferHistoryItem2.getCryptoTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.getStaticAssetId(), filter.getIsFilteringByGoldDepositBoost()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.historyItemsDao.countLater(CryptoTransferHistoryItem2.getCryptoTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId(), filter.getIsFilteringByGoldDepositBoost()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoTransferHistoryItem>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                refreshPaginated();
                return this.this$0.historyItemsDao.getLatest(CryptoTransferHistoryItem2.getCryptoTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), limit, filter.getStaticAssetId(), filter.getIsFilteringByGoldDepositBoost());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoTransferHistoryItem>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.historyItemsDao.getLater(CryptoTransferHistoryItem2.getCryptoTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.getStaticAssetId(), filter.getIsFilteringByGoldDepositBoost());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoTransferHistoryItem>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.historyItemsDao.get(CryptoTransferHistoryItem2.getCryptoTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId(), filter.getIsFilteringByGoldDepositBoost());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoTransferHistoryItem>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.historyItemsDao.getEarlier(CryptoTransferHistoryItem2.getCryptoTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.getStaticAssetId(), filter.getIsFilteringByGoldDepositBoost());
            }

            private final void refreshPaginated() {
                this.this$0.getHistory.refreshAllPages(Unit.INSTANCE, false);
            }
        };
        this.historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.CryptoTransfersStore$historyTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.CRYPTO_TRANSFER);
                final Flow historyItem = this.this$0.getHistoryItem(reference.getSourceId());
                return new Flow<CryptoTransferTransaction>() { // from class: com.robinhood.librobinhood.data.store.CryptoTransfersStore$historyTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoTransferTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = historyItem.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$historyTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$historyTransactionLoader$1$load$$inlined$map$1$2", m3645f = "CryptoTransfersStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$historyTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                CryptoTransferTransaction cryptoTransferTransaction = new CryptoTransferTransaction((CryptoTransferHistoryItem) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(cryptoTransferTransaction, anonymousClass1) == coroutine_suspended) {
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
        this.getHistory = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new CryptoTransfersStore$getHistory$1(this, null), getLogoutKillswitch(), new CryptoTransfersStore$getHistory$2(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion3 = Query.INSTANCE;
        this.fetchHistoryItem = Store.create$default(this, companion3, "fetchHistoryItem", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoTransfersStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransfersStore.fetchHistoryItem$lambda$0(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.getHistoryDetail = Endpoint.Companion.create$default(companion, new C337691(null), getLogoutKillswitch(), new C337702(null), storeBundle.getClock(), null, 16, null);
        this.getTransferabilityEndpoint = Endpoint.Companion.create$default(companion, new CryptoTransfersStore$getTransferabilityEndpoint$1(this, null), getLogoutKillswitch(), new CryptoTransfersStore$getTransferabilityEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        Endpoint<Unit, ApiCryptoTransferLimits> endpointCreate$default = Endpoint.Companion.create$default(companion, new CryptoTransfersStore$getLimitsEndpoint$1(this, null), getLogoutKillswitch(), new CryptoTransfersStore$getLimitsEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getLimitsEndpoint = endpointCreate$default;
        this.getLimitsQuery = Store.create$default(this, companion3, "fetchHistoryItem", CollectionsKt.listOf(new RefreshEach(new CryptoTransfersStore$getLimitsQuery$1(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoTransfersStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransfersStore.getLimitsQuery$lambda$2(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.getVaspsEndpoint = Endpoint.Companion.create$default(companion, new CryptoTransfersStore$getVaspsEndpoint$1(this, null), getLogoutKillswitch(), new CryptoTransfersStore$getVaspsEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.updateVerificationEndpoint = companion2.create(new CryptoTransfersStore$updateVerificationEndpoint$1(this, null), new CryptoTransfersStore$updateVerificationEndpoint$2(null));
        this.getSupportedNetworksEndpoint = Endpoint.Companion.create$default(companion, new CryptoTransfersStore$getSupportedNetworksEndpoint$1(this, null), getLogoutKillswitch(), new CryptoTransfersStore$getSupportedNetworksEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        CryptoTransfersStore$transferConfigEndpoint$1 cryptoTransfersStore$transferConfigEndpoint$1 = new CryptoTransfersStore$transferConfigEndpoint$1(cryptoTransferConfigDao);
        Endpoint<CryptoTransferConfigRequest, CryptoTransferConfig> endpointCreate = companion.create(new CryptoTransfersStore$transferConfigEndpoint$2(this, null), getLogoutKillswitch(), cryptoTransfersStore$transferConfigEndpoint$1, storeBundle.getClock(), new DefaultStaleDecider(CryptoTransferConfig.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        this.transferConfigEndpoint = endpointCreate;
        this.transferConfigQuery = Store.create$default(this, companion3, "transferConfigQuery", CollectionsKt.listOf(new RefreshEach(new CryptoTransfersStore$transferConfigQuery$1(endpointCreate))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoTransfersStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransfersStore.transferConfigQuery$lambda$4(this.f$0, (CryptoTransferConfigRequest) obj);
            }
        }, false, 8, null);
        this.transferConfigQueryCache = Store.create$default(this, companion3, "transferConfigQuery", CollectionsKt.emptyList(), new CryptoTransfersStore$transferConfigQueryCache$1(cryptoTransferConfigDao), false, 8, null);
        Endpoint<TransferOptionsRequest, ApiCryptoTransferOptions> endpointCreate2 = companion.create(new CryptoTransfersStore$transferOptionsEndpoint$1(this, null), getLogoutKillswitch(), new CryptoTransfersStore$transferOptionsEndpoint$2(this, null), storeBundle.getClock(), new DefaultStaleDecider(CryptoTransferOptions.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        this.transferOptionsEndpoint = endpointCreate2;
        this.transferOptionsQuery = Store.create$default(this, companion3, "transferOptionsQuery", CollectionsKt.listOf(new RefreshEach(new CryptoTransfersStore$transferOptionsQuery$1(endpointCreate2))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoTransfersStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransfersStore.transferOptionsQuery$lambda$6(this.f$0, (TransferOptionsRequest) obj);
            }
        }, false, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAccount(Continuation<? super CryptoTransferAccount> continuation) {
        C337681 c337681;
        if (continuation instanceof C337681) {
            c337681 = (C337681) continuation;
            int i = c337681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c337681.label = i - Integer.MIN_VALUE;
            } else {
                c337681 = new C337681(continuation);
            }
        }
        C337681 c3376812 = c337681;
        Object objForceFetch$default = c3376812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3376812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<Unit, ApiCryptoTransferAccount> endpoint = this.getAccountEndpoint;
            Unit unit = Unit.INSTANCE;
            c3376812.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, c3376812, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return CryptoTransferAccount2.toDbModel((ApiCryptoTransferAccount) objForceFetch$default);
    }

    public final Object getDepositDetails(String str, Continuation<? super ApiCryptoTransferDepositDetails> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.getLatestDepositAddressEndpoint, str, null, continuation, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestHigherWithdrawalLimit(Continuation<? super HigherWithdrawalLimit> continuation) {
        C337781 c337781;
        if (continuation instanceof C337781) {
            c337781 = (C337781) continuation;
            int i = c337781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c337781.label = i - Integer.MIN_VALUE;
            } else {
                c337781 = new C337781(continuation);
            }
        }
        C337781 c3377812 = c337781;
        Object objForceFetch$default = c3377812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3377812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<Unit, ApiHigherWithdrawalLimitResponse> endpoint = this.requestHigherWithdrawalLimitEndpoint;
            Unit unit = Unit.INSTANCE;
            c3377812.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, c3377812, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return HigherWithdrawalLimit2.toDbModel((ApiHigherWithdrawalLimitResponse) objForceFetch$default);
    }

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "it", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferWithdrawal$PrepareRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$prepareWithdrawal$1", m3645f = "CryptoTransfersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$prepareWithdrawal$1 */
    static final class C337741 extends ContinuationImpl7 implements Function2<ApiCryptoTransferWithdrawal.PrepareRequest, Continuation<? super CryptoTransferWithdrawal>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C337741(Continuation<? super C337741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C337741 c337741 = CryptoTransfersStore.this.new C337741(continuation);
            c337741.L$0 = obj;
            return c337741;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiCryptoTransferWithdrawal.PrepareRequest prepareRequest, Continuation<? super CryptoTransferWithdrawal> continuation) {
            return ((C337741) create(prepareRequest, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ApiCryptoTransferWithdrawal.PrepareRequest prepareRequest = (ApiCryptoTransferWithdrawal.PrepareRequest) this.L$0;
                CryptoTransfersApi cryptoTransfersApi = CryptoTransfersStore.this.cryptoTransfersApi;
                this.label = 1;
                obj = cryptoTransfersApi.prepareWithdrawal(prepareRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return CryptoTransferWithdrawal2.toDbModel((ApiCryptoTransferWithdrawal) obj);
        }
    }

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$prepareWithdrawal$2", m3645f = "CryptoTransfersStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$prepareWithdrawal$2 */
    static final class C337752 extends ContinuationImpl7 implements Function2<CryptoTransferWithdrawal, Continuation<? super Unit>, Object> {
        int label;

        C337752(Continuation<? super C337752> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C337752(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferWithdrawal cryptoTransferWithdrawal, Continuation<? super Unit> continuation) {
            return ((C337752) create(cryptoTransferWithdrawal, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "request", "Lcom/robinhood/librobinhood/data/store/SubmitRequestWithChallengeId;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$submitWithdrawal$1", m3645f = "CryptoTransfersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$submitWithdrawal$1 */
    static final class C337791 extends ContinuationImpl7 implements Function2<SubmitRequestWithChallengeId, Continuation<? super CryptoTransferWithdrawal>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C337791(Continuation<? super C337791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C337791 c337791 = CryptoTransfersStore.this.new C337791(continuation);
            c337791.L$0 = obj;
            return c337791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SubmitRequestWithChallengeId submitRequestWithChallengeId, Continuation<? super CryptoTransferWithdrawal> continuation) {
            return ((C337791) create(submitRequestWithChallengeId, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SubmitRequestWithChallengeId submitRequestWithChallengeId = (SubmitRequestWithChallengeId) this.L$0;
                CryptoTransfersApi cryptoTransfersApi = CryptoTransfersStore.this.cryptoTransfersApi;
                UUID challengeId = submitRequestWithChallengeId.getChallengeId();
                ApiCryptoTransferWithdrawal.SubmitRequest submitRequest = new ApiCryptoTransferWithdrawal.SubmitRequest(submitRequestWithChallengeId.getWithdrawalId());
                this.label = 1;
                obj = cryptoTransfersApi.submitWithdrawal(challengeId, submitRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return CryptoTransferWithdrawal2.toDbModel((ApiCryptoTransferWithdrawal) obj);
        }
    }

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$submitWithdrawal$2", m3645f = "CryptoTransfersStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$submitWithdrawal$2 */
    static final class C337802 extends ContinuationImpl7 implements Function2<CryptoTransferWithdrawal, Continuation<? super Unit>, Object> {
        int label;

        C337802(Continuation<? super C337802> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C337802(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferWithdrawal cryptoTransferWithdrawal, Continuation<? super Unit> continuation) {
            return ((C337802) create(cryptoTransferWithdrawal, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferSuvWorkflow;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$recreateSuvForWithdrawal$1", m3645f = "CryptoTransfersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$recreateSuvForWithdrawal$1 */
    static final class C337771 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCryptoTransferSuvWorkflow>, Object> {
        final /* synthetic */ UUID $withdrawalId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337771(UUID uuid, Continuation<? super C337771> continuation) {
            super(2, continuation);
            this.$withdrawalId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransfersStore.this.new C337771(this.$withdrawalId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCryptoTransferSuvWorkflow> continuation) {
            return ((C337771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = CryptoTransfersStore.this.recreateWorkflow;
            ApiCryptoTransferSuvWorkflow.Request request = new ApiCryptoTransferSuvWorkflow.Request(this.$withdrawalId);
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, request, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<ApiCryptoTransferSuvWorkflow> recreateSuvForWithdrawal(UUID withdrawalId) {
        Intrinsics.checkNotNullParameter(withdrawalId, "withdrawalId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C337771(withdrawalId, null), 1, null);
    }

    public final HistoryLoader.Callbacks<CryptoTransferHistoryItem> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return this.historyTransactionLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow fetchHistoryItem$lambda$0(CryptoTransfersStore cryptoTransfersStore, UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        return cryptoTransfersStore.historyItemsDao.getTransfer(transferId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<CryptoTransferHistoryItem> getHistoryItem(UUID transferId) {
        return this.fetchHistoryItem.asFlow(transferId);
    }

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferHistoryDetailResponse;", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$getHistoryDetail$1", m3645f = "CryptoTransfersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$getHistoryDetail$1 */
    static final class C337691 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super CryptoTransferHistoryDetailResponse>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C337691(Continuation<? super C337691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C337691 c337691 = CryptoTransfersStore.this.new C337691(continuation);
            c337691.L$0 = obj;
            return c337691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super CryptoTransferHistoryDetailResponse> continuation) {
            return ((C337691) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UUID uuid = (UUID) this.L$0;
                CryptoBonfireApi cryptoBonfireApi = CryptoTransfersStore.this.cryptoBonfireApi;
                this.label = 1;
                obj = cryptoBonfireApi.getCryptoTransferHistoryDetail(uuid, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return CryptoTransferHistoryDetailResponse2.toDbModel((ApiCryptoTransferHistoryDetailResponse) obj);
        }
    }

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferHistoryDetailResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$getHistoryDetail$2", m3645f = "CryptoTransfersStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$getHistoryDetail$2 */
    static final class C337702 extends ContinuationImpl7 implements Function2<CryptoTransferHistoryDetailResponse, Continuation<? super Unit>, Object> {
        int label;

        C337702(Continuation<? super C337702> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C337702(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferHistoryDetailResponse cryptoTransferHistoryDetailResponse, Continuation<? super Unit> continuation) {
            return ((C337702) create(cryptoTransferHistoryDetailResponse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public final Flow<CryptoTransferHistoryDetail> getHistoryDetail(UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        Endpoint<UUID, CryptoTransferHistoryDetailResponse> endpoint = this.getHistoryDetail;
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(endpoint, transferId, durationOfSeconds, null, 4, null);
        return new Flow<CryptoTransferHistoryDetail>() { // from class: com.robinhood.librobinhood.data.store.CryptoTransfersStore$getHistoryDetail$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super CryptoTransferHistoryDetail> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C337662(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$getHistoryDetail$$inlined$map$1$2 */
            public static final class C337662<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$getHistoryDetail$$inlined$map$1$2", m3645f = "CryptoTransfersStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$getHistoryDetail$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C337662.this.emit(null, this);
                    }
                }

                public C337662(FlowCollector flowCollector) {
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
                        CryptoTransferHistoryDetail historyDetail = ((CryptoTransferHistoryDetailResponse) obj).getHistoryDetail();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(historyDetail, anonymousClass1) == coroutine_suspended) {
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

    public final Object fetchHistoryDetail(UUID uuid, Continuation<? super CryptoTransferHistoryDetailResponse> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getHistoryDetail, uuid, null, continuation, 2, null);
    }

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferability;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$getTransferability$1", m3645f = "CryptoTransfersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$getTransferability$1 */
    static final class C337721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super CryptoTransferability>, Object> {
        final /* synthetic */ UUID $currencyPairId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337721(UUID uuid, Continuation<? super C337721> continuation) {
            super(2, continuation);
            this.$currencyPairId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransfersStore.this.new C337721(this.$currencyPairId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CryptoTransferability> continuation) {
            return ((C337721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = CryptoTransfersStore.this.getTransferabilityEndpoint;
            UUID uuid = this.$currencyPairId;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<CryptoTransferability> getTransferability(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C337721(currencyPairId, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getLimitsQuery$lambda$2(CryptoTransfersStore cryptoTransfersStore, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        return cryptoTransfersStore.limitsDao.getLimits();
    }

    public final Observable<CryptoTransferLimits> streamLimits() {
        Observable<CryptoTransferLimits> observableDistinctUntilChanged = this.getLimitsQuery.asObservable(Unit.INSTANCE).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public final Flow<CryptoTransferLimits> streamLimitsFlow() {
        return this.getLimitsQuery.asFlow(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getVasps(String str, Continuation<? super Flow<ApiCryptoVaspResponse>> continuation) {
        C337731 c337731;
        if (continuation instanceof C337731) {
            c337731 = (C337731) continuation;
            int i = c337731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c337731.label = i - Integer.MIN_VALUE;
            } else {
                c337731 = new C337731(continuation);
            }
        }
        C337731 c3377312 = c337731;
        Object objForceFetch$default = c3377312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3377312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<String, ApiCryptoVaspResponse> endpoint = this.getVaspsEndpoint;
            c3377312.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, c3377312, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return FlowKt.flowOf(objForceFetch$default);
    }

    public final Object updateVerification(ApiCryptoTransferHistoryDetailResponse.Type type2, UUID uuid, ApiCryptoWithdrawalVerificationRequest apiCryptoWithdrawalVerificationRequest, Continuation<? super ApiCryptoVerificationResponse> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.updateVerificationEndpoint, new UpdateVerificationRequest(type2, uuid, apiCryptoWithdrawalVerificationRequest), null, continuation, 2, null);
    }

    public final Object startEnrollment(Continuation<? super ApiCryptoTransferEnrollment> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.updateEnrollmentEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }

    public final Object getEnrollment(Continuation<? super ApiCryptoTransferEnrollment> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getEnrollmentEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }

    public final Object completeEnrollment(ApiCryptoTransferEnrollment.Request request, Continuation<? super ApiCryptoTransferEnrollment> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.finalizeEnrollment, request, null, continuation, 2, null);
    }

    public static /* synthetic */ Single prepareWithdrawal$default(CryptoTransfersStore cryptoTransfersStore, String str, BigDecimal bigDecimal, boolean z, UiCurrencyPair uiCurrencyPair, boolean z2, String str2, String str3, UUID uuid, int i, Object obj) {
        String str4;
        CryptoTransfersStore cryptoTransfersStore2;
        String str5;
        BigDecimal bigDecimal2;
        boolean z3;
        UiCurrencyPair uiCurrencyPair2;
        UUID uuid2;
        if ((i & 16) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        String str6 = (i & 32) != 0 ? null : str2;
        if ((i & 64) != 0) {
            str4 = null;
            str5 = str;
            bigDecimal2 = bigDecimal;
            z3 = z;
            uiCurrencyPair2 = uiCurrencyPair;
            uuid2 = uuid;
            cryptoTransfersStore2 = cryptoTransfersStore;
        } else {
            str4 = str3;
            cryptoTransfersStore2 = cryptoTransfersStore;
            str5 = str;
            bigDecimal2 = bigDecimal;
            z3 = z;
            uiCurrencyPair2 = uiCurrencyPair;
            uuid2 = uuid;
        }
        return cryptoTransfersStore2.prepareWithdrawal(str5, bigDecimal2, z3, uiCurrencyPair2, z4, str6, str4, uuid2);
    }

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$prepareWithdrawal$3", m3645f = "CryptoTransfersStore.kt", m3646l = {421}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$prepareWithdrawal$3 */
    static final class C337763 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super CryptoTransferWithdrawal>, Object> {
        final /* synthetic */ String $address;
        final /* synthetic */ String $addressTag;
        final /* synthetic */ BigDecimal $amount;
        final /* synthetic */ boolean $isAmountInFiat;
        final /* synthetic */ boolean $isFeesAddedToAmount;
        final /* synthetic */ UUID $loggingSessionId;
        final /* synthetic */ String $networkCode;
        final /* synthetic */ UiCurrencyPair $uiCurrencyPair;
        int label;
        final /* synthetic */ CryptoTransfersStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337763(boolean z, BigDecimal bigDecimal, UiCurrencyPair uiCurrencyPair, String str, boolean z2, String str2, String str3, UUID uuid, CryptoTransfersStore cryptoTransfersStore, Continuation<? super C337763> continuation) {
            super(2, continuation);
            this.$isAmountInFiat = z;
            this.$amount = bigDecimal;
            this.$uiCurrencyPair = uiCurrencyPair;
            this.$address = str;
            this.$isFeesAddedToAmount = z2;
            this.$networkCode = str2;
            this.$addressTag = str3;
            this.$loggingSessionId = uuid;
            this.this$0 = cryptoTransfersStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C337763(this.$isAmountInFiat, this.$amount, this.$uiCurrencyPair, this.$address, this.$isFeesAddedToAmount, this.$networkCode, this.$addressTag, this.$loggingSessionId, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CryptoTransferWithdrawal> continuation) {
            return ((C337763) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ApiCryptoTransferWithdrawal.PrepareRequest prepareRequest;
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
            if (this.$isAmountInFiat) {
                prepareRequest = new ApiCryptoTransferWithdrawal.PrepareRequest(this.$uiCurrencyPair.getAssetCurrency().getApiCode(), null, Money3.toMoney(this.$amount, this.$uiCurrencyPair.getQuoteCurrency().toIsoCurrency()), this.$address, this.$isFeesAddedToAmount, this.$networkCode, this.$addressTag, this.$loggingSessionId);
            } else {
                prepareRequest = new ApiCryptoTransferWithdrawal.PrepareRequest(this.$uiCurrencyPair.getAssetCurrency().getApiCode(), this.$amount, null, this.$address, this.$isFeesAddedToAmount, this.$networkCode, this.$addressTag, this.$loggingSessionId);
            }
            ApiCryptoTransferWithdrawal.PrepareRequest prepareRequest2 = prepareRequest;
            PostEndpoint postEndpoint = this.this$0.prepareWithdrawal;
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, prepareRequest2, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<CryptoTransferWithdrawal> prepareWithdrawal(String address, BigDecimal amount, boolean isAmountInFiat, UiCurrencyPair uiCurrencyPair, boolean isFeesAddedToAmount, String networkCode, String addressTag, UUID loggingSessionId) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C337763(isAmountInFiat, amount, uiCurrencyPair, address, isFeesAddedToAmount, networkCode, addressTag, loggingSessionId, this, null), 1, null);
    }

    public static /* synthetic */ Single submitWithdrawal$default(CryptoTransfersStore cryptoTransfersStore, UUID uuid, UUID uuid2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = null;
        }
        return cryptoTransfersStore.submitWithdrawal(uuid, uuid2);
    }

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$submitWithdrawal$3", m3645f = "CryptoTransfersStore.kt", m3646l = {431}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$submitWithdrawal$3 */
    static final class C337813 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super CryptoTransferWithdrawal>, Object> {
        final /* synthetic */ UUID $challengeId;
        final /* synthetic */ UUID $withdrawalId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337813(UUID uuid, UUID uuid2, Continuation<? super C337813> continuation) {
            super(2, continuation);
            this.$challengeId = uuid;
            this.$withdrawalId = uuid2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransfersStore.this.new C337813(this.$challengeId, this.$withdrawalId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CryptoTransferWithdrawal> continuation) {
            return ((C337813) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = CryptoTransfersStore.this.submitWithdrawal;
            SubmitRequestWithChallengeId submitRequestWithChallengeId = new SubmitRequestWithChallengeId(this.$challengeId, this.$withdrawalId);
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, submitRequestWithChallengeId, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<CryptoTransferWithdrawal> submitWithdrawal(UUID challengeId, UUID withdrawalId) {
        Intrinsics.checkNotNullParameter(withdrawalId, "withdrawalId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C337813(challengeId, withdrawalId, null), 1, null);
    }

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$getSupportNetworks$1", m3645f = "CryptoTransfersStore.kt", m3646l = {457}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoTransfersStore$getSupportNetworks$1 */
    static final class C337711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCryptoSupportedNetworks>, Object> {
        final /* synthetic */ String $address;
        final /* synthetic */ Currency $currency;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337711(Currency currency, String str, Continuation<? super C337711> continuation) {
            super(2, continuation);
            this.$currency = currency;
            this.$address = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransfersStore.this.new C337711(this.$currency, this.$address, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCryptoSupportedNetworks> continuation) {
            return ((C337711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = CryptoTransfersStore.this.getSupportedNetworksEndpoint;
            SupportedNetworksRequest supportedNetworksRequest = new SupportedNetworksRequest(this.$currency.getApiCode(), this.$address);
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, supportedNetworksRequest, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<ApiCryptoSupportedNetworks> getSupportNetworks(Currency currency, String address) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C337711(currency, address, null), 1, null);
    }

    public final Object getSupportNetworksCo(Currency currency, String str, Continuation<? super ApiCryptoSupportedNetworks> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getSupportedNetworksEndpoint, new SupportedNetworksRequest(currency.getApiCode(), str), null, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object transferConfigEndpoint$insert(CryptoTransferConfigDao cryptoTransferConfigDao, CryptoTransferConfig cryptoTransferConfig, Continuation continuation) {
        cryptoTransferConfigDao.insert(cryptoTransferConfig);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow transferConfigQuery$lambda$4(CryptoTransfersStore cryptoTransfersStore, CryptoTransferConfigRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getCurrencyCode() != null) {
            return cryptoTransfersStore.cryptoTransferConfigDao.getCryptoTransferConfig(it.getCurrencyCode());
        }
        return FlowKt.emptyFlow();
    }

    public final Object fetchTransferConfigCo(Currency currency, CryptoTransferAction cryptoTransferAction, Continuation<? super CryptoTransferConfig> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.transferConfigEndpoint, new CryptoTransferConfigRequest(currency != null ? currency.getApiCode() : null, cryptoTransferAction), null, continuation, 2, null);
    }

    public static /* synthetic */ Observable streamTransferConfig$default(CryptoTransfersStore cryptoTransfersStore, CryptoTransferAction cryptoTransferAction, Currency currency, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            currency = null;
        }
        if ((i & 4) != 0 && (currency == null || (str = currency.getApiCode()) == null)) {
            str = "";
        }
        return cryptoTransfersStore.streamTransferConfig(cryptoTransferAction, currency, str);
    }

    public final Observable<CryptoTransferConfig> streamTransferConfig(CryptoTransferAction action, Currency currency, String currencyCode) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return this.transferConfigQuery.asObservable(new CryptoTransferConfigRequest(currencyCode, action));
    }

    public static /* synthetic */ Flow streamTransferConfigCo$default(CryptoTransfersStore cryptoTransfersStore, CryptoTransferAction cryptoTransferAction, Currency currency, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            currency = null;
        }
        if ((i & 4) != 0 && (currency == null || (str = currency.getApiCode()) == null)) {
            str = "";
        }
        return cryptoTransfersStore.streamTransferConfigCo(cryptoTransferAction, currency, str);
    }

    public final Flow<CryptoTransferConfig> streamTransferConfigCo(CryptoTransferAction action, Currency currency, String currencyCode) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return this.transferConfigQuery.asFlow(new CryptoTransferConfigRequest(currencyCode, action));
    }

    public static /* synthetic */ Flow getCachedTransferConfigForCurrency$default(CryptoTransfersStore cryptoTransfersStore, Currency currency, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = currency.getApiCode();
        }
        return cryptoTransfersStore.getCachedTransferConfigForCurrency(currency, str);
    }

    public final Flow<CryptoTransferConfig> getCachedTransferConfigForCurrency(Currency currency, String currencyCode) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return this.transferConfigQueryCache.asFlow(currencyCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow transferOptionsQuery$lambda$6(CryptoTransfersStore cryptoTransfersStore, TransferOptionsRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoTransferOptionsDao cryptoTransferOptionsDao = cryptoTransfersStore.transferOptionsDao;
        String accountNumber = it.getAccountNumber();
        CryptoTransferAction action = it.getAction();
        String entryPointIdentifier = it.getEntryPointIdentifier();
        if (entryPointIdentifier == null) {
            entryPointIdentifier = "";
        }
        return cryptoTransferOptionsDao.get(accountNumber, action, entryPointIdentifier);
    }

    public static /* synthetic */ Flow streamTransferOptions$default(CryptoTransfersStore cryptoTransfersStore, String str, CryptoTransferAction cryptoTransferAction, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return cryptoTransfersStore.streamTransferOptions(str, cryptoTransferAction, str2);
    }

    public final Flow<CryptoTransferOptions> streamTransferOptions(String accountNumber, CryptoTransferAction action, String entryPointIdentifier) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.transferOptionsQuery.asFlow(new TransferOptionsRequest(accountNumber, action, entryPointIdentifier));
    }

    public static /* synthetic */ Flow streamPendingTransfers$default(CryptoTransfersStore cryptoTransfersStore, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return cryptoTransfersStore.streamPendingTransfers(str, i, z);
    }

    public final Flow<List<CryptoTransferHistoryItem>> streamPendingTransfers(String currencyPairId, int count, boolean refresh) {
        if (refresh) {
            this.getHistory.refreshAllPages(Unit.INSTANCE, false);
        }
        return this.historyItemsDao.getLatestPendingTransfers(currencyPairId != null ? StringsKt.toUuid(currencyPairId) : null, count);
    }
}
