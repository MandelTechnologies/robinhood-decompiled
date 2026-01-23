package com.robinhood.android.options.combo.dao;

import androidx.collection.ArrayMap;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowBuilder;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.combo.api.ApiComboOrder;
import com.robinhood.android.options.combo.p206db.ComboOrder;
import com.robinhood.android.options.combo.p206db.ComboOrderExecution;
import com.robinhood.android.options.combo.p206db.ComboOrderLeg;
import com.robinhood.android.options.combo.p206db.ComboOrderSalesTax;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.android.options.combo.p207ui.UiComboOrderLeg;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.ModelRoomConverters;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.IpoAccessStatus;
import com.robinhood.models.p320db.IssuerType;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OptionState;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p320db.ShortSaleLocateAvailability;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.room.CommonRoomConverters;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Flow;
import okhttp3.HttpUrl;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: ComboOrderDao_Impl.kt */
@Metadata(m3635d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 h2\u00020\u0001:\u0001hB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0014\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J-\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J1\u0010\u0018\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r0\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J1\u0010\u001a\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\r0\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\"H\u0014¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020\u00102\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\"H\u0014¢\u0006\u0004\b(\u0010%J\u001d\u0010*\u001a\u00020\u00102\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\"H\u0014¢\u0006\u0004\b*\u0010%J\u001d\u0010,\u001a\u00020\u00102\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190\"H\u0014¢\u0006\u0004\b,\u0010%J\u001d\u00100\u001a\u00020\u00102\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00100\u001a\u00020\u00102\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00103J)\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020804072\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u000108072\u0006\u0010;\u001a\u000205H\u0016¢\u0006\u0004\b<\u0010=J+\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020804072\u0006\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u000205H\u0016¢\u0006\u0004\b@\u0010AJ1\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020804072\u0006\u0010>\u001a\u00020\f2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0BH\u0016¢\u0006\u0004\bE\u0010FJ+\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020804072\u0006\u0010>\u001a\u00020\f2\u0006\u0010G\u001a\u000205H\u0016¢\u0006\u0004\bH\u0010AJc\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020804072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020C0B2\b\u0010J\u001a\u0004\u0018\u0001052\u0006\u0010L\u001a\u00020K2\b\u0010M\u001a\u0004\u0018\u00010K2\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020P2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\f0BH\u0016¢\u0006\u0004\bS\u0010TJk\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020804072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020C0B2\b\u0010J\u001a\u0004\u0018\u0001052\u0006\u0010L\u001a\u00020K2\b\u0010M\u001a\u0004\u0018\u00010K2\u0006\u0010U\u001a\u00020K2\u0006\u0010V\u001a\u0002052\u0006\u0010Q\u001a\u00020P2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\f0BH\u0016¢\u0006\u0004\bW\u0010XJs\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020804072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020C0B2\b\u0010J\u001a\u0004\u0018\u0001052\u0006\u0010L\u001a\u00020K2\b\u0010M\u001a\u0004\u0018\u00010K2\u0006\u0010U\u001a\u00020K2\u0006\u0010V\u001a\u0002052\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020P2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\f0BH\u0016¢\u0006\u0004\bY\u0010ZJs\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020804072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020C0B2\b\u0010J\u001a\u0004\u0018\u0001052\u0006\u0010L\u001a\u00020K2\b\u0010M\u001a\u0004\u0018\u00010K2\u0006\u0010U\u001a\u00020K2\u0006\u0010V\u001a\u0002052\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020P2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\f0BH\u0016¢\u0006\u0004\b[\u0010ZJW\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020C0B2\b\u0010J\u001a\u0004\u0018\u0001052\u0006\u0010L\u001a\u00020K2\b\u0010M\u001a\u0004\u0018\u00010K2\u0006\u0010Q\u001a\u00020P2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\f0BH\u0016¢\u0006\u0004\b\\\u0010]Jg\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020C0B2\b\u0010J\u001a\u0004\u0018\u0001052\u0006\u0010L\u001a\u00020K2\b\u0010M\u001a\u0004\u0018\u00010K2\u0006\u0010U\u001a\u00020K2\u0006\u0010V\u001a\u0002052\u0006\u0010Q\u001a\u00020P2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\f0BH\u0016¢\u0006\u0004\b^\u0010XR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010_R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001e0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010dR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020&0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010bR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u000e0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010bR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00190`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010d¨\u0006i"}, m3636d2 = {"Lcom/robinhood/android/options/combo/dao/ComboOrderDao_Impl;", "Lcom/robinhood/android/options/combo/dao/ComboOrderDao;", "Landroidx/room/RoomDatabase;", "__db", "<init>", "(Landroidx/room/RoomDatabase;)V", "Lcom/robinhood/utils/room/CommonRoomConverters;", "__commonRoomConverters", "()Lcom/robinhood/utils/room/CommonRoomConverters;", "Landroidx/sqlite/SQLiteConnection;", "_connection", "Landroidx/collection/ArrayMap;", "", "", "Lcom/robinhood/android/options/combo/db/ComboOrderExecution;", "_map", "", "__fetchRelationshipComboOrderExecutionAscomRobinhoodAndroidOptionsComboDbComboOrderExecution", "(Landroidx/sqlite/SQLiteConnection;Landroidx/collection/ArrayMap;)V", "Lcom/robinhood/models/db/OptionInstrument;", "__fetchRelationshipOptionInstrumentAscomRobinhoodModelsDbOptionInstrument", "Lcom/robinhood/models/db/Instrument;", "__fetchRelationshipInstrumentAscomRobinhoodModelsDbInstrument", "Lcom/robinhood/android/options/combo/ui/UiComboOrderLeg;", "__fetchRelationshipComboOrderLegAscomRobinhoodAndroidOptionsComboUiUiComboOrderLeg", "Lcom/robinhood/android/options/combo/db/ComboOrderSalesTax;", "__fetchRelationshipComboOrderSalesTaxAscomRobinhoodAndroidOptionsComboDbComboOrderSalesTax", "Lcom/robinhood/models/dao/ModelRoomConverters;", "__modelRoomConverters", "()Lcom/robinhood/models/dao/ModelRoomConverters;", "Lcom/robinhood/android/options/combo/db/ComboOrder;", Card.Icon.ORDER, "insertOrder", "(Lcom/robinhood/android/options/combo/db/ComboOrder;)V", "", "orders", "insertOrders", "(Ljava/lang/Iterable;)V", "Lcom/robinhood/android/options/combo/db/ComboOrderLeg;", "legs", "insertLegs", "executions", "insertExecutions", "salesTaxes", "insertSalesTaxes", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/options/combo/api/ApiComboOrder;", "result", "insert", "(Lcom/robinhood/models/PaginatedResult;)V", "apiOrder", "(Lcom/robinhood/android/options/combo/api/ApiComboOrder;)V", "", "Ljava/util/UUID;", "comboOrderIds", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "getOrders", "(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", "orderId", "getOrder", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "accountNumber", "optionInstrumentId", "getComboOrdersByOptionInstrument", "(Ljava/lang/String;Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/shared/models/history/shared/OrderState;", "orderStates", "getComboOrdersByOrderState", "(Ljava/lang/String;Ljava/util/Set;)Lkotlinx/coroutines/flow/Flow;", "aggregateOptionPositionId", "getComboOrdersByAggregatePosition", "states", "instrumentId", "j$/time/Instant", "since", "before", "", "limit", "", "isFilteringByAccountNumber", "accountNumbers", "getLatest", "(Ljava/util/Set;Ljava/util/UUID;Lj$/time/Instant;Lj$/time/Instant;IZLjava/util/Set;)Lkotlinx/coroutines/flow/Flow;", "createdAt", "id", "get", "(Ljava/util/Set;Ljava/util/UUID;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/UUID;ZLjava/util/Set;)Lkotlinx/coroutines/flow/Flow;", "getEarlier", "(Ljava/util/Set;Ljava/util/UUID;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/UUID;IZLjava/util/Set;)Lkotlinx/coroutines/flow/Flow;", "getLater", "countTotal", "(Ljava/util/Set;Ljava/util/UUID;Lj$/time/Instant;Lj$/time/Instant;ZLjava/util/Set;)Lkotlinx/coroutines/flow/Flow;", "countLater", "Landroidx/room/RoomDatabase;", "Landroidx/room/EntityInsertAdapter;", "__insertAdapterOfComboOrder", "Landroidx/room/EntityInsertAdapter;", "Lkotlin/Lazy;", "Lkotlin/Lazy;", "__insertAdapterOfComboOrderLeg", "__insertAdapterOfComboOrderExecution", "__insertAdapterOfComboOrderSalesTax", "Companion", "lib-db-room_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComboOrderDao_Impl extends ComboOrderDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy<CommonRoomConverters> __commonRoomConverters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<ComboOrder> __insertAdapterOfComboOrder;
    private final EntityInsertAdapter<ComboOrderExecution> __insertAdapterOfComboOrderExecution;
    private final EntityInsertAdapter<ComboOrderLeg> __insertAdapterOfComboOrderLeg;
    private final EntityInsertAdapter<ComboOrderSalesTax> __insertAdapterOfComboOrderSalesTax;
    private final Lazy<ModelRoomConverters> __modelRoomConverters;

    public ComboOrderDao_Impl(final RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__commonRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComboOrderDao_Impl.__commonRoomConverters$lambda$0(__db);
            }
        });
        this.__modelRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComboOrderDao_Impl.__modelRoomConverters$lambda$1(__db);
            }
        });
        this.__db = __db;
        this.__insertAdapterOfComboOrder = new EntityInsertAdapter<ComboOrder>() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `ComboOrder` (`id`,`accountNumber`,`averageNetPremiumPaid`,`cancelUrl`,`canceledQuantity`,`chainId`,`chainSymbol`,`closingStrategy`,`contractFees`,`createdAt`,`derivedState`,`direction`,`goldSavings`,`isReplaceable`,`netAmount`,`netAmountDirection`,`openingStrategy`,`pendingQuantity`,`premium`,`price`,`processedPremium`,`processedQuantity`,`quantity`,`regulatoryFees`,`stopPrice`,`strategy`,`timeInForce`,`trigger`,`type`,`updatedAt`,`refId`,`processedPremiumDirection`,`estimatedTotalNetAmount`,`estimatedTotalNetAmountDirection`,`formSource`,`equityInstrumentId`,`underlyingSymbol`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, ComboOrder entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                String strUuidToString = ComboOrderDao_Impl.this.__commonRoomConverters().uuidToString(entity.getId());
                if (strUuidToString == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindText(1, strUuidToString);
                }
                statement.bindText(2, entity.getAccountNumber());
                String strBigDecimalToString = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getAverageNetPremiumPaid());
                if (strBigDecimalToString == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindText(3, strBigDecimalToString);
                }
                String cancelUrl = entity.getCancelUrl();
                if (cancelUrl == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindText(4, cancelUrl);
                }
                String strBigDecimalToString2 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getCanceledQuantity());
                if (strBigDecimalToString2 == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindText(5, strBigDecimalToString2);
                }
                String strUuidToString2 = ComboOrderDao_Impl.this.__commonRoomConverters().uuidToString(entity.getChainId());
                if (strUuidToString2 == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindText(6, strUuidToString2);
                }
                statement.bindText(7, entity.getChainSymbol());
                OptionStrategyType closingStrategy = entity.getClosingStrategy();
                OptionStrategyType.Companion companion = OptionStrategyType.INSTANCE;
                String serverValue = companion.toServerValue(closingStrategy);
                if (serverValue == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindText(8, serverValue);
                }
                String strBigDecimalToString3 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getContractFees());
                if (strBigDecimalToString3 == null) {
                    statement.bindNull(9);
                } else {
                    statement.bindText(9, strBigDecimalToString3);
                }
                String strInstantToString = ComboOrderDao_Impl.this.__commonRoomConverters().instantToString(entity.getCreatedAt());
                if (strInstantToString == null) {
                    statement.bindNull(10);
                } else {
                    statement.bindText(10, strInstantToString);
                }
                String serverValue2 = OrderState.INSTANCE.toServerValue(entity.getDerivedState());
                if (serverValue2 == null) {
                    statement.bindNull(11);
                } else {
                    statement.bindText(11, serverValue2);
                }
                OrderDirection.Companion companion2 = OrderDirection.INSTANCE;
                String serverValue3 = companion2.toServerValue(entity.getDirection());
                if (serverValue3 == null) {
                    statement.bindNull(12);
                } else {
                    statement.bindText(12, serverValue3);
                }
                String strBigDecimalToString4 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getGoldSavings());
                if (strBigDecimalToString4 == null) {
                    statement.bindNull(13);
                } else {
                    statement.bindText(13, strBigDecimalToString4);
                }
                statement.bindLong(14, entity.isReplaceable() ? 1L : 0L);
                String strBigDecimalToString5 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getNetAmount());
                if (strBigDecimalToString5 == null) {
                    statement.bindNull(15);
                } else {
                    statement.bindText(15, strBigDecimalToString5);
                }
                String serverValue4 = companion2.toServerValue(entity.getNetAmountDirection());
                if (serverValue4 == null) {
                    statement.bindNull(16);
                } else {
                    statement.bindText(16, serverValue4);
                }
                String serverValue5 = companion.toServerValue(entity.getOpeningStrategy());
                if (serverValue5 == null) {
                    statement.bindNull(17);
                } else {
                    statement.bindText(17, serverValue5);
                }
                String strBigDecimalToString6 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getPendingQuantity());
                if (strBigDecimalToString6 == null) {
                    statement.bindNull(18);
                } else {
                    statement.bindText(18, strBigDecimalToString6);
                }
                String strBigDecimalToString7 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getPremium());
                if (strBigDecimalToString7 == null) {
                    statement.bindNull(19);
                } else {
                    statement.bindText(19, strBigDecimalToString7);
                }
                String strBigDecimalToString8 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getPrice());
                if (strBigDecimalToString8 == null) {
                    statement.bindNull(20);
                } else {
                    statement.bindText(20, strBigDecimalToString8);
                }
                String strBigDecimalToString9 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getProcessedPremium());
                if (strBigDecimalToString9 == null) {
                    statement.bindNull(21);
                } else {
                    statement.bindText(21, strBigDecimalToString9);
                }
                String strBigDecimalToString10 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getProcessedQuantity());
                if (strBigDecimalToString10 == null) {
                    statement.bindNull(22);
                } else {
                    statement.bindText(22, strBigDecimalToString10);
                }
                String strBigDecimalToString11 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getQuantity());
                if (strBigDecimalToString11 == null) {
                    statement.bindNull(23);
                } else {
                    statement.bindText(23, strBigDecimalToString11);
                }
                String strBigDecimalToString12 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getRegulatoryFees());
                if (strBigDecimalToString12 == null) {
                    statement.bindNull(24);
                } else {
                    statement.bindText(24, strBigDecimalToString12);
                }
                String strBigDecimalToString13 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getStopPrice());
                if (strBigDecimalToString13 == null) {
                    statement.bindNull(25);
                } else {
                    statement.bindText(25, strBigDecimalToString13);
                }
                String serverValue6 = companion.toServerValue(entity.getStrategy());
                if (serverValue6 == null) {
                    statement.bindNull(26);
                } else {
                    statement.bindText(26, serverValue6);
                }
                String serverValue7 = OrderTimeInForce.INSTANCE.toServerValue(entity.getTimeInForce());
                if (serverValue7 == null) {
                    statement.bindNull(27);
                } else {
                    statement.bindText(27, serverValue7);
                }
                String serverValue8 = OrderTrigger.INSTANCE.toServerValue(entity.getTrigger());
                if (serverValue8 == null) {
                    statement.bindNull(28);
                } else {
                    statement.bindText(28, serverValue8);
                }
                String serverValue9 = OrderType.INSTANCE.toServerValue(entity.getType());
                if (serverValue9 == null) {
                    statement.bindNull(29);
                } else {
                    statement.bindText(29, serverValue9);
                }
                String strInstantToString2 = ComboOrderDao_Impl.this.__commonRoomConverters().instantToString(entity.getUpdatedAt());
                if (strInstantToString2 == null) {
                    statement.bindNull(30);
                } else {
                    statement.bindText(30, strInstantToString2);
                }
                String strUuidToString3 = ComboOrderDao_Impl.this.__commonRoomConverters().uuidToString(entity.getRefId());
                if (strUuidToString3 == null) {
                    statement.bindNull(31);
                } else {
                    statement.bindText(31, strUuidToString3);
                }
                String serverValue10 = companion2.toServerValue(entity.getProcessedPremiumDirection());
                if (serverValue10 == null) {
                    statement.bindNull(32);
                } else {
                    statement.bindText(32, serverValue10);
                }
                String strBigDecimalToString14 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getEstimatedTotalNetAmount());
                if (strBigDecimalToString14 == null) {
                    statement.bindNull(33);
                } else {
                    statement.bindText(33, strBigDecimalToString14);
                }
                String serverValue11 = companion2.toServerValue(entity.getEstimatedTotalNetAmountDirection());
                if (serverValue11 == null) {
                    statement.bindNull(34);
                } else {
                    statement.bindText(34, serverValue11);
                }
                String serverValue12 = OptionOrder.FormSource.INSTANCE.toServerValue(entity.getFormSource());
                if (serverValue12 == null) {
                    statement.bindNull(35);
                } else {
                    statement.bindText(35, serverValue12);
                }
                String strUuidToString4 = ComboOrderDao_Impl.this.__commonRoomConverters().uuidToString(entity.getEquityInstrumentId());
                if (strUuidToString4 == null) {
                    statement.bindNull(36);
                } else {
                    statement.bindText(36, strUuidToString4);
                }
                statement.bindText(37, entity.getUnderlyingSymbol());
            }
        };
        this.__insertAdapterOfComboOrderLeg = new EntityInsertAdapter<ComboOrderLeg>() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl.2
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `ComboOrderLeg` (`id`,`orderId`,`instrumentId`,`instrumentType`,`positionEffect`,`ratioQuantity`,`side`) VALUES (?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, ComboOrderLeg entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                String strUuidToString = ComboOrderDao_Impl.this.__commonRoomConverters().uuidToString(entity.getId());
                if (strUuidToString == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindText(1, strUuidToString);
                }
                String strUuidToString2 = ComboOrderDao_Impl.this.__commonRoomConverters().uuidToString(entity.getOrderId());
                if (strUuidToString2 == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindText(2, strUuidToString2);
                }
                String strUuidToString3 = ComboOrderDao_Impl.this.__commonRoomConverters().uuidToString(entity.getInstrumentId());
                if (strUuidToString3 == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindText(3, strUuidToString3);
                }
                String serverValue = ApiComboOrder.InstrumentType.INSTANCE.toServerValue(entity.getInstrumentType());
                if (serverValue == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindText(4, serverValue);
                }
                String serverValue2 = OrderPositionEffect.INSTANCE.toServerValue(entity.getPositionEffect());
                if (serverValue2 == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindText(5, serverValue2);
                }
                statement.bindLong(6, entity.getRatioQuantity());
                String serverValue3 = OrderSide.INSTANCE.toServerValue(entity.getSide());
                if (serverValue3 == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindText(7, serverValue3);
                }
            }
        };
        this.__insertAdapterOfComboOrderExecution = new EntityInsertAdapter<ComboOrderExecution>() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl.3
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `ComboOrderExecution` (`id`,`legId`,`price`,`processedQuantity`,`quantity`,`settlementDate`,`timestamp`) VALUES (?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, ComboOrderExecution entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                String strUuidToString = ComboOrderDao_Impl.this.__commonRoomConverters().uuidToString(entity.getId());
                if (strUuidToString == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindText(1, strUuidToString);
                }
                String strUuidToString2 = ComboOrderDao_Impl.this.__commonRoomConverters().uuidToString(entity.getLegId());
                if (strUuidToString2 == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindText(2, strUuidToString2);
                }
                String strBigDecimalToString = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getPrice());
                if (strBigDecimalToString == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindText(3, strBigDecimalToString);
                }
                String strBigDecimalToString2 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getProcessedQuantity());
                if (strBigDecimalToString2 == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindText(4, strBigDecimalToString2);
                }
                String strBigDecimalToString3 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getQuantity());
                if (strBigDecimalToString3 == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindText(5, strBigDecimalToString3);
                }
                String strLocalDateToString = ComboOrderDao_Impl.this.__commonRoomConverters().localDateToString(entity.getSettlementDate());
                if (strLocalDateToString == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindText(6, strLocalDateToString);
                }
                String strInstantToString = ComboOrderDao_Impl.this.__commonRoomConverters().instantToString(entity.getTimestamp());
                if (strInstantToString == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindText(7, strInstantToString);
                }
            }
        };
        this.__insertAdapterOfComboOrderSalesTax = new EntityInsertAdapter<ComboOrderSalesTax>() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl.4
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `ComboOrderSalesTax` (`id`,`orderId`,`type`,`displayName`,`feeRate`,`fee`) VALUES (?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, ComboOrderSalesTax entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                String strUuidToString = ComboOrderDao_Impl.this.__commonRoomConverters().uuidToString(entity.getId());
                if (strUuidToString == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindText(1, strUuidToString);
                }
                String strUuidToString2 = ComboOrderDao_Impl.this.__commonRoomConverters().uuidToString(entity.getOrderId());
                if (strUuidToString2 == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindText(2, strUuidToString2);
                }
                statement.bindText(3, entity.getType());
                statement.bindText(4, entity.getDisplayName());
                String strBigDecimalToString = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getFeeRate());
                if (strBigDecimalToString == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindText(5, strBigDecimalToString);
                }
                String strBigDecimalToString2 = ComboOrderDao_Impl.this.__commonRoomConverters().bigDecimalToString(entity.getFee());
                if (strBigDecimalToString2 == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindText(6, strBigDecimalToString2);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonRoomConverters __commonRoomConverters$lambda$0(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(CommonRoomConverters.class));
        if (typeConverter != null) {
            return (CommonRoomConverters) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ModelRoomConverters __modelRoomConverters$lambda$1(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(ModelRoomConverters.class));
        if (typeConverter != null) {
            return (ModelRoomConverters) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    protected void insertOrder(final ComboOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.insertOrder$lambda$2(this.f$0, order, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertOrder$lambda$2(ComboOrderDao_Impl comboOrderDao_Impl, ComboOrder comboOrder, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        comboOrderDao_Impl.__insertAdapterOfComboOrder.insert(_connection, (SQLiteConnection) comboOrder);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    protected void insertOrders(final Iterable<ComboOrder> orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.insertOrders$lambda$3(this.f$0, orders, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertOrders$lambda$3(ComboOrderDao_Impl comboOrderDao_Impl, Iterable iterable, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        comboOrderDao_Impl.__insertAdapterOfComboOrder.insert(_connection, (Iterable<? extends ComboOrder>) iterable);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    protected void insertLegs(final Iterable<ComboOrderLeg> legs) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.insertLegs$lambda$4(this.f$0, legs, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertLegs$lambda$4(ComboOrderDao_Impl comboOrderDao_Impl, Iterable iterable, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        comboOrderDao_Impl.__insertAdapterOfComboOrderLeg.insert(_connection, (Iterable<? extends ComboOrderLeg>) iterable);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    protected void insertExecutions(final Iterable<ComboOrderExecution> executions) {
        Intrinsics.checkNotNullParameter(executions, "executions");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.insertExecutions$lambda$5(this.f$0, executions, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertExecutions$lambda$5(ComboOrderDao_Impl comboOrderDao_Impl, Iterable iterable, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        comboOrderDao_Impl.__insertAdapterOfComboOrderExecution.insert(_connection, (Iterable<? extends ComboOrderExecution>) iterable);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    protected void insertSalesTaxes(final Iterable<ComboOrderSalesTax> salesTaxes) {
        Intrinsics.checkNotNullParameter(salesTaxes, "salesTaxes");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.insertSalesTaxes$lambda$6(this.f$0, salesTaxes, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertSalesTaxes$lambda$6(ComboOrderDao_Impl comboOrderDao_Impl, Iterable iterable, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        comboOrderDao_Impl.__insertAdapterOfComboOrderSalesTax.insert(_connection, (Iterable<? extends ComboOrderSalesTax>) iterable);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    public void insert(final PaginatedResult<ApiComboOrder> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.insert$lambda$7(this.f$0, result, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$7(ComboOrderDao_Impl comboOrderDao_Impl, PaginatedResult paginatedResult, SQLiteConnection sQLiteConnection) {
        Intrinsics.checkNotNullParameter(sQLiteConnection, "<unused var>");
        super.insert((PaginatedResult<ApiComboOrder>) paginatedResult);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    public void insert(final ApiComboOrder apiOrder) {
        Intrinsics.checkNotNullParameter(apiOrder, "apiOrder");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.insert$lambda$8(this.f$0, apiOrder, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$8(ComboOrderDao_Impl comboOrderDao_Impl, ApiComboOrder apiComboOrder, SQLiteConnection sQLiteConnection) {
        Intrinsics.checkNotNullParameter(sQLiteConnection, "<unused var>");
        super.insert(apiComboOrder);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    public Flow<List<UiComboOrder>> getOrders(final List<UUID> comboOrderIds) {
        Intrinsics.checkNotNullParameter(comboOrderIds, "comboOrderIds");
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        SELECT *");
        sb.append("\n");
        sb.append("        FROM UiComboOrder");
        sb.append("\n");
        sb.append("        WHERE id IN (");
        StringUtil.appendPlaceholders(sb, comboOrderIds.size());
        sb.append(")");
        sb.append("\n");
        sb.append("        ORDER BY updatedAt DESC");
        sb.append("\n");
        sb.append("        ");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return FlowBuilder.createFlow(this.__db, true, new String[]{"ComboOrderExecution", "OptionInstrument", "Instrument", "ComboOrderLeg", "ComboOrderSalesTax", "UiComboOrder"}, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.getOrders$lambda$9(string2, comboOrderIds, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:314:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0762 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x002c, B:12:0x0036, B:11:0x0033, B:13:0x0039, B:14:0x026f, B:16:0x0275, B:18:0x0281, B:20:0x028e, B:22:0x0298, B:24:0x02a5, B:25:0x02b7, B:27:0x02bd, B:31:0x02c9, B:34:0x02d5, B:39:0x02e8, B:42:0x02f4, B:46:0x0303, B:51:0x0312, B:53:0x031c, B:57:0x0328, B:59:0x0332, B:63:0x0342, B:68:0x0357, B:73:0x0370, B:77:0x037e, B:82:0x0393, B:84:0x039b, B:89:0x03ac, B:93:0x03ba, B:98:0x03cf, B:103:0x03ea, B:108:0x03fb, B:110:0x0405, B:114:0x0413, B:116:0x0419, B:120:0x042d, B:125:0x0448, B:127:0x0452, B:132:0x0463, B:137:0x047c, B:142:0x0495, B:144:0x049f, B:149:0x04b0, B:151:0x04ba, B:156:0x04cb, B:158:0x04d5, B:163:0x04e6, B:165:0x04f0, B:170:0x0501, B:174:0x0517, B:179:0x052c, B:181:0x0534, B:186:0x0545, B:188:0x054d, B:193:0x055e, B:195:0x0566, B:200:0x0577, B:202:0x0581, B:207:0x0592, B:211:0x05a8, B:213:0x05ae, B:218:0x05c5, B:220:0x05cf, B:224:0x05dd, B:226:0x05e3, B:230:0x05f1, B:232:0x05f9, B:237:0x060a, B:239:0x0614, B:244:0x0638, B:249:0x0647, B:254:0x0660, B:256:0x066a, B:261:0x067b, B:263:0x0683, B:268:0x0694, B:270:0x069e, B:275:0x06af, B:277:0x06b7, B:282:0x06c8, B:284:0x06d2, B:289:0x06e5, B:294:0x0700, B:296:0x070a, B:301:0x0727, B:303:0x072d, B:305:0x0735, B:312:0x0756, B:317:0x076b, B:319:0x0775, B:324:0x0784, B:326:0x078e, B:331:0x079d, B:333:0x07a7, B:334:0x07ae, B:338:0x07c5, B:342:0x07d1, B:346:0x07e3, B:348:0x07e9, B:353:0x07fe, B:358:0x080d, B:360:0x0817, B:365:0x0828, B:367:0x0832, B:371:0x0840, B:373:0x0846, B:378:0x085d, B:380:0x0867, B:384:0x0875, B:389:0x088e, B:391:0x0898, B:396:0x08a9, B:398:0x08b3, B:402:0x08c1, B:407:0x08ee, B:409:0x08f8, B:414:0x090c, B:419:0x092f, B:423:0x095c, B:425:0x0962, B:426:0x09c5, B:427:0x09ca, B:422:0x0954, B:418:0x0926, B:413:0x0905, B:428:0x09cb, B:429:0x09d0, B:406:0x08e5, B:401:0x08bd, B:430:0x09d1, B:431:0x09d6, B:395:0x08a4, B:432:0x09d7, B:433:0x09dc, B:388:0x0889, B:383:0x0871, B:434:0x09dd, B:435:0x09e2, B:377:0x0854, B:436:0x09e3, B:437:0x09e8, B:370:0x083c, B:438:0x09e9, B:439:0x09ee, B:364:0x0823, B:440:0x09ef, B:441:0x09f4, B:357:0x0808, B:442:0x09f5, B:443:0x09fa, B:345:0x07db, B:444:0x09fb, B:445:0x0a00, B:337:0x07c1, B:446:0x0a01, B:447:0x0a06, B:330:0x0798, B:448:0x0a07, B:449:0x0a0c, B:323:0x077f, B:450:0x0a0d, B:451:0x0a12, B:316:0x0762, B:300:0x0719, B:452:0x0a13, B:453:0x0a18, B:293:0x06f7, B:454:0x0a19, B:455:0x0a1e, B:281:0x06c3, B:456:0x0a1f, B:457:0x0a26, B:274:0x06aa, B:458:0x0a27, B:459:0x0a2c, B:267:0x068f, B:460:0x0a2d, B:461:0x0a34, B:260:0x0676, B:462:0x0a35, B:463:0x0a3c, B:253:0x065b, B:248:0x0642, B:464:0x0a3d, B:465:0x0a42, B:236:0x0605, B:466:0x0a43, B:467:0x0a4a, B:229:0x05ed, B:468:0x0a4b, B:469:0x0a50, B:223:0x05d9, B:470:0x0a51, B:471:0x0a56, B:217:0x05bc, B:472:0x0a57, B:473:0x0a5c, B:210:0x05a4, B:206:0x058d, B:474:0x0a5d, B:475:0x0a62, B:199:0x0572, B:476:0x0a63, B:477:0x0a6a, B:192:0x0559, B:478:0x0a6b, B:479:0x0a72, B:185:0x0540, B:480:0x0a73, B:481:0x0a7a, B:178:0x0527, B:173:0x0513, B:169:0x04fc, B:482:0x0a7b, B:483:0x0a80, B:162:0x04e1, B:484:0x0a81, B:485:0x0a86, B:155:0x04c6, B:486:0x0a87, B:487:0x0a8c, B:148:0x04ab, B:488:0x0a8d, B:489:0x0a92, B:141:0x0490, B:136:0x0477, B:131:0x045e, B:490:0x0a93, B:491:0x0a98, B:124:0x043f, B:119:0x0425, B:492:0x0a99, B:493:0x0a9e, B:113:0x040f, B:494:0x0a9f, B:495:0x0aa4, B:107:0x03f4, B:97:0x03c6, B:496:0x0aa5, B:497:0x0aaa, B:88:0x03a7, B:498:0x0aab, B:499:0x0ab2, B:81:0x038a, B:500:0x0ab3, B:501:0x0ab8, B:72:0x036b, B:67:0x0352, B:62:0x033e, B:502:0x0ab9, B:503:0x0abe, B:56:0x0324, B:504:0x0abf, B:505:0x0ac4, B:50:0x030d, B:45:0x02fd, B:506:0x0ac5, B:507:0x0aca, B:38:0x02e3, B:508:0x0acb, B:509:0x0ad0, B:30:0x02c5), top: B:514:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0775 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x002c, B:12:0x0036, B:11:0x0033, B:13:0x0039, B:14:0x026f, B:16:0x0275, B:18:0x0281, B:20:0x028e, B:22:0x0298, B:24:0x02a5, B:25:0x02b7, B:27:0x02bd, B:31:0x02c9, B:34:0x02d5, B:39:0x02e8, B:42:0x02f4, B:46:0x0303, B:51:0x0312, B:53:0x031c, B:57:0x0328, B:59:0x0332, B:63:0x0342, B:68:0x0357, B:73:0x0370, B:77:0x037e, B:82:0x0393, B:84:0x039b, B:89:0x03ac, B:93:0x03ba, B:98:0x03cf, B:103:0x03ea, B:108:0x03fb, B:110:0x0405, B:114:0x0413, B:116:0x0419, B:120:0x042d, B:125:0x0448, B:127:0x0452, B:132:0x0463, B:137:0x047c, B:142:0x0495, B:144:0x049f, B:149:0x04b0, B:151:0x04ba, B:156:0x04cb, B:158:0x04d5, B:163:0x04e6, B:165:0x04f0, B:170:0x0501, B:174:0x0517, B:179:0x052c, B:181:0x0534, B:186:0x0545, B:188:0x054d, B:193:0x055e, B:195:0x0566, B:200:0x0577, B:202:0x0581, B:207:0x0592, B:211:0x05a8, B:213:0x05ae, B:218:0x05c5, B:220:0x05cf, B:224:0x05dd, B:226:0x05e3, B:230:0x05f1, B:232:0x05f9, B:237:0x060a, B:239:0x0614, B:244:0x0638, B:249:0x0647, B:254:0x0660, B:256:0x066a, B:261:0x067b, B:263:0x0683, B:268:0x0694, B:270:0x069e, B:275:0x06af, B:277:0x06b7, B:282:0x06c8, B:284:0x06d2, B:289:0x06e5, B:294:0x0700, B:296:0x070a, B:301:0x0727, B:303:0x072d, B:305:0x0735, B:312:0x0756, B:317:0x076b, B:319:0x0775, B:324:0x0784, B:326:0x078e, B:331:0x079d, B:333:0x07a7, B:334:0x07ae, B:338:0x07c5, B:342:0x07d1, B:346:0x07e3, B:348:0x07e9, B:353:0x07fe, B:358:0x080d, B:360:0x0817, B:365:0x0828, B:367:0x0832, B:371:0x0840, B:373:0x0846, B:378:0x085d, B:380:0x0867, B:384:0x0875, B:389:0x088e, B:391:0x0898, B:396:0x08a9, B:398:0x08b3, B:402:0x08c1, B:407:0x08ee, B:409:0x08f8, B:414:0x090c, B:419:0x092f, B:423:0x095c, B:425:0x0962, B:426:0x09c5, B:427:0x09ca, B:422:0x0954, B:418:0x0926, B:413:0x0905, B:428:0x09cb, B:429:0x09d0, B:406:0x08e5, B:401:0x08bd, B:430:0x09d1, B:431:0x09d6, B:395:0x08a4, B:432:0x09d7, B:433:0x09dc, B:388:0x0889, B:383:0x0871, B:434:0x09dd, B:435:0x09e2, B:377:0x0854, B:436:0x09e3, B:437:0x09e8, B:370:0x083c, B:438:0x09e9, B:439:0x09ee, B:364:0x0823, B:440:0x09ef, B:441:0x09f4, B:357:0x0808, B:442:0x09f5, B:443:0x09fa, B:345:0x07db, B:444:0x09fb, B:445:0x0a00, B:337:0x07c1, B:446:0x0a01, B:447:0x0a06, B:330:0x0798, B:448:0x0a07, B:449:0x0a0c, B:323:0x077f, B:450:0x0a0d, B:451:0x0a12, B:316:0x0762, B:300:0x0719, B:452:0x0a13, B:453:0x0a18, B:293:0x06f7, B:454:0x0a19, B:455:0x0a1e, B:281:0x06c3, B:456:0x0a1f, B:457:0x0a26, B:274:0x06aa, B:458:0x0a27, B:459:0x0a2c, B:267:0x068f, B:460:0x0a2d, B:461:0x0a34, B:260:0x0676, B:462:0x0a35, B:463:0x0a3c, B:253:0x065b, B:248:0x0642, B:464:0x0a3d, B:465:0x0a42, B:236:0x0605, B:466:0x0a43, B:467:0x0a4a, B:229:0x05ed, B:468:0x0a4b, B:469:0x0a50, B:223:0x05d9, B:470:0x0a51, B:471:0x0a56, B:217:0x05bc, B:472:0x0a57, B:473:0x0a5c, B:210:0x05a4, B:206:0x058d, B:474:0x0a5d, B:475:0x0a62, B:199:0x0572, B:476:0x0a63, B:477:0x0a6a, B:192:0x0559, B:478:0x0a6b, B:479:0x0a72, B:185:0x0540, B:480:0x0a73, B:481:0x0a7a, B:178:0x0527, B:173:0x0513, B:169:0x04fc, B:482:0x0a7b, B:483:0x0a80, B:162:0x04e1, B:484:0x0a81, B:485:0x0a86, B:155:0x04c6, B:486:0x0a87, B:487:0x0a8c, B:148:0x04ab, B:488:0x0a8d, B:489:0x0a92, B:141:0x0490, B:136:0x0477, B:131:0x045e, B:490:0x0a93, B:491:0x0a98, B:124:0x043f, B:119:0x0425, B:492:0x0a99, B:493:0x0a9e, B:113:0x040f, B:494:0x0a9f, B:495:0x0aa4, B:107:0x03f4, B:97:0x03c6, B:496:0x0aa5, B:497:0x0aaa, B:88:0x03a7, B:498:0x0aab, B:499:0x0ab2, B:81:0x038a, B:500:0x0ab3, B:501:0x0ab8, B:72:0x036b, B:67:0x0352, B:62:0x033e, B:502:0x0ab9, B:503:0x0abe, B:56:0x0324, B:504:0x0abf, B:505:0x0ac4, B:50:0x030d, B:45:0x02fd, B:506:0x0ac5, B:507:0x0aca, B:38:0x02e3, B:508:0x0acb, B:509:0x0ad0, B:30:0x02c5), top: B:514:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07c1 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x002c, B:12:0x0036, B:11:0x0033, B:13:0x0039, B:14:0x026f, B:16:0x0275, B:18:0x0281, B:20:0x028e, B:22:0x0298, B:24:0x02a5, B:25:0x02b7, B:27:0x02bd, B:31:0x02c9, B:34:0x02d5, B:39:0x02e8, B:42:0x02f4, B:46:0x0303, B:51:0x0312, B:53:0x031c, B:57:0x0328, B:59:0x0332, B:63:0x0342, B:68:0x0357, B:73:0x0370, B:77:0x037e, B:82:0x0393, B:84:0x039b, B:89:0x03ac, B:93:0x03ba, B:98:0x03cf, B:103:0x03ea, B:108:0x03fb, B:110:0x0405, B:114:0x0413, B:116:0x0419, B:120:0x042d, B:125:0x0448, B:127:0x0452, B:132:0x0463, B:137:0x047c, B:142:0x0495, B:144:0x049f, B:149:0x04b0, B:151:0x04ba, B:156:0x04cb, B:158:0x04d5, B:163:0x04e6, B:165:0x04f0, B:170:0x0501, B:174:0x0517, B:179:0x052c, B:181:0x0534, B:186:0x0545, B:188:0x054d, B:193:0x055e, B:195:0x0566, B:200:0x0577, B:202:0x0581, B:207:0x0592, B:211:0x05a8, B:213:0x05ae, B:218:0x05c5, B:220:0x05cf, B:224:0x05dd, B:226:0x05e3, B:230:0x05f1, B:232:0x05f9, B:237:0x060a, B:239:0x0614, B:244:0x0638, B:249:0x0647, B:254:0x0660, B:256:0x066a, B:261:0x067b, B:263:0x0683, B:268:0x0694, B:270:0x069e, B:275:0x06af, B:277:0x06b7, B:282:0x06c8, B:284:0x06d2, B:289:0x06e5, B:294:0x0700, B:296:0x070a, B:301:0x0727, B:303:0x072d, B:305:0x0735, B:312:0x0756, B:317:0x076b, B:319:0x0775, B:324:0x0784, B:326:0x078e, B:331:0x079d, B:333:0x07a7, B:334:0x07ae, B:338:0x07c5, B:342:0x07d1, B:346:0x07e3, B:348:0x07e9, B:353:0x07fe, B:358:0x080d, B:360:0x0817, B:365:0x0828, B:367:0x0832, B:371:0x0840, B:373:0x0846, B:378:0x085d, B:380:0x0867, B:384:0x0875, B:389:0x088e, B:391:0x0898, B:396:0x08a9, B:398:0x08b3, B:402:0x08c1, B:407:0x08ee, B:409:0x08f8, B:414:0x090c, B:419:0x092f, B:423:0x095c, B:425:0x0962, B:426:0x09c5, B:427:0x09ca, B:422:0x0954, B:418:0x0926, B:413:0x0905, B:428:0x09cb, B:429:0x09d0, B:406:0x08e5, B:401:0x08bd, B:430:0x09d1, B:431:0x09d6, B:395:0x08a4, B:432:0x09d7, B:433:0x09dc, B:388:0x0889, B:383:0x0871, B:434:0x09dd, B:435:0x09e2, B:377:0x0854, B:436:0x09e3, B:437:0x09e8, B:370:0x083c, B:438:0x09e9, B:439:0x09ee, B:364:0x0823, B:440:0x09ef, B:441:0x09f4, B:357:0x0808, B:442:0x09f5, B:443:0x09fa, B:345:0x07db, B:444:0x09fb, B:445:0x0a00, B:337:0x07c1, B:446:0x0a01, B:447:0x0a06, B:330:0x0798, B:448:0x0a07, B:449:0x0a0c, B:323:0x077f, B:450:0x0a0d, B:451:0x0a12, B:316:0x0762, B:300:0x0719, B:452:0x0a13, B:453:0x0a18, B:293:0x06f7, B:454:0x0a19, B:455:0x0a1e, B:281:0x06c3, B:456:0x0a1f, B:457:0x0a26, B:274:0x06aa, B:458:0x0a27, B:459:0x0a2c, B:267:0x068f, B:460:0x0a2d, B:461:0x0a34, B:260:0x0676, B:462:0x0a35, B:463:0x0a3c, B:253:0x065b, B:248:0x0642, B:464:0x0a3d, B:465:0x0a42, B:236:0x0605, B:466:0x0a43, B:467:0x0a4a, B:229:0x05ed, B:468:0x0a4b, B:469:0x0a50, B:223:0x05d9, B:470:0x0a51, B:471:0x0a56, B:217:0x05bc, B:472:0x0a57, B:473:0x0a5c, B:210:0x05a4, B:206:0x058d, B:474:0x0a5d, B:475:0x0a62, B:199:0x0572, B:476:0x0a63, B:477:0x0a6a, B:192:0x0559, B:478:0x0a6b, B:479:0x0a72, B:185:0x0540, B:480:0x0a73, B:481:0x0a7a, B:178:0x0527, B:173:0x0513, B:169:0x04fc, B:482:0x0a7b, B:483:0x0a80, B:162:0x04e1, B:484:0x0a81, B:485:0x0a86, B:155:0x04c6, B:486:0x0a87, B:487:0x0a8c, B:148:0x04ab, B:488:0x0a8d, B:489:0x0a92, B:141:0x0490, B:136:0x0477, B:131:0x045e, B:490:0x0a93, B:491:0x0a98, B:124:0x043f, B:119:0x0425, B:492:0x0a99, B:493:0x0a9e, B:113:0x040f, B:494:0x0a9f, B:495:0x0aa4, B:107:0x03f4, B:97:0x03c6, B:496:0x0aa5, B:497:0x0aaa, B:88:0x03a7, B:498:0x0aab, B:499:0x0ab2, B:81:0x038a, B:500:0x0ab3, B:501:0x0ab8, B:72:0x036b, B:67:0x0352, B:62:0x033e, B:502:0x0ab9, B:503:0x0abe, B:56:0x0324, B:504:0x0abf, B:505:0x0ac4, B:50:0x030d, B:45:0x02fd, B:506:0x0ac5, B:507:0x0aca, B:38:0x02e3, B:508:0x0acb, B:509:0x0ad0, B:30:0x02c5), top: B:514:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0a0d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:554:0x09fb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List getOrders$lambda$9(String str, List list, ComboOrderDao_Impl comboOrderDao_Impl, SQLiteConnection _connection) {
        int i;
        String text;
        String text2;
        int i2;
        String text3;
        String text4;
        String text5;
        String text6;
        Integer numValueOf;
        int i3;
        int i4;
        OptionChain.TickRequirements tickRequirements;
        Tradability tradabilityFromServerValue;
        String text7;
        String text8;
        String text9;
        String text10;
        String text11;
        String text12;
        BigDecimal bigDecimalStringToBigDecimal;
        int i5;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i6 = 1;
            while (it.hasNext()) {
                String strUuidToString = comboOrderDao_Impl.__commonRoomConverters().uuidToString((UUID) it.next());
                if (strUuidToString == null) {
                    sQLiteStatementPrepare.bindNull(i6);
                } else {
                    sQLiteStatementPrepare.bindText(i6, strUuidToString);
                }
                i6++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "averageNetPremiumPaid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancelUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canceledQuantity");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSymbol");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closingStrategy");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contractFees");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivedState");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "direction");
            String str2 = "getValue(...)";
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "goldSavings");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isReplaceable");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmount");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmountDirection");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openingStrategy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pendingQuantity");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "premium");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AnalyticsStrings.TAG_SORT_ORDER_PRICE);
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremium");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedQuantity");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "regulatoryFees");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stopPrice");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "strategy");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInForce");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedAt");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "refId");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremiumDirection");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmount");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmountDirection");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "formSource");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equityInstrumentId");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "underlyingSymbol");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_canOpenPosition");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_cashComponent");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_expirationDates");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_extendedHoursState");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_lateCloseState");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickAboveCutoff");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickBelowCutoff");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_cutoffPrice");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_receivedAt");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_settleOnOpen");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_symbol");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_tradeValueMultiplier");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_selloutTimeToExpiration");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_affiliateTradability");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_allDayTradability");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_carRequired");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_dayTradeRatio");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_defaultPresetPercentLimit");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_fractionalTradability");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_id");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_listDate");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_maintenanceRatio");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_marginInitialRatio");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_minTickSize");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_name");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_otcMarketTier");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_receivedAt");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_simpleName");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_state");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_symbol");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_tradableChainId");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_type");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_notionalEstimatedQuantityDecimals");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_shortSaleTradability");
            ArrayMap<String, List<UiComboOrderLeg>> arrayMap = new ArrayMap<>();
            int i7 = columnIndexOrThrow12;
            ArrayMap<String, List<ComboOrderSalesTax>> arrayMap2 = new ArrayMap<>();
            while (sQLiteStatementPrepare.step()) {
                int i8 = columnIndexOrThrow11;
                String text13 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (arrayMap.containsKey(text13)) {
                    i5 = columnIndexOrThrow10;
                } else {
                    i5 = columnIndexOrThrow10;
                    arrayMap.put(text13, new ArrayList());
                }
                String text14 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!arrayMap2.containsKey(text14)) {
                    arrayMap2.put(text14, new ArrayList());
                }
                columnIndexOrThrow11 = i8;
                columnIndexOrThrow10 = i5;
            }
            int i9 = columnIndexOrThrow10;
            int i10 = columnIndexOrThrow11;
            sQLiteStatementPrepare.reset();
            comboOrderDao_Impl.m2217x4e5ab2fa(_connection, arrayMap);
            comboOrderDao_Impl.m2219x367d9594(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text15 = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                int i11 = columnIndexOrThrow2;
                BigDecimal bigDecimalStringToBigDecimal2 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (bigDecimalStringToBigDecimal2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                int i12 = columnIndexOrThrow3;
                BigDecimal bigDecimalStringToBigDecimal3 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (bigDecimalStringToBigDecimal3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                UUID uuidStringToUuid2 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (uuidStringToUuid2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text17 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                OptionStrategyType.Companion companion = OptionStrategyType.INSTANCE;
                OptionStrategyType optionStrategyTypeFromServerValue = companion.fromServerValue(text18);
                int i13 = columnIndexOrThrow4;
                BigDecimal bigDecimalStringToBigDecimal4 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                int i14 = i9;
                i9 = i14;
                Instant instantStringToInstant = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i14) ? null : sQLiteStatementPrepare.getText(i14));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i15 = i10;
                if (sQLiteStatementPrepare.isNull(i15)) {
                    i = i15;
                    text = null;
                } else {
                    i = i15;
                    text = sQLiteStatementPrepare.getText(i15);
                }
                int i16 = columnIndexOrThrow5;
                OrderState orderStateFromServerValue = OrderState.INSTANCE.fromServerValue(text);
                if (orderStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.shared.models.history.shared.OrderState', but it was NULL.");
                }
                int i17 = i7;
                String text19 = sQLiteStatementPrepare.isNull(i17) ? null : sQLiteStatementPrepare.getText(i17);
                i7 = i17;
                OrderDirection.Companion companion2 = OrderDirection.INSTANCE;
                OrderDirection orderDirectionFromServerValue = companion2.fromServerValue(text19);
                if (orderDirectionFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i18 = columnIndexOrThrow6;
                int i19 = columnIndexOrThrow13;
                if (sQLiteStatementPrepare.isNull(i19)) {
                    columnIndexOrThrow13 = i19;
                    text2 = null;
                } else {
                    columnIndexOrThrow13 = i19;
                    text2 = sQLiteStatementPrepare.getText(i19);
                }
                int i20 = columnIndexOrThrow7;
                BigDecimal bigDecimalStringToBigDecimal5 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text2);
                int i21 = columnIndexOrThrow14;
                int i22 = columnIndexOrThrow8;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i21)) != 0;
                int i23 = columnIndexOrThrow15;
                BigDecimal bigDecimalStringToBigDecimal6 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23));
                if (bigDecimalStringToBigDecimal6 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i24 = columnIndexOrThrow16;
                OrderDirection orderDirectionFromServerValue2 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i24) ? null : sQLiteStatementPrepare.getText(i24));
                if (orderDirectionFromServerValue2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i25 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i25)) {
                    i2 = i24;
                    text3 = null;
                } else {
                    i2 = i24;
                    text3 = sQLiteStatementPrepare.getText(i25);
                }
                OptionStrategyType optionStrategyTypeFromServerValue2 = companion.fromServerValue(text3);
                int i26 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i26)) {
                    columnIndexOrThrow18 = i26;
                    text4 = null;
                } else {
                    columnIndexOrThrow18 = i26;
                    text4 = sQLiteStatementPrepare.getText(i26);
                }
                BigDecimal bigDecimalStringToBigDecimal7 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text4);
                if (bigDecimalStringToBigDecimal7 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i27 = columnIndexOrThrow19;
                columnIndexOrThrow19 = i27;
                BigDecimal bigDecimalStringToBigDecimal8 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i27) ? null : sQLiteStatementPrepare.getText(i27));
                int i28 = columnIndexOrThrow20;
                columnIndexOrThrow20 = i28;
                BigDecimal bigDecimalStringToBigDecimal9 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i28) ? null : sQLiteStatementPrepare.getText(i28));
                int i29 = columnIndexOrThrow21;
                columnIndexOrThrow21 = i29;
                BigDecimal bigDecimalStringToBigDecimal10 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29));
                if (bigDecimalStringToBigDecimal10 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i30 = columnIndexOrThrow22;
                columnIndexOrThrow22 = i30;
                BigDecimal bigDecimalStringToBigDecimal11 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i30) ? null : sQLiteStatementPrepare.getText(i30));
                if (bigDecimalStringToBigDecimal11 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i31 = columnIndexOrThrow23;
                columnIndexOrThrow23 = i31;
                BigDecimal bigDecimalStringToBigDecimal12 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i31) ? null : sQLiteStatementPrepare.getText(i31));
                if (bigDecimalStringToBigDecimal12 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i32 = columnIndexOrThrow24;
                columnIndexOrThrow24 = i32;
                BigDecimal bigDecimalStringToBigDecimal13 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32));
                if (bigDecimalStringToBigDecimal13 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i33 = columnIndexOrThrow25;
                columnIndexOrThrow25 = i33;
                BigDecimal bigDecimalStringToBigDecimal14 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                int i34 = columnIndexOrThrow26;
                OptionStrategyType optionStrategyTypeFromServerValue3 = companion.fromServerValue(sQLiteStatementPrepare.isNull(i34) ? null : sQLiteStatementPrepare.getText(i34));
                int i35 = columnIndexOrThrow27;
                columnIndexOrThrow26 = i34;
                OrderTimeInForce orderTimeInForceFromServerValue = OrderTimeInForce.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i35) ? null : sQLiteStatementPrepare.getText(i35));
                if (orderTimeInForceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTimeInForce', but it was NULL.");
                }
                int i36 = columnIndexOrThrow28;
                columnIndexOrThrow28 = i36;
                OrderTrigger orderTriggerFromServerValue = OrderTrigger.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i36) ? null : sQLiteStatementPrepare.getText(i36));
                if (orderTriggerFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTrigger', but it was NULL.");
                }
                int i37 = columnIndexOrThrow29;
                columnIndexOrThrow29 = i37;
                OrderType orderTypeFromServerValue = OrderType.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i37) ? null : sQLiteStatementPrepare.getText(i37));
                if (orderTypeFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderType', but it was NULL.");
                }
                int i38 = columnIndexOrThrow30;
                columnIndexOrThrow30 = i38;
                Instant instantStringToInstant2 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i38) ? null : sQLiteStatementPrepare.getText(i38));
                if (instantStringToInstant2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i39 = columnIndexOrThrow31;
                columnIndexOrThrow31 = i39;
                UUID uuidStringToUuid3 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i39) ? null : sQLiteStatementPrepare.getText(i39));
                int i40 = columnIndexOrThrow32;
                OrderDirection orderDirectionFromServerValue3 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i40) ? null : sQLiteStatementPrepare.getText(i40));
                if (orderDirectionFromServerValue3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i41 = columnIndexOrThrow33;
                if (sQLiteStatementPrepare.isNull(i41)) {
                    columnIndexOrThrow32 = i40;
                    text5 = null;
                } else {
                    columnIndexOrThrow32 = i40;
                    text5 = sQLiteStatementPrepare.getText(i41);
                }
                columnIndexOrThrow27 = i35;
                BigDecimal bigDecimalStringToBigDecimal15 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text5);
                if (bigDecimalStringToBigDecimal15 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i42 = columnIndexOrThrow34;
                OrderDirection orderDirectionFromServerValue4 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i42) ? null : sQLiteStatementPrepare.getText(i42));
                if (orderDirectionFromServerValue4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i43 = columnIndexOrThrow35;
                OptionOrder.FormSource formSourceFromServerValue = OptionOrder.FormSource.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                if (formSourceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionOrder.FormSource', but it was NULL.");
                }
                int i44 = columnIndexOrThrow36;
                columnIndexOrThrow35 = i43;
                UUID uuidStringToUuid4 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i44) ? null : sQLiteStatementPrepare.getText(i44));
                if (uuidStringToUuid4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i45 = columnIndexOrThrow37;
                ComboOrder comboOrder = new ComboOrder(uuidStringToUuid, text15, bigDecimalStringToBigDecimal2, text16, bigDecimalStringToBigDecimal3, uuidStringToUuid2, text17, optionStrategyTypeFromServerValue, bigDecimalStringToBigDecimal4, instantStringToInstant, orderStateFromServerValue, orderDirectionFromServerValue, bigDecimalStringToBigDecimal5, z, bigDecimalStringToBigDecimal6, orderDirectionFromServerValue2, optionStrategyTypeFromServerValue2, bigDecimalStringToBigDecimal7, bigDecimalStringToBigDecimal8, bigDecimalStringToBigDecimal9, bigDecimalStringToBigDecimal10, bigDecimalStringToBigDecimal11, bigDecimalStringToBigDecimal12, bigDecimalStringToBigDecimal13, bigDecimalStringToBigDecimal14, optionStrategyTypeFromServerValue3, orderTimeInForceFromServerValue, orderTriggerFromServerValue, orderTypeFromServerValue, instantStringToInstant2, uuidStringToUuid3, orderDirectionFromServerValue3, bigDecimalStringToBigDecimal15, orderDirectionFromServerValue4, formSourceFromServerValue, uuidStringToUuid4, sQLiteStatementPrepare.getText(i45));
                columnIndexOrThrow37 = i45;
                columnIndexOrThrow36 = i44;
                int i46 = columnIndexOrThrow38;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i46)) != 0;
                int i47 = columnIndexOrThrow39;
                columnIndexOrThrow39 = i47;
                BigDecimal bigDecimalStringToBigDecimal16 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i47) ? null : sQLiteStatementPrepare.getText(i47));
                int i48 = columnIndexOrThrow40;
                columnIndexOrThrow40 = i48;
                ImmutableList<LocalDate> immutableListStringToLocalDateImmutableList = comboOrderDao_Impl.__modelRoomConverters().stringToLocalDateImmutableList(sQLiteStatementPrepare.isNull(i48) ? null : sQLiteStatementPrepare.getText(i48));
                if (immutableListStringToLocalDateImmutableList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlinx.collections.immutable.ImmutableList<java.time.LocalDate>', but it was NULL.");
                }
                int i49 = columnIndexOrThrow41;
                columnIndexOrThrow41 = i49;
                OptionChain.ExtendedHoursState extendedHoursStateFromServerValue = OptionChain.ExtendedHoursState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i49) ? null : sQLiteStatementPrepare.getText(i49));
                if (extendedHoursStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.ExtendedHoursState', but it was NULL.");
                }
                int i50 = columnIndexOrThrow42;
                columnIndexOrThrow42 = i50;
                UUID uuidStringToUuid5 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i50) ? null : sQLiteStatementPrepare.getText(i50));
                if (uuidStringToUuid5 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i51 = columnIndexOrThrow43;
                columnIndexOrThrow43 = i51;
                OptionChain.LateCloseState lateCloseStateFromServerValue = OptionChain.LateCloseState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i51) ? null : sQLiteStatementPrepare.getText(i51));
                if (lateCloseStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.LateCloseState', but it was NULL.");
                }
                int i52 = columnIndexOrThrow47;
                columnIndexOrThrow47 = i52;
                Instant instantStringToInstant3 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i52) ? null : sQLiteStatementPrepare.getText(i52));
                if (instantStringToInstant3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                columnIndexOrThrow34 = i42;
                int i53 = columnIndexOrThrow48;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i53)) != 0;
                int i54 = columnIndexOrThrow49;
                String text20 = sQLiteStatementPrepare.getText(i54);
                int i55 = columnIndexOrThrow50;
                if (sQLiteStatementPrepare.isNull(i55)) {
                    columnIndexOrThrow48 = i53;
                    text6 = null;
                } else {
                    columnIndexOrThrow48 = i53;
                    text6 = sQLiteStatementPrepare.getText(i55);
                }
                columnIndexOrThrow49 = i54;
                BigDecimal bigDecimalStringToBigDecimal17 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text6);
                if (bigDecimalStringToBigDecimal17 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i56 = columnIndexOrThrow51;
                if (sQLiteStatementPrepare.isNull(i56)) {
                    columnIndexOrThrow50 = i55;
                    numValueOf = null;
                } else {
                    columnIndexOrThrow50 = i55;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i56));
                }
                int i57 = columnIndexOrThrow44;
                if (sQLiteStatementPrepare.isNull(i57)) {
                    i3 = columnIndexOrThrow45;
                    if (sQLiteStatementPrepare.isNull(i3)) {
                        columnIndexOrThrow51 = i56;
                        i4 = columnIndexOrThrow46;
                        if (!sQLiteStatementPrepare.isNull(i4)) {
                            if (sQLiteStatementPrepare.isNull(i57)) {
                                columnIndexOrThrow44 = i57;
                                text12 = sQLiteStatementPrepare.getText(i57);
                            } else {
                                columnIndexOrThrow44 = i57;
                                text12 = null;
                            }
                            columnIndexOrThrow38 = i46;
                            bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                            if (bigDecimalStringToBigDecimal != null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow45 = i3;
                            BigDecimal bigDecimalStringToBigDecimal18 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3));
                            if (bigDecimalStringToBigDecimal18 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow46 = i4;
                            BigDecimal bigDecimalStringToBigDecimal19 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4));
                            if (bigDecimalStringToBigDecimal19 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            tickRequirements = new OptionChain.TickRequirements(bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal18, bigDecimalStringToBigDecimal19);
                            OptionChain optionChain = new OptionChain(z2, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z3, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i58 = columnIndexOrThrow52;
                            String text21 = !sQLiteStatementPrepare.isNull(i58) ? null : sQLiteStatementPrepare.getText(i58);
                            Tradability.Companion companion3 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion3.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i59 = columnIndexOrThrow53;
                            if (sQLiteStatementPrepare.isNull(i59)) {
                                columnIndexOrThrow52 = i58;
                                text7 = null;
                            } else {
                                columnIndexOrThrow52 = i58;
                                text7 = sQLiteStatementPrepare.getText(i59);
                            }
                            Tradability tradabilityFromServerValue2 = companion3.fromServerValue(text7);
                            if (tradabilityFromServerValue2 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            columnIndexOrThrow53 = i59;
                            int i60 = columnIndexOrThrow54;
                            boolean z4 = ((int) sQLiteStatementPrepare.getLong(i60)) != 0;
                            int i61 = columnIndexOrThrow55;
                            columnIndexOrThrow54 = i60;
                            BigDecimal bigDecimalStringToBigDecimal20 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i61) ? null : sQLiteStatementPrepare.getText(i61));
                            if (bigDecimalStringToBigDecimal20 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i62 = columnIndexOrThrow56;
                            columnIndexOrThrow56 = i62;
                            BigDecimal bigDecimalStringToBigDecimal21 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i62) ? null : sQLiteStatementPrepare.getText(i62));
                            if (bigDecimalStringToBigDecimal21 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i63 = columnIndexOrThrow57;
                            Tradability tradabilityFromServerValue3 = companion3.fromServerValue(sQLiteStatementPrepare.isNull(i63) ? null : sQLiteStatementPrepare.getText(i63));
                            if (tradabilityFromServerValue3 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i64 = columnIndexOrThrow58;
                            if (sQLiteStatementPrepare.isNull(i64)) {
                                columnIndexOrThrow57 = i63;
                                text8 = null;
                            } else {
                                columnIndexOrThrow57 = i63;
                                text8 = sQLiteStatementPrepare.getText(i64);
                            }
                            columnIndexOrThrow55 = i61;
                            UUID uuidStringToUuid6 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text8);
                            if (uuidStringToUuid6 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                            int i65 = columnIndexOrThrow59;
                            LocalDate localDateStringToLocalDate = comboOrderDao_Impl.__commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(i65) ? null : sQLiteStatementPrepare.getText(i65));
                            int i66 = columnIndexOrThrow60;
                            columnIndexOrThrow59 = i65;
                            BigDecimal bigDecimalStringToBigDecimal22 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66));
                            if (bigDecimalStringToBigDecimal22 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i67 = columnIndexOrThrow61;
                            columnIndexOrThrow61 = i67;
                            BigDecimal bigDecimalStringToBigDecimal23 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i67) ? null : sQLiteStatementPrepare.getText(i67));
                            if (bigDecimalStringToBigDecimal23 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i68 = columnIndexOrThrow62;
                            BigDecimal bigDecimalStringToBigDecimal24 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i68) ? null : sQLiteStatementPrepare.getText(i68));
                            int i69 = columnIndexOrThrow63;
                            String text22 = sQLiteStatementPrepare.getText(i69);
                            int i70 = columnIndexOrThrow64;
                            String text23 = sQLiteStatementPrepare.getText(i70);
                            columnIndexOrThrow63 = i69;
                            int i71 = columnIndexOrThrow65;
                            if (sQLiteStatementPrepare.isNull(i71)) {
                                columnIndexOrThrow65 = i71;
                                text9 = null;
                            } else {
                                columnIndexOrThrow65 = i71;
                                text9 = sQLiteStatementPrepare.getText(i71);
                            }
                            columnIndexOrThrow62 = i68;
                            Instant instantStringToInstant4 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(text9);
                            if (instantStringToInstant4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                            }
                            int i72 = columnIndexOrThrow66;
                            String text24 = sQLiteStatementPrepare.isNull(i72) ? null : sQLiteStatementPrepare.getText(i72);
                            int i73 = columnIndexOrThrow67;
                            String text25 = sQLiteStatementPrepare.getText(i73);
                            int i74 = columnIndexOrThrow68;
                            String text26 = sQLiteStatementPrepare.getText(i74);
                            columnIndexOrThrow66 = i72;
                            int i75 = columnIndexOrThrow69;
                            if (sQLiteStatementPrepare.isNull(i75)) {
                                columnIndexOrThrow69 = i75;
                                text10 = null;
                            } else {
                                columnIndexOrThrow69 = i75;
                                text10 = sQLiteStatementPrepare.getText(i75);
                            }
                            columnIndexOrThrow67 = i73;
                            UUID uuidStringToUuid7 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text10);
                            int i76 = columnIndexOrThrow70;
                            String text27 = sQLiteStatementPrepare.getText(i76);
                            columnIndexOrThrow60 = i66;
                            columnIndexOrThrow58 = i64;
                            int i77 = columnIndexOrThrow71;
                            int i78 = (int) sQLiteStatementPrepare.getLong(i77);
                            int i79 = columnIndexOrThrow72;
                            if (sQLiteStatementPrepare.isNull(i79)) {
                                columnIndexOrThrow70 = i76;
                                text11 = null;
                            } else {
                                columnIndexOrThrow70 = i76;
                                text11 = sQLiteStatementPrepare.getText(i79);
                            }
                            Tradability tradabilityFromServerValue4 = companion3.fromServerValue(text11);
                            if (tradabilityFromServerValue4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            Instrument instrument = new Instrument(tradabilityFromServerValue, z4, bigDecimalStringToBigDecimal20, bigDecimalStringToBigDecimal21, tradabilityFromServerValue3, tradabilityFromServerValue2, uuidStringToUuid6, null, null, null, localDateStringToLocalDate, bigDecimalStringToBigDecimal22, bigDecimalStringToBigDecimal23, bigDecimalStringToBigDecimal24, text22, text23, instantStringToInstant4, text24, text25, text26, uuidStringToUuid7, text27, i78, tradabilityFromServerValue4, null, null);
                            Object value = MapsKt.getValue(arrayMap, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            String str3 = str2;
                            Intrinsics.checkNotNullExpressionValue(value, str3);
                            List list2 = (List) value;
                            Object value2 = MapsKt.getValue(arrayMap2, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            Intrinsics.checkNotNullExpressionValue(value2, str3);
                            arrayList.add(new UiComboOrder(comboOrder, optionChain, instrument, list2, (List) value2));
                            columnIndexOrThrow71 = i77;
                            columnIndexOrThrow68 = i74;
                            str2 = str3;
                            columnIndexOrThrow72 = i79;
                            columnIndexOrThrow64 = i70;
                            columnIndexOrThrow8 = i22;
                            columnIndexOrThrow14 = i21;
                            columnIndexOrThrow15 = i23;
                            columnIndexOrThrow16 = i2;
                            columnIndexOrThrow17 = i25;
                            columnIndexOrThrow5 = i16;
                            columnIndexOrThrow2 = i11;
                            columnIndexOrThrow3 = i12;
                            columnIndexOrThrow4 = i13;
                            i10 = i;
                            columnIndexOrThrow6 = i18;
                            columnIndexOrThrow7 = i20;
                            columnIndexOrThrow33 = i41;
                        } else {
                            columnIndexOrThrow46 = i4;
                            columnIndexOrThrow44 = i57;
                            columnIndexOrThrow45 = i3;
                            columnIndexOrThrow38 = i46;
                            tickRequirements = null;
                            OptionChain optionChain2 = new OptionChain(z2, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z3, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i582 = columnIndexOrThrow52;
                            if (!sQLiteStatementPrepare.isNull(i582)) {
                            }
                            Tradability.Companion companion32 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion32.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                            }
                        }
                    } else {
                        columnIndexOrThrow51 = i56;
                    }
                } else {
                    columnIndexOrThrow51 = i56;
                    i3 = columnIndexOrThrow45;
                }
                i4 = columnIndexOrThrow46;
                if (sQLiteStatementPrepare.isNull(i57)) {
                }
                columnIndexOrThrow38 = i46;
                bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                if (bigDecimalStringToBigDecimal != null) {
                }
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    public Flow<UiComboOrder> getOrder(final UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        final String str = "\n        SELECT *\n        FROM UiComboOrder\n        WHERE id = ?\n        ";
        return FlowBuilder.createFlow(this.__db, true, new String[]{"ComboOrderExecution", "OptionInstrument", "Instrument", "ComboOrderLeg", "ComboOrderSalesTax", "UiComboOrder"}, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.getOrder$lambda$10(str, this, orderId, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06a9 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0011, B:5:0x001e, B:9:0x0028, B:10:0x025e, B:12:0x0264, B:14:0x0270, B:16:0x027d, B:18:0x0287, B:20:0x0294, B:22:0x02a8, B:26:0x02b4, B:29:0x02c0, B:33:0x02d0, B:36:0x02dc, B:40:0x02eb, B:44:0x02f7, B:46:0x0301, B:50:0x030d, B:52:0x0317, B:56:0x0327, B:60:0x0339, B:64:0x034f, B:68:0x035d, B:72:0x0369, B:74:0x0371, B:78:0x037f, B:82:0x038b, B:86:0x0397, B:91:0x03b1, B:95:0x03bd, B:97:0x03c7, B:101:0x03d5, B:103:0x03db, B:107:0x03e9, B:111:0x03fb, B:113:0x0405, B:117:0x0413, B:121:0x0429, B:125:0x043f, B:127:0x0449, B:131:0x0457, B:133:0x0461, B:137:0x046f, B:139:0x0479, B:143:0x0487, B:145:0x0491, B:149:0x049f, B:153:0x04b5, B:157:0x04c7, B:159:0x04cf, B:163:0x04dd, B:165:0x04e5, B:169:0x04f3, B:171:0x04fb, B:175:0x0509, B:177:0x0513, B:181:0x0521, B:185:0x0537, B:187:0x053d, B:191:0x054b, B:193:0x0555, B:197:0x0563, B:199:0x0569, B:203:0x0577, B:205:0x057f, B:209:0x058d, B:211:0x0597, B:216:0x05b3, B:220:0x05bf, B:224:0x05d5, B:226:0x05df, B:230:0x05ed, B:232:0x05f5, B:236:0x0603, B:238:0x060d, B:242:0x061b, B:244:0x0623, B:248:0x0631, B:250:0x063b, B:255:0x064c, B:259:0x065e, B:261:0x0668, B:266:0x0681, B:268:0x0687, B:270:0x068f, B:276:0x06a1, B:280:0x06ad, B:282:0x06b7, B:286:0x06c3, B:288:0x06cd, B:292:0x06d9, B:294:0x06e3, B:295:0x06ea, B:299:0x06fd, B:303:0x0709, B:307:0x0715, B:309:0x071b, B:314:0x072c, B:318:0x0738, B:320:0x0742, B:324:0x0750, B:326:0x075a, B:330:0x0768, B:332:0x076e, B:336:0x077c, B:338:0x0786, B:342:0x0794, B:346:0x07aa, B:348:0x07b4, B:352:0x07c2, B:354:0x07cc, B:358:0x07da, B:362:0x07fc, B:364:0x0806, B:369:0x081a, B:373:0x0832, B:377:0x0854, B:379:0x085a, B:380:0x089a, B:381:0x089f, B:376:0x0850, B:372:0x082e, B:368:0x0813, B:382:0x08a0, B:383:0x08a5, B:361:0x07f8, B:357:0x07d6, B:384:0x08a6, B:385:0x08ab, B:351:0x07be, B:386:0x08ac, B:387:0x08b1, B:345:0x07a6, B:341:0x0790, B:388:0x08b2, B:389:0x08b7, B:335:0x0778, B:390:0x08b8, B:391:0x08bd, B:329:0x0764, B:392:0x08be, B:393:0x08c3, B:323:0x074c, B:394:0x08c4, B:395:0x08c9, B:317:0x0734, B:396:0x08ca, B:397:0x08cf, B:306:0x0711, B:398:0x08d0, B:399:0x08d5, B:298:0x06f9, B:400:0x08d6, B:401:0x08db, B:291:0x06d5, B:402:0x08dc, B:403:0x08e1, B:285:0x06bf, B:404:0x08e2, B:405:0x08e7, B:279:0x06a9, B:265:0x0675, B:406:0x08e8, B:407:0x08ed, B:258:0x065a, B:408:0x08ee, B:409:0x08f3, B:247:0x062d, B:410:0x08f4, B:411:0x08fb, B:241:0x0617, B:412:0x08fc, B:413:0x0901, B:235:0x05ff, B:414:0x0902, B:415:0x0909, B:229:0x05e9, B:416:0x090a, B:417:0x0911, B:223:0x05d1, B:219:0x05bb, B:418:0x0912, B:419:0x0917, B:208:0x0589, B:420:0x0918, B:421:0x091f, B:202:0x0573, B:422:0x0920, B:423:0x0925, B:196:0x055f, B:424:0x0926, B:425:0x092b, B:190:0x0547, B:426:0x092c, B:427:0x0931, B:184:0x0533, B:180:0x051d, B:428:0x0932, B:429:0x0937, B:174:0x0505, B:430:0x0938, B:431:0x093f, B:168:0x04ef, B:432:0x0940, B:433:0x0947, B:162:0x04d9, B:434:0x0948, B:435:0x094f, B:156:0x04c3, B:152:0x04b1, B:148:0x049b, B:436:0x0950, B:437:0x0955, B:142:0x0483, B:438:0x0956, B:439:0x095b, B:136:0x046b, B:440:0x095c, B:441:0x0961, B:130:0x0453, B:442:0x0962, B:443:0x0967, B:124:0x043b, B:120:0x0425, B:116:0x040f, B:444:0x0968, B:445:0x096d, B:110:0x03f7, B:106:0x03e5, B:446:0x096e, B:447:0x0973, B:100:0x03d1, B:448:0x0974, B:449:0x0979, B:94:0x03b9, B:85:0x0393, B:450:0x097a, B:451:0x097f, B:77:0x037b, B:452:0x0980, B:453:0x0987, B:71:0x0365, B:454:0x0988, B:455:0x098d, B:63:0x034b, B:59:0x0335, B:55:0x0323, B:456:0x098e, B:457:0x0993, B:49:0x0309, B:458:0x0994, B:459:0x0999, B:43:0x02f3, B:39:0x02e5, B:460:0x099a, B:461:0x099f, B:32:0x02cc, B:462:0x09a0, B:463:0x09a5, B:25:0x02b0, B:8:0x0025), top: B:468:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06b7 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0011, B:5:0x001e, B:9:0x0028, B:10:0x025e, B:12:0x0264, B:14:0x0270, B:16:0x027d, B:18:0x0287, B:20:0x0294, B:22:0x02a8, B:26:0x02b4, B:29:0x02c0, B:33:0x02d0, B:36:0x02dc, B:40:0x02eb, B:44:0x02f7, B:46:0x0301, B:50:0x030d, B:52:0x0317, B:56:0x0327, B:60:0x0339, B:64:0x034f, B:68:0x035d, B:72:0x0369, B:74:0x0371, B:78:0x037f, B:82:0x038b, B:86:0x0397, B:91:0x03b1, B:95:0x03bd, B:97:0x03c7, B:101:0x03d5, B:103:0x03db, B:107:0x03e9, B:111:0x03fb, B:113:0x0405, B:117:0x0413, B:121:0x0429, B:125:0x043f, B:127:0x0449, B:131:0x0457, B:133:0x0461, B:137:0x046f, B:139:0x0479, B:143:0x0487, B:145:0x0491, B:149:0x049f, B:153:0x04b5, B:157:0x04c7, B:159:0x04cf, B:163:0x04dd, B:165:0x04e5, B:169:0x04f3, B:171:0x04fb, B:175:0x0509, B:177:0x0513, B:181:0x0521, B:185:0x0537, B:187:0x053d, B:191:0x054b, B:193:0x0555, B:197:0x0563, B:199:0x0569, B:203:0x0577, B:205:0x057f, B:209:0x058d, B:211:0x0597, B:216:0x05b3, B:220:0x05bf, B:224:0x05d5, B:226:0x05df, B:230:0x05ed, B:232:0x05f5, B:236:0x0603, B:238:0x060d, B:242:0x061b, B:244:0x0623, B:248:0x0631, B:250:0x063b, B:255:0x064c, B:259:0x065e, B:261:0x0668, B:266:0x0681, B:268:0x0687, B:270:0x068f, B:276:0x06a1, B:280:0x06ad, B:282:0x06b7, B:286:0x06c3, B:288:0x06cd, B:292:0x06d9, B:294:0x06e3, B:295:0x06ea, B:299:0x06fd, B:303:0x0709, B:307:0x0715, B:309:0x071b, B:314:0x072c, B:318:0x0738, B:320:0x0742, B:324:0x0750, B:326:0x075a, B:330:0x0768, B:332:0x076e, B:336:0x077c, B:338:0x0786, B:342:0x0794, B:346:0x07aa, B:348:0x07b4, B:352:0x07c2, B:354:0x07cc, B:358:0x07da, B:362:0x07fc, B:364:0x0806, B:369:0x081a, B:373:0x0832, B:377:0x0854, B:379:0x085a, B:380:0x089a, B:381:0x089f, B:376:0x0850, B:372:0x082e, B:368:0x0813, B:382:0x08a0, B:383:0x08a5, B:361:0x07f8, B:357:0x07d6, B:384:0x08a6, B:385:0x08ab, B:351:0x07be, B:386:0x08ac, B:387:0x08b1, B:345:0x07a6, B:341:0x0790, B:388:0x08b2, B:389:0x08b7, B:335:0x0778, B:390:0x08b8, B:391:0x08bd, B:329:0x0764, B:392:0x08be, B:393:0x08c3, B:323:0x074c, B:394:0x08c4, B:395:0x08c9, B:317:0x0734, B:396:0x08ca, B:397:0x08cf, B:306:0x0711, B:398:0x08d0, B:399:0x08d5, B:298:0x06f9, B:400:0x08d6, B:401:0x08db, B:291:0x06d5, B:402:0x08dc, B:403:0x08e1, B:285:0x06bf, B:404:0x08e2, B:405:0x08e7, B:279:0x06a9, B:265:0x0675, B:406:0x08e8, B:407:0x08ed, B:258:0x065a, B:408:0x08ee, B:409:0x08f3, B:247:0x062d, B:410:0x08f4, B:411:0x08fb, B:241:0x0617, B:412:0x08fc, B:413:0x0901, B:235:0x05ff, B:414:0x0902, B:415:0x0909, B:229:0x05e9, B:416:0x090a, B:417:0x0911, B:223:0x05d1, B:219:0x05bb, B:418:0x0912, B:419:0x0917, B:208:0x0589, B:420:0x0918, B:421:0x091f, B:202:0x0573, B:422:0x0920, B:423:0x0925, B:196:0x055f, B:424:0x0926, B:425:0x092b, B:190:0x0547, B:426:0x092c, B:427:0x0931, B:184:0x0533, B:180:0x051d, B:428:0x0932, B:429:0x0937, B:174:0x0505, B:430:0x0938, B:431:0x093f, B:168:0x04ef, B:432:0x0940, B:433:0x0947, B:162:0x04d9, B:434:0x0948, B:435:0x094f, B:156:0x04c3, B:152:0x04b1, B:148:0x049b, B:436:0x0950, B:437:0x0955, B:142:0x0483, B:438:0x0956, B:439:0x095b, B:136:0x046b, B:440:0x095c, B:441:0x0961, B:130:0x0453, B:442:0x0962, B:443:0x0967, B:124:0x043b, B:120:0x0425, B:116:0x040f, B:444:0x0968, B:445:0x096d, B:110:0x03f7, B:106:0x03e5, B:446:0x096e, B:447:0x0973, B:100:0x03d1, B:448:0x0974, B:449:0x0979, B:94:0x03b9, B:85:0x0393, B:450:0x097a, B:451:0x097f, B:77:0x037b, B:452:0x0980, B:453:0x0987, B:71:0x0365, B:454:0x0988, B:455:0x098d, B:63:0x034b, B:59:0x0335, B:55:0x0323, B:456:0x098e, B:457:0x0993, B:49:0x0309, B:458:0x0994, B:459:0x0999, B:43:0x02f3, B:39:0x02e5, B:460:0x099a, B:461:0x099f, B:32:0x02cc, B:462:0x09a0, B:463:0x09a5, B:25:0x02b0, B:8:0x0025), top: B:468:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06f9 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0011, B:5:0x001e, B:9:0x0028, B:10:0x025e, B:12:0x0264, B:14:0x0270, B:16:0x027d, B:18:0x0287, B:20:0x0294, B:22:0x02a8, B:26:0x02b4, B:29:0x02c0, B:33:0x02d0, B:36:0x02dc, B:40:0x02eb, B:44:0x02f7, B:46:0x0301, B:50:0x030d, B:52:0x0317, B:56:0x0327, B:60:0x0339, B:64:0x034f, B:68:0x035d, B:72:0x0369, B:74:0x0371, B:78:0x037f, B:82:0x038b, B:86:0x0397, B:91:0x03b1, B:95:0x03bd, B:97:0x03c7, B:101:0x03d5, B:103:0x03db, B:107:0x03e9, B:111:0x03fb, B:113:0x0405, B:117:0x0413, B:121:0x0429, B:125:0x043f, B:127:0x0449, B:131:0x0457, B:133:0x0461, B:137:0x046f, B:139:0x0479, B:143:0x0487, B:145:0x0491, B:149:0x049f, B:153:0x04b5, B:157:0x04c7, B:159:0x04cf, B:163:0x04dd, B:165:0x04e5, B:169:0x04f3, B:171:0x04fb, B:175:0x0509, B:177:0x0513, B:181:0x0521, B:185:0x0537, B:187:0x053d, B:191:0x054b, B:193:0x0555, B:197:0x0563, B:199:0x0569, B:203:0x0577, B:205:0x057f, B:209:0x058d, B:211:0x0597, B:216:0x05b3, B:220:0x05bf, B:224:0x05d5, B:226:0x05df, B:230:0x05ed, B:232:0x05f5, B:236:0x0603, B:238:0x060d, B:242:0x061b, B:244:0x0623, B:248:0x0631, B:250:0x063b, B:255:0x064c, B:259:0x065e, B:261:0x0668, B:266:0x0681, B:268:0x0687, B:270:0x068f, B:276:0x06a1, B:280:0x06ad, B:282:0x06b7, B:286:0x06c3, B:288:0x06cd, B:292:0x06d9, B:294:0x06e3, B:295:0x06ea, B:299:0x06fd, B:303:0x0709, B:307:0x0715, B:309:0x071b, B:314:0x072c, B:318:0x0738, B:320:0x0742, B:324:0x0750, B:326:0x075a, B:330:0x0768, B:332:0x076e, B:336:0x077c, B:338:0x0786, B:342:0x0794, B:346:0x07aa, B:348:0x07b4, B:352:0x07c2, B:354:0x07cc, B:358:0x07da, B:362:0x07fc, B:364:0x0806, B:369:0x081a, B:373:0x0832, B:377:0x0854, B:379:0x085a, B:380:0x089a, B:381:0x089f, B:376:0x0850, B:372:0x082e, B:368:0x0813, B:382:0x08a0, B:383:0x08a5, B:361:0x07f8, B:357:0x07d6, B:384:0x08a6, B:385:0x08ab, B:351:0x07be, B:386:0x08ac, B:387:0x08b1, B:345:0x07a6, B:341:0x0790, B:388:0x08b2, B:389:0x08b7, B:335:0x0778, B:390:0x08b8, B:391:0x08bd, B:329:0x0764, B:392:0x08be, B:393:0x08c3, B:323:0x074c, B:394:0x08c4, B:395:0x08c9, B:317:0x0734, B:396:0x08ca, B:397:0x08cf, B:306:0x0711, B:398:0x08d0, B:399:0x08d5, B:298:0x06f9, B:400:0x08d6, B:401:0x08db, B:291:0x06d5, B:402:0x08dc, B:403:0x08e1, B:285:0x06bf, B:404:0x08e2, B:405:0x08e7, B:279:0x06a9, B:265:0x0675, B:406:0x08e8, B:407:0x08ed, B:258:0x065a, B:408:0x08ee, B:409:0x08f3, B:247:0x062d, B:410:0x08f4, B:411:0x08fb, B:241:0x0617, B:412:0x08fc, B:413:0x0901, B:235:0x05ff, B:414:0x0902, B:415:0x0909, B:229:0x05e9, B:416:0x090a, B:417:0x0911, B:223:0x05d1, B:219:0x05bb, B:418:0x0912, B:419:0x0917, B:208:0x0589, B:420:0x0918, B:421:0x091f, B:202:0x0573, B:422:0x0920, B:423:0x0925, B:196:0x055f, B:424:0x0926, B:425:0x092b, B:190:0x0547, B:426:0x092c, B:427:0x0931, B:184:0x0533, B:180:0x051d, B:428:0x0932, B:429:0x0937, B:174:0x0505, B:430:0x0938, B:431:0x093f, B:168:0x04ef, B:432:0x0940, B:433:0x0947, B:162:0x04d9, B:434:0x0948, B:435:0x094f, B:156:0x04c3, B:152:0x04b1, B:148:0x049b, B:436:0x0950, B:437:0x0955, B:142:0x0483, B:438:0x0956, B:439:0x095b, B:136:0x046b, B:440:0x095c, B:441:0x0961, B:130:0x0453, B:442:0x0962, B:443:0x0967, B:124:0x043b, B:120:0x0425, B:116:0x040f, B:444:0x0968, B:445:0x096d, B:110:0x03f7, B:106:0x03e5, B:446:0x096e, B:447:0x0973, B:100:0x03d1, B:448:0x0974, B:449:0x0979, B:94:0x03b9, B:85:0x0393, B:450:0x097a, B:451:0x097f, B:77:0x037b, B:452:0x0980, B:453:0x0987, B:71:0x0365, B:454:0x0988, B:455:0x098d, B:63:0x034b, B:59:0x0335, B:55:0x0323, B:456:0x098e, B:457:0x0993, B:49:0x0309, B:458:0x0994, B:459:0x0999, B:43:0x02f3, B:39:0x02e5, B:460:0x099a, B:461:0x099f, B:32:0x02cc, B:462:0x09a0, B:463:0x09a5, B:25:0x02b0, B:8:0x0025), top: B:468:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x08d0 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0011, B:5:0x001e, B:9:0x0028, B:10:0x025e, B:12:0x0264, B:14:0x0270, B:16:0x027d, B:18:0x0287, B:20:0x0294, B:22:0x02a8, B:26:0x02b4, B:29:0x02c0, B:33:0x02d0, B:36:0x02dc, B:40:0x02eb, B:44:0x02f7, B:46:0x0301, B:50:0x030d, B:52:0x0317, B:56:0x0327, B:60:0x0339, B:64:0x034f, B:68:0x035d, B:72:0x0369, B:74:0x0371, B:78:0x037f, B:82:0x038b, B:86:0x0397, B:91:0x03b1, B:95:0x03bd, B:97:0x03c7, B:101:0x03d5, B:103:0x03db, B:107:0x03e9, B:111:0x03fb, B:113:0x0405, B:117:0x0413, B:121:0x0429, B:125:0x043f, B:127:0x0449, B:131:0x0457, B:133:0x0461, B:137:0x046f, B:139:0x0479, B:143:0x0487, B:145:0x0491, B:149:0x049f, B:153:0x04b5, B:157:0x04c7, B:159:0x04cf, B:163:0x04dd, B:165:0x04e5, B:169:0x04f3, B:171:0x04fb, B:175:0x0509, B:177:0x0513, B:181:0x0521, B:185:0x0537, B:187:0x053d, B:191:0x054b, B:193:0x0555, B:197:0x0563, B:199:0x0569, B:203:0x0577, B:205:0x057f, B:209:0x058d, B:211:0x0597, B:216:0x05b3, B:220:0x05bf, B:224:0x05d5, B:226:0x05df, B:230:0x05ed, B:232:0x05f5, B:236:0x0603, B:238:0x060d, B:242:0x061b, B:244:0x0623, B:248:0x0631, B:250:0x063b, B:255:0x064c, B:259:0x065e, B:261:0x0668, B:266:0x0681, B:268:0x0687, B:270:0x068f, B:276:0x06a1, B:280:0x06ad, B:282:0x06b7, B:286:0x06c3, B:288:0x06cd, B:292:0x06d9, B:294:0x06e3, B:295:0x06ea, B:299:0x06fd, B:303:0x0709, B:307:0x0715, B:309:0x071b, B:314:0x072c, B:318:0x0738, B:320:0x0742, B:324:0x0750, B:326:0x075a, B:330:0x0768, B:332:0x076e, B:336:0x077c, B:338:0x0786, B:342:0x0794, B:346:0x07aa, B:348:0x07b4, B:352:0x07c2, B:354:0x07cc, B:358:0x07da, B:362:0x07fc, B:364:0x0806, B:369:0x081a, B:373:0x0832, B:377:0x0854, B:379:0x085a, B:380:0x089a, B:381:0x089f, B:376:0x0850, B:372:0x082e, B:368:0x0813, B:382:0x08a0, B:383:0x08a5, B:361:0x07f8, B:357:0x07d6, B:384:0x08a6, B:385:0x08ab, B:351:0x07be, B:386:0x08ac, B:387:0x08b1, B:345:0x07a6, B:341:0x0790, B:388:0x08b2, B:389:0x08b7, B:335:0x0778, B:390:0x08b8, B:391:0x08bd, B:329:0x0764, B:392:0x08be, B:393:0x08c3, B:323:0x074c, B:394:0x08c4, B:395:0x08c9, B:317:0x0734, B:396:0x08ca, B:397:0x08cf, B:306:0x0711, B:398:0x08d0, B:399:0x08d5, B:298:0x06f9, B:400:0x08d6, B:401:0x08db, B:291:0x06d5, B:402:0x08dc, B:403:0x08e1, B:285:0x06bf, B:404:0x08e2, B:405:0x08e7, B:279:0x06a9, B:265:0x0675, B:406:0x08e8, B:407:0x08ed, B:258:0x065a, B:408:0x08ee, B:409:0x08f3, B:247:0x062d, B:410:0x08f4, B:411:0x08fb, B:241:0x0617, B:412:0x08fc, B:413:0x0901, B:235:0x05ff, B:414:0x0902, B:415:0x0909, B:229:0x05e9, B:416:0x090a, B:417:0x0911, B:223:0x05d1, B:219:0x05bb, B:418:0x0912, B:419:0x0917, B:208:0x0589, B:420:0x0918, B:421:0x091f, B:202:0x0573, B:422:0x0920, B:423:0x0925, B:196:0x055f, B:424:0x0926, B:425:0x092b, B:190:0x0547, B:426:0x092c, B:427:0x0931, B:184:0x0533, B:180:0x051d, B:428:0x0932, B:429:0x0937, B:174:0x0505, B:430:0x0938, B:431:0x093f, B:168:0x04ef, B:432:0x0940, B:433:0x0947, B:162:0x04d9, B:434:0x0948, B:435:0x094f, B:156:0x04c3, B:152:0x04b1, B:148:0x049b, B:436:0x0950, B:437:0x0955, B:142:0x0483, B:438:0x0956, B:439:0x095b, B:136:0x046b, B:440:0x095c, B:441:0x0961, B:130:0x0453, B:442:0x0962, B:443:0x0967, B:124:0x043b, B:120:0x0425, B:116:0x040f, B:444:0x0968, B:445:0x096d, B:110:0x03f7, B:106:0x03e5, B:446:0x096e, B:447:0x0973, B:100:0x03d1, B:448:0x0974, B:449:0x0979, B:94:0x03b9, B:85:0x0393, B:450:0x097a, B:451:0x097f, B:77:0x037b, B:452:0x0980, B:453:0x0987, B:71:0x0365, B:454:0x0988, B:455:0x098d, B:63:0x034b, B:59:0x0335, B:55:0x0323, B:456:0x098e, B:457:0x0993, B:49:0x0309, B:458:0x0994, B:459:0x0999, B:43:0x02f3, B:39:0x02e5, B:460:0x099a, B:461:0x099f, B:32:0x02cc, B:462:0x09a0, B:463:0x09a5, B:25:0x02b0, B:8:0x0025), top: B:468:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x08e2 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0011, B:5:0x001e, B:9:0x0028, B:10:0x025e, B:12:0x0264, B:14:0x0270, B:16:0x027d, B:18:0x0287, B:20:0x0294, B:22:0x02a8, B:26:0x02b4, B:29:0x02c0, B:33:0x02d0, B:36:0x02dc, B:40:0x02eb, B:44:0x02f7, B:46:0x0301, B:50:0x030d, B:52:0x0317, B:56:0x0327, B:60:0x0339, B:64:0x034f, B:68:0x035d, B:72:0x0369, B:74:0x0371, B:78:0x037f, B:82:0x038b, B:86:0x0397, B:91:0x03b1, B:95:0x03bd, B:97:0x03c7, B:101:0x03d5, B:103:0x03db, B:107:0x03e9, B:111:0x03fb, B:113:0x0405, B:117:0x0413, B:121:0x0429, B:125:0x043f, B:127:0x0449, B:131:0x0457, B:133:0x0461, B:137:0x046f, B:139:0x0479, B:143:0x0487, B:145:0x0491, B:149:0x049f, B:153:0x04b5, B:157:0x04c7, B:159:0x04cf, B:163:0x04dd, B:165:0x04e5, B:169:0x04f3, B:171:0x04fb, B:175:0x0509, B:177:0x0513, B:181:0x0521, B:185:0x0537, B:187:0x053d, B:191:0x054b, B:193:0x0555, B:197:0x0563, B:199:0x0569, B:203:0x0577, B:205:0x057f, B:209:0x058d, B:211:0x0597, B:216:0x05b3, B:220:0x05bf, B:224:0x05d5, B:226:0x05df, B:230:0x05ed, B:232:0x05f5, B:236:0x0603, B:238:0x060d, B:242:0x061b, B:244:0x0623, B:248:0x0631, B:250:0x063b, B:255:0x064c, B:259:0x065e, B:261:0x0668, B:266:0x0681, B:268:0x0687, B:270:0x068f, B:276:0x06a1, B:280:0x06ad, B:282:0x06b7, B:286:0x06c3, B:288:0x06cd, B:292:0x06d9, B:294:0x06e3, B:295:0x06ea, B:299:0x06fd, B:303:0x0709, B:307:0x0715, B:309:0x071b, B:314:0x072c, B:318:0x0738, B:320:0x0742, B:324:0x0750, B:326:0x075a, B:330:0x0768, B:332:0x076e, B:336:0x077c, B:338:0x0786, B:342:0x0794, B:346:0x07aa, B:348:0x07b4, B:352:0x07c2, B:354:0x07cc, B:358:0x07da, B:362:0x07fc, B:364:0x0806, B:369:0x081a, B:373:0x0832, B:377:0x0854, B:379:0x085a, B:380:0x089a, B:381:0x089f, B:376:0x0850, B:372:0x082e, B:368:0x0813, B:382:0x08a0, B:383:0x08a5, B:361:0x07f8, B:357:0x07d6, B:384:0x08a6, B:385:0x08ab, B:351:0x07be, B:386:0x08ac, B:387:0x08b1, B:345:0x07a6, B:341:0x0790, B:388:0x08b2, B:389:0x08b7, B:335:0x0778, B:390:0x08b8, B:391:0x08bd, B:329:0x0764, B:392:0x08be, B:393:0x08c3, B:323:0x074c, B:394:0x08c4, B:395:0x08c9, B:317:0x0734, B:396:0x08ca, B:397:0x08cf, B:306:0x0711, B:398:0x08d0, B:399:0x08d5, B:298:0x06f9, B:400:0x08d6, B:401:0x08db, B:291:0x06d5, B:402:0x08dc, B:403:0x08e1, B:285:0x06bf, B:404:0x08e2, B:405:0x08e7, B:279:0x06a9, B:265:0x0675, B:406:0x08e8, B:407:0x08ed, B:258:0x065a, B:408:0x08ee, B:409:0x08f3, B:247:0x062d, B:410:0x08f4, B:411:0x08fb, B:241:0x0617, B:412:0x08fc, B:413:0x0901, B:235:0x05ff, B:414:0x0902, B:415:0x0909, B:229:0x05e9, B:416:0x090a, B:417:0x0911, B:223:0x05d1, B:219:0x05bb, B:418:0x0912, B:419:0x0917, B:208:0x0589, B:420:0x0918, B:421:0x091f, B:202:0x0573, B:422:0x0920, B:423:0x0925, B:196:0x055f, B:424:0x0926, B:425:0x092b, B:190:0x0547, B:426:0x092c, B:427:0x0931, B:184:0x0533, B:180:0x051d, B:428:0x0932, B:429:0x0937, B:174:0x0505, B:430:0x0938, B:431:0x093f, B:168:0x04ef, B:432:0x0940, B:433:0x0947, B:162:0x04d9, B:434:0x0948, B:435:0x094f, B:156:0x04c3, B:152:0x04b1, B:148:0x049b, B:436:0x0950, B:437:0x0955, B:142:0x0483, B:438:0x0956, B:439:0x095b, B:136:0x046b, B:440:0x095c, B:441:0x0961, B:130:0x0453, B:442:0x0962, B:443:0x0967, B:124:0x043b, B:120:0x0425, B:116:0x040f, B:444:0x0968, B:445:0x096d, B:110:0x03f7, B:106:0x03e5, B:446:0x096e, B:447:0x0973, B:100:0x03d1, B:448:0x0974, B:449:0x0979, B:94:0x03b9, B:85:0x0393, B:450:0x097a, B:451:0x097f, B:77:0x037b, B:452:0x0980, B:453:0x0987, B:71:0x0365, B:454:0x0988, B:455:0x098d, B:63:0x034b, B:59:0x0335, B:55:0x0323, B:456:0x098e, B:457:0x0993, B:49:0x0309, B:458:0x0994, B:459:0x0999, B:43:0x02f3, B:39:0x02e5, B:460:0x099a, B:461:0x099f, B:32:0x02cc, B:462:0x09a0, B:463:0x09a5, B:25:0x02b0, B:8:0x0025), top: B:468:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final UiComboOrder getOrder$lambda$10(String str, ComboOrderDao_Impl comboOrderDao_Impl, UUID uuid, SQLiteConnection _connection) {
        int i;
        int i2;
        OptionChain.TickRequirements tickRequirements;
        Tradability tradabilityFromServerValue;
        BigDecimal bigDecimalStringToBigDecimal;
        int i3;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strUuidToString = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strUuidToString);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "averageNetPremiumPaid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancelUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canceledQuantity");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSymbol");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closingStrategy");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contractFees");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivedState");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "direction");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "goldSavings");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isReplaceable");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmount");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmountDirection");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openingStrategy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pendingQuantity");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "premium");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AnalyticsStrings.TAG_SORT_ORDER_PRICE);
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremium");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedQuantity");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "regulatoryFees");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stopPrice");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "strategy");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInForce");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedAt");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "refId");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremiumDirection");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmount");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmountDirection");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "formSource");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equityInstrumentId");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "underlyingSymbol");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_canOpenPosition");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_cashComponent");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_expirationDates");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_extendedHoursState");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_lateCloseState");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickAboveCutoff");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickBelowCutoff");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_cutoffPrice");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_receivedAt");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_settleOnOpen");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_symbol");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_tradeValueMultiplier");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_selloutTimeToExpiration");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_affiliateTradability");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_allDayTradability");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_carRequired");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_dayTradeRatio");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_defaultPresetPercentLimit");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_fractionalTradability");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_id");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_listDate");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_maintenanceRatio");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_marginInitialRatio");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_minTickSize");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_name");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_otcMarketTier");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_receivedAt");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_simpleName");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_state");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_symbol");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_tradableChainId");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_type");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_notionalEstimatedQuantityDecimals");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_shortSaleTradability");
            ArrayMap<String, List<UiComboOrderLeg>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<ComboOrderSalesTax>> arrayMap2 = new ArrayMap<>();
            while (sQLiteStatementPrepare.step()) {
                int i4 = columnIndexOrThrow11;
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (arrayMap.containsKey(text)) {
                    i3 = columnIndexOrThrow10;
                } else {
                    i3 = columnIndexOrThrow10;
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
                columnIndexOrThrow11 = i4;
                columnIndexOrThrow10 = i3;
            }
            int i5 = columnIndexOrThrow10;
            int i6 = columnIndexOrThrow11;
            sQLiteStatementPrepare.reset();
            comboOrderDao_Impl.m2217x4e5ab2fa(_connection, arrayMap);
            comboOrderDao_Impl.m2219x367d9594(_connection, arrayMap2);
            UiComboOrder uiComboOrder = null;
            String text3 = null;
            if (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                BigDecimal bigDecimalStringToBigDecimal2 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (bigDecimalStringToBigDecimal2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                BigDecimal bigDecimalStringToBigDecimal3 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (bigDecimalStringToBigDecimal3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                UUID uuidStringToUuid2 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (uuidStringToUuid2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text6 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                OptionStrategyType.Companion companion = OptionStrategyType.INSTANCE;
                OptionStrategyType optionStrategyTypeFromServerValue = companion.fromServerValue(text7);
                BigDecimal bigDecimalStringToBigDecimal4 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                Instant instantStringToInstant = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                OrderState orderStateFromServerValue = OrderState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                if (orderStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.shared.models.history.shared.OrderState', but it was NULL.");
                }
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                OrderDirection.Companion companion2 = OrderDirection.INSTANCE;
                OrderDirection orderDirectionFromServerValue = companion2.fromServerValue(text8);
                if (orderDirectionFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal5 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14)) != 0;
                BigDecimal bigDecimalStringToBigDecimal6 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15));
                if (bigDecimalStringToBigDecimal6 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                OrderDirection orderDirectionFromServerValue2 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16));
                if (orderDirectionFromServerValue2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                OptionStrategyType optionStrategyTypeFromServerValue2 = companion.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                BigDecimal bigDecimalStringToBigDecimal7 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18));
                if (bigDecimalStringToBigDecimal7 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal8 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19));
                BigDecimal bigDecimalStringToBigDecimal9 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20));
                BigDecimal bigDecimalStringToBigDecimal10 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21));
                if (bigDecimalStringToBigDecimal10 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal11 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22));
                if (bigDecimalStringToBigDecimal11 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal12 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23));
                if (bigDecimalStringToBigDecimal12 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal13 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                if (bigDecimalStringToBigDecimal13 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal14 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                OptionStrategyType optionStrategyTypeFromServerValue3 = companion.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                OrderTimeInForce orderTimeInForceFromServerValue = OrderTimeInForce.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27));
                if (orderTimeInForceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTimeInForce', but it was NULL.");
                }
                OrderTrigger orderTriggerFromServerValue = OrderTrigger.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28));
                if (orderTriggerFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTrigger', but it was NULL.");
                }
                OrderType orderTypeFromServerValue = OrderType.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29));
                if (orderTypeFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderType', but it was NULL.");
                }
                Instant instantStringToInstant2 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30));
                if (instantStringToInstant2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                UUID uuidStringToUuid3 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31));
                OrderDirection orderDirectionFromServerValue3 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32));
                if (orderDirectionFromServerValue3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                BigDecimal bigDecimalStringToBigDecimal15 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33));
                if (bigDecimalStringToBigDecimal15 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                OrderDirection orderDirectionFromServerValue4 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34));
                if (orderDirectionFromServerValue4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                OptionOrder.FormSource formSourceFromServerValue = OptionOrder.FormSource.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35));
                if (formSourceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionOrder.FormSource', but it was NULL.");
                }
                UUID uuidStringToUuid4 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow36));
                if (uuidStringToUuid4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                ComboOrder comboOrder = new ComboOrder(uuidStringToUuid, text4, bigDecimalStringToBigDecimal2, text5, bigDecimalStringToBigDecimal3, uuidStringToUuid2, text6, optionStrategyTypeFromServerValue, bigDecimalStringToBigDecimal4, instantStringToInstant, orderStateFromServerValue, orderDirectionFromServerValue, bigDecimalStringToBigDecimal5, z, bigDecimalStringToBigDecimal6, orderDirectionFromServerValue2, optionStrategyTypeFromServerValue2, bigDecimalStringToBigDecimal7, bigDecimalStringToBigDecimal8, bigDecimalStringToBigDecimal9, bigDecimalStringToBigDecimal10, bigDecimalStringToBigDecimal11, bigDecimalStringToBigDecimal12, bigDecimalStringToBigDecimal13, bigDecimalStringToBigDecimal14, optionStrategyTypeFromServerValue3, orderTimeInForceFromServerValue, orderTriggerFromServerValue, orderTypeFromServerValue, instantStringToInstant2, uuidStringToUuid3, orderDirectionFromServerValue3, bigDecimalStringToBigDecimal15, orderDirectionFromServerValue4, formSourceFromServerValue, uuidStringToUuid4, sQLiteStatementPrepare.getText(columnIndexOrThrow37));
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow38)) != 0;
                BigDecimal bigDecimalStringToBigDecimal16 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39));
                ImmutableList<LocalDate> immutableListStringToLocalDateImmutableList = comboOrderDao_Impl.__modelRoomConverters().stringToLocalDateImmutableList(sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow40));
                if (immutableListStringToLocalDateImmutableList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlinx.collections.immutable.ImmutableList<java.time.LocalDate>', but it was NULL.");
                }
                OptionChain.ExtendedHoursState extendedHoursStateFromServerValue = OptionChain.ExtendedHoursState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow41) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow41));
                if (extendedHoursStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.ExtendedHoursState', but it was NULL.");
                }
                UUID uuidStringToUuid5 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow42) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow42));
                if (uuidStringToUuid5 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                OptionChain.LateCloseState lateCloseStateFromServerValue = OptionChain.LateCloseState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow43) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow43));
                if (lateCloseStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.LateCloseState', but it was NULL.");
                }
                Instant instantStringToInstant3 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow47) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow47));
                if (instantStringToInstant3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow48)) != 0;
                String text9 = sQLiteStatementPrepare.getText(columnIndexOrThrow49);
                BigDecimal bigDecimalStringToBigDecimal17 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow50) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow50));
                if (bigDecimalStringToBigDecimal17 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                Integer numValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow51) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow51));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow44)) {
                    i = columnIndexOrThrow45;
                    if (sQLiteStatementPrepare.isNull(i)) {
                        i2 = columnIndexOrThrow46;
                        if (sQLiteStatementPrepare.isNull(i2)) {
                            tickRequirements = null;
                            OptionChain optionChain = new OptionChain(z2, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z3, text9, bigDecimalStringToBigDecimal17, numValueOf);
                            String text10 = !sQLiteStatementPrepare.isNull(columnIndexOrThrow52) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow52);
                            Tradability.Companion companion3 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion3.fromServerValue(text10);
                            if (tradabilityFromServerValue != null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            Tradability tradabilityFromServerValue2 = companion3.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow53) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow53));
                            if (tradabilityFromServerValue2 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            boolean z4 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow54)) != 0;
                            BigDecimal bigDecimalStringToBigDecimal18 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow55) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow55));
                            if (bigDecimalStringToBigDecimal18 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            BigDecimal bigDecimalStringToBigDecimal19 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow56) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow56));
                            if (bigDecimalStringToBigDecimal19 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            Tradability tradabilityFromServerValue3 = companion3.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow57) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow57));
                            if (tradabilityFromServerValue3 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            UUID uuidStringToUuid6 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow58) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow58));
                            if (uuidStringToUuid6 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                            LocalDate localDateStringToLocalDate = comboOrderDao_Impl.__commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow59));
                            BigDecimal bigDecimalStringToBigDecimal20 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow60) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow60));
                            if (bigDecimalStringToBigDecimal20 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            BigDecimal bigDecimalStringToBigDecimal21 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow61) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow61));
                            if (bigDecimalStringToBigDecimal21 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            BigDecimal bigDecimalStringToBigDecimal22 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow62) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow62));
                            String text11 = sQLiteStatementPrepare.getText(columnIndexOrThrow63);
                            String text12 = sQLiteStatementPrepare.getText(columnIndexOrThrow64);
                            Instant instantStringToInstant4 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(columnIndexOrThrow65) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow65));
                            if (instantStringToInstant4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                            }
                            String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow66) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow66);
                            String text14 = sQLiteStatementPrepare.getText(columnIndexOrThrow67);
                            String text15 = sQLiteStatementPrepare.getText(columnIndexOrThrow68);
                            UUID uuidStringToUuid7 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow69) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow69));
                            String text16 = sQLiteStatementPrepare.getText(columnIndexOrThrow70);
                            int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow71);
                            if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow72)) {
                                text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow72);
                            }
                            Tradability tradabilityFromServerValue4 = companion3.fromServerValue(text3);
                            if (tradabilityFromServerValue4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            Instrument instrument = new Instrument(tradabilityFromServerValue, z4, bigDecimalStringToBigDecimal18, bigDecimalStringToBigDecimal19, tradabilityFromServerValue3, tradabilityFromServerValue2, uuidStringToUuid6, null, null, null, localDateStringToLocalDate, bigDecimalStringToBigDecimal20, bigDecimalStringToBigDecimal21, bigDecimalStringToBigDecimal22, text11, text12, instantStringToInstant4, text13, text14, text15, uuidStringToUuid7, text16, i7, tradabilityFromServerValue4, null, null);
                            Object value = MapsKt.getValue(arrayMap, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            List list = (List) value;
                            Object value2 = MapsKt.getValue(arrayMap2, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            uiComboOrder = new UiComboOrder(comboOrder, optionChain, instrument, list, (List) value2);
                        }
                    }
                    bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(!sQLiteStatementPrepare.isNull(columnIndexOrThrow44) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow44));
                    if (bigDecimalStringToBigDecimal != null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                    }
                    BigDecimal bigDecimalStringToBigDecimal23 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i));
                    if (bigDecimalStringToBigDecimal23 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                    }
                    BigDecimal bigDecimalStringToBigDecimal24 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2));
                    if (bigDecimalStringToBigDecimal24 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                    }
                    tickRequirements = new OptionChain.TickRequirements(bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal23, bigDecimalStringToBigDecimal24);
                    OptionChain optionChain2 = new OptionChain(z2, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z3, text9, bigDecimalStringToBigDecimal17, numValueOf);
                    if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow52)) {
                    }
                    Tradability.Companion companion32 = Tradability.INSTANCE;
                    tradabilityFromServerValue = companion32.fromServerValue(text10);
                    if (tradabilityFromServerValue != null) {
                    }
                } else {
                    i = columnIndexOrThrow45;
                }
                i2 = columnIndexOrThrow46;
                bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(!sQLiteStatementPrepare.isNull(columnIndexOrThrow44) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow44));
                if (bigDecimalStringToBigDecimal != null) {
                }
            }
            sQLiteStatementPrepare.close();
            return uiComboOrder;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    public Flow<List<UiComboOrder>> getComboOrdersByOptionInstrument(final String accountNumber, final UUID optionInstrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
        final String str = "\n        SELECT O.*\n        FROM ComboOrderLeg L\n        JOIN UiComboOrder O\n        ON L.orderId = O.id\n        WHERE L.instrumentId = ? AND O.accountNumber = ?\n        GROUP BY O.id\n        ORDER BY O.updatedAt DESC\n        ";
        return FlowBuilder.createFlow(this.__db, true, new String[]{"ComboOrderExecution", "OptionInstrument", "Instrument", "ComboOrderLeg", "ComboOrderSalesTax", "UiComboOrder"}, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.getComboOrdersByOptionInstrument$lambda$11(str, this, optionInstrumentId, accountNumber, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0757 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0011, B:5:0x001e, B:9:0x0028, B:10:0x0264, B:12:0x026a, B:14:0x0276, B:16:0x0283, B:18:0x028d, B:20:0x029a, B:21:0x02ac, B:23:0x02b2, B:27:0x02be, B:30:0x02ca, B:35:0x02dd, B:38:0x02e9, B:42:0x02f8, B:47:0x0307, B:49:0x0311, B:53:0x031d, B:55:0x0327, B:59:0x0337, B:64:0x034c, B:69:0x0365, B:73:0x0373, B:78:0x0388, B:80:0x0390, B:85:0x03a1, B:89:0x03af, B:94:0x03c4, B:99:0x03df, B:104:0x03f0, B:106:0x03fa, B:110:0x0408, B:112:0x040e, B:116:0x0422, B:121:0x043d, B:123:0x0447, B:128:0x0458, B:133:0x0471, B:138:0x048a, B:140:0x0494, B:145:0x04a5, B:147:0x04af, B:152:0x04c0, B:154:0x04ca, B:159:0x04db, B:161:0x04e5, B:166:0x04f6, B:170:0x050c, B:175:0x0521, B:177:0x0529, B:182:0x053a, B:184:0x0542, B:189:0x0553, B:191:0x055b, B:196:0x056c, B:198:0x0576, B:203:0x0587, B:207:0x059d, B:209:0x05a3, B:214:0x05ba, B:216:0x05c4, B:220:0x05d2, B:222:0x05d8, B:226:0x05e6, B:228:0x05ee, B:233:0x05ff, B:235:0x0609, B:240:0x062d, B:245:0x063c, B:250:0x0655, B:252:0x065f, B:257:0x0670, B:259:0x0678, B:264:0x0689, B:266:0x0693, B:271:0x06a4, B:273:0x06ac, B:278:0x06bd, B:280:0x06c7, B:285:0x06da, B:290:0x06f5, B:292:0x06ff, B:297:0x071c, B:299:0x0722, B:301:0x072a, B:308:0x074b, B:313:0x0760, B:315:0x076a, B:320:0x0779, B:322:0x0783, B:327:0x0792, B:329:0x079c, B:330:0x07a3, B:334:0x07ba, B:338:0x07c6, B:342:0x07d8, B:344:0x07de, B:349:0x07f3, B:354:0x0802, B:356:0x080c, B:361:0x081d, B:363:0x0827, B:367:0x0835, B:369:0x083b, B:374:0x0852, B:376:0x085c, B:380:0x086a, B:385:0x0883, B:387:0x088d, B:392:0x089e, B:394:0x08a8, B:398:0x08b6, B:403:0x08e3, B:405:0x08ed, B:410:0x0901, B:415:0x0924, B:419:0x0951, B:421:0x0957, B:422:0x09ba, B:423:0x09bf, B:418:0x0949, B:414:0x091b, B:409:0x08fa, B:424:0x09c0, B:425:0x09c5, B:402:0x08da, B:397:0x08b2, B:426:0x09c6, B:427:0x09cb, B:391:0x0899, B:428:0x09cc, B:429:0x09d1, B:384:0x087e, B:379:0x0866, B:430:0x09d2, B:431:0x09d7, B:373:0x0849, B:432:0x09d8, B:433:0x09dd, B:366:0x0831, B:434:0x09de, B:435:0x09e3, B:360:0x0818, B:436:0x09e4, B:437:0x09e9, B:353:0x07fd, B:438:0x09ea, B:439:0x09ef, B:341:0x07d0, B:440:0x09f0, B:441:0x09f5, B:333:0x07b6, B:442:0x09f6, B:443:0x09fb, B:326:0x078d, B:444:0x09fc, B:445:0x0a01, B:319:0x0774, B:446:0x0a02, B:447:0x0a07, B:312:0x0757, B:296:0x070e, B:448:0x0a08, B:449:0x0a0d, B:289:0x06ec, B:450:0x0a0e, B:451:0x0a13, B:277:0x06b8, B:452:0x0a14, B:453:0x0a1b, B:270:0x069f, B:454:0x0a1c, B:455:0x0a21, B:263:0x0684, B:456:0x0a22, B:457:0x0a29, B:256:0x066b, B:458:0x0a2a, B:459:0x0a31, B:249:0x0650, B:244:0x0637, B:460:0x0a32, B:461:0x0a37, B:232:0x05fa, B:462:0x0a38, B:463:0x0a3f, B:225:0x05e2, B:464:0x0a40, B:465:0x0a45, B:219:0x05ce, B:466:0x0a46, B:467:0x0a4b, B:213:0x05b1, B:468:0x0a4c, B:469:0x0a51, B:206:0x0599, B:202:0x0582, B:470:0x0a52, B:471:0x0a57, B:195:0x0567, B:472:0x0a58, B:473:0x0a5f, B:188:0x054e, B:474:0x0a60, B:475:0x0a67, B:181:0x0535, B:476:0x0a68, B:477:0x0a6f, B:174:0x051c, B:169:0x0508, B:165:0x04f1, B:478:0x0a70, B:479:0x0a75, B:158:0x04d6, B:480:0x0a76, B:481:0x0a7b, B:151:0x04bb, B:482:0x0a7c, B:483:0x0a81, B:144:0x04a0, B:484:0x0a82, B:485:0x0a87, B:137:0x0485, B:132:0x046c, B:127:0x0453, B:486:0x0a88, B:487:0x0a8d, B:120:0x0434, B:115:0x041a, B:488:0x0a8e, B:489:0x0a93, B:109:0x0404, B:490:0x0a94, B:491:0x0a99, B:103:0x03e9, B:93:0x03bb, B:492:0x0a9a, B:493:0x0a9f, B:84:0x039c, B:494:0x0aa0, B:495:0x0aa7, B:77:0x037f, B:496:0x0aa8, B:497:0x0aad, B:68:0x0360, B:63:0x0347, B:58:0x0333, B:498:0x0aae, B:499:0x0ab3, B:52:0x0319, B:500:0x0ab4, B:501:0x0ab9, B:46:0x0302, B:41:0x02f2, B:502:0x0aba, B:503:0x0abf, B:34:0x02d8, B:504:0x0ac0, B:505:0x0ac5, B:26:0x02ba, B:8:0x0025), top: B:510:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x076a A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0011, B:5:0x001e, B:9:0x0028, B:10:0x0264, B:12:0x026a, B:14:0x0276, B:16:0x0283, B:18:0x028d, B:20:0x029a, B:21:0x02ac, B:23:0x02b2, B:27:0x02be, B:30:0x02ca, B:35:0x02dd, B:38:0x02e9, B:42:0x02f8, B:47:0x0307, B:49:0x0311, B:53:0x031d, B:55:0x0327, B:59:0x0337, B:64:0x034c, B:69:0x0365, B:73:0x0373, B:78:0x0388, B:80:0x0390, B:85:0x03a1, B:89:0x03af, B:94:0x03c4, B:99:0x03df, B:104:0x03f0, B:106:0x03fa, B:110:0x0408, B:112:0x040e, B:116:0x0422, B:121:0x043d, B:123:0x0447, B:128:0x0458, B:133:0x0471, B:138:0x048a, B:140:0x0494, B:145:0x04a5, B:147:0x04af, B:152:0x04c0, B:154:0x04ca, B:159:0x04db, B:161:0x04e5, B:166:0x04f6, B:170:0x050c, B:175:0x0521, B:177:0x0529, B:182:0x053a, B:184:0x0542, B:189:0x0553, B:191:0x055b, B:196:0x056c, B:198:0x0576, B:203:0x0587, B:207:0x059d, B:209:0x05a3, B:214:0x05ba, B:216:0x05c4, B:220:0x05d2, B:222:0x05d8, B:226:0x05e6, B:228:0x05ee, B:233:0x05ff, B:235:0x0609, B:240:0x062d, B:245:0x063c, B:250:0x0655, B:252:0x065f, B:257:0x0670, B:259:0x0678, B:264:0x0689, B:266:0x0693, B:271:0x06a4, B:273:0x06ac, B:278:0x06bd, B:280:0x06c7, B:285:0x06da, B:290:0x06f5, B:292:0x06ff, B:297:0x071c, B:299:0x0722, B:301:0x072a, B:308:0x074b, B:313:0x0760, B:315:0x076a, B:320:0x0779, B:322:0x0783, B:327:0x0792, B:329:0x079c, B:330:0x07a3, B:334:0x07ba, B:338:0x07c6, B:342:0x07d8, B:344:0x07de, B:349:0x07f3, B:354:0x0802, B:356:0x080c, B:361:0x081d, B:363:0x0827, B:367:0x0835, B:369:0x083b, B:374:0x0852, B:376:0x085c, B:380:0x086a, B:385:0x0883, B:387:0x088d, B:392:0x089e, B:394:0x08a8, B:398:0x08b6, B:403:0x08e3, B:405:0x08ed, B:410:0x0901, B:415:0x0924, B:419:0x0951, B:421:0x0957, B:422:0x09ba, B:423:0x09bf, B:418:0x0949, B:414:0x091b, B:409:0x08fa, B:424:0x09c0, B:425:0x09c5, B:402:0x08da, B:397:0x08b2, B:426:0x09c6, B:427:0x09cb, B:391:0x0899, B:428:0x09cc, B:429:0x09d1, B:384:0x087e, B:379:0x0866, B:430:0x09d2, B:431:0x09d7, B:373:0x0849, B:432:0x09d8, B:433:0x09dd, B:366:0x0831, B:434:0x09de, B:435:0x09e3, B:360:0x0818, B:436:0x09e4, B:437:0x09e9, B:353:0x07fd, B:438:0x09ea, B:439:0x09ef, B:341:0x07d0, B:440:0x09f0, B:441:0x09f5, B:333:0x07b6, B:442:0x09f6, B:443:0x09fb, B:326:0x078d, B:444:0x09fc, B:445:0x0a01, B:319:0x0774, B:446:0x0a02, B:447:0x0a07, B:312:0x0757, B:296:0x070e, B:448:0x0a08, B:449:0x0a0d, B:289:0x06ec, B:450:0x0a0e, B:451:0x0a13, B:277:0x06b8, B:452:0x0a14, B:453:0x0a1b, B:270:0x069f, B:454:0x0a1c, B:455:0x0a21, B:263:0x0684, B:456:0x0a22, B:457:0x0a29, B:256:0x066b, B:458:0x0a2a, B:459:0x0a31, B:249:0x0650, B:244:0x0637, B:460:0x0a32, B:461:0x0a37, B:232:0x05fa, B:462:0x0a38, B:463:0x0a3f, B:225:0x05e2, B:464:0x0a40, B:465:0x0a45, B:219:0x05ce, B:466:0x0a46, B:467:0x0a4b, B:213:0x05b1, B:468:0x0a4c, B:469:0x0a51, B:206:0x0599, B:202:0x0582, B:470:0x0a52, B:471:0x0a57, B:195:0x0567, B:472:0x0a58, B:473:0x0a5f, B:188:0x054e, B:474:0x0a60, B:475:0x0a67, B:181:0x0535, B:476:0x0a68, B:477:0x0a6f, B:174:0x051c, B:169:0x0508, B:165:0x04f1, B:478:0x0a70, B:479:0x0a75, B:158:0x04d6, B:480:0x0a76, B:481:0x0a7b, B:151:0x04bb, B:482:0x0a7c, B:483:0x0a81, B:144:0x04a0, B:484:0x0a82, B:485:0x0a87, B:137:0x0485, B:132:0x046c, B:127:0x0453, B:486:0x0a88, B:487:0x0a8d, B:120:0x0434, B:115:0x041a, B:488:0x0a8e, B:489:0x0a93, B:109:0x0404, B:490:0x0a94, B:491:0x0a99, B:103:0x03e9, B:93:0x03bb, B:492:0x0a9a, B:493:0x0a9f, B:84:0x039c, B:494:0x0aa0, B:495:0x0aa7, B:77:0x037f, B:496:0x0aa8, B:497:0x0aad, B:68:0x0360, B:63:0x0347, B:58:0x0333, B:498:0x0aae, B:499:0x0ab3, B:52:0x0319, B:500:0x0ab4, B:501:0x0ab9, B:46:0x0302, B:41:0x02f2, B:502:0x0aba, B:503:0x0abf, B:34:0x02d8, B:504:0x0ac0, B:505:0x0ac5, B:26:0x02ba, B:8:0x0025), top: B:510:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07b6 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0011, B:5:0x001e, B:9:0x0028, B:10:0x0264, B:12:0x026a, B:14:0x0276, B:16:0x0283, B:18:0x028d, B:20:0x029a, B:21:0x02ac, B:23:0x02b2, B:27:0x02be, B:30:0x02ca, B:35:0x02dd, B:38:0x02e9, B:42:0x02f8, B:47:0x0307, B:49:0x0311, B:53:0x031d, B:55:0x0327, B:59:0x0337, B:64:0x034c, B:69:0x0365, B:73:0x0373, B:78:0x0388, B:80:0x0390, B:85:0x03a1, B:89:0x03af, B:94:0x03c4, B:99:0x03df, B:104:0x03f0, B:106:0x03fa, B:110:0x0408, B:112:0x040e, B:116:0x0422, B:121:0x043d, B:123:0x0447, B:128:0x0458, B:133:0x0471, B:138:0x048a, B:140:0x0494, B:145:0x04a5, B:147:0x04af, B:152:0x04c0, B:154:0x04ca, B:159:0x04db, B:161:0x04e5, B:166:0x04f6, B:170:0x050c, B:175:0x0521, B:177:0x0529, B:182:0x053a, B:184:0x0542, B:189:0x0553, B:191:0x055b, B:196:0x056c, B:198:0x0576, B:203:0x0587, B:207:0x059d, B:209:0x05a3, B:214:0x05ba, B:216:0x05c4, B:220:0x05d2, B:222:0x05d8, B:226:0x05e6, B:228:0x05ee, B:233:0x05ff, B:235:0x0609, B:240:0x062d, B:245:0x063c, B:250:0x0655, B:252:0x065f, B:257:0x0670, B:259:0x0678, B:264:0x0689, B:266:0x0693, B:271:0x06a4, B:273:0x06ac, B:278:0x06bd, B:280:0x06c7, B:285:0x06da, B:290:0x06f5, B:292:0x06ff, B:297:0x071c, B:299:0x0722, B:301:0x072a, B:308:0x074b, B:313:0x0760, B:315:0x076a, B:320:0x0779, B:322:0x0783, B:327:0x0792, B:329:0x079c, B:330:0x07a3, B:334:0x07ba, B:338:0x07c6, B:342:0x07d8, B:344:0x07de, B:349:0x07f3, B:354:0x0802, B:356:0x080c, B:361:0x081d, B:363:0x0827, B:367:0x0835, B:369:0x083b, B:374:0x0852, B:376:0x085c, B:380:0x086a, B:385:0x0883, B:387:0x088d, B:392:0x089e, B:394:0x08a8, B:398:0x08b6, B:403:0x08e3, B:405:0x08ed, B:410:0x0901, B:415:0x0924, B:419:0x0951, B:421:0x0957, B:422:0x09ba, B:423:0x09bf, B:418:0x0949, B:414:0x091b, B:409:0x08fa, B:424:0x09c0, B:425:0x09c5, B:402:0x08da, B:397:0x08b2, B:426:0x09c6, B:427:0x09cb, B:391:0x0899, B:428:0x09cc, B:429:0x09d1, B:384:0x087e, B:379:0x0866, B:430:0x09d2, B:431:0x09d7, B:373:0x0849, B:432:0x09d8, B:433:0x09dd, B:366:0x0831, B:434:0x09de, B:435:0x09e3, B:360:0x0818, B:436:0x09e4, B:437:0x09e9, B:353:0x07fd, B:438:0x09ea, B:439:0x09ef, B:341:0x07d0, B:440:0x09f0, B:441:0x09f5, B:333:0x07b6, B:442:0x09f6, B:443:0x09fb, B:326:0x078d, B:444:0x09fc, B:445:0x0a01, B:319:0x0774, B:446:0x0a02, B:447:0x0a07, B:312:0x0757, B:296:0x070e, B:448:0x0a08, B:449:0x0a0d, B:289:0x06ec, B:450:0x0a0e, B:451:0x0a13, B:277:0x06b8, B:452:0x0a14, B:453:0x0a1b, B:270:0x069f, B:454:0x0a1c, B:455:0x0a21, B:263:0x0684, B:456:0x0a22, B:457:0x0a29, B:256:0x066b, B:458:0x0a2a, B:459:0x0a31, B:249:0x0650, B:244:0x0637, B:460:0x0a32, B:461:0x0a37, B:232:0x05fa, B:462:0x0a38, B:463:0x0a3f, B:225:0x05e2, B:464:0x0a40, B:465:0x0a45, B:219:0x05ce, B:466:0x0a46, B:467:0x0a4b, B:213:0x05b1, B:468:0x0a4c, B:469:0x0a51, B:206:0x0599, B:202:0x0582, B:470:0x0a52, B:471:0x0a57, B:195:0x0567, B:472:0x0a58, B:473:0x0a5f, B:188:0x054e, B:474:0x0a60, B:475:0x0a67, B:181:0x0535, B:476:0x0a68, B:477:0x0a6f, B:174:0x051c, B:169:0x0508, B:165:0x04f1, B:478:0x0a70, B:479:0x0a75, B:158:0x04d6, B:480:0x0a76, B:481:0x0a7b, B:151:0x04bb, B:482:0x0a7c, B:483:0x0a81, B:144:0x04a0, B:484:0x0a82, B:485:0x0a87, B:137:0x0485, B:132:0x046c, B:127:0x0453, B:486:0x0a88, B:487:0x0a8d, B:120:0x0434, B:115:0x041a, B:488:0x0a8e, B:489:0x0a93, B:109:0x0404, B:490:0x0a94, B:491:0x0a99, B:103:0x03e9, B:93:0x03bb, B:492:0x0a9a, B:493:0x0a9f, B:84:0x039c, B:494:0x0aa0, B:495:0x0aa7, B:77:0x037f, B:496:0x0aa8, B:497:0x0aad, B:68:0x0360, B:63:0x0347, B:58:0x0333, B:498:0x0aae, B:499:0x0ab3, B:52:0x0319, B:500:0x0ab4, B:501:0x0ab9, B:46:0x0302, B:41:0x02f2, B:502:0x0aba, B:503:0x0abf, B:34:0x02d8, B:504:0x0ac0, B:505:0x0ac5, B:26:0x02ba, B:8:0x0025), top: B:510:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0a02 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x09f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List getComboOrdersByOptionInstrument$lambda$11(String str, ComboOrderDao_Impl comboOrderDao_Impl, UUID uuid, String str2, SQLiteConnection _connection) {
        int i;
        String text;
        String text2;
        int i2;
        String text3;
        String text4;
        String text5;
        String text6;
        Integer numValueOf;
        int i3;
        int i4;
        OptionChain.TickRequirements tickRequirements;
        Tradability tradabilityFromServerValue;
        String text7;
        String text8;
        String text9;
        String text10;
        String text11;
        String text12;
        BigDecimal bigDecimalStringToBigDecimal;
        int i5;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strUuidToString = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strUuidToString);
            }
            sQLiteStatementPrepare.bindText(2, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "averageNetPremiumPaid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancelUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canceledQuantity");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSymbol");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closingStrategy");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contractFees");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivedState");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "direction");
            String str3 = "getValue(...)";
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "goldSavings");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isReplaceable");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmount");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmountDirection");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openingStrategy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pendingQuantity");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "premium");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AnalyticsStrings.TAG_SORT_ORDER_PRICE);
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremium");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedQuantity");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "regulatoryFees");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stopPrice");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "strategy");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInForce");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedAt");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "refId");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremiumDirection");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmount");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmountDirection");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "formSource");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equityInstrumentId");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "underlyingSymbol");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_canOpenPosition");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_cashComponent");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_expirationDates");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_extendedHoursState");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_lateCloseState");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickAboveCutoff");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickBelowCutoff");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_cutoffPrice");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_receivedAt");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_settleOnOpen");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_symbol");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_tradeValueMultiplier");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_selloutTimeToExpiration");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_affiliateTradability");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_allDayTradability");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_carRequired");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_dayTradeRatio");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_defaultPresetPercentLimit");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_fractionalTradability");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_id");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_listDate");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_maintenanceRatio");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_marginInitialRatio");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_minTickSize");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_name");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_otcMarketTier");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_receivedAt");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_simpleName");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_state");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_symbol");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_tradableChainId");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_type");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_notionalEstimatedQuantityDecimals");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_shortSaleTradability");
            ArrayMap<String, List<UiComboOrderLeg>> arrayMap = new ArrayMap<>();
            int i6 = columnIndexOrThrow12;
            ArrayMap<String, List<ComboOrderSalesTax>> arrayMap2 = new ArrayMap<>();
            while (sQLiteStatementPrepare.step()) {
                int i7 = columnIndexOrThrow11;
                String text13 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (arrayMap.containsKey(text13)) {
                    i5 = columnIndexOrThrow10;
                } else {
                    i5 = columnIndexOrThrow10;
                    arrayMap.put(text13, new ArrayList());
                }
                String text14 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!arrayMap2.containsKey(text14)) {
                    arrayMap2.put(text14, new ArrayList());
                }
                columnIndexOrThrow11 = i7;
                columnIndexOrThrow10 = i5;
            }
            int i8 = columnIndexOrThrow10;
            int i9 = columnIndexOrThrow11;
            sQLiteStatementPrepare.reset();
            comboOrderDao_Impl.m2217x4e5ab2fa(_connection, arrayMap);
            comboOrderDao_Impl.m2219x367d9594(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text15 = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                int i10 = columnIndexOrThrow2;
                BigDecimal bigDecimalStringToBigDecimal2 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (bigDecimalStringToBigDecimal2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                int i11 = columnIndexOrThrow3;
                BigDecimal bigDecimalStringToBigDecimal3 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (bigDecimalStringToBigDecimal3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                UUID uuidStringToUuid2 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (uuidStringToUuid2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text17 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                OptionStrategyType.Companion companion = OptionStrategyType.INSTANCE;
                OptionStrategyType optionStrategyTypeFromServerValue = companion.fromServerValue(text18);
                int i12 = columnIndexOrThrow4;
                BigDecimal bigDecimalStringToBigDecimal4 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                int i13 = i8;
                i8 = i13;
                Instant instantStringToInstant = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i13) ? null : sQLiteStatementPrepare.getText(i13));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i14 = i9;
                if (sQLiteStatementPrepare.isNull(i14)) {
                    i = i14;
                    text = null;
                } else {
                    i = i14;
                    text = sQLiteStatementPrepare.getText(i14);
                }
                int i15 = columnIndexOrThrow5;
                OrderState orderStateFromServerValue = OrderState.INSTANCE.fromServerValue(text);
                if (orderStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.shared.models.history.shared.OrderState', but it was NULL.");
                }
                int i16 = i6;
                String text19 = sQLiteStatementPrepare.isNull(i16) ? null : sQLiteStatementPrepare.getText(i16);
                i6 = i16;
                OrderDirection.Companion companion2 = OrderDirection.INSTANCE;
                OrderDirection orderDirectionFromServerValue = companion2.fromServerValue(text19);
                if (orderDirectionFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i17 = columnIndexOrThrow6;
                int i18 = columnIndexOrThrow13;
                if (sQLiteStatementPrepare.isNull(i18)) {
                    columnIndexOrThrow13 = i18;
                    text2 = null;
                } else {
                    columnIndexOrThrow13 = i18;
                    text2 = sQLiteStatementPrepare.getText(i18);
                }
                int i19 = columnIndexOrThrow7;
                BigDecimal bigDecimalStringToBigDecimal5 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text2);
                int i20 = columnIndexOrThrow14;
                int i21 = columnIndexOrThrow8;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i20)) != 0;
                int i22 = columnIndexOrThrow15;
                BigDecimal bigDecimalStringToBigDecimal6 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i22) ? null : sQLiteStatementPrepare.getText(i22));
                if (bigDecimalStringToBigDecimal6 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i23 = columnIndexOrThrow16;
                OrderDirection orderDirectionFromServerValue2 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23));
                if (orderDirectionFromServerValue2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i24 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i24)) {
                    i2 = i23;
                    text3 = null;
                } else {
                    i2 = i23;
                    text3 = sQLiteStatementPrepare.getText(i24);
                }
                OptionStrategyType optionStrategyTypeFromServerValue2 = companion.fromServerValue(text3);
                int i25 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i25)) {
                    columnIndexOrThrow18 = i25;
                    text4 = null;
                } else {
                    columnIndexOrThrow18 = i25;
                    text4 = sQLiteStatementPrepare.getText(i25);
                }
                BigDecimal bigDecimalStringToBigDecimal7 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text4);
                if (bigDecimalStringToBigDecimal7 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i26 = columnIndexOrThrow19;
                columnIndexOrThrow19 = i26;
                BigDecimal bigDecimalStringToBigDecimal8 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i26) ? null : sQLiteStatementPrepare.getText(i26));
                int i27 = columnIndexOrThrow20;
                columnIndexOrThrow20 = i27;
                BigDecimal bigDecimalStringToBigDecimal9 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i27) ? null : sQLiteStatementPrepare.getText(i27));
                int i28 = columnIndexOrThrow21;
                columnIndexOrThrow21 = i28;
                BigDecimal bigDecimalStringToBigDecimal10 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i28) ? null : sQLiteStatementPrepare.getText(i28));
                if (bigDecimalStringToBigDecimal10 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i29 = columnIndexOrThrow22;
                columnIndexOrThrow22 = i29;
                BigDecimal bigDecimalStringToBigDecimal11 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29));
                if (bigDecimalStringToBigDecimal11 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i30 = columnIndexOrThrow23;
                columnIndexOrThrow23 = i30;
                BigDecimal bigDecimalStringToBigDecimal12 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i30) ? null : sQLiteStatementPrepare.getText(i30));
                if (bigDecimalStringToBigDecimal12 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i31 = columnIndexOrThrow24;
                columnIndexOrThrow24 = i31;
                BigDecimal bigDecimalStringToBigDecimal13 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i31) ? null : sQLiteStatementPrepare.getText(i31));
                if (bigDecimalStringToBigDecimal13 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i32 = columnIndexOrThrow25;
                columnIndexOrThrow25 = i32;
                BigDecimal bigDecimalStringToBigDecimal14 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32));
                int i33 = columnIndexOrThrow26;
                OptionStrategyType optionStrategyTypeFromServerValue3 = companion.fromServerValue(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                int i34 = columnIndexOrThrow27;
                columnIndexOrThrow26 = i33;
                OrderTimeInForce orderTimeInForceFromServerValue = OrderTimeInForce.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i34) ? null : sQLiteStatementPrepare.getText(i34));
                if (orderTimeInForceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTimeInForce', but it was NULL.");
                }
                int i35 = columnIndexOrThrow28;
                columnIndexOrThrow28 = i35;
                OrderTrigger orderTriggerFromServerValue = OrderTrigger.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i35) ? null : sQLiteStatementPrepare.getText(i35));
                if (orderTriggerFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTrigger', but it was NULL.");
                }
                int i36 = columnIndexOrThrow29;
                columnIndexOrThrow29 = i36;
                OrderType orderTypeFromServerValue = OrderType.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i36) ? null : sQLiteStatementPrepare.getText(i36));
                if (orderTypeFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderType', but it was NULL.");
                }
                int i37 = columnIndexOrThrow30;
                columnIndexOrThrow30 = i37;
                Instant instantStringToInstant2 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i37) ? null : sQLiteStatementPrepare.getText(i37));
                if (instantStringToInstant2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i38 = columnIndexOrThrow31;
                columnIndexOrThrow31 = i38;
                UUID uuidStringToUuid3 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i38) ? null : sQLiteStatementPrepare.getText(i38));
                int i39 = columnIndexOrThrow32;
                OrderDirection orderDirectionFromServerValue3 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i39) ? null : sQLiteStatementPrepare.getText(i39));
                if (orderDirectionFromServerValue3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i40 = columnIndexOrThrow33;
                if (sQLiteStatementPrepare.isNull(i40)) {
                    columnIndexOrThrow32 = i39;
                    text5 = null;
                } else {
                    columnIndexOrThrow32 = i39;
                    text5 = sQLiteStatementPrepare.getText(i40);
                }
                columnIndexOrThrow27 = i34;
                BigDecimal bigDecimalStringToBigDecimal15 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text5);
                if (bigDecimalStringToBigDecimal15 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i41 = columnIndexOrThrow34;
                OrderDirection orderDirectionFromServerValue4 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i41) ? null : sQLiteStatementPrepare.getText(i41));
                if (orderDirectionFromServerValue4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i42 = columnIndexOrThrow35;
                OptionOrder.FormSource formSourceFromServerValue = OptionOrder.FormSource.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i42) ? null : sQLiteStatementPrepare.getText(i42));
                if (formSourceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionOrder.FormSource', but it was NULL.");
                }
                int i43 = columnIndexOrThrow36;
                columnIndexOrThrow35 = i42;
                UUID uuidStringToUuid4 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                if (uuidStringToUuid4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i44 = columnIndexOrThrow37;
                ComboOrder comboOrder = new ComboOrder(uuidStringToUuid, text15, bigDecimalStringToBigDecimal2, text16, bigDecimalStringToBigDecimal3, uuidStringToUuid2, text17, optionStrategyTypeFromServerValue, bigDecimalStringToBigDecimal4, instantStringToInstant, orderStateFromServerValue, orderDirectionFromServerValue, bigDecimalStringToBigDecimal5, z, bigDecimalStringToBigDecimal6, orderDirectionFromServerValue2, optionStrategyTypeFromServerValue2, bigDecimalStringToBigDecimal7, bigDecimalStringToBigDecimal8, bigDecimalStringToBigDecimal9, bigDecimalStringToBigDecimal10, bigDecimalStringToBigDecimal11, bigDecimalStringToBigDecimal12, bigDecimalStringToBigDecimal13, bigDecimalStringToBigDecimal14, optionStrategyTypeFromServerValue3, orderTimeInForceFromServerValue, orderTriggerFromServerValue, orderTypeFromServerValue, instantStringToInstant2, uuidStringToUuid3, orderDirectionFromServerValue3, bigDecimalStringToBigDecimal15, orderDirectionFromServerValue4, formSourceFromServerValue, uuidStringToUuid4, sQLiteStatementPrepare.getText(i44));
                columnIndexOrThrow37 = i44;
                columnIndexOrThrow36 = i43;
                int i45 = columnIndexOrThrow38;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i45)) != 0;
                int i46 = columnIndexOrThrow39;
                columnIndexOrThrow39 = i46;
                BigDecimal bigDecimalStringToBigDecimal16 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i46) ? null : sQLiteStatementPrepare.getText(i46));
                int i47 = columnIndexOrThrow40;
                columnIndexOrThrow40 = i47;
                ImmutableList<LocalDate> immutableListStringToLocalDateImmutableList = comboOrderDao_Impl.__modelRoomConverters().stringToLocalDateImmutableList(sQLiteStatementPrepare.isNull(i47) ? null : sQLiteStatementPrepare.getText(i47));
                if (immutableListStringToLocalDateImmutableList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlinx.collections.immutable.ImmutableList<java.time.LocalDate>', but it was NULL.");
                }
                int i48 = columnIndexOrThrow41;
                columnIndexOrThrow41 = i48;
                OptionChain.ExtendedHoursState extendedHoursStateFromServerValue = OptionChain.ExtendedHoursState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i48) ? null : sQLiteStatementPrepare.getText(i48));
                if (extendedHoursStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.ExtendedHoursState', but it was NULL.");
                }
                int i49 = columnIndexOrThrow42;
                columnIndexOrThrow42 = i49;
                UUID uuidStringToUuid5 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i49) ? null : sQLiteStatementPrepare.getText(i49));
                if (uuidStringToUuid5 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i50 = columnIndexOrThrow43;
                columnIndexOrThrow43 = i50;
                OptionChain.LateCloseState lateCloseStateFromServerValue = OptionChain.LateCloseState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i50) ? null : sQLiteStatementPrepare.getText(i50));
                if (lateCloseStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.LateCloseState', but it was NULL.");
                }
                int i51 = columnIndexOrThrow47;
                columnIndexOrThrow47 = i51;
                Instant instantStringToInstant3 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i51) ? null : sQLiteStatementPrepare.getText(i51));
                if (instantStringToInstant3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                columnIndexOrThrow34 = i41;
                int i52 = columnIndexOrThrow48;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i52)) != 0;
                int i53 = columnIndexOrThrow49;
                String text20 = sQLiteStatementPrepare.getText(i53);
                int i54 = columnIndexOrThrow50;
                if (sQLiteStatementPrepare.isNull(i54)) {
                    columnIndexOrThrow48 = i52;
                    text6 = null;
                } else {
                    columnIndexOrThrow48 = i52;
                    text6 = sQLiteStatementPrepare.getText(i54);
                }
                columnIndexOrThrow49 = i53;
                BigDecimal bigDecimalStringToBigDecimal17 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text6);
                if (bigDecimalStringToBigDecimal17 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i55 = columnIndexOrThrow51;
                if (sQLiteStatementPrepare.isNull(i55)) {
                    columnIndexOrThrow50 = i54;
                    numValueOf = null;
                } else {
                    columnIndexOrThrow50 = i54;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i55));
                }
                int i56 = columnIndexOrThrow44;
                if (sQLiteStatementPrepare.isNull(i56)) {
                    i3 = columnIndexOrThrow45;
                    if (sQLiteStatementPrepare.isNull(i3)) {
                        columnIndexOrThrow51 = i55;
                        i4 = columnIndexOrThrow46;
                        if (!sQLiteStatementPrepare.isNull(i4)) {
                            if (sQLiteStatementPrepare.isNull(i56)) {
                                columnIndexOrThrow44 = i56;
                                text12 = sQLiteStatementPrepare.getText(i56);
                            } else {
                                columnIndexOrThrow44 = i56;
                                text12 = null;
                            }
                            columnIndexOrThrow38 = i45;
                            bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                            if (bigDecimalStringToBigDecimal != null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow45 = i3;
                            BigDecimal bigDecimalStringToBigDecimal18 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3));
                            if (bigDecimalStringToBigDecimal18 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow46 = i4;
                            BigDecimal bigDecimalStringToBigDecimal19 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4));
                            if (bigDecimalStringToBigDecimal19 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            tickRequirements = new OptionChain.TickRequirements(bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal18, bigDecimalStringToBigDecimal19);
                            OptionChain optionChain = new OptionChain(z2, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z3, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i57 = columnIndexOrThrow52;
                            String text21 = !sQLiteStatementPrepare.isNull(i57) ? null : sQLiteStatementPrepare.getText(i57);
                            Tradability.Companion companion3 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion3.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i58 = columnIndexOrThrow53;
                            if (sQLiteStatementPrepare.isNull(i58)) {
                                columnIndexOrThrow52 = i57;
                                text7 = null;
                            } else {
                                columnIndexOrThrow52 = i57;
                                text7 = sQLiteStatementPrepare.getText(i58);
                            }
                            Tradability tradabilityFromServerValue2 = companion3.fromServerValue(text7);
                            if (tradabilityFromServerValue2 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            columnIndexOrThrow53 = i58;
                            int i59 = columnIndexOrThrow54;
                            boolean z4 = ((int) sQLiteStatementPrepare.getLong(i59)) != 0;
                            int i60 = columnIndexOrThrow55;
                            columnIndexOrThrow54 = i59;
                            BigDecimal bigDecimalStringToBigDecimal20 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i60) ? null : sQLiteStatementPrepare.getText(i60));
                            if (bigDecimalStringToBigDecimal20 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i61 = columnIndexOrThrow56;
                            columnIndexOrThrow56 = i61;
                            BigDecimal bigDecimalStringToBigDecimal21 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i61) ? null : sQLiteStatementPrepare.getText(i61));
                            if (bigDecimalStringToBigDecimal21 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i62 = columnIndexOrThrow57;
                            Tradability tradabilityFromServerValue3 = companion3.fromServerValue(sQLiteStatementPrepare.isNull(i62) ? null : sQLiteStatementPrepare.getText(i62));
                            if (tradabilityFromServerValue3 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i63 = columnIndexOrThrow58;
                            if (sQLiteStatementPrepare.isNull(i63)) {
                                columnIndexOrThrow57 = i62;
                                text8 = null;
                            } else {
                                columnIndexOrThrow57 = i62;
                                text8 = sQLiteStatementPrepare.getText(i63);
                            }
                            columnIndexOrThrow55 = i60;
                            UUID uuidStringToUuid6 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text8);
                            if (uuidStringToUuid6 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                            int i64 = columnIndexOrThrow59;
                            LocalDate localDateStringToLocalDate = comboOrderDao_Impl.__commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(i64) ? null : sQLiteStatementPrepare.getText(i64));
                            int i65 = columnIndexOrThrow60;
                            columnIndexOrThrow59 = i64;
                            BigDecimal bigDecimalStringToBigDecimal22 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i65) ? null : sQLiteStatementPrepare.getText(i65));
                            if (bigDecimalStringToBigDecimal22 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i66 = columnIndexOrThrow61;
                            columnIndexOrThrow61 = i66;
                            BigDecimal bigDecimalStringToBigDecimal23 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66));
                            if (bigDecimalStringToBigDecimal23 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i67 = columnIndexOrThrow62;
                            BigDecimal bigDecimalStringToBigDecimal24 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i67) ? null : sQLiteStatementPrepare.getText(i67));
                            int i68 = columnIndexOrThrow63;
                            String text22 = sQLiteStatementPrepare.getText(i68);
                            int i69 = columnIndexOrThrow64;
                            String text23 = sQLiteStatementPrepare.getText(i69);
                            columnIndexOrThrow63 = i68;
                            int i70 = columnIndexOrThrow65;
                            if (sQLiteStatementPrepare.isNull(i70)) {
                                columnIndexOrThrow65 = i70;
                                text9 = null;
                            } else {
                                columnIndexOrThrow65 = i70;
                                text9 = sQLiteStatementPrepare.getText(i70);
                            }
                            columnIndexOrThrow62 = i67;
                            Instant instantStringToInstant4 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(text9);
                            if (instantStringToInstant4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                            }
                            int i71 = columnIndexOrThrow66;
                            String text24 = sQLiteStatementPrepare.isNull(i71) ? null : sQLiteStatementPrepare.getText(i71);
                            int i72 = columnIndexOrThrow67;
                            String text25 = sQLiteStatementPrepare.getText(i72);
                            int i73 = columnIndexOrThrow68;
                            String text26 = sQLiteStatementPrepare.getText(i73);
                            columnIndexOrThrow66 = i71;
                            int i74 = columnIndexOrThrow69;
                            if (sQLiteStatementPrepare.isNull(i74)) {
                                columnIndexOrThrow69 = i74;
                                text10 = null;
                            } else {
                                columnIndexOrThrow69 = i74;
                                text10 = sQLiteStatementPrepare.getText(i74);
                            }
                            columnIndexOrThrow67 = i72;
                            UUID uuidStringToUuid7 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text10);
                            int i75 = columnIndexOrThrow70;
                            String text27 = sQLiteStatementPrepare.getText(i75);
                            columnIndexOrThrow60 = i65;
                            columnIndexOrThrow58 = i63;
                            int i76 = columnIndexOrThrow71;
                            int i77 = (int) sQLiteStatementPrepare.getLong(i76);
                            int i78 = columnIndexOrThrow72;
                            if (sQLiteStatementPrepare.isNull(i78)) {
                                columnIndexOrThrow70 = i75;
                                text11 = null;
                            } else {
                                columnIndexOrThrow70 = i75;
                                text11 = sQLiteStatementPrepare.getText(i78);
                            }
                            Tradability tradabilityFromServerValue4 = companion3.fromServerValue(text11);
                            if (tradabilityFromServerValue4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            Instrument instrument = new Instrument(tradabilityFromServerValue, z4, bigDecimalStringToBigDecimal20, bigDecimalStringToBigDecimal21, tradabilityFromServerValue3, tradabilityFromServerValue2, uuidStringToUuid6, null, null, null, localDateStringToLocalDate, bigDecimalStringToBigDecimal22, bigDecimalStringToBigDecimal23, bigDecimalStringToBigDecimal24, text22, text23, instantStringToInstant4, text24, text25, text26, uuidStringToUuid7, text27, i77, tradabilityFromServerValue4, null, null);
                            Object value = MapsKt.getValue(arrayMap, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            String str4 = str3;
                            Intrinsics.checkNotNullExpressionValue(value, str4);
                            List list = (List) value;
                            Object value2 = MapsKt.getValue(arrayMap2, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            Intrinsics.checkNotNullExpressionValue(value2, str4);
                            arrayList.add(new UiComboOrder(comboOrder, optionChain, instrument, list, (List) value2));
                            columnIndexOrThrow71 = i76;
                            columnIndexOrThrow68 = i73;
                            str3 = str4;
                            columnIndexOrThrow72 = i78;
                            columnIndexOrThrow64 = i69;
                            columnIndexOrThrow5 = i15;
                            columnIndexOrThrow2 = i10;
                            columnIndexOrThrow3 = i11;
                            columnIndexOrThrow4 = i12;
                            i9 = i;
                            columnIndexOrThrow6 = i17;
                            columnIndexOrThrow7 = i19;
                            columnIndexOrThrow8 = i21;
                            columnIndexOrThrow14 = i20;
                            columnIndexOrThrow15 = i22;
                            columnIndexOrThrow16 = i2;
                            columnIndexOrThrow17 = i24;
                            columnIndexOrThrow33 = i40;
                        } else {
                            columnIndexOrThrow46 = i4;
                            columnIndexOrThrow44 = i56;
                            columnIndexOrThrow45 = i3;
                            columnIndexOrThrow38 = i45;
                            tickRequirements = null;
                            OptionChain optionChain2 = new OptionChain(z2, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z3, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i572 = columnIndexOrThrow52;
                            if (!sQLiteStatementPrepare.isNull(i572)) {
                            }
                            Tradability.Companion companion32 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion32.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                            }
                        }
                    } else {
                        columnIndexOrThrow51 = i55;
                    }
                } else {
                    columnIndexOrThrow51 = i55;
                    i3 = columnIndexOrThrow45;
                }
                i4 = columnIndexOrThrow46;
                if (sQLiteStatementPrepare.isNull(i56)) {
                }
                columnIndexOrThrow38 = i45;
                bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                if (bigDecimalStringToBigDecimal != null) {
                }
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    public Flow<List<UiComboOrder>> getComboOrdersByOrderState(final String accountNumber, final Set<? extends OrderState> orderStates) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderStates, "orderStates");
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        SELECT *");
        sb.append("\n");
        sb.append("        FROM UiComboOrder");
        sb.append("\n");
        sb.append("        WHERE derivedState IN (");
        final int size = orderStates.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(") AND accountNumber = ");
        sb.append("?");
        sb.append("\n");
        sb.append("        ORDER BY updatedAt DESC");
        sb.append("\n");
        sb.append("        ");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return FlowBuilder.createFlow(this.__db, true, new String[]{"ComboOrderExecution", "OptionInstrument", "Instrument", "ComboOrderLeg", "ComboOrderSalesTax", "UiComboOrder"}, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.getComboOrdersByOrderState$lambda$12(string2, orderStates, size, accountNumber, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0768 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0011, B:4:0x0017, B:6:0x001d, B:8:0x002b, B:12:0x0035, B:11:0x0032, B:13:0x0038, B:14:0x0275, B:16:0x027b, B:18:0x0287, B:20:0x0294, B:22:0x029e, B:24:0x02ab, B:25:0x02bd, B:27:0x02c3, B:31:0x02cf, B:34:0x02db, B:39:0x02ee, B:42:0x02fa, B:46:0x0309, B:51:0x0318, B:53:0x0322, B:57:0x032e, B:59:0x0338, B:63:0x0348, B:68:0x035d, B:73:0x0376, B:77:0x0384, B:82:0x0399, B:84:0x03a1, B:89:0x03b2, B:93:0x03c0, B:98:0x03d5, B:103:0x03f0, B:108:0x0401, B:110:0x040b, B:114:0x0419, B:116:0x041f, B:120:0x0433, B:125:0x044e, B:127:0x0458, B:132:0x0469, B:137:0x0482, B:142:0x049b, B:144:0x04a5, B:149:0x04b6, B:151:0x04c0, B:156:0x04d1, B:158:0x04db, B:163:0x04ec, B:165:0x04f6, B:170:0x0507, B:174:0x051d, B:179:0x0532, B:181:0x053a, B:186:0x054b, B:188:0x0553, B:193:0x0564, B:195:0x056c, B:200:0x057d, B:202:0x0587, B:207:0x0598, B:211:0x05ae, B:213:0x05b4, B:218:0x05cb, B:220:0x05d5, B:224:0x05e3, B:226:0x05e9, B:230:0x05f7, B:232:0x05ff, B:237:0x0610, B:239:0x061a, B:244:0x063e, B:249:0x064d, B:254:0x0666, B:256:0x0670, B:261:0x0681, B:263:0x0689, B:268:0x069a, B:270:0x06a4, B:275:0x06b5, B:277:0x06bd, B:282:0x06ce, B:284:0x06d8, B:289:0x06eb, B:294:0x0706, B:296:0x0710, B:301:0x072d, B:303:0x0733, B:305:0x073b, B:312:0x075c, B:317:0x0771, B:319:0x077b, B:324:0x078a, B:326:0x0794, B:331:0x07a3, B:333:0x07ad, B:334:0x07b4, B:338:0x07cb, B:342:0x07d7, B:346:0x07e9, B:348:0x07ef, B:353:0x0804, B:358:0x0813, B:360:0x081d, B:365:0x082e, B:367:0x0838, B:371:0x0846, B:373:0x084c, B:378:0x0863, B:380:0x086d, B:384:0x087b, B:389:0x0894, B:391:0x089e, B:396:0x08af, B:398:0x08b9, B:402:0x08c7, B:407:0x08f4, B:409:0x08fe, B:414:0x0912, B:419:0x0935, B:423:0x0962, B:425:0x0968, B:426:0x09cb, B:427:0x09d0, B:422:0x095a, B:418:0x092c, B:413:0x090b, B:428:0x09d1, B:429:0x09d6, B:406:0x08eb, B:401:0x08c3, B:430:0x09d7, B:431:0x09dc, B:395:0x08aa, B:432:0x09dd, B:433:0x09e2, B:388:0x088f, B:383:0x0877, B:434:0x09e3, B:435:0x09e8, B:377:0x085a, B:436:0x09e9, B:437:0x09ee, B:370:0x0842, B:438:0x09ef, B:439:0x09f4, B:364:0x0829, B:440:0x09f5, B:441:0x09fa, B:357:0x080e, B:442:0x09fb, B:443:0x0a00, B:345:0x07e1, B:444:0x0a01, B:445:0x0a06, B:337:0x07c7, B:446:0x0a07, B:447:0x0a0c, B:330:0x079e, B:448:0x0a0d, B:449:0x0a12, B:323:0x0785, B:450:0x0a13, B:451:0x0a18, B:316:0x0768, B:300:0x071f, B:452:0x0a19, B:453:0x0a1e, B:293:0x06fd, B:454:0x0a1f, B:455:0x0a24, B:281:0x06c9, B:456:0x0a25, B:457:0x0a2c, B:274:0x06b0, B:458:0x0a2d, B:459:0x0a32, B:267:0x0695, B:460:0x0a33, B:461:0x0a3a, B:260:0x067c, B:462:0x0a3b, B:463:0x0a42, B:253:0x0661, B:248:0x0648, B:464:0x0a43, B:465:0x0a48, B:236:0x060b, B:466:0x0a49, B:467:0x0a50, B:229:0x05f3, B:468:0x0a51, B:469:0x0a56, B:223:0x05df, B:470:0x0a57, B:471:0x0a5c, B:217:0x05c2, B:472:0x0a5d, B:473:0x0a62, B:210:0x05aa, B:206:0x0593, B:474:0x0a63, B:475:0x0a68, B:199:0x0578, B:476:0x0a69, B:477:0x0a70, B:192:0x055f, B:478:0x0a71, B:479:0x0a78, B:185:0x0546, B:480:0x0a79, B:481:0x0a80, B:178:0x052d, B:173:0x0519, B:169:0x0502, B:482:0x0a81, B:483:0x0a86, B:162:0x04e7, B:484:0x0a87, B:485:0x0a8c, B:155:0x04cc, B:486:0x0a8d, B:487:0x0a92, B:148:0x04b1, B:488:0x0a93, B:489:0x0a98, B:141:0x0496, B:136:0x047d, B:131:0x0464, B:490:0x0a99, B:491:0x0a9e, B:124:0x0445, B:119:0x042b, B:492:0x0a9f, B:493:0x0aa4, B:113:0x0415, B:494:0x0aa5, B:495:0x0aaa, B:107:0x03fa, B:97:0x03cc, B:496:0x0aab, B:497:0x0ab0, B:88:0x03ad, B:498:0x0ab1, B:499:0x0ab8, B:81:0x0390, B:500:0x0ab9, B:501:0x0abe, B:72:0x0371, B:67:0x0358, B:62:0x0344, B:502:0x0abf, B:503:0x0ac4, B:56:0x032a, B:504:0x0ac5, B:505:0x0aca, B:50:0x0313, B:45:0x0303, B:506:0x0acb, B:507:0x0ad0, B:38:0x02e9, B:508:0x0ad1, B:509:0x0ad6, B:30:0x02cb), top: B:514:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x077b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0011, B:4:0x0017, B:6:0x001d, B:8:0x002b, B:12:0x0035, B:11:0x0032, B:13:0x0038, B:14:0x0275, B:16:0x027b, B:18:0x0287, B:20:0x0294, B:22:0x029e, B:24:0x02ab, B:25:0x02bd, B:27:0x02c3, B:31:0x02cf, B:34:0x02db, B:39:0x02ee, B:42:0x02fa, B:46:0x0309, B:51:0x0318, B:53:0x0322, B:57:0x032e, B:59:0x0338, B:63:0x0348, B:68:0x035d, B:73:0x0376, B:77:0x0384, B:82:0x0399, B:84:0x03a1, B:89:0x03b2, B:93:0x03c0, B:98:0x03d5, B:103:0x03f0, B:108:0x0401, B:110:0x040b, B:114:0x0419, B:116:0x041f, B:120:0x0433, B:125:0x044e, B:127:0x0458, B:132:0x0469, B:137:0x0482, B:142:0x049b, B:144:0x04a5, B:149:0x04b6, B:151:0x04c0, B:156:0x04d1, B:158:0x04db, B:163:0x04ec, B:165:0x04f6, B:170:0x0507, B:174:0x051d, B:179:0x0532, B:181:0x053a, B:186:0x054b, B:188:0x0553, B:193:0x0564, B:195:0x056c, B:200:0x057d, B:202:0x0587, B:207:0x0598, B:211:0x05ae, B:213:0x05b4, B:218:0x05cb, B:220:0x05d5, B:224:0x05e3, B:226:0x05e9, B:230:0x05f7, B:232:0x05ff, B:237:0x0610, B:239:0x061a, B:244:0x063e, B:249:0x064d, B:254:0x0666, B:256:0x0670, B:261:0x0681, B:263:0x0689, B:268:0x069a, B:270:0x06a4, B:275:0x06b5, B:277:0x06bd, B:282:0x06ce, B:284:0x06d8, B:289:0x06eb, B:294:0x0706, B:296:0x0710, B:301:0x072d, B:303:0x0733, B:305:0x073b, B:312:0x075c, B:317:0x0771, B:319:0x077b, B:324:0x078a, B:326:0x0794, B:331:0x07a3, B:333:0x07ad, B:334:0x07b4, B:338:0x07cb, B:342:0x07d7, B:346:0x07e9, B:348:0x07ef, B:353:0x0804, B:358:0x0813, B:360:0x081d, B:365:0x082e, B:367:0x0838, B:371:0x0846, B:373:0x084c, B:378:0x0863, B:380:0x086d, B:384:0x087b, B:389:0x0894, B:391:0x089e, B:396:0x08af, B:398:0x08b9, B:402:0x08c7, B:407:0x08f4, B:409:0x08fe, B:414:0x0912, B:419:0x0935, B:423:0x0962, B:425:0x0968, B:426:0x09cb, B:427:0x09d0, B:422:0x095a, B:418:0x092c, B:413:0x090b, B:428:0x09d1, B:429:0x09d6, B:406:0x08eb, B:401:0x08c3, B:430:0x09d7, B:431:0x09dc, B:395:0x08aa, B:432:0x09dd, B:433:0x09e2, B:388:0x088f, B:383:0x0877, B:434:0x09e3, B:435:0x09e8, B:377:0x085a, B:436:0x09e9, B:437:0x09ee, B:370:0x0842, B:438:0x09ef, B:439:0x09f4, B:364:0x0829, B:440:0x09f5, B:441:0x09fa, B:357:0x080e, B:442:0x09fb, B:443:0x0a00, B:345:0x07e1, B:444:0x0a01, B:445:0x0a06, B:337:0x07c7, B:446:0x0a07, B:447:0x0a0c, B:330:0x079e, B:448:0x0a0d, B:449:0x0a12, B:323:0x0785, B:450:0x0a13, B:451:0x0a18, B:316:0x0768, B:300:0x071f, B:452:0x0a19, B:453:0x0a1e, B:293:0x06fd, B:454:0x0a1f, B:455:0x0a24, B:281:0x06c9, B:456:0x0a25, B:457:0x0a2c, B:274:0x06b0, B:458:0x0a2d, B:459:0x0a32, B:267:0x0695, B:460:0x0a33, B:461:0x0a3a, B:260:0x067c, B:462:0x0a3b, B:463:0x0a42, B:253:0x0661, B:248:0x0648, B:464:0x0a43, B:465:0x0a48, B:236:0x060b, B:466:0x0a49, B:467:0x0a50, B:229:0x05f3, B:468:0x0a51, B:469:0x0a56, B:223:0x05df, B:470:0x0a57, B:471:0x0a5c, B:217:0x05c2, B:472:0x0a5d, B:473:0x0a62, B:210:0x05aa, B:206:0x0593, B:474:0x0a63, B:475:0x0a68, B:199:0x0578, B:476:0x0a69, B:477:0x0a70, B:192:0x055f, B:478:0x0a71, B:479:0x0a78, B:185:0x0546, B:480:0x0a79, B:481:0x0a80, B:178:0x052d, B:173:0x0519, B:169:0x0502, B:482:0x0a81, B:483:0x0a86, B:162:0x04e7, B:484:0x0a87, B:485:0x0a8c, B:155:0x04cc, B:486:0x0a8d, B:487:0x0a92, B:148:0x04b1, B:488:0x0a93, B:489:0x0a98, B:141:0x0496, B:136:0x047d, B:131:0x0464, B:490:0x0a99, B:491:0x0a9e, B:124:0x0445, B:119:0x042b, B:492:0x0a9f, B:493:0x0aa4, B:113:0x0415, B:494:0x0aa5, B:495:0x0aaa, B:107:0x03fa, B:97:0x03cc, B:496:0x0aab, B:497:0x0ab0, B:88:0x03ad, B:498:0x0ab1, B:499:0x0ab8, B:81:0x0390, B:500:0x0ab9, B:501:0x0abe, B:72:0x0371, B:67:0x0358, B:62:0x0344, B:502:0x0abf, B:503:0x0ac4, B:56:0x032a, B:504:0x0ac5, B:505:0x0aca, B:50:0x0313, B:45:0x0303, B:506:0x0acb, B:507:0x0ad0, B:38:0x02e9, B:508:0x0ad1, B:509:0x0ad6, B:30:0x02cb), top: B:514:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07c7 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0011, B:4:0x0017, B:6:0x001d, B:8:0x002b, B:12:0x0035, B:11:0x0032, B:13:0x0038, B:14:0x0275, B:16:0x027b, B:18:0x0287, B:20:0x0294, B:22:0x029e, B:24:0x02ab, B:25:0x02bd, B:27:0x02c3, B:31:0x02cf, B:34:0x02db, B:39:0x02ee, B:42:0x02fa, B:46:0x0309, B:51:0x0318, B:53:0x0322, B:57:0x032e, B:59:0x0338, B:63:0x0348, B:68:0x035d, B:73:0x0376, B:77:0x0384, B:82:0x0399, B:84:0x03a1, B:89:0x03b2, B:93:0x03c0, B:98:0x03d5, B:103:0x03f0, B:108:0x0401, B:110:0x040b, B:114:0x0419, B:116:0x041f, B:120:0x0433, B:125:0x044e, B:127:0x0458, B:132:0x0469, B:137:0x0482, B:142:0x049b, B:144:0x04a5, B:149:0x04b6, B:151:0x04c0, B:156:0x04d1, B:158:0x04db, B:163:0x04ec, B:165:0x04f6, B:170:0x0507, B:174:0x051d, B:179:0x0532, B:181:0x053a, B:186:0x054b, B:188:0x0553, B:193:0x0564, B:195:0x056c, B:200:0x057d, B:202:0x0587, B:207:0x0598, B:211:0x05ae, B:213:0x05b4, B:218:0x05cb, B:220:0x05d5, B:224:0x05e3, B:226:0x05e9, B:230:0x05f7, B:232:0x05ff, B:237:0x0610, B:239:0x061a, B:244:0x063e, B:249:0x064d, B:254:0x0666, B:256:0x0670, B:261:0x0681, B:263:0x0689, B:268:0x069a, B:270:0x06a4, B:275:0x06b5, B:277:0x06bd, B:282:0x06ce, B:284:0x06d8, B:289:0x06eb, B:294:0x0706, B:296:0x0710, B:301:0x072d, B:303:0x0733, B:305:0x073b, B:312:0x075c, B:317:0x0771, B:319:0x077b, B:324:0x078a, B:326:0x0794, B:331:0x07a3, B:333:0x07ad, B:334:0x07b4, B:338:0x07cb, B:342:0x07d7, B:346:0x07e9, B:348:0x07ef, B:353:0x0804, B:358:0x0813, B:360:0x081d, B:365:0x082e, B:367:0x0838, B:371:0x0846, B:373:0x084c, B:378:0x0863, B:380:0x086d, B:384:0x087b, B:389:0x0894, B:391:0x089e, B:396:0x08af, B:398:0x08b9, B:402:0x08c7, B:407:0x08f4, B:409:0x08fe, B:414:0x0912, B:419:0x0935, B:423:0x0962, B:425:0x0968, B:426:0x09cb, B:427:0x09d0, B:422:0x095a, B:418:0x092c, B:413:0x090b, B:428:0x09d1, B:429:0x09d6, B:406:0x08eb, B:401:0x08c3, B:430:0x09d7, B:431:0x09dc, B:395:0x08aa, B:432:0x09dd, B:433:0x09e2, B:388:0x088f, B:383:0x0877, B:434:0x09e3, B:435:0x09e8, B:377:0x085a, B:436:0x09e9, B:437:0x09ee, B:370:0x0842, B:438:0x09ef, B:439:0x09f4, B:364:0x0829, B:440:0x09f5, B:441:0x09fa, B:357:0x080e, B:442:0x09fb, B:443:0x0a00, B:345:0x07e1, B:444:0x0a01, B:445:0x0a06, B:337:0x07c7, B:446:0x0a07, B:447:0x0a0c, B:330:0x079e, B:448:0x0a0d, B:449:0x0a12, B:323:0x0785, B:450:0x0a13, B:451:0x0a18, B:316:0x0768, B:300:0x071f, B:452:0x0a19, B:453:0x0a1e, B:293:0x06fd, B:454:0x0a1f, B:455:0x0a24, B:281:0x06c9, B:456:0x0a25, B:457:0x0a2c, B:274:0x06b0, B:458:0x0a2d, B:459:0x0a32, B:267:0x0695, B:460:0x0a33, B:461:0x0a3a, B:260:0x067c, B:462:0x0a3b, B:463:0x0a42, B:253:0x0661, B:248:0x0648, B:464:0x0a43, B:465:0x0a48, B:236:0x060b, B:466:0x0a49, B:467:0x0a50, B:229:0x05f3, B:468:0x0a51, B:469:0x0a56, B:223:0x05df, B:470:0x0a57, B:471:0x0a5c, B:217:0x05c2, B:472:0x0a5d, B:473:0x0a62, B:210:0x05aa, B:206:0x0593, B:474:0x0a63, B:475:0x0a68, B:199:0x0578, B:476:0x0a69, B:477:0x0a70, B:192:0x055f, B:478:0x0a71, B:479:0x0a78, B:185:0x0546, B:480:0x0a79, B:481:0x0a80, B:178:0x052d, B:173:0x0519, B:169:0x0502, B:482:0x0a81, B:483:0x0a86, B:162:0x04e7, B:484:0x0a87, B:485:0x0a8c, B:155:0x04cc, B:486:0x0a8d, B:487:0x0a92, B:148:0x04b1, B:488:0x0a93, B:489:0x0a98, B:141:0x0496, B:136:0x047d, B:131:0x0464, B:490:0x0a99, B:491:0x0a9e, B:124:0x0445, B:119:0x042b, B:492:0x0a9f, B:493:0x0aa4, B:113:0x0415, B:494:0x0aa5, B:495:0x0aaa, B:107:0x03fa, B:97:0x03cc, B:496:0x0aab, B:497:0x0ab0, B:88:0x03ad, B:498:0x0ab1, B:499:0x0ab8, B:81:0x0390, B:500:0x0ab9, B:501:0x0abe, B:72:0x0371, B:67:0x0358, B:62:0x0344, B:502:0x0abf, B:503:0x0ac4, B:56:0x032a, B:504:0x0ac5, B:505:0x0aca, B:50:0x0313, B:45:0x0303, B:506:0x0acb, B:507:0x0ad0, B:38:0x02e9, B:508:0x0ad1, B:509:0x0ad6, B:30:0x02cb), top: B:514:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0a13 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0a01 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List getComboOrdersByOrderState$lambda$12(String str, Set set, int i, String str2, ComboOrderDao_Impl comboOrderDao_Impl, SQLiteConnection _connection) {
        int i2;
        String text;
        String text2;
        int i3;
        String text3;
        String text4;
        String text5;
        String text6;
        Integer numValueOf;
        int i4;
        int i5;
        OptionChain.TickRequirements tickRequirements;
        Tradability tradabilityFromServerValue;
        String text7;
        String text8;
        String text9;
        String text10;
        String text11;
        String text12;
        BigDecimal bigDecimalStringToBigDecimal;
        int i6;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = set.iterator();
            int i7 = 1;
            while (it.hasNext()) {
                String serverValue = OrderState.INSTANCE.toServerValue((OrderState) it.next());
                if (serverValue == null) {
                    sQLiteStatementPrepare.bindNull(i7);
                } else {
                    sQLiteStatementPrepare.bindText(i7, serverValue);
                }
                i7++;
            }
            sQLiteStatementPrepare.bindText(i + 1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "averageNetPremiumPaid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancelUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canceledQuantity");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSymbol");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closingStrategy");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contractFees");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivedState");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "direction");
            String str3 = "getValue(...)";
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "goldSavings");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isReplaceable");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmount");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmountDirection");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openingStrategy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pendingQuantity");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "premium");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AnalyticsStrings.TAG_SORT_ORDER_PRICE);
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremium");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedQuantity");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "regulatoryFees");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stopPrice");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "strategy");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInForce");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedAt");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "refId");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremiumDirection");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmount");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmountDirection");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "formSource");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equityInstrumentId");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "underlyingSymbol");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_canOpenPosition");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_cashComponent");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_expirationDates");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_extendedHoursState");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_lateCloseState");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickAboveCutoff");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickBelowCutoff");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_cutoffPrice");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_receivedAt");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_settleOnOpen");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_symbol");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_tradeValueMultiplier");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_selloutTimeToExpiration");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_affiliateTradability");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_allDayTradability");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_carRequired");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_dayTradeRatio");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_defaultPresetPercentLimit");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_fractionalTradability");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_id");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_listDate");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_maintenanceRatio");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_marginInitialRatio");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_minTickSize");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_name");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_otcMarketTier");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_receivedAt");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_simpleName");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_state");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_symbol");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_tradableChainId");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_type");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_notionalEstimatedQuantityDecimals");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_shortSaleTradability");
            ArrayMap<String, List<UiComboOrderLeg>> arrayMap = new ArrayMap<>();
            int i8 = columnIndexOrThrow12;
            ArrayMap<String, List<ComboOrderSalesTax>> arrayMap2 = new ArrayMap<>();
            while (sQLiteStatementPrepare.step()) {
                int i9 = columnIndexOrThrow11;
                String text13 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (arrayMap.containsKey(text13)) {
                    i6 = columnIndexOrThrow10;
                } else {
                    i6 = columnIndexOrThrow10;
                    arrayMap.put(text13, new ArrayList());
                }
                String text14 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!arrayMap2.containsKey(text14)) {
                    arrayMap2.put(text14, new ArrayList());
                }
                columnIndexOrThrow11 = i9;
                columnIndexOrThrow10 = i6;
            }
            int i10 = columnIndexOrThrow10;
            int i11 = columnIndexOrThrow11;
            sQLiteStatementPrepare.reset();
            comboOrderDao_Impl.m2217x4e5ab2fa(_connection, arrayMap);
            comboOrderDao_Impl.m2219x367d9594(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text15 = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                int i12 = columnIndexOrThrow2;
                BigDecimal bigDecimalStringToBigDecimal2 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (bigDecimalStringToBigDecimal2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                int i13 = columnIndexOrThrow3;
                BigDecimal bigDecimalStringToBigDecimal3 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (bigDecimalStringToBigDecimal3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                UUID uuidStringToUuid2 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (uuidStringToUuid2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text17 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                OptionStrategyType.Companion companion = OptionStrategyType.INSTANCE;
                OptionStrategyType optionStrategyTypeFromServerValue = companion.fromServerValue(text18);
                int i14 = columnIndexOrThrow4;
                BigDecimal bigDecimalStringToBigDecimal4 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                int i15 = i10;
                i10 = i15;
                Instant instantStringToInstant = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i15) ? null : sQLiteStatementPrepare.getText(i15));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i16 = i11;
                if (sQLiteStatementPrepare.isNull(i16)) {
                    i2 = i16;
                    text = null;
                } else {
                    i2 = i16;
                    text = sQLiteStatementPrepare.getText(i16);
                }
                int i17 = columnIndexOrThrow5;
                OrderState orderStateFromServerValue = OrderState.INSTANCE.fromServerValue(text);
                if (orderStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.shared.models.history.shared.OrderState', but it was NULL.");
                }
                int i18 = i8;
                String text19 = sQLiteStatementPrepare.isNull(i18) ? null : sQLiteStatementPrepare.getText(i18);
                i8 = i18;
                OrderDirection.Companion companion2 = OrderDirection.INSTANCE;
                OrderDirection orderDirectionFromServerValue = companion2.fromServerValue(text19);
                if (orderDirectionFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i19 = columnIndexOrThrow6;
                int i20 = columnIndexOrThrow13;
                if (sQLiteStatementPrepare.isNull(i20)) {
                    columnIndexOrThrow13 = i20;
                    text2 = null;
                } else {
                    columnIndexOrThrow13 = i20;
                    text2 = sQLiteStatementPrepare.getText(i20);
                }
                int i21 = columnIndexOrThrow7;
                BigDecimal bigDecimalStringToBigDecimal5 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text2);
                int i22 = columnIndexOrThrow14;
                int i23 = columnIndexOrThrow8;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i22)) != 0;
                int i24 = columnIndexOrThrow15;
                BigDecimal bigDecimalStringToBigDecimal6 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i24) ? null : sQLiteStatementPrepare.getText(i24));
                if (bigDecimalStringToBigDecimal6 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i25 = columnIndexOrThrow16;
                OrderDirection orderDirectionFromServerValue2 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i25) ? null : sQLiteStatementPrepare.getText(i25));
                if (orderDirectionFromServerValue2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i26 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i26)) {
                    i3 = i25;
                    text3 = null;
                } else {
                    i3 = i25;
                    text3 = sQLiteStatementPrepare.getText(i26);
                }
                OptionStrategyType optionStrategyTypeFromServerValue2 = companion.fromServerValue(text3);
                int i27 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i27)) {
                    columnIndexOrThrow18 = i27;
                    text4 = null;
                } else {
                    columnIndexOrThrow18 = i27;
                    text4 = sQLiteStatementPrepare.getText(i27);
                }
                BigDecimal bigDecimalStringToBigDecimal7 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text4);
                if (bigDecimalStringToBigDecimal7 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i28 = columnIndexOrThrow19;
                columnIndexOrThrow19 = i28;
                BigDecimal bigDecimalStringToBigDecimal8 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i28) ? null : sQLiteStatementPrepare.getText(i28));
                int i29 = columnIndexOrThrow20;
                columnIndexOrThrow20 = i29;
                BigDecimal bigDecimalStringToBigDecimal9 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29));
                int i30 = columnIndexOrThrow21;
                columnIndexOrThrow21 = i30;
                BigDecimal bigDecimalStringToBigDecimal10 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i30) ? null : sQLiteStatementPrepare.getText(i30));
                if (bigDecimalStringToBigDecimal10 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i31 = columnIndexOrThrow22;
                columnIndexOrThrow22 = i31;
                BigDecimal bigDecimalStringToBigDecimal11 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i31) ? null : sQLiteStatementPrepare.getText(i31));
                if (bigDecimalStringToBigDecimal11 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i32 = columnIndexOrThrow23;
                columnIndexOrThrow23 = i32;
                BigDecimal bigDecimalStringToBigDecimal12 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32));
                if (bigDecimalStringToBigDecimal12 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i33 = columnIndexOrThrow24;
                columnIndexOrThrow24 = i33;
                BigDecimal bigDecimalStringToBigDecimal13 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                if (bigDecimalStringToBigDecimal13 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i34 = columnIndexOrThrow25;
                columnIndexOrThrow25 = i34;
                BigDecimal bigDecimalStringToBigDecimal14 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i34) ? null : sQLiteStatementPrepare.getText(i34));
                int i35 = columnIndexOrThrow26;
                OptionStrategyType optionStrategyTypeFromServerValue3 = companion.fromServerValue(sQLiteStatementPrepare.isNull(i35) ? null : sQLiteStatementPrepare.getText(i35));
                int i36 = columnIndexOrThrow27;
                columnIndexOrThrow26 = i35;
                OrderTimeInForce orderTimeInForceFromServerValue = OrderTimeInForce.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i36) ? null : sQLiteStatementPrepare.getText(i36));
                if (orderTimeInForceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTimeInForce', but it was NULL.");
                }
                int i37 = columnIndexOrThrow28;
                columnIndexOrThrow28 = i37;
                OrderTrigger orderTriggerFromServerValue = OrderTrigger.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i37) ? null : sQLiteStatementPrepare.getText(i37));
                if (orderTriggerFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTrigger', but it was NULL.");
                }
                int i38 = columnIndexOrThrow29;
                columnIndexOrThrow29 = i38;
                OrderType orderTypeFromServerValue = OrderType.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i38) ? null : sQLiteStatementPrepare.getText(i38));
                if (orderTypeFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderType', but it was NULL.");
                }
                int i39 = columnIndexOrThrow30;
                columnIndexOrThrow30 = i39;
                Instant instantStringToInstant2 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i39) ? null : sQLiteStatementPrepare.getText(i39));
                if (instantStringToInstant2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i40 = columnIndexOrThrow31;
                columnIndexOrThrow31 = i40;
                UUID uuidStringToUuid3 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i40) ? null : sQLiteStatementPrepare.getText(i40));
                int i41 = columnIndexOrThrow32;
                OrderDirection orderDirectionFromServerValue3 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i41) ? null : sQLiteStatementPrepare.getText(i41));
                if (orderDirectionFromServerValue3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i42 = columnIndexOrThrow33;
                if (sQLiteStatementPrepare.isNull(i42)) {
                    columnIndexOrThrow32 = i41;
                    text5 = null;
                } else {
                    columnIndexOrThrow32 = i41;
                    text5 = sQLiteStatementPrepare.getText(i42);
                }
                columnIndexOrThrow27 = i36;
                BigDecimal bigDecimalStringToBigDecimal15 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text5);
                if (bigDecimalStringToBigDecimal15 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i43 = columnIndexOrThrow34;
                OrderDirection orderDirectionFromServerValue4 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                if (orderDirectionFromServerValue4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i44 = columnIndexOrThrow35;
                OptionOrder.FormSource formSourceFromServerValue = OptionOrder.FormSource.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i44) ? null : sQLiteStatementPrepare.getText(i44));
                if (formSourceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionOrder.FormSource', but it was NULL.");
                }
                int i45 = columnIndexOrThrow36;
                columnIndexOrThrow35 = i44;
                UUID uuidStringToUuid4 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i45) ? null : sQLiteStatementPrepare.getText(i45));
                if (uuidStringToUuid4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i46 = columnIndexOrThrow37;
                ComboOrder comboOrder = new ComboOrder(uuidStringToUuid, text15, bigDecimalStringToBigDecimal2, text16, bigDecimalStringToBigDecimal3, uuidStringToUuid2, text17, optionStrategyTypeFromServerValue, bigDecimalStringToBigDecimal4, instantStringToInstant, orderStateFromServerValue, orderDirectionFromServerValue, bigDecimalStringToBigDecimal5, z, bigDecimalStringToBigDecimal6, orderDirectionFromServerValue2, optionStrategyTypeFromServerValue2, bigDecimalStringToBigDecimal7, bigDecimalStringToBigDecimal8, bigDecimalStringToBigDecimal9, bigDecimalStringToBigDecimal10, bigDecimalStringToBigDecimal11, bigDecimalStringToBigDecimal12, bigDecimalStringToBigDecimal13, bigDecimalStringToBigDecimal14, optionStrategyTypeFromServerValue3, orderTimeInForceFromServerValue, orderTriggerFromServerValue, orderTypeFromServerValue, instantStringToInstant2, uuidStringToUuid3, orderDirectionFromServerValue3, bigDecimalStringToBigDecimal15, orderDirectionFromServerValue4, formSourceFromServerValue, uuidStringToUuid4, sQLiteStatementPrepare.getText(i46));
                columnIndexOrThrow37 = i46;
                columnIndexOrThrow36 = i45;
                int i47 = columnIndexOrThrow38;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i47)) != 0;
                int i48 = columnIndexOrThrow39;
                columnIndexOrThrow39 = i48;
                BigDecimal bigDecimalStringToBigDecimal16 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i48) ? null : sQLiteStatementPrepare.getText(i48));
                int i49 = columnIndexOrThrow40;
                columnIndexOrThrow40 = i49;
                ImmutableList<LocalDate> immutableListStringToLocalDateImmutableList = comboOrderDao_Impl.__modelRoomConverters().stringToLocalDateImmutableList(sQLiteStatementPrepare.isNull(i49) ? null : sQLiteStatementPrepare.getText(i49));
                if (immutableListStringToLocalDateImmutableList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlinx.collections.immutable.ImmutableList<java.time.LocalDate>', but it was NULL.");
                }
                int i50 = columnIndexOrThrow41;
                columnIndexOrThrow41 = i50;
                OptionChain.ExtendedHoursState extendedHoursStateFromServerValue = OptionChain.ExtendedHoursState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i50) ? null : sQLiteStatementPrepare.getText(i50));
                if (extendedHoursStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.ExtendedHoursState', but it was NULL.");
                }
                int i51 = columnIndexOrThrow42;
                columnIndexOrThrow42 = i51;
                UUID uuidStringToUuid5 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i51) ? null : sQLiteStatementPrepare.getText(i51));
                if (uuidStringToUuid5 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i52 = columnIndexOrThrow43;
                columnIndexOrThrow43 = i52;
                OptionChain.LateCloseState lateCloseStateFromServerValue = OptionChain.LateCloseState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i52) ? null : sQLiteStatementPrepare.getText(i52));
                if (lateCloseStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.LateCloseState', but it was NULL.");
                }
                int i53 = columnIndexOrThrow47;
                columnIndexOrThrow47 = i53;
                Instant instantStringToInstant3 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i53) ? null : sQLiteStatementPrepare.getText(i53));
                if (instantStringToInstant3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                columnIndexOrThrow34 = i43;
                int i54 = columnIndexOrThrow48;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i54)) != 0;
                int i55 = columnIndexOrThrow49;
                String text20 = sQLiteStatementPrepare.getText(i55);
                int i56 = columnIndexOrThrow50;
                if (sQLiteStatementPrepare.isNull(i56)) {
                    columnIndexOrThrow48 = i54;
                    text6 = null;
                } else {
                    columnIndexOrThrow48 = i54;
                    text6 = sQLiteStatementPrepare.getText(i56);
                }
                columnIndexOrThrow49 = i55;
                BigDecimal bigDecimalStringToBigDecimal17 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text6);
                if (bigDecimalStringToBigDecimal17 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i57 = columnIndexOrThrow51;
                if (sQLiteStatementPrepare.isNull(i57)) {
                    columnIndexOrThrow50 = i56;
                    numValueOf = null;
                } else {
                    columnIndexOrThrow50 = i56;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i57));
                }
                int i58 = columnIndexOrThrow44;
                if (sQLiteStatementPrepare.isNull(i58)) {
                    i4 = columnIndexOrThrow45;
                    if (sQLiteStatementPrepare.isNull(i4)) {
                        columnIndexOrThrow51 = i57;
                        i5 = columnIndexOrThrow46;
                        if (!sQLiteStatementPrepare.isNull(i5)) {
                            if (sQLiteStatementPrepare.isNull(i58)) {
                                columnIndexOrThrow44 = i58;
                                text12 = sQLiteStatementPrepare.getText(i58);
                            } else {
                                columnIndexOrThrow44 = i58;
                                text12 = null;
                            }
                            columnIndexOrThrow38 = i47;
                            bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                            if (bigDecimalStringToBigDecimal != null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow45 = i4;
                            BigDecimal bigDecimalStringToBigDecimal18 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4));
                            if (bigDecimalStringToBigDecimal18 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow46 = i5;
                            BigDecimal bigDecimalStringToBigDecimal19 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5));
                            if (bigDecimalStringToBigDecimal19 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            tickRequirements = new OptionChain.TickRequirements(bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal18, bigDecimalStringToBigDecimal19);
                            OptionChain optionChain = new OptionChain(z2, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z3, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i59 = columnIndexOrThrow52;
                            String text21 = !sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59);
                            Tradability.Companion companion3 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion3.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i60 = columnIndexOrThrow53;
                            if (sQLiteStatementPrepare.isNull(i60)) {
                                columnIndexOrThrow52 = i59;
                                text7 = null;
                            } else {
                                columnIndexOrThrow52 = i59;
                                text7 = sQLiteStatementPrepare.getText(i60);
                            }
                            Tradability tradabilityFromServerValue2 = companion3.fromServerValue(text7);
                            if (tradabilityFromServerValue2 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            columnIndexOrThrow53 = i60;
                            int i61 = columnIndexOrThrow54;
                            boolean z4 = ((int) sQLiteStatementPrepare.getLong(i61)) != 0;
                            int i62 = columnIndexOrThrow55;
                            columnIndexOrThrow54 = i61;
                            BigDecimal bigDecimalStringToBigDecimal20 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i62) ? null : sQLiteStatementPrepare.getText(i62));
                            if (bigDecimalStringToBigDecimal20 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i63 = columnIndexOrThrow56;
                            columnIndexOrThrow56 = i63;
                            BigDecimal bigDecimalStringToBigDecimal21 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i63) ? null : sQLiteStatementPrepare.getText(i63));
                            if (bigDecimalStringToBigDecimal21 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i64 = columnIndexOrThrow57;
                            Tradability tradabilityFromServerValue3 = companion3.fromServerValue(sQLiteStatementPrepare.isNull(i64) ? null : sQLiteStatementPrepare.getText(i64));
                            if (tradabilityFromServerValue3 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i65 = columnIndexOrThrow58;
                            if (sQLiteStatementPrepare.isNull(i65)) {
                                columnIndexOrThrow57 = i64;
                                text8 = null;
                            } else {
                                columnIndexOrThrow57 = i64;
                                text8 = sQLiteStatementPrepare.getText(i65);
                            }
                            columnIndexOrThrow55 = i62;
                            UUID uuidStringToUuid6 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text8);
                            if (uuidStringToUuid6 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                            int i66 = columnIndexOrThrow59;
                            LocalDate localDateStringToLocalDate = comboOrderDao_Impl.__commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66));
                            int i67 = columnIndexOrThrow60;
                            columnIndexOrThrow59 = i66;
                            BigDecimal bigDecimalStringToBigDecimal22 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i67) ? null : sQLiteStatementPrepare.getText(i67));
                            if (bigDecimalStringToBigDecimal22 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i68 = columnIndexOrThrow61;
                            columnIndexOrThrow61 = i68;
                            BigDecimal bigDecimalStringToBigDecimal23 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i68) ? null : sQLiteStatementPrepare.getText(i68));
                            if (bigDecimalStringToBigDecimal23 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i69 = columnIndexOrThrow62;
                            BigDecimal bigDecimalStringToBigDecimal24 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i69) ? null : sQLiteStatementPrepare.getText(i69));
                            int i70 = columnIndexOrThrow63;
                            String text22 = sQLiteStatementPrepare.getText(i70);
                            int i71 = columnIndexOrThrow64;
                            String text23 = sQLiteStatementPrepare.getText(i71);
                            columnIndexOrThrow63 = i70;
                            int i72 = columnIndexOrThrow65;
                            if (sQLiteStatementPrepare.isNull(i72)) {
                                columnIndexOrThrow65 = i72;
                                text9 = null;
                            } else {
                                columnIndexOrThrow65 = i72;
                                text9 = sQLiteStatementPrepare.getText(i72);
                            }
                            columnIndexOrThrow62 = i69;
                            Instant instantStringToInstant4 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(text9);
                            if (instantStringToInstant4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                            }
                            int i73 = columnIndexOrThrow66;
                            String text24 = sQLiteStatementPrepare.isNull(i73) ? null : sQLiteStatementPrepare.getText(i73);
                            int i74 = columnIndexOrThrow67;
                            String text25 = sQLiteStatementPrepare.getText(i74);
                            int i75 = columnIndexOrThrow68;
                            String text26 = sQLiteStatementPrepare.getText(i75);
                            columnIndexOrThrow66 = i73;
                            int i76 = columnIndexOrThrow69;
                            if (sQLiteStatementPrepare.isNull(i76)) {
                                columnIndexOrThrow69 = i76;
                                text10 = null;
                            } else {
                                columnIndexOrThrow69 = i76;
                                text10 = sQLiteStatementPrepare.getText(i76);
                            }
                            columnIndexOrThrow67 = i74;
                            UUID uuidStringToUuid7 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text10);
                            int i77 = columnIndexOrThrow70;
                            String text27 = sQLiteStatementPrepare.getText(i77);
                            columnIndexOrThrow60 = i67;
                            columnIndexOrThrow58 = i65;
                            int i78 = columnIndexOrThrow71;
                            int i79 = (int) sQLiteStatementPrepare.getLong(i78);
                            int i80 = columnIndexOrThrow72;
                            if (sQLiteStatementPrepare.isNull(i80)) {
                                columnIndexOrThrow70 = i77;
                                text11 = null;
                            } else {
                                columnIndexOrThrow70 = i77;
                                text11 = sQLiteStatementPrepare.getText(i80);
                            }
                            Tradability tradabilityFromServerValue4 = companion3.fromServerValue(text11);
                            if (tradabilityFromServerValue4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            Instrument instrument = new Instrument(tradabilityFromServerValue, z4, bigDecimalStringToBigDecimal20, bigDecimalStringToBigDecimal21, tradabilityFromServerValue3, tradabilityFromServerValue2, uuidStringToUuid6, null, null, null, localDateStringToLocalDate, bigDecimalStringToBigDecimal22, bigDecimalStringToBigDecimal23, bigDecimalStringToBigDecimal24, text22, text23, instantStringToInstant4, text24, text25, text26, uuidStringToUuid7, text27, i79, tradabilityFromServerValue4, null, null);
                            Object value = MapsKt.getValue(arrayMap, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            String str4 = str3;
                            Intrinsics.checkNotNullExpressionValue(value, str4);
                            List list = (List) value;
                            Object value2 = MapsKt.getValue(arrayMap2, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            Intrinsics.checkNotNullExpressionValue(value2, str4);
                            arrayList.add(new UiComboOrder(comboOrder, optionChain, instrument, list, (List) value2));
                            columnIndexOrThrow71 = i78;
                            columnIndexOrThrow68 = i75;
                            str3 = str4;
                            columnIndexOrThrow72 = i80;
                            columnIndexOrThrow64 = i71;
                            columnIndexOrThrow15 = i24;
                            columnIndexOrThrow16 = i3;
                            columnIndexOrThrow17 = i26;
                            columnIndexOrThrow5 = i17;
                            columnIndexOrThrow2 = i12;
                            columnIndexOrThrow3 = i13;
                            columnIndexOrThrow4 = i14;
                            i11 = i2;
                            columnIndexOrThrow6 = i19;
                            columnIndexOrThrow7 = i21;
                            columnIndexOrThrow8 = i23;
                            columnIndexOrThrow33 = i42;
                            columnIndexOrThrow14 = i22;
                        } else {
                            columnIndexOrThrow46 = i5;
                            columnIndexOrThrow44 = i58;
                            columnIndexOrThrow45 = i4;
                            columnIndexOrThrow38 = i47;
                            tickRequirements = null;
                            OptionChain optionChain2 = new OptionChain(z2, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z3, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i592 = columnIndexOrThrow52;
                            if (!sQLiteStatementPrepare.isNull(i592)) {
                            }
                            Tradability.Companion companion32 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion32.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                            }
                        }
                    } else {
                        columnIndexOrThrow51 = i57;
                    }
                } else {
                    columnIndexOrThrow51 = i57;
                    i4 = columnIndexOrThrow45;
                }
                i5 = columnIndexOrThrow46;
                if (sQLiteStatementPrepare.isNull(i58)) {
                }
                columnIndexOrThrow38 = i47;
                bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                if (bigDecimalStringToBigDecimal != null) {
                }
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    public Flow<List<UiComboOrder>> getComboOrdersByAggregatePosition(final String accountNumber, final UUID aggregateOptionPositionId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionId, "aggregateOptionPositionId");
        final String str = "\n        SELECT O.*\n        FROM AggregateOptionPositionLeg PL\n        JOIN ComboOrderLeg OL\n        ON PL.optionInstrumentId = OL.instrumentId\n        JOIN UiComboOrder O\n        ON OL.orderId = O.id\n        WHERE PL.aggregateOptionPositionId = ? AND O.accountNumber = ?\n        GROUP BY O.id\n        ORDER BY O.updatedAt DESC\n        ";
        return FlowBuilder.createFlow(this.__db, true, new String[]{"ComboOrderExecution", "OptionInstrument", "Instrument", "ComboOrderLeg", "ComboOrderSalesTax", "AggregateOptionPositionLeg", "UiComboOrder"}, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.getComboOrdersByAggregatePosition$lambda$13(str, this, aggregateOptionPositionId, accountNumber, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0757 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0011, B:5:0x001e, B:9:0x0028, B:10:0x0264, B:12:0x026a, B:14:0x0276, B:16:0x0283, B:18:0x028d, B:20:0x029a, B:21:0x02ac, B:23:0x02b2, B:27:0x02be, B:30:0x02ca, B:35:0x02dd, B:38:0x02e9, B:42:0x02f8, B:47:0x0307, B:49:0x0311, B:53:0x031d, B:55:0x0327, B:59:0x0337, B:64:0x034c, B:69:0x0365, B:73:0x0373, B:78:0x0388, B:80:0x0390, B:85:0x03a1, B:89:0x03af, B:94:0x03c4, B:99:0x03df, B:104:0x03f0, B:106:0x03fa, B:110:0x0408, B:112:0x040e, B:116:0x0422, B:121:0x043d, B:123:0x0447, B:128:0x0458, B:133:0x0471, B:138:0x048a, B:140:0x0494, B:145:0x04a5, B:147:0x04af, B:152:0x04c0, B:154:0x04ca, B:159:0x04db, B:161:0x04e5, B:166:0x04f6, B:170:0x050c, B:175:0x0521, B:177:0x0529, B:182:0x053a, B:184:0x0542, B:189:0x0553, B:191:0x055b, B:196:0x056c, B:198:0x0576, B:203:0x0587, B:207:0x059d, B:209:0x05a3, B:214:0x05ba, B:216:0x05c4, B:220:0x05d2, B:222:0x05d8, B:226:0x05e6, B:228:0x05ee, B:233:0x05ff, B:235:0x0609, B:240:0x062d, B:245:0x063c, B:250:0x0655, B:252:0x065f, B:257:0x0670, B:259:0x0678, B:264:0x0689, B:266:0x0693, B:271:0x06a4, B:273:0x06ac, B:278:0x06bd, B:280:0x06c7, B:285:0x06da, B:290:0x06f5, B:292:0x06ff, B:297:0x071c, B:299:0x0722, B:301:0x072a, B:308:0x074b, B:313:0x0760, B:315:0x076a, B:320:0x0779, B:322:0x0783, B:327:0x0792, B:329:0x079c, B:330:0x07a3, B:334:0x07ba, B:338:0x07c6, B:342:0x07d8, B:344:0x07de, B:349:0x07f3, B:354:0x0802, B:356:0x080c, B:361:0x081d, B:363:0x0827, B:367:0x0835, B:369:0x083b, B:374:0x0852, B:376:0x085c, B:380:0x086a, B:385:0x0883, B:387:0x088d, B:392:0x089e, B:394:0x08a8, B:398:0x08b6, B:403:0x08e3, B:405:0x08ed, B:410:0x0901, B:415:0x0924, B:419:0x0951, B:421:0x0957, B:422:0x09ba, B:423:0x09bf, B:418:0x0949, B:414:0x091b, B:409:0x08fa, B:424:0x09c0, B:425:0x09c5, B:402:0x08da, B:397:0x08b2, B:426:0x09c6, B:427:0x09cb, B:391:0x0899, B:428:0x09cc, B:429:0x09d1, B:384:0x087e, B:379:0x0866, B:430:0x09d2, B:431:0x09d7, B:373:0x0849, B:432:0x09d8, B:433:0x09dd, B:366:0x0831, B:434:0x09de, B:435:0x09e3, B:360:0x0818, B:436:0x09e4, B:437:0x09e9, B:353:0x07fd, B:438:0x09ea, B:439:0x09ef, B:341:0x07d0, B:440:0x09f0, B:441:0x09f5, B:333:0x07b6, B:442:0x09f6, B:443:0x09fb, B:326:0x078d, B:444:0x09fc, B:445:0x0a01, B:319:0x0774, B:446:0x0a02, B:447:0x0a07, B:312:0x0757, B:296:0x070e, B:448:0x0a08, B:449:0x0a0d, B:289:0x06ec, B:450:0x0a0e, B:451:0x0a13, B:277:0x06b8, B:452:0x0a14, B:453:0x0a1b, B:270:0x069f, B:454:0x0a1c, B:455:0x0a21, B:263:0x0684, B:456:0x0a22, B:457:0x0a29, B:256:0x066b, B:458:0x0a2a, B:459:0x0a31, B:249:0x0650, B:244:0x0637, B:460:0x0a32, B:461:0x0a37, B:232:0x05fa, B:462:0x0a38, B:463:0x0a3f, B:225:0x05e2, B:464:0x0a40, B:465:0x0a45, B:219:0x05ce, B:466:0x0a46, B:467:0x0a4b, B:213:0x05b1, B:468:0x0a4c, B:469:0x0a51, B:206:0x0599, B:202:0x0582, B:470:0x0a52, B:471:0x0a57, B:195:0x0567, B:472:0x0a58, B:473:0x0a5f, B:188:0x054e, B:474:0x0a60, B:475:0x0a67, B:181:0x0535, B:476:0x0a68, B:477:0x0a6f, B:174:0x051c, B:169:0x0508, B:165:0x04f1, B:478:0x0a70, B:479:0x0a75, B:158:0x04d6, B:480:0x0a76, B:481:0x0a7b, B:151:0x04bb, B:482:0x0a7c, B:483:0x0a81, B:144:0x04a0, B:484:0x0a82, B:485:0x0a87, B:137:0x0485, B:132:0x046c, B:127:0x0453, B:486:0x0a88, B:487:0x0a8d, B:120:0x0434, B:115:0x041a, B:488:0x0a8e, B:489:0x0a93, B:109:0x0404, B:490:0x0a94, B:491:0x0a99, B:103:0x03e9, B:93:0x03bb, B:492:0x0a9a, B:493:0x0a9f, B:84:0x039c, B:494:0x0aa0, B:495:0x0aa7, B:77:0x037f, B:496:0x0aa8, B:497:0x0aad, B:68:0x0360, B:63:0x0347, B:58:0x0333, B:498:0x0aae, B:499:0x0ab3, B:52:0x0319, B:500:0x0ab4, B:501:0x0ab9, B:46:0x0302, B:41:0x02f2, B:502:0x0aba, B:503:0x0abf, B:34:0x02d8, B:504:0x0ac0, B:505:0x0ac5, B:26:0x02ba, B:8:0x0025), top: B:510:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x076a A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0011, B:5:0x001e, B:9:0x0028, B:10:0x0264, B:12:0x026a, B:14:0x0276, B:16:0x0283, B:18:0x028d, B:20:0x029a, B:21:0x02ac, B:23:0x02b2, B:27:0x02be, B:30:0x02ca, B:35:0x02dd, B:38:0x02e9, B:42:0x02f8, B:47:0x0307, B:49:0x0311, B:53:0x031d, B:55:0x0327, B:59:0x0337, B:64:0x034c, B:69:0x0365, B:73:0x0373, B:78:0x0388, B:80:0x0390, B:85:0x03a1, B:89:0x03af, B:94:0x03c4, B:99:0x03df, B:104:0x03f0, B:106:0x03fa, B:110:0x0408, B:112:0x040e, B:116:0x0422, B:121:0x043d, B:123:0x0447, B:128:0x0458, B:133:0x0471, B:138:0x048a, B:140:0x0494, B:145:0x04a5, B:147:0x04af, B:152:0x04c0, B:154:0x04ca, B:159:0x04db, B:161:0x04e5, B:166:0x04f6, B:170:0x050c, B:175:0x0521, B:177:0x0529, B:182:0x053a, B:184:0x0542, B:189:0x0553, B:191:0x055b, B:196:0x056c, B:198:0x0576, B:203:0x0587, B:207:0x059d, B:209:0x05a3, B:214:0x05ba, B:216:0x05c4, B:220:0x05d2, B:222:0x05d8, B:226:0x05e6, B:228:0x05ee, B:233:0x05ff, B:235:0x0609, B:240:0x062d, B:245:0x063c, B:250:0x0655, B:252:0x065f, B:257:0x0670, B:259:0x0678, B:264:0x0689, B:266:0x0693, B:271:0x06a4, B:273:0x06ac, B:278:0x06bd, B:280:0x06c7, B:285:0x06da, B:290:0x06f5, B:292:0x06ff, B:297:0x071c, B:299:0x0722, B:301:0x072a, B:308:0x074b, B:313:0x0760, B:315:0x076a, B:320:0x0779, B:322:0x0783, B:327:0x0792, B:329:0x079c, B:330:0x07a3, B:334:0x07ba, B:338:0x07c6, B:342:0x07d8, B:344:0x07de, B:349:0x07f3, B:354:0x0802, B:356:0x080c, B:361:0x081d, B:363:0x0827, B:367:0x0835, B:369:0x083b, B:374:0x0852, B:376:0x085c, B:380:0x086a, B:385:0x0883, B:387:0x088d, B:392:0x089e, B:394:0x08a8, B:398:0x08b6, B:403:0x08e3, B:405:0x08ed, B:410:0x0901, B:415:0x0924, B:419:0x0951, B:421:0x0957, B:422:0x09ba, B:423:0x09bf, B:418:0x0949, B:414:0x091b, B:409:0x08fa, B:424:0x09c0, B:425:0x09c5, B:402:0x08da, B:397:0x08b2, B:426:0x09c6, B:427:0x09cb, B:391:0x0899, B:428:0x09cc, B:429:0x09d1, B:384:0x087e, B:379:0x0866, B:430:0x09d2, B:431:0x09d7, B:373:0x0849, B:432:0x09d8, B:433:0x09dd, B:366:0x0831, B:434:0x09de, B:435:0x09e3, B:360:0x0818, B:436:0x09e4, B:437:0x09e9, B:353:0x07fd, B:438:0x09ea, B:439:0x09ef, B:341:0x07d0, B:440:0x09f0, B:441:0x09f5, B:333:0x07b6, B:442:0x09f6, B:443:0x09fb, B:326:0x078d, B:444:0x09fc, B:445:0x0a01, B:319:0x0774, B:446:0x0a02, B:447:0x0a07, B:312:0x0757, B:296:0x070e, B:448:0x0a08, B:449:0x0a0d, B:289:0x06ec, B:450:0x0a0e, B:451:0x0a13, B:277:0x06b8, B:452:0x0a14, B:453:0x0a1b, B:270:0x069f, B:454:0x0a1c, B:455:0x0a21, B:263:0x0684, B:456:0x0a22, B:457:0x0a29, B:256:0x066b, B:458:0x0a2a, B:459:0x0a31, B:249:0x0650, B:244:0x0637, B:460:0x0a32, B:461:0x0a37, B:232:0x05fa, B:462:0x0a38, B:463:0x0a3f, B:225:0x05e2, B:464:0x0a40, B:465:0x0a45, B:219:0x05ce, B:466:0x0a46, B:467:0x0a4b, B:213:0x05b1, B:468:0x0a4c, B:469:0x0a51, B:206:0x0599, B:202:0x0582, B:470:0x0a52, B:471:0x0a57, B:195:0x0567, B:472:0x0a58, B:473:0x0a5f, B:188:0x054e, B:474:0x0a60, B:475:0x0a67, B:181:0x0535, B:476:0x0a68, B:477:0x0a6f, B:174:0x051c, B:169:0x0508, B:165:0x04f1, B:478:0x0a70, B:479:0x0a75, B:158:0x04d6, B:480:0x0a76, B:481:0x0a7b, B:151:0x04bb, B:482:0x0a7c, B:483:0x0a81, B:144:0x04a0, B:484:0x0a82, B:485:0x0a87, B:137:0x0485, B:132:0x046c, B:127:0x0453, B:486:0x0a88, B:487:0x0a8d, B:120:0x0434, B:115:0x041a, B:488:0x0a8e, B:489:0x0a93, B:109:0x0404, B:490:0x0a94, B:491:0x0a99, B:103:0x03e9, B:93:0x03bb, B:492:0x0a9a, B:493:0x0a9f, B:84:0x039c, B:494:0x0aa0, B:495:0x0aa7, B:77:0x037f, B:496:0x0aa8, B:497:0x0aad, B:68:0x0360, B:63:0x0347, B:58:0x0333, B:498:0x0aae, B:499:0x0ab3, B:52:0x0319, B:500:0x0ab4, B:501:0x0ab9, B:46:0x0302, B:41:0x02f2, B:502:0x0aba, B:503:0x0abf, B:34:0x02d8, B:504:0x0ac0, B:505:0x0ac5, B:26:0x02ba, B:8:0x0025), top: B:510:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07b6 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0011, B:5:0x001e, B:9:0x0028, B:10:0x0264, B:12:0x026a, B:14:0x0276, B:16:0x0283, B:18:0x028d, B:20:0x029a, B:21:0x02ac, B:23:0x02b2, B:27:0x02be, B:30:0x02ca, B:35:0x02dd, B:38:0x02e9, B:42:0x02f8, B:47:0x0307, B:49:0x0311, B:53:0x031d, B:55:0x0327, B:59:0x0337, B:64:0x034c, B:69:0x0365, B:73:0x0373, B:78:0x0388, B:80:0x0390, B:85:0x03a1, B:89:0x03af, B:94:0x03c4, B:99:0x03df, B:104:0x03f0, B:106:0x03fa, B:110:0x0408, B:112:0x040e, B:116:0x0422, B:121:0x043d, B:123:0x0447, B:128:0x0458, B:133:0x0471, B:138:0x048a, B:140:0x0494, B:145:0x04a5, B:147:0x04af, B:152:0x04c0, B:154:0x04ca, B:159:0x04db, B:161:0x04e5, B:166:0x04f6, B:170:0x050c, B:175:0x0521, B:177:0x0529, B:182:0x053a, B:184:0x0542, B:189:0x0553, B:191:0x055b, B:196:0x056c, B:198:0x0576, B:203:0x0587, B:207:0x059d, B:209:0x05a3, B:214:0x05ba, B:216:0x05c4, B:220:0x05d2, B:222:0x05d8, B:226:0x05e6, B:228:0x05ee, B:233:0x05ff, B:235:0x0609, B:240:0x062d, B:245:0x063c, B:250:0x0655, B:252:0x065f, B:257:0x0670, B:259:0x0678, B:264:0x0689, B:266:0x0693, B:271:0x06a4, B:273:0x06ac, B:278:0x06bd, B:280:0x06c7, B:285:0x06da, B:290:0x06f5, B:292:0x06ff, B:297:0x071c, B:299:0x0722, B:301:0x072a, B:308:0x074b, B:313:0x0760, B:315:0x076a, B:320:0x0779, B:322:0x0783, B:327:0x0792, B:329:0x079c, B:330:0x07a3, B:334:0x07ba, B:338:0x07c6, B:342:0x07d8, B:344:0x07de, B:349:0x07f3, B:354:0x0802, B:356:0x080c, B:361:0x081d, B:363:0x0827, B:367:0x0835, B:369:0x083b, B:374:0x0852, B:376:0x085c, B:380:0x086a, B:385:0x0883, B:387:0x088d, B:392:0x089e, B:394:0x08a8, B:398:0x08b6, B:403:0x08e3, B:405:0x08ed, B:410:0x0901, B:415:0x0924, B:419:0x0951, B:421:0x0957, B:422:0x09ba, B:423:0x09bf, B:418:0x0949, B:414:0x091b, B:409:0x08fa, B:424:0x09c0, B:425:0x09c5, B:402:0x08da, B:397:0x08b2, B:426:0x09c6, B:427:0x09cb, B:391:0x0899, B:428:0x09cc, B:429:0x09d1, B:384:0x087e, B:379:0x0866, B:430:0x09d2, B:431:0x09d7, B:373:0x0849, B:432:0x09d8, B:433:0x09dd, B:366:0x0831, B:434:0x09de, B:435:0x09e3, B:360:0x0818, B:436:0x09e4, B:437:0x09e9, B:353:0x07fd, B:438:0x09ea, B:439:0x09ef, B:341:0x07d0, B:440:0x09f0, B:441:0x09f5, B:333:0x07b6, B:442:0x09f6, B:443:0x09fb, B:326:0x078d, B:444:0x09fc, B:445:0x0a01, B:319:0x0774, B:446:0x0a02, B:447:0x0a07, B:312:0x0757, B:296:0x070e, B:448:0x0a08, B:449:0x0a0d, B:289:0x06ec, B:450:0x0a0e, B:451:0x0a13, B:277:0x06b8, B:452:0x0a14, B:453:0x0a1b, B:270:0x069f, B:454:0x0a1c, B:455:0x0a21, B:263:0x0684, B:456:0x0a22, B:457:0x0a29, B:256:0x066b, B:458:0x0a2a, B:459:0x0a31, B:249:0x0650, B:244:0x0637, B:460:0x0a32, B:461:0x0a37, B:232:0x05fa, B:462:0x0a38, B:463:0x0a3f, B:225:0x05e2, B:464:0x0a40, B:465:0x0a45, B:219:0x05ce, B:466:0x0a46, B:467:0x0a4b, B:213:0x05b1, B:468:0x0a4c, B:469:0x0a51, B:206:0x0599, B:202:0x0582, B:470:0x0a52, B:471:0x0a57, B:195:0x0567, B:472:0x0a58, B:473:0x0a5f, B:188:0x054e, B:474:0x0a60, B:475:0x0a67, B:181:0x0535, B:476:0x0a68, B:477:0x0a6f, B:174:0x051c, B:169:0x0508, B:165:0x04f1, B:478:0x0a70, B:479:0x0a75, B:158:0x04d6, B:480:0x0a76, B:481:0x0a7b, B:151:0x04bb, B:482:0x0a7c, B:483:0x0a81, B:144:0x04a0, B:484:0x0a82, B:485:0x0a87, B:137:0x0485, B:132:0x046c, B:127:0x0453, B:486:0x0a88, B:487:0x0a8d, B:120:0x0434, B:115:0x041a, B:488:0x0a8e, B:489:0x0a93, B:109:0x0404, B:490:0x0a94, B:491:0x0a99, B:103:0x03e9, B:93:0x03bb, B:492:0x0a9a, B:493:0x0a9f, B:84:0x039c, B:494:0x0aa0, B:495:0x0aa7, B:77:0x037f, B:496:0x0aa8, B:497:0x0aad, B:68:0x0360, B:63:0x0347, B:58:0x0333, B:498:0x0aae, B:499:0x0ab3, B:52:0x0319, B:500:0x0ab4, B:501:0x0ab9, B:46:0x0302, B:41:0x02f2, B:502:0x0aba, B:503:0x0abf, B:34:0x02d8, B:504:0x0ac0, B:505:0x0ac5, B:26:0x02ba, B:8:0x0025), top: B:510:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0a02 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x09f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List getComboOrdersByAggregatePosition$lambda$13(String str, ComboOrderDao_Impl comboOrderDao_Impl, UUID uuid, String str2, SQLiteConnection _connection) {
        int i;
        String text;
        String text2;
        int i2;
        String text3;
        String text4;
        String text5;
        String text6;
        Integer numValueOf;
        int i3;
        int i4;
        OptionChain.TickRequirements tickRequirements;
        Tradability tradabilityFromServerValue;
        String text7;
        String text8;
        String text9;
        String text10;
        String text11;
        String text12;
        BigDecimal bigDecimalStringToBigDecimal;
        int i5;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            String strUuidToString = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strUuidToString);
            }
            sQLiteStatementPrepare.bindText(2, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "averageNetPremiumPaid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancelUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canceledQuantity");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSymbol");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closingStrategy");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contractFees");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivedState");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "direction");
            String str3 = "getValue(...)";
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "goldSavings");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isReplaceable");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmount");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmountDirection");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openingStrategy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pendingQuantity");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "premium");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AnalyticsStrings.TAG_SORT_ORDER_PRICE);
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremium");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedQuantity");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "regulatoryFees");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stopPrice");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "strategy");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInForce");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedAt");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "refId");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremiumDirection");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmount");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmountDirection");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "formSource");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equityInstrumentId");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "underlyingSymbol");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_canOpenPosition");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_cashComponent");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_expirationDates");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_extendedHoursState");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_lateCloseState");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickAboveCutoff");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickBelowCutoff");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_cutoffPrice");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_receivedAt");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_settleOnOpen");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_symbol");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_tradeValueMultiplier");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_selloutTimeToExpiration");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_affiliateTradability");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_allDayTradability");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_carRequired");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_dayTradeRatio");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_defaultPresetPercentLimit");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_fractionalTradability");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_id");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_listDate");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_maintenanceRatio");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_marginInitialRatio");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_minTickSize");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_name");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_otcMarketTier");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_receivedAt");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_simpleName");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_state");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_symbol");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_tradableChainId");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_type");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_notionalEstimatedQuantityDecimals");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_shortSaleTradability");
            ArrayMap<String, List<UiComboOrderLeg>> arrayMap = new ArrayMap<>();
            int i6 = columnIndexOrThrow12;
            ArrayMap<String, List<ComboOrderSalesTax>> arrayMap2 = new ArrayMap<>();
            while (sQLiteStatementPrepare.step()) {
                int i7 = columnIndexOrThrow11;
                String text13 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (arrayMap.containsKey(text13)) {
                    i5 = columnIndexOrThrow10;
                } else {
                    i5 = columnIndexOrThrow10;
                    arrayMap.put(text13, new ArrayList());
                }
                String text14 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!arrayMap2.containsKey(text14)) {
                    arrayMap2.put(text14, new ArrayList());
                }
                columnIndexOrThrow11 = i7;
                columnIndexOrThrow10 = i5;
            }
            int i8 = columnIndexOrThrow10;
            int i9 = columnIndexOrThrow11;
            sQLiteStatementPrepare.reset();
            comboOrderDao_Impl.m2217x4e5ab2fa(_connection, arrayMap);
            comboOrderDao_Impl.m2219x367d9594(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text15 = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                int i10 = columnIndexOrThrow2;
                BigDecimal bigDecimalStringToBigDecimal2 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (bigDecimalStringToBigDecimal2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                int i11 = columnIndexOrThrow3;
                BigDecimal bigDecimalStringToBigDecimal3 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (bigDecimalStringToBigDecimal3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                UUID uuidStringToUuid2 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (uuidStringToUuid2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text17 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                OptionStrategyType.Companion companion = OptionStrategyType.INSTANCE;
                OptionStrategyType optionStrategyTypeFromServerValue = companion.fromServerValue(text18);
                int i12 = columnIndexOrThrow4;
                BigDecimal bigDecimalStringToBigDecimal4 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                int i13 = i8;
                i8 = i13;
                Instant instantStringToInstant = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i13) ? null : sQLiteStatementPrepare.getText(i13));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i14 = i9;
                if (sQLiteStatementPrepare.isNull(i14)) {
                    i = i14;
                    text = null;
                } else {
                    i = i14;
                    text = sQLiteStatementPrepare.getText(i14);
                }
                int i15 = columnIndexOrThrow5;
                OrderState orderStateFromServerValue = OrderState.INSTANCE.fromServerValue(text);
                if (orderStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.shared.models.history.shared.OrderState', but it was NULL.");
                }
                int i16 = i6;
                String text19 = sQLiteStatementPrepare.isNull(i16) ? null : sQLiteStatementPrepare.getText(i16);
                i6 = i16;
                OrderDirection.Companion companion2 = OrderDirection.INSTANCE;
                OrderDirection orderDirectionFromServerValue = companion2.fromServerValue(text19);
                if (orderDirectionFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i17 = columnIndexOrThrow6;
                int i18 = columnIndexOrThrow13;
                if (sQLiteStatementPrepare.isNull(i18)) {
                    columnIndexOrThrow13 = i18;
                    text2 = null;
                } else {
                    columnIndexOrThrow13 = i18;
                    text2 = sQLiteStatementPrepare.getText(i18);
                }
                int i19 = columnIndexOrThrow7;
                BigDecimal bigDecimalStringToBigDecimal5 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text2);
                int i20 = columnIndexOrThrow14;
                int i21 = columnIndexOrThrow8;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i20)) != 0;
                int i22 = columnIndexOrThrow15;
                BigDecimal bigDecimalStringToBigDecimal6 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i22) ? null : sQLiteStatementPrepare.getText(i22));
                if (bigDecimalStringToBigDecimal6 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i23 = columnIndexOrThrow16;
                OrderDirection orderDirectionFromServerValue2 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23));
                if (orderDirectionFromServerValue2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i24 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i24)) {
                    i2 = i23;
                    text3 = null;
                } else {
                    i2 = i23;
                    text3 = sQLiteStatementPrepare.getText(i24);
                }
                OptionStrategyType optionStrategyTypeFromServerValue2 = companion.fromServerValue(text3);
                int i25 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i25)) {
                    columnIndexOrThrow18 = i25;
                    text4 = null;
                } else {
                    columnIndexOrThrow18 = i25;
                    text4 = sQLiteStatementPrepare.getText(i25);
                }
                BigDecimal bigDecimalStringToBigDecimal7 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text4);
                if (bigDecimalStringToBigDecimal7 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i26 = columnIndexOrThrow19;
                columnIndexOrThrow19 = i26;
                BigDecimal bigDecimalStringToBigDecimal8 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i26) ? null : sQLiteStatementPrepare.getText(i26));
                int i27 = columnIndexOrThrow20;
                columnIndexOrThrow20 = i27;
                BigDecimal bigDecimalStringToBigDecimal9 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i27) ? null : sQLiteStatementPrepare.getText(i27));
                int i28 = columnIndexOrThrow21;
                columnIndexOrThrow21 = i28;
                BigDecimal bigDecimalStringToBigDecimal10 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i28) ? null : sQLiteStatementPrepare.getText(i28));
                if (bigDecimalStringToBigDecimal10 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i29 = columnIndexOrThrow22;
                columnIndexOrThrow22 = i29;
                BigDecimal bigDecimalStringToBigDecimal11 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29));
                if (bigDecimalStringToBigDecimal11 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i30 = columnIndexOrThrow23;
                columnIndexOrThrow23 = i30;
                BigDecimal bigDecimalStringToBigDecimal12 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i30) ? null : sQLiteStatementPrepare.getText(i30));
                if (bigDecimalStringToBigDecimal12 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i31 = columnIndexOrThrow24;
                columnIndexOrThrow24 = i31;
                BigDecimal bigDecimalStringToBigDecimal13 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i31) ? null : sQLiteStatementPrepare.getText(i31));
                if (bigDecimalStringToBigDecimal13 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i32 = columnIndexOrThrow25;
                columnIndexOrThrow25 = i32;
                BigDecimal bigDecimalStringToBigDecimal14 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32));
                int i33 = columnIndexOrThrow26;
                OptionStrategyType optionStrategyTypeFromServerValue3 = companion.fromServerValue(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                int i34 = columnIndexOrThrow27;
                columnIndexOrThrow26 = i33;
                OrderTimeInForce orderTimeInForceFromServerValue = OrderTimeInForce.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i34) ? null : sQLiteStatementPrepare.getText(i34));
                if (orderTimeInForceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTimeInForce', but it was NULL.");
                }
                int i35 = columnIndexOrThrow28;
                columnIndexOrThrow28 = i35;
                OrderTrigger orderTriggerFromServerValue = OrderTrigger.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i35) ? null : sQLiteStatementPrepare.getText(i35));
                if (orderTriggerFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTrigger', but it was NULL.");
                }
                int i36 = columnIndexOrThrow29;
                columnIndexOrThrow29 = i36;
                OrderType orderTypeFromServerValue = OrderType.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i36) ? null : sQLiteStatementPrepare.getText(i36));
                if (orderTypeFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderType', but it was NULL.");
                }
                int i37 = columnIndexOrThrow30;
                columnIndexOrThrow30 = i37;
                Instant instantStringToInstant2 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i37) ? null : sQLiteStatementPrepare.getText(i37));
                if (instantStringToInstant2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i38 = columnIndexOrThrow31;
                columnIndexOrThrow31 = i38;
                UUID uuidStringToUuid3 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i38) ? null : sQLiteStatementPrepare.getText(i38));
                int i39 = columnIndexOrThrow32;
                OrderDirection orderDirectionFromServerValue3 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i39) ? null : sQLiteStatementPrepare.getText(i39));
                if (orderDirectionFromServerValue3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i40 = columnIndexOrThrow33;
                if (sQLiteStatementPrepare.isNull(i40)) {
                    columnIndexOrThrow32 = i39;
                    text5 = null;
                } else {
                    columnIndexOrThrow32 = i39;
                    text5 = sQLiteStatementPrepare.getText(i40);
                }
                columnIndexOrThrow27 = i34;
                BigDecimal bigDecimalStringToBigDecimal15 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text5);
                if (bigDecimalStringToBigDecimal15 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i41 = columnIndexOrThrow34;
                OrderDirection orderDirectionFromServerValue4 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i41) ? null : sQLiteStatementPrepare.getText(i41));
                if (orderDirectionFromServerValue4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i42 = columnIndexOrThrow35;
                OptionOrder.FormSource formSourceFromServerValue = OptionOrder.FormSource.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i42) ? null : sQLiteStatementPrepare.getText(i42));
                if (formSourceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionOrder.FormSource', but it was NULL.");
                }
                int i43 = columnIndexOrThrow36;
                columnIndexOrThrow35 = i42;
                UUID uuidStringToUuid4 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                if (uuidStringToUuid4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i44 = columnIndexOrThrow37;
                ComboOrder comboOrder = new ComboOrder(uuidStringToUuid, text15, bigDecimalStringToBigDecimal2, text16, bigDecimalStringToBigDecimal3, uuidStringToUuid2, text17, optionStrategyTypeFromServerValue, bigDecimalStringToBigDecimal4, instantStringToInstant, orderStateFromServerValue, orderDirectionFromServerValue, bigDecimalStringToBigDecimal5, z, bigDecimalStringToBigDecimal6, orderDirectionFromServerValue2, optionStrategyTypeFromServerValue2, bigDecimalStringToBigDecimal7, bigDecimalStringToBigDecimal8, bigDecimalStringToBigDecimal9, bigDecimalStringToBigDecimal10, bigDecimalStringToBigDecimal11, bigDecimalStringToBigDecimal12, bigDecimalStringToBigDecimal13, bigDecimalStringToBigDecimal14, optionStrategyTypeFromServerValue3, orderTimeInForceFromServerValue, orderTriggerFromServerValue, orderTypeFromServerValue, instantStringToInstant2, uuidStringToUuid3, orderDirectionFromServerValue3, bigDecimalStringToBigDecimal15, orderDirectionFromServerValue4, formSourceFromServerValue, uuidStringToUuid4, sQLiteStatementPrepare.getText(i44));
                columnIndexOrThrow37 = i44;
                columnIndexOrThrow36 = i43;
                int i45 = columnIndexOrThrow38;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i45)) != 0;
                int i46 = columnIndexOrThrow39;
                columnIndexOrThrow39 = i46;
                BigDecimal bigDecimalStringToBigDecimal16 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i46) ? null : sQLiteStatementPrepare.getText(i46));
                int i47 = columnIndexOrThrow40;
                columnIndexOrThrow40 = i47;
                ImmutableList<LocalDate> immutableListStringToLocalDateImmutableList = comboOrderDao_Impl.__modelRoomConverters().stringToLocalDateImmutableList(sQLiteStatementPrepare.isNull(i47) ? null : sQLiteStatementPrepare.getText(i47));
                if (immutableListStringToLocalDateImmutableList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlinx.collections.immutable.ImmutableList<java.time.LocalDate>', but it was NULL.");
                }
                int i48 = columnIndexOrThrow41;
                columnIndexOrThrow41 = i48;
                OptionChain.ExtendedHoursState extendedHoursStateFromServerValue = OptionChain.ExtendedHoursState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i48) ? null : sQLiteStatementPrepare.getText(i48));
                if (extendedHoursStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.ExtendedHoursState', but it was NULL.");
                }
                int i49 = columnIndexOrThrow42;
                columnIndexOrThrow42 = i49;
                UUID uuidStringToUuid5 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i49) ? null : sQLiteStatementPrepare.getText(i49));
                if (uuidStringToUuid5 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i50 = columnIndexOrThrow43;
                columnIndexOrThrow43 = i50;
                OptionChain.LateCloseState lateCloseStateFromServerValue = OptionChain.LateCloseState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i50) ? null : sQLiteStatementPrepare.getText(i50));
                if (lateCloseStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.LateCloseState', but it was NULL.");
                }
                int i51 = columnIndexOrThrow47;
                columnIndexOrThrow47 = i51;
                Instant instantStringToInstant3 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i51) ? null : sQLiteStatementPrepare.getText(i51));
                if (instantStringToInstant3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                columnIndexOrThrow34 = i41;
                int i52 = columnIndexOrThrow48;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i52)) != 0;
                int i53 = columnIndexOrThrow49;
                String text20 = sQLiteStatementPrepare.getText(i53);
                int i54 = columnIndexOrThrow50;
                if (sQLiteStatementPrepare.isNull(i54)) {
                    columnIndexOrThrow48 = i52;
                    text6 = null;
                } else {
                    columnIndexOrThrow48 = i52;
                    text6 = sQLiteStatementPrepare.getText(i54);
                }
                columnIndexOrThrow49 = i53;
                BigDecimal bigDecimalStringToBigDecimal17 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text6);
                if (bigDecimalStringToBigDecimal17 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i55 = columnIndexOrThrow51;
                if (sQLiteStatementPrepare.isNull(i55)) {
                    columnIndexOrThrow50 = i54;
                    numValueOf = null;
                } else {
                    columnIndexOrThrow50 = i54;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i55));
                }
                int i56 = columnIndexOrThrow44;
                if (sQLiteStatementPrepare.isNull(i56)) {
                    i3 = columnIndexOrThrow45;
                    if (sQLiteStatementPrepare.isNull(i3)) {
                        columnIndexOrThrow51 = i55;
                        i4 = columnIndexOrThrow46;
                        if (!sQLiteStatementPrepare.isNull(i4)) {
                            if (sQLiteStatementPrepare.isNull(i56)) {
                                columnIndexOrThrow44 = i56;
                                text12 = sQLiteStatementPrepare.getText(i56);
                            } else {
                                columnIndexOrThrow44 = i56;
                                text12 = null;
                            }
                            columnIndexOrThrow38 = i45;
                            bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                            if (bigDecimalStringToBigDecimal != null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow45 = i3;
                            BigDecimal bigDecimalStringToBigDecimal18 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3));
                            if (bigDecimalStringToBigDecimal18 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow46 = i4;
                            BigDecimal bigDecimalStringToBigDecimal19 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4));
                            if (bigDecimalStringToBigDecimal19 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            tickRequirements = new OptionChain.TickRequirements(bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal18, bigDecimalStringToBigDecimal19);
                            OptionChain optionChain = new OptionChain(z2, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z3, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i57 = columnIndexOrThrow52;
                            String text21 = !sQLiteStatementPrepare.isNull(i57) ? null : sQLiteStatementPrepare.getText(i57);
                            Tradability.Companion companion3 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion3.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i58 = columnIndexOrThrow53;
                            if (sQLiteStatementPrepare.isNull(i58)) {
                                columnIndexOrThrow52 = i57;
                                text7 = null;
                            } else {
                                columnIndexOrThrow52 = i57;
                                text7 = sQLiteStatementPrepare.getText(i58);
                            }
                            Tradability tradabilityFromServerValue2 = companion3.fromServerValue(text7);
                            if (tradabilityFromServerValue2 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            columnIndexOrThrow53 = i58;
                            int i59 = columnIndexOrThrow54;
                            boolean z4 = ((int) sQLiteStatementPrepare.getLong(i59)) != 0;
                            int i60 = columnIndexOrThrow55;
                            columnIndexOrThrow54 = i59;
                            BigDecimal bigDecimalStringToBigDecimal20 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i60) ? null : sQLiteStatementPrepare.getText(i60));
                            if (bigDecimalStringToBigDecimal20 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i61 = columnIndexOrThrow56;
                            columnIndexOrThrow56 = i61;
                            BigDecimal bigDecimalStringToBigDecimal21 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i61) ? null : sQLiteStatementPrepare.getText(i61));
                            if (bigDecimalStringToBigDecimal21 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i62 = columnIndexOrThrow57;
                            Tradability tradabilityFromServerValue3 = companion3.fromServerValue(sQLiteStatementPrepare.isNull(i62) ? null : sQLiteStatementPrepare.getText(i62));
                            if (tradabilityFromServerValue3 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i63 = columnIndexOrThrow58;
                            if (sQLiteStatementPrepare.isNull(i63)) {
                                columnIndexOrThrow57 = i62;
                                text8 = null;
                            } else {
                                columnIndexOrThrow57 = i62;
                                text8 = sQLiteStatementPrepare.getText(i63);
                            }
                            columnIndexOrThrow55 = i60;
                            UUID uuidStringToUuid6 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text8);
                            if (uuidStringToUuid6 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                            int i64 = columnIndexOrThrow59;
                            LocalDate localDateStringToLocalDate = comboOrderDao_Impl.__commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(i64) ? null : sQLiteStatementPrepare.getText(i64));
                            int i65 = columnIndexOrThrow60;
                            columnIndexOrThrow59 = i64;
                            BigDecimal bigDecimalStringToBigDecimal22 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i65) ? null : sQLiteStatementPrepare.getText(i65));
                            if (bigDecimalStringToBigDecimal22 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i66 = columnIndexOrThrow61;
                            columnIndexOrThrow61 = i66;
                            BigDecimal bigDecimalStringToBigDecimal23 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66));
                            if (bigDecimalStringToBigDecimal23 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i67 = columnIndexOrThrow62;
                            BigDecimal bigDecimalStringToBigDecimal24 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i67) ? null : sQLiteStatementPrepare.getText(i67));
                            int i68 = columnIndexOrThrow63;
                            String text22 = sQLiteStatementPrepare.getText(i68);
                            int i69 = columnIndexOrThrow64;
                            String text23 = sQLiteStatementPrepare.getText(i69);
                            columnIndexOrThrow63 = i68;
                            int i70 = columnIndexOrThrow65;
                            if (sQLiteStatementPrepare.isNull(i70)) {
                                columnIndexOrThrow65 = i70;
                                text9 = null;
                            } else {
                                columnIndexOrThrow65 = i70;
                                text9 = sQLiteStatementPrepare.getText(i70);
                            }
                            columnIndexOrThrow62 = i67;
                            Instant instantStringToInstant4 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(text9);
                            if (instantStringToInstant4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                            }
                            int i71 = columnIndexOrThrow66;
                            String text24 = sQLiteStatementPrepare.isNull(i71) ? null : sQLiteStatementPrepare.getText(i71);
                            int i72 = columnIndexOrThrow67;
                            String text25 = sQLiteStatementPrepare.getText(i72);
                            int i73 = columnIndexOrThrow68;
                            String text26 = sQLiteStatementPrepare.getText(i73);
                            columnIndexOrThrow66 = i71;
                            int i74 = columnIndexOrThrow69;
                            if (sQLiteStatementPrepare.isNull(i74)) {
                                columnIndexOrThrow69 = i74;
                                text10 = null;
                            } else {
                                columnIndexOrThrow69 = i74;
                                text10 = sQLiteStatementPrepare.getText(i74);
                            }
                            columnIndexOrThrow67 = i72;
                            UUID uuidStringToUuid7 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text10);
                            int i75 = columnIndexOrThrow70;
                            String text27 = sQLiteStatementPrepare.getText(i75);
                            columnIndexOrThrow60 = i65;
                            columnIndexOrThrow58 = i63;
                            int i76 = columnIndexOrThrow71;
                            int i77 = (int) sQLiteStatementPrepare.getLong(i76);
                            int i78 = columnIndexOrThrow72;
                            if (sQLiteStatementPrepare.isNull(i78)) {
                                columnIndexOrThrow70 = i75;
                                text11 = null;
                            } else {
                                columnIndexOrThrow70 = i75;
                                text11 = sQLiteStatementPrepare.getText(i78);
                            }
                            Tradability tradabilityFromServerValue4 = companion3.fromServerValue(text11);
                            if (tradabilityFromServerValue4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            Instrument instrument = new Instrument(tradabilityFromServerValue, z4, bigDecimalStringToBigDecimal20, bigDecimalStringToBigDecimal21, tradabilityFromServerValue3, tradabilityFromServerValue2, uuidStringToUuid6, null, null, null, localDateStringToLocalDate, bigDecimalStringToBigDecimal22, bigDecimalStringToBigDecimal23, bigDecimalStringToBigDecimal24, text22, text23, instantStringToInstant4, text24, text25, text26, uuidStringToUuid7, text27, i77, tradabilityFromServerValue4, null, null);
                            Object value = MapsKt.getValue(arrayMap, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            String str4 = str3;
                            Intrinsics.checkNotNullExpressionValue(value, str4);
                            List list = (List) value;
                            Object value2 = MapsKt.getValue(arrayMap2, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            Intrinsics.checkNotNullExpressionValue(value2, str4);
                            arrayList.add(new UiComboOrder(comboOrder, optionChain, instrument, list, (List) value2));
                            columnIndexOrThrow71 = i76;
                            columnIndexOrThrow68 = i73;
                            str3 = str4;
                            columnIndexOrThrow72 = i78;
                            columnIndexOrThrow64 = i69;
                            columnIndexOrThrow5 = i15;
                            columnIndexOrThrow2 = i10;
                            columnIndexOrThrow3 = i11;
                            columnIndexOrThrow4 = i12;
                            i9 = i;
                            columnIndexOrThrow6 = i17;
                            columnIndexOrThrow7 = i19;
                            columnIndexOrThrow8 = i21;
                            columnIndexOrThrow14 = i20;
                            columnIndexOrThrow15 = i22;
                            columnIndexOrThrow16 = i2;
                            columnIndexOrThrow17 = i24;
                            columnIndexOrThrow33 = i40;
                        } else {
                            columnIndexOrThrow46 = i4;
                            columnIndexOrThrow44 = i56;
                            columnIndexOrThrow45 = i3;
                            columnIndexOrThrow38 = i45;
                            tickRequirements = null;
                            OptionChain optionChain2 = new OptionChain(z2, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z3, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i572 = columnIndexOrThrow52;
                            if (!sQLiteStatementPrepare.isNull(i572)) {
                            }
                            Tradability.Companion companion32 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion32.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                            }
                        }
                    } else {
                        columnIndexOrThrow51 = i55;
                    }
                } else {
                    columnIndexOrThrow51 = i55;
                    i3 = columnIndexOrThrow45;
                }
                i4 = columnIndexOrThrow46;
                if (sQLiteStatementPrepare.isNull(i56)) {
                }
                columnIndexOrThrow38 = i45;
                bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                if (bigDecimalStringToBigDecimal != null) {
                }
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    public Flow<List<UiComboOrder>> getLatest(final Set<? extends OrderState> states, final UUID instrumentId, final Instant since, final Instant before, final int limit, final boolean isFilteringByAccountNumber, final Set<String> accountNumbers) {
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(since, "since");
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        SELECT *");
        sb.append("\n");
        sb.append("        FROM UiComboOrder");
        sb.append("\n");
        sb.append("        WHERE derivedState IN (");
        final int size = states.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(")");
        sb.append("\n");
        sb.append("        AND (");
        sb.append("\n");
        sb.append("            ");
        sb.append("?");
        sb.append(" IS NULL ");
        sb.append("\n");
        sb.append("            OR equityInstrumentId = ");
        sb.append("?");
        sb.append("\n");
        sb.append("        )");
        sb.append("\n");
        sb.append("        AND createdAt >= ");
        sb.append("?");
        sb.append("\n");
        sb.append("        AND (");
        sb.append("?");
        sb.append(" IS NULL OR createdAt < ");
        sb.append("?");
        sb.append(")");
        sb.append("\n");
        sb.append("        AND (NOT ");
        sb.append("?");
        sb.append(" OR accountNumber in (");
        final int size2 = accountNumbers.size();
        StringUtil.appendPlaceholders(sb, size2);
        sb.append("))");
        sb.append("\n");
        sb.append("        ORDER BY createdAt DESC, id DESC");
        sb.append("\n");
        sb.append("        LIMIT ");
        sb.append("?");
        sb.append("\n");
        sb.append("        ");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return FlowBuilder.createFlow(this.__db, true, new String[]{"ComboOrderExecution", "OptionInstrument", "Instrument", "ComboOrderLeg", "ComboOrderSalesTax", "UiComboOrder"}, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.getLatest$lambda$14(string2, states, size, this, instrumentId, since, before, isFilteringByAccountNumber, accountNumbers, size2, limit, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07ee A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0015, B:4:0x001a, B:6:0x0020, B:8:0x002e, B:12:0x0038, B:11:0x0035, B:13:0x003b, B:15:0x0047, B:17:0x004e, B:19:0x005a, B:21:0x0061, B:23:0x006f, B:25:0x0076, B:27:0x0082, B:29:0x0089, B:31:0x0095, B:33:0x009c, B:34:0x00ab, B:36:0x00b1, B:37:0x00bd, B:38:0x02fb, B:40:0x0301, B:42:0x030d, B:44:0x031a, B:46:0x0324, B:48:0x0331, B:49:0x0343, B:51:0x0349, B:55:0x0355, B:58:0x0361, B:63:0x0374, B:66:0x0380, B:70:0x038f, B:75:0x039e, B:77:0x03a8, B:81:0x03b4, B:83:0x03be, B:87:0x03ce, B:92:0x03e3, B:97:0x03fc, B:101:0x040a, B:106:0x041f, B:108:0x0427, B:113:0x0438, B:117:0x0446, B:122:0x045b, B:127:0x0476, B:132:0x0487, B:134:0x0491, B:138:0x049f, B:140:0x04a5, B:144:0x04b9, B:149:0x04d4, B:151:0x04de, B:156:0x04ef, B:161:0x0508, B:166:0x0521, B:168:0x052b, B:173:0x053c, B:175:0x0546, B:180:0x0557, B:182:0x0561, B:187:0x0572, B:189:0x057c, B:194:0x058d, B:198:0x05a3, B:203:0x05b8, B:205:0x05c0, B:210:0x05d1, B:212:0x05d9, B:217:0x05ea, B:219:0x05f2, B:224:0x0603, B:226:0x060d, B:231:0x061e, B:235:0x0634, B:237:0x063a, B:242:0x0651, B:244:0x065b, B:248:0x0669, B:250:0x066f, B:254:0x067d, B:256:0x0685, B:261:0x0696, B:263:0x06a0, B:268:0x06c4, B:273:0x06d3, B:278:0x06ec, B:280:0x06f6, B:285:0x0707, B:287:0x070f, B:292:0x0720, B:294:0x072a, B:299:0x073b, B:301:0x0743, B:306:0x0754, B:308:0x075e, B:313:0x0771, B:318:0x078c, B:320:0x0796, B:325:0x07b3, B:327:0x07b9, B:329:0x07c1, B:336:0x07e2, B:341:0x07f7, B:343:0x0801, B:348:0x0810, B:350:0x081a, B:355:0x0829, B:357:0x0833, B:358:0x083a, B:362:0x0851, B:366:0x085d, B:370:0x086f, B:372:0x0875, B:377:0x088a, B:382:0x0899, B:384:0x08a3, B:389:0x08b4, B:391:0x08be, B:395:0x08cc, B:397:0x08d2, B:402:0x08e9, B:404:0x08f3, B:408:0x0901, B:413:0x091a, B:415:0x0924, B:420:0x0935, B:422:0x093f, B:426:0x094d, B:431:0x097a, B:433:0x0984, B:438:0x0998, B:443:0x09bb, B:447:0x09e8, B:449:0x09ee, B:450:0x0a4f, B:451:0x0a54, B:446:0x09e0, B:442:0x09b2, B:437:0x0991, B:452:0x0a55, B:453:0x0a5a, B:430:0x0971, B:425:0x0949, B:454:0x0a5b, B:455:0x0a60, B:419:0x0930, B:456:0x0a61, B:457:0x0a66, B:412:0x0915, B:407:0x08fd, B:458:0x0a67, B:459:0x0a6c, B:401:0x08e0, B:460:0x0a6d, B:461:0x0a72, B:394:0x08c8, B:462:0x0a73, B:463:0x0a78, B:388:0x08af, B:464:0x0a79, B:465:0x0a7e, B:381:0x0894, B:466:0x0a7f, B:467:0x0a84, B:369:0x0867, B:468:0x0a85, B:469:0x0a8a, B:361:0x084d, B:470:0x0a8b, B:471:0x0a90, B:354:0x0824, B:472:0x0a91, B:473:0x0a96, B:347:0x080b, B:474:0x0a97, B:475:0x0a9c, B:340:0x07ee, B:324:0x07a5, B:476:0x0a9d, B:477:0x0aa2, B:317:0x0783, B:478:0x0aa3, B:479:0x0aa8, B:305:0x074f, B:480:0x0aa9, B:481:0x0ab0, B:298:0x0736, B:482:0x0ab1, B:483:0x0ab6, B:291:0x071b, B:484:0x0ab7, B:485:0x0abe, B:284:0x0702, B:486:0x0abf, B:487:0x0ac6, B:277:0x06e7, B:272:0x06ce, B:488:0x0ac7, B:489:0x0acc, B:260:0x0691, B:490:0x0acd, B:491:0x0ad4, B:253:0x0679, B:492:0x0ad5, B:493:0x0ada, B:247:0x0665, B:494:0x0adb, B:495:0x0ae0, B:241:0x0648, B:496:0x0ae1, B:497:0x0ae6, B:234:0x0630, B:230:0x0619, B:498:0x0ae7, B:499:0x0aec, B:223:0x05fe, B:500:0x0aed, B:501:0x0af4, B:216:0x05e5, B:502:0x0af5, B:503:0x0afc, B:209:0x05cc, B:504:0x0afd, B:505:0x0b04, B:202:0x05b3, B:197:0x059f, B:193:0x0588, B:506:0x0b05, B:507:0x0b0a, B:186:0x056d, B:508:0x0b0b, B:509:0x0b10, B:179:0x0552, B:510:0x0b11, B:511:0x0b16, B:172:0x0537, B:512:0x0b17, B:513:0x0b1c, B:165:0x051c, B:160:0x0503, B:155:0x04ea, B:514:0x0b1d, B:515:0x0b22, B:148:0x04cb, B:143:0x04b1, B:516:0x0b23, B:517:0x0b28, B:137:0x049b, B:518:0x0b29, B:519:0x0b2e, B:131:0x0480, B:121:0x0452, B:520:0x0b2f, B:521:0x0b34, B:112:0x0433, B:522:0x0b35, B:523:0x0b3c, B:105:0x0416, B:524:0x0b3d, B:525:0x0b42, B:96:0x03f7, B:91:0x03de, B:86:0x03ca, B:526:0x0b43, B:527:0x0b48, B:80:0x03b0, B:528:0x0b49, B:529:0x0b4e, B:74:0x0399, B:69:0x0389, B:530:0x0b4f, B:531:0x0b54, B:62:0x036f, B:532:0x0b55, B:533:0x0b5a, B:54:0x0351, B:32:0x0099, B:28:0x0086, B:24:0x0073, B:20:0x005e, B:16:0x004b), top: B:538:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0801 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0015, B:4:0x001a, B:6:0x0020, B:8:0x002e, B:12:0x0038, B:11:0x0035, B:13:0x003b, B:15:0x0047, B:17:0x004e, B:19:0x005a, B:21:0x0061, B:23:0x006f, B:25:0x0076, B:27:0x0082, B:29:0x0089, B:31:0x0095, B:33:0x009c, B:34:0x00ab, B:36:0x00b1, B:37:0x00bd, B:38:0x02fb, B:40:0x0301, B:42:0x030d, B:44:0x031a, B:46:0x0324, B:48:0x0331, B:49:0x0343, B:51:0x0349, B:55:0x0355, B:58:0x0361, B:63:0x0374, B:66:0x0380, B:70:0x038f, B:75:0x039e, B:77:0x03a8, B:81:0x03b4, B:83:0x03be, B:87:0x03ce, B:92:0x03e3, B:97:0x03fc, B:101:0x040a, B:106:0x041f, B:108:0x0427, B:113:0x0438, B:117:0x0446, B:122:0x045b, B:127:0x0476, B:132:0x0487, B:134:0x0491, B:138:0x049f, B:140:0x04a5, B:144:0x04b9, B:149:0x04d4, B:151:0x04de, B:156:0x04ef, B:161:0x0508, B:166:0x0521, B:168:0x052b, B:173:0x053c, B:175:0x0546, B:180:0x0557, B:182:0x0561, B:187:0x0572, B:189:0x057c, B:194:0x058d, B:198:0x05a3, B:203:0x05b8, B:205:0x05c0, B:210:0x05d1, B:212:0x05d9, B:217:0x05ea, B:219:0x05f2, B:224:0x0603, B:226:0x060d, B:231:0x061e, B:235:0x0634, B:237:0x063a, B:242:0x0651, B:244:0x065b, B:248:0x0669, B:250:0x066f, B:254:0x067d, B:256:0x0685, B:261:0x0696, B:263:0x06a0, B:268:0x06c4, B:273:0x06d3, B:278:0x06ec, B:280:0x06f6, B:285:0x0707, B:287:0x070f, B:292:0x0720, B:294:0x072a, B:299:0x073b, B:301:0x0743, B:306:0x0754, B:308:0x075e, B:313:0x0771, B:318:0x078c, B:320:0x0796, B:325:0x07b3, B:327:0x07b9, B:329:0x07c1, B:336:0x07e2, B:341:0x07f7, B:343:0x0801, B:348:0x0810, B:350:0x081a, B:355:0x0829, B:357:0x0833, B:358:0x083a, B:362:0x0851, B:366:0x085d, B:370:0x086f, B:372:0x0875, B:377:0x088a, B:382:0x0899, B:384:0x08a3, B:389:0x08b4, B:391:0x08be, B:395:0x08cc, B:397:0x08d2, B:402:0x08e9, B:404:0x08f3, B:408:0x0901, B:413:0x091a, B:415:0x0924, B:420:0x0935, B:422:0x093f, B:426:0x094d, B:431:0x097a, B:433:0x0984, B:438:0x0998, B:443:0x09bb, B:447:0x09e8, B:449:0x09ee, B:450:0x0a4f, B:451:0x0a54, B:446:0x09e0, B:442:0x09b2, B:437:0x0991, B:452:0x0a55, B:453:0x0a5a, B:430:0x0971, B:425:0x0949, B:454:0x0a5b, B:455:0x0a60, B:419:0x0930, B:456:0x0a61, B:457:0x0a66, B:412:0x0915, B:407:0x08fd, B:458:0x0a67, B:459:0x0a6c, B:401:0x08e0, B:460:0x0a6d, B:461:0x0a72, B:394:0x08c8, B:462:0x0a73, B:463:0x0a78, B:388:0x08af, B:464:0x0a79, B:465:0x0a7e, B:381:0x0894, B:466:0x0a7f, B:467:0x0a84, B:369:0x0867, B:468:0x0a85, B:469:0x0a8a, B:361:0x084d, B:470:0x0a8b, B:471:0x0a90, B:354:0x0824, B:472:0x0a91, B:473:0x0a96, B:347:0x080b, B:474:0x0a97, B:475:0x0a9c, B:340:0x07ee, B:324:0x07a5, B:476:0x0a9d, B:477:0x0aa2, B:317:0x0783, B:478:0x0aa3, B:479:0x0aa8, B:305:0x074f, B:480:0x0aa9, B:481:0x0ab0, B:298:0x0736, B:482:0x0ab1, B:483:0x0ab6, B:291:0x071b, B:484:0x0ab7, B:485:0x0abe, B:284:0x0702, B:486:0x0abf, B:487:0x0ac6, B:277:0x06e7, B:272:0x06ce, B:488:0x0ac7, B:489:0x0acc, B:260:0x0691, B:490:0x0acd, B:491:0x0ad4, B:253:0x0679, B:492:0x0ad5, B:493:0x0ada, B:247:0x0665, B:494:0x0adb, B:495:0x0ae0, B:241:0x0648, B:496:0x0ae1, B:497:0x0ae6, B:234:0x0630, B:230:0x0619, B:498:0x0ae7, B:499:0x0aec, B:223:0x05fe, B:500:0x0aed, B:501:0x0af4, B:216:0x05e5, B:502:0x0af5, B:503:0x0afc, B:209:0x05cc, B:504:0x0afd, B:505:0x0b04, B:202:0x05b3, B:197:0x059f, B:193:0x0588, B:506:0x0b05, B:507:0x0b0a, B:186:0x056d, B:508:0x0b0b, B:509:0x0b10, B:179:0x0552, B:510:0x0b11, B:511:0x0b16, B:172:0x0537, B:512:0x0b17, B:513:0x0b1c, B:165:0x051c, B:160:0x0503, B:155:0x04ea, B:514:0x0b1d, B:515:0x0b22, B:148:0x04cb, B:143:0x04b1, B:516:0x0b23, B:517:0x0b28, B:137:0x049b, B:518:0x0b29, B:519:0x0b2e, B:131:0x0480, B:121:0x0452, B:520:0x0b2f, B:521:0x0b34, B:112:0x0433, B:522:0x0b35, B:523:0x0b3c, B:105:0x0416, B:524:0x0b3d, B:525:0x0b42, B:96:0x03f7, B:91:0x03de, B:86:0x03ca, B:526:0x0b43, B:527:0x0b48, B:80:0x03b0, B:528:0x0b49, B:529:0x0b4e, B:74:0x0399, B:69:0x0389, B:530:0x0b4f, B:531:0x0b54, B:62:0x036f, B:532:0x0b55, B:533:0x0b5a, B:54:0x0351, B:32:0x0099, B:28:0x0086, B:24:0x0073, B:20:0x005e, B:16:0x004b), top: B:538:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x084d A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0015, B:4:0x001a, B:6:0x0020, B:8:0x002e, B:12:0x0038, B:11:0x0035, B:13:0x003b, B:15:0x0047, B:17:0x004e, B:19:0x005a, B:21:0x0061, B:23:0x006f, B:25:0x0076, B:27:0x0082, B:29:0x0089, B:31:0x0095, B:33:0x009c, B:34:0x00ab, B:36:0x00b1, B:37:0x00bd, B:38:0x02fb, B:40:0x0301, B:42:0x030d, B:44:0x031a, B:46:0x0324, B:48:0x0331, B:49:0x0343, B:51:0x0349, B:55:0x0355, B:58:0x0361, B:63:0x0374, B:66:0x0380, B:70:0x038f, B:75:0x039e, B:77:0x03a8, B:81:0x03b4, B:83:0x03be, B:87:0x03ce, B:92:0x03e3, B:97:0x03fc, B:101:0x040a, B:106:0x041f, B:108:0x0427, B:113:0x0438, B:117:0x0446, B:122:0x045b, B:127:0x0476, B:132:0x0487, B:134:0x0491, B:138:0x049f, B:140:0x04a5, B:144:0x04b9, B:149:0x04d4, B:151:0x04de, B:156:0x04ef, B:161:0x0508, B:166:0x0521, B:168:0x052b, B:173:0x053c, B:175:0x0546, B:180:0x0557, B:182:0x0561, B:187:0x0572, B:189:0x057c, B:194:0x058d, B:198:0x05a3, B:203:0x05b8, B:205:0x05c0, B:210:0x05d1, B:212:0x05d9, B:217:0x05ea, B:219:0x05f2, B:224:0x0603, B:226:0x060d, B:231:0x061e, B:235:0x0634, B:237:0x063a, B:242:0x0651, B:244:0x065b, B:248:0x0669, B:250:0x066f, B:254:0x067d, B:256:0x0685, B:261:0x0696, B:263:0x06a0, B:268:0x06c4, B:273:0x06d3, B:278:0x06ec, B:280:0x06f6, B:285:0x0707, B:287:0x070f, B:292:0x0720, B:294:0x072a, B:299:0x073b, B:301:0x0743, B:306:0x0754, B:308:0x075e, B:313:0x0771, B:318:0x078c, B:320:0x0796, B:325:0x07b3, B:327:0x07b9, B:329:0x07c1, B:336:0x07e2, B:341:0x07f7, B:343:0x0801, B:348:0x0810, B:350:0x081a, B:355:0x0829, B:357:0x0833, B:358:0x083a, B:362:0x0851, B:366:0x085d, B:370:0x086f, B:372:0x0875, B:377:0x088a, B:382:0x0899, B:384:0x08a3, B:389:0x08b4, B:391:0x08be, B:395:0x08cc, B:397:0x08d2, B:402:0x08e9, B:404:0x08f3, B:408:0x0901, B:413:0x091a, B:415:0x0924, B:420:0x0935, B:422:0x093f, B:426:0x094d, B:431:0x097a, B:433:0x0984, B:438:0x0998, B:443:0x09bb, B:447:0x09e8, B:449:0x09ee, B:450:0x0a4f, B:451:0x0a54, B:446:0x09e0, B:442:0x09b2, B:437:0x0991, B:452:0x0a55, B:453:0x0a5a, B:430:0x0971, B:425:0x0949, B:454:0x0a5b, B:455:0x0a60, B:419:0x0930, B:456:0x0a61, B:457:0x0a66, B:412:0x0915, B:407:0x08fd, B:458:0x0a67, B:459:0x0a6c, B:401:0x08e0, B:460:0x0a6d, B:461:0x0a72, B:394:0x08c8, B:462:0x0a73, B:463:0x0a78, B:388:0x08af, B:464:0x0a79, B:465:0x0a7e, B:381:0x0894, B:466:0x0a7f, B:467:0x0a84, B:369:0x0867, B:468:0x0a85, B:469:0x0a8a, B:361:0x084d, B:470:0x0a8b, B:471:0x0a90, B:354:0x0824, B:472:0x0a91, B:473:0x0a96, B:347:0x080b, B:474:0x0a97, B:475:0x0a9c, B:340:0x07ee, B:324:0x07a5, B:476:0x0a9d, B:477:0x0aa2, B:317:0x0783, B:478:0x0aa3, B:479:0x0aa8, B:305:0x074f, B:480:0x0aa9, B:481:0x0ab0, B:298:0x0736, B:482:0x0ab1, B:483:0x0ab6, B:291:0x071b, B:484:0x0ab7, B:485:0x0abe, B:284:0x0702, B:486:0x0abf, B:487:0x0ac6, B:277:0x06e7, B:272:0x06ce, B:488:0x0ac7, B:489:0x0acc, B:260:0x0691, B:490:0x0acd, B:491:0x0ad4, B:253:0x0679, B:492:0x0ad5, B:493:0x0ada, B:247:0x0665, B:494:0x0adb, B:495:0x0ae0, B:241:0x0648, B:496:0x0ae1, B:497:0x0ae6, B:234:0x0630, B:230:0x0619, B:498:0x0ae7, B:499:0x0aec, B:223:0x05fe, B:500:0x0aed, B:501:0x0af4, B:216:0x05e5, B:502:0x0af5, B:503:0x0afc, B:209:0x05cc, B:504:0x0afd, B:505:0x0b04, B:202:0x05b3, B:197:0x059f, B:193:0x0588, B:506:0x0b05, B:507:0x0b0a, B:186:0x056d, B:508:0x0b0b, B:509:0x0b10, B:179:0x0552, B:510:0x0b11, B:511:0x0b16, B:172:0x0537, B:512:0x0b17, B:513:0x0b1c, B:165:0x051c, B:160:0x0503, B:155:0x04ea, B:514:0x0b1d, B:515:0x0b22, B:148:0x04cb, B:143:0x04b1, B:516:0x0b23, B:517:0x0b28, B:137:0x049b, B:518:0x0b29, B:519:0x0b2e, B:131:0x0480, B:121:0x0452, B:520:0x0b2f, B:521:0x0b34, B:112:0x0433, B:522:0x0b35, B:523:0x0b3c, B:105:0x0416, B:524:0x0b3d, B:525:0x0b42, B:96:0x03f7, B:91:0x03de, B:86:0x03ca, B:526:0x0b43, B:527:0x0b48, B:80:0x03b0, B:528:0x0b49, B:529:0x0b4e, B:74:0x0399, B:69:0x0389, B:530:0x0b4f, B:531:0x0b54, B:62:0x036f, B:532:0x0b55, B:533:0x0b5a, B:54:0x0351, B:32:0x0099, B:28:0x0086, B:24:0x0073, B:20:0x005e, B:16:0x004b), top: B:538:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0a97 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0a85 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List getLatest$lambda$14(String str, Set set, int i, ComboOrderDao_Impl comboOrderDao_Impl, UUID uuid, Instant instant, Instant instant2, boolean z, Set set2, int i2, int i3, SQLiteConnection _connection) {
        int i4;
        String text;
        String text2;
        String text3;
        String text4;
        String text5;
        String text6;
        Integer numValueOf;
        int i5;
        int i6;
        OptionChain.TickRequirements tickRequirements;
        Tradability tradabilityFromServerValue;
        String text7;
        String text8;
        String text9;
        String text10;
        String text11;
        String text12;
        BigDecimal bigDecimalStringToBigDecimal;
        int i7;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = set.iterator();
            int i8 = 1;
            while (it.hasNext()) {
                String serverValue = OrderState.INSTANCE.toServerValue((OrderState) it.next());
                if (serverValue == null) {
                    sQLiteStatementPrepare.bindNull(i8);
                } else {
                    sQLiteStatementPrepare.bindText(i8, serverValue);
                }
                i8++;
            }
            int i9 = i + 1;
            String strUuidToString = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(i9);
            } else {
                sQLiteStatementPrepare.bindText(i9, strUuidToString);
            }
            int i10 = i + 2;
            String strUuidToString2 = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString2 == null) {
                sQLiteStatementPrepare.bindNull(i10);
            } else {
                sQLiteStatementPrepare.bindText(i10, strUuidToString2);
            }
            int i11 = i + 3;
            String strInstantToString = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant);
            if (strInstantToString == null) {
                sQLiteStatementPrepare.bindNull(i11);
            } else {
                sQLiteStatementPrepare.bindText(i11, strInstantToString);
            }
            int i12 = i + 4;
            String strInstantToString2 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant2);
            if (strInstantToString2 == null) {
                sQLiteStatementPrepare.bindNull(i12);
            } else {
                sQLiteStatementPrepare.bindText(i12, strInstantToString2);
            }
            int i13 = i + 5;
            String strInstantToString3 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant2);
            if (strInstantToString3 == null) {
                sQLiteStatementPrepare.bindNull(i13);
            } else {
                sQLiteStatementPrepare.bindText(i13, strInstantToString3);
            }
            sQLiteStatementPrepare.bindLong(i + 6, z ? 1L : 0L);
            int i14 = i + 7;
            Iterator it2 = set2.iterator();
            int i15 = i14;
            while (it2.hasNext()) {
                sQLiteStatementPrepare.bindText(i15, (String) it2.next());
                i15++;
            }
            sQLiteStatementPrepare.bindLong(i14 + i2, i3);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "averageNetPremiumPaid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancelUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canceledQuantity");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSymbol");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closingStrategy");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contractFees");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivedState");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "direction");
            String str2 = "getValue(...)";
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "goldSavings");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isReplaceable");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmount");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmountDirection");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openingStrategy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pendingQuantity");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "premium");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AnalyticsStrings.TAG_SORT_ORDER_PRICE);
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremium");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedQuantity");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "regulatoryFees");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stopPrice");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "strategy");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInForce");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedAt");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "refId");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremiumDirection");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmount");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmountDirection");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "formSource");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equityInstrumentId");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "underlyingSymbol");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_canOpenPosition");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_cashComponent");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_expirationDates");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_extendedHoursState");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_lateCloseState");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickAboveCutoff");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickBelowCutoff");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_cutoffPrice");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_receivedAt");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_settleOnOpen");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_symbol");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_tradeValueMultiplier");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_selloutTimeToExpiration");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_affiliateTradability");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_allDayTradability");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_carRequired");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_dayTradeRatio");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_defaultPresetPercentLimit");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_fractionalTradability");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_id");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_listDate");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_maintenanceRatio");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_marginInitialRatio");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_minTickSize");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_name");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_otcMarketTier");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_receivedAt");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_simpleName");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_state");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_symbol");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_tradableChainId");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_type");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_notionalEstimatedQuantityDecimals");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_shortSaleTradability");
            ArrayMap<String, List<UiComboOrderLeg>> arrayMap = new ArrayMap<>();
            int i16 = columnIndexOrThrow12;
            ArrayMap<String, List<ComboOrderSalesTax>> arrayMap2 = new ArrayMap<>();
            while (sQLiteStatementPrepare.step()) {
                int i17 = columnIndexOrThrow11;
                String text13 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (arrayMap.containsKey(text13)) {
                    i7 = columnIndexOrThrow10;
                } else {
                    i7 = columnIndexOrThrow10;
                    arrayMap.put(text13, new ArrayList());
                }
                String text14 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!arrayMap2.containsKey(text14)) {
                    arrayMap2.put(text14, new ArrayList());
                }
                columnIndexOrThrow11 = i17;
                columnIndexOrThrow10 = i7;
            }
            int i18 = columnIndexOrThrow10;
            int i19 = columnIndexOrThrow11;
            sQLiteStatementPrepare.reset();
            comboOrderDao_Impl.m2217x4e5ab2fa(_connection, arrayMap);
            comboOrderDao_Impl.m2219x367d9594(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text15 = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                int i20 = columnIndexOrThrow2;
                BigDecimal bigDecimalStringToBigDecimal2 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (bigDecimalStringToBigDecimal2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                int i21 = columnIndexOrThrow3;
                BigDecimal bigDecimalStringToBigDecimal3 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (bigDecimalStringToBigDecimal3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                UUID uuidStringToUuid2 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (uuidStringToUuid2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text17 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                OptionStrategyType.Companion companion = OptionStrategyType.INSTANCE;
                OptionStrategyType optionStrategyTypeFromServerValue = companion.fromServerValue(text18);
                int i22 = columnIndexOrThrow4;
                BigDecimal bigDecimalStringToBigDecimal4 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                int i23 = i18;
                i18 = i23;
                Instant instantStringToInstant = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i24 = i19;
                if (sQLiteStatementPrepare.isNull(i24)) {
                    i4 = i24;
                    text = null;
                } else {
                    i4 = i24;
                    text = sQLiteStatementPrepare.getText(i24);
                }
                int i25 = columnIndexOrThrow5;
                OrderState orderStateFromServerValue = OrderState.INSTANCE.fromServerValue(text);
                if (orderStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.shared.models.history.shared.OrderState', but it was NULL.");
                }
                int i26 = i16;
                String text19 = sQLiteStatementPrepare.isNull(i26) ? null : sQLiteStatementPrepare.getText(i26);
                i16 = i26;
                OrderDirection.Companion companion2 = OrderDirection.INSTANCE;
                OrderDirection orderDirectionFromServerValue = companion2.fromServerValue(text19);
                if (orderDirectionFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i27 = columnIndexOrThrow6;
                int i28 = columnIndexOrThrow13;
                if (sQLiteStatementPrepare.isNull(i28)) {
                    columnIndexOrThrow13 = i28;
                    text2 = null;
                } else {
                    columnIndexOrThrow13 = i28;
                    text2 = sQLiteStatementPrepare.getText(i28);
                }
                int i29 = columnIndexOrThrow7;
                BigDecimal bigDecimalStringToBigDecimal5 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text2);
                int i30 = columnIndexOrThrow14;
                int i31 = columnIndexOrThrow8;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i30)) != 0;
                int i32 = columnIndexOrThrow15;
                BigDecimal bigDecimalStringToBigDecimal6 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32));
                if (bigDecimalStringToBigDecimal6 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i33 = columnIndexOrThrow16;
                OrderDirection orderDirectionFromServerValue2 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                if (orderDirectionFromServerValue2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i34 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i34)) {
                    columnIndexOrThrow16 = i33;
                    text3 = null;
                } else {
                    columnIndexOrThrow16 = i33;
                    text3 = sQLiteStatementPrepare.getText(i34);
                }
                OptionStrategyType optionStrategyTypeFromServerValue2 = companion.fromServerValue(text3);
                int i35 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i35)) {
                    columnIndexOrThrow18 = i35;
                    text4 = null;
                } else {
                    columnIndexOrThrow18 = i35;
                    text4 = sQLiteStatementPrepare.getText(i35);
                }
                BigDecimal bigDecimalStringToBigDecimal7 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text4);
                if (bigDecimalStringToBigDecimal7 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i36 = columnIndexOrThrow19;
                columnIndexOrThrow19 = i36;
                BigDecimal bigDecimalStringToBigDecimal8 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i36) ? null : sQLiteStatementPrepare.getText(i36));
                int i37 = columnIndexOrThrow20;
                columnIndexOrThrow20 = i37;
                BigDecimal bigDecimalStringToBigDecimal9 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i37) ? null : sQLiteStatementPrepare.getText(i37));
                int i38 = columnIndexOrThrow21;
                columnIndexOrThrow21 = i38;
                BigDecimal bigDecimalStringToBigDecimal10 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i38) ? null : sQLiteStatementPrepare.getText(i38));
                if (bigDecimalStringToBigDecimal10 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i39 = columnIndexOrThrow22;
                columnIndexOrThrow22 = i39;
                BigDecimal bigDecimalStringToBigDecimal11 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i39) ? null : sQLiteStatementPrepare.getText(i39));
                if (bigDecimalStringToBigDecimal11 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i40 = columnIndexOrThrow23;
                columnIndexOrThrow23 = i40;
                BigDecimal bigDecimalStringToBigDecimal12 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i40) ? null : sQLiteStatementPrepare.getText(i40));
                if (bigDecimalStringToBigDecimal12 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i41 = columnIndexOrThrow24;
                columnIndexOrThrow24 = i41;
                BigDecimal bigDecimalStringToBigDecimal13 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i41) ? null : sQLiteStatementPrepare.getText(i41));
                if (bigDecimalStringToBigDecimal13 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i42 = columnIndexOrThrow25;
                columnIndexOrThrow25 = i42;
                BigDecimal bigDecimalStringToBigDecimal14 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i42) ? null : sQLiteStatementPrepare.getText(i42));
                int i43 = columnIndexOrThrow26;
                OptionStrategyType optionStrategyTypeFromServerValue3 = companion.fromServerValue(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                int i44 = columnIndexOrThrow27;
                columnIndexOrThrow26 = i43;
                OrderTimeInForce orderTimeInForceFromServerValue = OrderTimeInForce.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i44) ? null : sQLiteStatementPrepare.getText(i44));
                if (orderTimeInForceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTimeInForce', but it was NULL.");
                }
                int i45 = columnIndexOrThrow28;
                columnIndexOrThrow28 = i45;
                OrderTrigger orderTriggerFromServerValue = OrderTrigger.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i45) ? null : sQLiteStatementPrepare.getText(i45));
                if (orderTriggerFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTrigger', but it was NULL.");
                }
                int i46 = columnIndexOrThrow29;
                columnIndexOrThrow29 = i46;
                OrderType orderTypeFromServerValue = OrderType.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i46) ? null : sQLiteStatementPrepare.getText(i46));
                if (orderTypeFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderType', but it was NULL.");
                }
                int i47 = columnIndexOrThrow30;
                columnIndexOrThrow30 = i47;
                Instant instantStringToInstant2 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i47) ? null : sQLiteStatementPrepare.getText(i47));
                if (instantStringToInstant2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i48 = columnIndexOrThrow31;
                columnIndexOrThrow31 = i48;
                UUID uuidStringToUuid3 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i48) ? null : sQLiteStatementPrepare.getText(i48));
                int i49 = columnIndexOrThrow32;
                OrderDirection orderDirectionFromServerValue3 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i49) ? null : sQLiteStatementPrepare.getText(i49));
                if (orderDirectionFromServerValue3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i50 = columnIndexOrThrow33;
                if (sQLiteStatementPrepare.isNull(i50)) {
                    columnIndexOrThrow32 = i49;
                    text5 = null;
                } else {
                    columnIndexOrThrow32 = i49;
                    text5 = sQLiteStatementPrepare.getText(i50);
                }
                columnIndexOrThrow27 = i44;
                BigDecimal bigDecimalStringToBigDecimal15 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text5);
                if (bigDecimalStringToBigDecimal15 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i51 = columnIndexOrThrow34;
                OrderDirection orderDirectionFromServerValue4 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i51) ? null : sQLiteStatementPrepare.getText(i51));
                if (orderDirectionFromServerValue4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i52 = columnIndexOrThrow35;
                OptionOrder.FormSource formSourceFromServerValue = OptionOrder.FormSource.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i52) ? null : sQLiteStatementPrepare.getText(i52));
                if (formSourceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionOrder.FormSource', but it was NULL.");
                }
                int i53 = columnIndexOrThrow36;
                columnIndexOrThrow35 = i52;
                UUID uuidStringToUuid4 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i53) ? null : sQLiteStatementPrepare.getText(i53));
                if (uuidStringToUuid4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i54 = columnIndexOrThrow37;
                ComboOrder comboOrder = new ComboOrder(uuidStringToUuid, text15, bigDecimalStringToBigDecimal2, text16, bigDecimalStringToBigDecimal3, uuidStringToUuid2, text17, optionStrategyTypeFromServerValue, bigDecimalStringToBigDecimal4, instantStringToInstant, orderStateFromServerValue, orderDirectionFromServerValue, bigDecimalStringToBigDecimal5, z2, bigDecimalStringToBigDecimal6, orderDirectionFromServerValue2, optionStrategyTypeFromServerValue2, bigDecimalStringToBigDecimal7, bigDecimalStringToBigDecimal8, bigDecimalStringToBigDecimal9, bigDecimalStringToBigDecimal10, bigDecimalStringToBigDecimal11, bigDecimalStringToBigDecimal12, bigDecimalStringToBigDecimal13, bigDecimalStringToBigDecimal14, optionStrategyTypeFromServerValue3, orderTimeInForceFromServerValue, orderTriggerFromServerValue, orderTypeFromServerValue, instantStringToInstant2, uuidStringToUuid3, orderDirectionFromServerValue3, bigDecimalStringToBigDecimal15, orderDirectionFromServerValue4, formSourceFromServerValue, uuidStringToUuid4, sQLiteStatementPrepare.getText(i54));
                columnIndexOrThrow37 = i54;
                columnIndexOrThrow36 = i53;
                int i55 = columnIndexOrThrow38;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i55)) != 0;
                int i56 = columnIndexOrThrow39;
                columnIndexOrThrow39 = i56;
                BigDecimal bigDecimalStringToBigDecimal16 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i56) ? null : sQLiteStatementPrepare.getText(i56));
                int i57 = columnIndexOrThrow40;
                columnIndexOrThrow40 = i57;
                ImmutableList<LocalDate> immutableListStringToLocalDateImmutableList = comboOrderDao_Impl.__modelRoomConverters().stringToLocalDateImmutableList(sQLiteStatementPrepare.isNull(i57) ? null : sQLiteStatementPrepare.getText(i57));
                if (immutableListStringToLocalDateImmutableList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlinx.collections.immutable.ImmutableList<java.time.LocalDate>', but it was NULL.");
                }
                int i58 = columnIndexOrThrow41;
                columnIndexOrThrow41 = i58;
                OptionChain.ExtendedHoursState extendedHoursStateFromServerValue = OptionChain.ExtendedHoursState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i58) ? null : sQLiteStatementPrepare.getText(i58));
                if (extendedHoursStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.ExtendedHoursState', but it was NULL.");
                }
                int i59 = columnIndexOrThrow42;
                columnIndexOrThrow42 = i59;
                UUID uuidStringToUuid5 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59));
                if (uuidStringToUuid5 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i60 = columnIndexOrThrow43;
                columnIndexOrThrow43 = i60;
                OptionChain.LateCloseState lateCloseStateFromServerValue = OptionChain.LateCloseState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i60) ? null : sQLiteStatementPrepare.getText(i60));
                if (lateCloseStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.LateCloseState', but it was NULL.");
                }
                int i61 = columnIndexOrThrow47;
                columnIndexOrThrow47 = i61;
                Instant instantStringToInstant3 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i61) ? null : sQLiteStatementPrepare.getText(i61));
                if (instantStringToInstant3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                columnIndexOrThrow34 = i51;
                int i62 = columnIndexOrThrow48;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(i62)) != 0;
                int i63 = columnIndexOrThrow49;
                String text20 = sQLiteStatementPrepare.getText(i63);
                int i64 = columnIndexOrThrow50;
                if (sQLiteStatementPrepare.isNull(i64)) {
                    columnIndexOrThrow48 = i62;
                    text6 = null;
                } else {
                    columnIndexOrThrow48 = i62;
                    text6 = sQLiteStatementPrepare.getText(i64);
                }
                columnIndexOrThrow49 = i63;
                BigDecimal bigDecimalStringToBigDecimal17 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text6);
                if (bigDecimalStringToBigDecimal17 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i65 = columnIndexOrThrow51;
                if (sQLiteStatementPrepare.isNull(i65)) {
                    columnIndexOrThrow50 = i64;
                    numValueOf = null;
                } else {
                    columnIndexOrThrow50 = i64;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i65));
                }
                int i66 = columnIndexOrThrow44;
                if (sQLiteStatementPrepare.isNull(i66)) {
                    i5 = columnIndexOrThrow45;
                    if (sQLiteStatementPrepare.isNull(i5)) {
                        columnIndexOrThrow51 = i65;
                        i6 = columnIndexOrThrow46;
                        if (!sQLiteStatementPrepare.isNull(i6)) {
                            if (sQLiteStatementPrepare.isNull(i66)) {
                                columnIndexOrThrow44 = i66;
                                text12 = sQLiteStatementPrepare.getText(i66);
                            } else {
                                columnIndexOrThrow44 = i66;
                                text12 = null;
                            }
                            columnIndexOrThrow38 = i55;
                            bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                            if (bigDecimalStringToBigDecimal != null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow45 = i5;
                            BigDecimal bigDecimalStringToBigDecimal18 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5));
                            if (bigDecimalStringToBigDecimal18 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow46 = i6;
                            BigDecimal bigDecimalStringToBigDecimal19 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                            if (bigDecimalStringToBigDecimal19 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            tickRequirements = new OptionChain.TickRequirements(bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal18, bigDecimalStringToBigDecimal19);
                            OptionChain optionChain = new OptionChain(z3, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z4, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i67 = columnIndexOrThrow52;
                            String text21 = !sQLiteStatementPrepare.isNull(i67) ? null : sQLiteStatementPrepare.getText(i67);
                            Tradability.Companion companion3 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion3.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i68 = columnIndexOrThrow53;
                            if (sQLiteStatementPrepare.isNull(i68)) {
                                columnIndexOrThrow52 = i67;
                                text7 = null;
                            } else {
                                columnIndexOrThrow52 = i67;
                                text7 = sQLiteStatementPrepare.getText(i68);
                            }
                            Tradability tradabilityFromServerValue2 = companion3.fromServerValue(text7);
                            if (tradabilityFromServerValue2 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            columnIndexOrThrow53 = i68;
                            int i69 = columnIndexOrThrow54;
                            boolean z5 = ((int) sQLiteStatementPrepare.getLong(i69)) != 0;
                            int i70 = columnIndexOrThrow55;
                            columnIndexOrThrow54 = i69;
                            BigDecimal bigDecimalStringToBigDecimal20 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i70) ? null : sQLiteStatementPrepare.getText(i70));
                            if (bigDecimalStringToBigDecimal20 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i71 = columnIndexOrThrow56;
                            columnIndexOrThrow56 = i71;
                            BigDecimal bigDecimalStringToBigDecimal21 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i71) ? null : sQLiteStatementPrepare.getText(i71));
                            if (bigDecimalStringToBigDecimal21 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i72 = columnIndexOrThrow57;
                            Tradability tradabilityFromServerValue3 = companion3.fromServerValue(sQLiteStatementPrepare.isNull(i72) ? null : sQLiteStatementPrepare.getText(i72));
                            if (tradabilityFromServerValue3 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i73 = columnIndexOrThrow58;
                            if (sQLiteStatementPrepare.isNull(i73)) {
                                columnIndexOrThrow57 = i72;
                                text8 = null;
                            } else {
                                columnIndexOrThrow57 = i72;
                                text8 = sQLiteStatementPrepare.getText(i73);
                            }
                            columnIndexOrThrow55 = i70;
                            UUID uuidStringToUuid6 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text8);
                            if (uuidStringToUuid6 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                            int i74 = columnIndexOrThrow59;
                            LocalDate localDateStringToLocalDate = comboOrderDao_Impl.__commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74));
                            int i75 = columnIndexOrThrow60;
                            columnIndexOrThrow59 = i74;
                            BigDecimal bigDecimalStringToBigDecimal22 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i75) ? null : sQLiteStatementPrepare.getText(i75));
                            if (bigDecimalStringToBigDecimal22 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i76 = columnIndexOrThrow61;
                            columnIndexOrThrow61 = i76;
                            BigDecimal bigDecimalStringToBigDecimal23 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i76) ? null : sQLiteStatementPrepare.getText(i76));
                            if (bigDecimalStringToBigDecimal23 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i77 = columnIndexOrThrow62;
                            BigDecimal bigDecimalStringToBigDecimal24 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i77) ? null : sQLiteStatementPrepare.getText(i77));
                            int i78 = columnIndexOrThrow63;
                            String text22 = sQLiteStatementPrepare.getText(i78);
                            int i79 = columnIndexOrThrow64;
                            String text23 = sQLiteStatementPrepare.getText(i79);
                            columnIndexOrThrow63 = i78;
                            int i80 = columnIndexOrThrow65;
                            if (sQLiteStatementPrepare.isNull(i80)) {
                                columnIndexOrThrow65 = i80;
                                text9 = null;
                            } else {
                                columnIndexOrThrow65 = i80;
                                text9 = sQLiteStatementPrepare.getText(i80);
                            }
                            columnIndexOrThrow62 = i77;
                            Instant instantStringToInstant4 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(text9);
                            if (instantStringToInstant4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                            }
                            int i81 = columnIndexOrThrow66;
                            String text24 = sQLiteStatementPrepare.isNull(i81) ? null : sQLiteStatementPrepare.getText(i81);
                            int i82 = columnIndexOrThrow67;
                            String text25 = sQLiteStatementPrepare.getText(i82);
                            int i83 = columnIndexOrThrow68;
                            String text26 = sQLiteStatementPrepare.getText(i83);
                            columnIndexOrThrow66 = i81;
                            int i84 = columnIndexOrThrow69;
                            if (sQLiteStatementPrepare.isNull(i84)) {
                                columnIndexOrThrow69 = i84;
                                text10 = null;
                            } else {
                                columnIndexOrThrow69 = i84;
                                text10 = sQLiteStatementPrepare.getText(i84);
                            }
                            columnIndexOrThrow67 = i82;
                            UUID uuidStringToUuid7 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text10);
                            int i85 = columnIndexOrThrow70;
                            String text27 = sQLiteStatementPrepare.getText(i85);
                            columnIndexOrThrow60 = i75;
                            columnIndexOrThrow58 = i73;
                            int i86 = columnIndexOrThrow71;
                            int i87 = (int) sQLiteStatementPrepare.getLong(i86);
                            int i88 = columnIndexOrThrow72;
                            if (sQLiteStatementPrepare.isNull(i88)) {
                                columnIndexOrThrow70 = i85;
                                text11 = null;
                            } else {
                                columnIndexOrThrow70 = i85;
                                text11 = sQLiteStatementPrepare.getText(i88);
                            }
                            Tradability tradabilityFromServerValue4 = companion3.fromServerValue(text11);
                            if (tradabilityFromServerValue4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            Instrument instrument = new Instrument(tradabilityFromServerValue, z5, bigDecimalStringToBigDecimal20, bigDecimalStringToBigDecimal21, tradabilityFromServerValue3, tradabilityFromServerValue2, uuidStringToUuid6, null, null, null, localDateStringToLocalDate, bigDecimalStringToBigDecimal22, bigDecimalStringToBigDecimal23, bigDecimalStringToBigDecimal24, text22, text23, instantStringToInstant4, text24, text25, text26, uuidStringToUuid7, text27, i87, tradabilityFromServerValue4, null, null);
                            Object value = MapsKt.getValue(arrayMap, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            String str3 = str2;
                            Intrinsics.checkNotNullExpressionValue(value, str3);
                            List list = (List) value;
                            Object value2 = MapsKt.getValue(arrayMap2, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            Intrinsics.checkNotNullExpressionValue(value2, str3);
                            arrayList.add(new UiComboOrder(comboOrder, optionChain, instrument, list, (List) value2));
                            columnIndexOrThrow15 = i32;
                            columnIndexOrThrow71 = i86;
                            columnIndexOrThrow68 = i83;
                            str2 = str3;
                            columnIndexOrThrow72 = i88;
                            columnIndexOrThrow64 = i79;
                            columnIndexOrThrow17 = i34;
                            columnIndexOrThrow5 = i25;
                            columnIndexOrThrow2 = i20;
                            columnIndexOrThrow3 = i21;
                            columnIndexOrThrow4 = i22;
                            i19 = i4;
                            columnIndexOrThrow6 = i27;
                            columnIndexOrThrow7 = i29;
                            columnIndexOrThrow8 = i31;
                            columnIndexOrThrow33 = i50;
                            columnIndexOrThrow14 = i30;
                        } else {
                            columnIndexOrThrow46 = i6;
                            columnIndexOrThrow44 = i66;
                            columnIndexOrThrow45 = i5;
                            columnIndexOrThrow38 = i55;
                            tickRequirements = null;
                            OptionChain optionChain2 = new OptionChain(z3, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z4, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i672 = columnIndexOrThrow52;
                            if (!sQLiteStatementPrepare.isNull(i672)) {
                            }
                            Tradability.Companion companion32 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion32.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                            }
                        }
                    } else {
                        columnIndexOrThrow51 = i65;
                    }
                } else {
                    columnIndexOrThrow51 = i65;
                    i5 = columnIndexOrThrow45;
                }
                i6 = columnIndexOrThrow46;
                if (sQLiteStatementPrepare.isNull(i66)) {
                }
                columnIndexOrThrow38 = i55;
                bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                if (bigDecimalStringToBigDecimal != null) {
                }
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    public Flow<List<UiComboOrder>> get(final Set<? extends OrderState> states, final UUID instrumentId, final Instant since, final Instant before, final Instant createdAt, final UUID id, final boolean isFilteringByAccountNumber, final Set<String> accountNumbers) {
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(since, "since");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        SELECT *");
        sb.append("\n");
        sb.append("        FROM UiComboOrder");
        sb.append("\n");
        sb.append("        WHERE derivedState IN (");
        final int size = states.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(")");
        sb.append("\n");
        sb.append("        AND (");
        sb.append("\n");
        sb.append("            ");
        sb.append("?");
        sb.append(" IS NULL ");
        sb.append("\n");
        sb.append("            OR equityInstrumentId = ");
        sb.append("?");
        sb.append("\n");
        sb.append("        )");
        sb.append("\n");
        sb.append("        AND createdAt >= ");
        sb.append("?");
        sb.append("\n");
        sb.append("        AND (");
        sb.append("?");
        sb.append(" IS NULL OR createdAt < ");
        sb.append("?");
        sb.append(")");
        sb.append("\n");
        sb.append("        AND createdAt = ");
        sb.append("?");
        sb.append(" AND id = ");
        sb.append("?");
        sb.append("\n");
        sb.append("        AND (NOT ");
        sb.append("?");
        sb.append(" OR accountNumber in (");
        StringUtil.appendPlaceholders(sb, accountNumbers.size());
        sb.append("))");
        sb.append("\n");
        sb.append("        ");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return FlowBuilder.createFlow(this.__db, true, new String[]{"ComboOrderExecution", "OptionInstrument", "Instrument", "ComboOrderLeg", "ComboOrderSalesTax", "UiComboOrder"}, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.get$lambda$15(string2, states, size, this, instrumentId, since, before, createdAt, id, isFilteringByAccountNumber, accountNumbers, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x080f A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0015, B:4:0x001a, B:6:0x0020, B:8:0x002e, B:12:0x0038, B:11:0x0035, B:13:0x003b, B:15:0x0047, B:17:0x004e, B:19:0x005a, B:21:0x0061, B:23:0x006f, B:25:0x0076, B:27:0x0082, B:29:0x0089, B:31:0x0095, B:33:0x009c, B:35:0x00aa, B:37:0x00b1, B:39:0x00bf, B:41:0x00c6, B:42:0x00d4, B:44:0x00da, B:45:0x00e6, B:46:0x031c, B:48:0x0322, B:50:0x032e, B:52:0x033b, B:54:0x0345, B:56:0x0352, B:57:0x0364, B:59:0x036a, B:63:0x0376, B:66:0x0382, B:71:0x0395, B:74:0x03a1, B:78:0x03b0, B:83:0x03bf, B:85:0x03c9, B:89:0x03d5, B:91:0x03df, B:95:0x03ef, B:100:0x0404, B:105:0x041d, B:109:0x042b, B:114:0x0440, B:116:0x0448, B:121:0x0459, B:125:0x0467, B:130:0x047c, B:135:0x0497, B:140:0x04a8, B:142:0x04b2, B:146:0x04c0, B:148:0x04c6, B:152:0x04da, B:157:0x04f5, B:159:0x04ff, B:164:0x0510, B:169:0x0529, B:174:0x0542, B:176:0x054c, B:181:0x055d, B:183:0x0567, B:188:0x0578, B:190:0x0582, B:195:0x0593, B:197:0x059d, B:202:0x05ae, B:206:0x05c4, B:211:0x05d9, B:213:0x05e1, B:218:0x05f2, B:220:0x05fa, B:225:0x060b, B:227:0x0613, B:232:0x0624, B:234:0x062e, B:239:0x063f, B:243:0x0655, B:245:0x065b, B:250:0x0672, B:252:0x067c, B:256:0x068a, B:258:0x0690, B:262:0x069e, B:264:0x06a6, B:269:0x06b7, B:271:0x06c1, B:276:0x06e5, B:281:0x06f4, B:286:0x070d, B:288:0x0717, B:293:0x0728, B:295:0x0730, B:300:0x0741, B:302:0x074b, B:307:0x075c, B:309:0x0764, B:314:0x0775, B:316:0x077f, B:321:0x0792, B:326:0x07ad, B:328:0x07b7, B:333:0x07d4, B:335:0x07da, B:337:0x07e2, B:344:0x0803, B:349:0x0818, B:351:0x0822, B:356:0x0831, B:358:0x083b, B:363:0x084a, B:365:0x0854, B:366:0x085b, B:370:0x0872, B:374:0x087e, B:378:0x0890, B:380:0x0896, B:385:0x08ab, B:390:0x08ba, B:392:0x08c4, B:397:0x08d5, B:399:0x08df, B:403:0x08ed, B:405:0x08f3, B:410:0x090a, B:412:0x0914, B:416:0x0922, B:421:0x093b, B:423:0x0945, B:428:0x0956, B:430:0x0960, B:434:0x096e, B:439:0x099b, B:441:0x09a5, B:446:0x09b9, B:451:0x09dc, B:455:0x0a09, B:457:0x0a0f, B:458:0x0a70, B:459:0x0a75, B:454:0x0a01, B:450:0x09d3, B:445:0x09b2, B:460:0x0a76, B:461:0x0a7b, B:438:0x0992, B:433:0x096a, B:462:0x0a7c, B:463:0x0a81, B:427:0x0951, B:464:0x0a82, B:465:0x0a87, B:420:0x0936, B:415:0x091e, B:466:0x0a88, B:467:0x0a8d, B:409:0x0901, B:468:0x0a8e, B:469:0x0a93, B:402:0x08e9, B:470:0x0a94, B:471:0x0a99, B:396:0x08d0, B:472:0x0a9a, B:473:0x0a9f, B:389:0x08b5, B:474:0x0aa0, B:475:0x0aa5, B:377:0x0888, B:476:0x0aa6, B:477:0x0aab, B:369:0x086e, B:478:0x0aac, B:479:0x0ab1, B:362:0x0845, B:480:0x0ab2, B:481:0x0ab7, B:355:0x082c, B:482:0x0ab8, B:483:0x0abd, B:348:0x080f, B:332:0x07c6, B:484:0x0abe, B:485:0x0ac3, B:325:0x07a4, B:486:0x0ac4, B:487:0x0ac9, B:313:0x0770, B:488:0x0aca, B:489:0x0ad1, B:306:0x0757, B:490:0x0ad2, B:491:0x0ad7, B:299:0x073c, B:492:0x0ad8, B:493:0x0adf, B:292:0x0723, B:494:0x0ae0, B:495:0x0ae7, B:285:0x0708, B:280:0x06ef, B:496:0x0ae8, B:497:0x0aed, B:268:0x06b2, B:498:0x0aee, B:499:0x0af5, B:261:0x069a, B:500:0x0af6, B:501:0x0afb, B:255:0x0686, B:502:0x0afc, B:503:0x0b01, B:249:0x0669, B:504:0x0b02, B:505:0x0b07, B:242:0x0651, B:238:0x063a, B:506:0x0b08, B:507:0x0b0d, B:231:0x061f, B:508:0x0b0e, B:509:0x0b15, B:224:0x0606, B:510:0x0b16, B:511:0x0b1d, B:217:0x05ed, B:512:0x0b1e, B:513:0x0b25, B:210:0x05d4, B:205:0x05c0, B:201:0x05a9, B:514:0x0b26, B:515:0x0b2b, B:194:0x058e, B:516:0x0b2c, B:517:0x0b31, B:187:0x0573, B:518:0x0b32, B:519:0x0b37, B:180:0x0558, B:520:0x0b38, B:521:0x0b3d, B:173:0x053d, B:168:0x0524, B:163:0x050b, B:522:0x0b3e, B:523:0x0b43, B:156:0x04ec, B:151:0x04d2, B:524:0x0b44, B:525:0x0b49, B:145:0x04bc, B:526:0x0b4a, B:527:0x0b4f, B:139:0x04a1, B:129:0x0473, B:528:0x0b50, B:529:0x0b55, B:120:0x0454, B:530:0x0b56, B:531:0x0b5d, B:113:0x0437, B:532:0x0b5e, B:533:0x0b63, B:104:0x0418, B:99:0x03ff, B:94:0x03eb, B:534:0x0b64, B:535:0x0b69, B:88:0x03d1, B:536:0x0b6a, B:537:0x0b6f, B:82:0x03ba, B:77:0x03aa, B:538:0x0b70, B:539:0x0b75, B:70:0x0390, B:540:0x0b76, B:541:0x0b7b, B:62:0x0372, B:40:0x00c3, B:36:0x00ae, B:32:0x0099, B:28:0x0086, B:24:0x0073, B:20:0x005e, B:16:0x004b), top: B:546:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0822 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0015, B:4:0x001a, B:6:0x0020, B:8:0x002e, B:12:0x0038, B:11:0x0035, B:13:0x003b, B:15:0x0047, B:17:0x004e, B:19:0x005a, B:21:0x0061, B:23:0x006f, B:25:0x0076, B:27:0x0082, B:29:0x0089, B:31:0x0095, B:33:0x009c, B:35:0x00aa, B:37:0x00b1, B:39:0x00bf, B:41:0x00c6, B:42:0x00d4, B:44:0x00da, B:45:0x00e6, B:46:0x031c, B:48:0x0322, B:50:0x032e, B:52:0x033b, B:54:0x0345, B:56:0x0352, B:57:0x0364, B:59:0x036a, B:63:0x0376, B:66:0x0382, B:71:0x0395, B:74:0x03a1, B:78:0x03b0, B:83:0x03bf, B:85:0x03c9, B:89:0x03d5, B:91:0x03df, B:95:0x03ef, B:100:0x0404, B:105:0x041d, B:109:0x042b, B:114:0x0440, B:116:0x0448, B:121:0x0459, B:125:0x0467, B:130:0x047c, B:135:0x0497, B:140:0x04a8, B:142:0x04b2, B:146:0x04c0, B:148:0x04c6, B:152:0x04da, B:157:0x04f5, B:159:0x04ff, B:164:0x0510, B:169:0x0529, B:174:0x0542, B:176:0x054c, B:181:0x055d, B:183:0x0567, B:188:0x0578, B:190:0x0582, B:195:0x0593, B:197:0x059d, B:202:0x05ae, B:206:0x05c4, B:211:0x05d9, B:213:0x05e1, B:218:0x05f2, B:220:0x05fa, B:225:0x060b, B:227:0x0613, B:232:0x0624, B:234:0x062e, B:239:0x063f, B:243:0x0655, B:245:0x065b, B:250:0x0672, B:252:0x067c, B:256:0x068a, B:258:0x0690, B:262:0x069e, B:264:0x06a6, B:269:0x06b7, B:271:0x06c1, B:276:0x06e5, B:281:0x06f4, B:286:0x070d, B:288:0x0717, B:293:0x0728, B:295:0x0730, B:300:0x0741, B:302:0x074b, B:307:0x075c, B:309:0x0764, B:314:0x0775, B:316:0x077f, B:321:0x0792, B:326:0x07ad, B:328:0x07b7, B:333:0x07d4, B:335:0x07da, B:337:0x07e2, B:344:0x0803, B:349:0x0818, B:351:0x0822, B:356:0x0831, B:358:0x083b, B:363:0x084a, B:365:0x0854, B:366:0x085b, B:370:0x0872, B:374:0x087e, B:378:0x0890, B:380:0x0896, B:385:0x08ab, B:390:0x08ba, B:392:0x08c4, B:397:0x08d5, B:399:0x08df, B:403:0x08ed, B:405:0x08f3, B:410:0x090a, B:412:0x0914, B:416:0x0922, B:421:0x093b, B:423:0x0945, B:428:0x0956, B:430:0x0960, B:434:0x096e, B:439:0x099b, B:441:0x09a5, B:446:0x09b9, B:451:0x09dc, B:455:0x0a09, B:457:0x0a0f, B:458:0x0a70, B:459:0x0a75, B:454:0x0a01, B:450:0x09d3, B:445:0x09b2, B:460:0x0a76, B:461:0x0a7b, B:438:0x0992, B:433:0x096a, B:462:0x0a7c, B:463:0x0a81, B:427:0x0951, B:464:0x0a82, B:465:0x0a87, B:420:0x0936, B:415:0x091e, B:466:0x0a88, B:467:0x0a8d, B:409:0x0901, B:468:0x0a8e, B:469:0x0a93, B:402:0x08e9, B:470:0x0a94, B:471:0x0a99, B:396:0x08d0, B:472:0x0a9a, B:473:0x0a9f, B:389:0x08b5, B:474:0x0aa0, B:475:0x0aa5, B:377:0x0888, B:476:0x0aa6, B:477:0x0aab, B:369:0x086e, B:478:0x0aac, B:479:0x0ab1, B:362:0x0845, B:480:0x0ab2, B:481:0x0ab7, B:355:0x082c, B:482:0x0ab8, B:483:0x0abd, B:348:0x080f, B:332:0x07c6, B:484:0x0abe, B:485:0x0ac3, B:325:0x07a4, B:486:0x0ac4, B:487:0x0ac9, B:313:0x0770, B:488:0x0aca, B:489:0x0ad1, B:306:0x0757, B:490:0x0ad2, B:491:0x0ad7, B:299:0x073c, B:492:0x0ad8, B:493:0x0adf, B:292:0x0723, B:494:0x0ae0, B:495:0x0ae7, B:285:0x0708, B:280:0x06ef, B:496:0x0ae8, B:497:0x0aed, B:268:0x06b2, B:498:0x0aee, B:499:0x0af5, B:261:0x069a, B:500:0x0af6, B:501:0x0afb, B:255:0x0686, B:502:0x0afc, B:503:0x0b01, B:249:0x0669, B:504:0x0b02, B:505:0x0b07, B:242:0x0651, B:238:0x063a, B:506:0x0b08, B:507:0x0b0d, B:231:0x061f, B:508:0x0b0e, B:509:0x0b15, B:224:0x0606, B:510:0x0b16, B:511:0x0b1d, B:217:0x05ed, B:512:0x0b1e, B:513:0x0b25, B:210:0x05d4, B:205:0x05c0, B:201:0x05a9, B:514:0x0b26, B:515:0x0b2b, B:194:0x058e, B:516:0x0b2c, B:517:0x0b31, B:187:0x0573, B:518:0x0b32, B:519:0x0b37, B:180:0x0558, B:520:0x0b38, B:521:0x0b3d, B:173:0x053d, B:168:0x0524, B:163:0x050b, B:522:0x0b3e, B:523:0x0b43, B:156:0x04ec, B:151:0x04d2, B:524:0x0b44, B:525:0x0b49, B:145:0x04bc, B:526:0x0b4a, B:527:0x0b4f, B:139:0x04a1, B:129:0x0473, B:528:0x0b50, B:529:0x0b55, B:120:0x0454, B:530:0x0b56, B:531:0x0b5d, B:113:0x0437, B:532:0x0b5e, B:533:0x0b63, B:104:0x0418, B:99:0x03ff, B:94:0x03eb, B:534:0x0b64, B:535:0x0b69, B:88:0x03d1, B:536:0x0b6a, B:537:0x0b6f, B:82:0x03ba, B:77:0x03aa, B:538:0x0b70, B:539:0x0b75, B:70:0x0390, B:540:0x0b76, B:541:0x0b7b, B:62:0x0372, B:40:0x00c3, B:36:0x00ae, B:32:0x0099, B:28:0x0086, B:24:0x0073, B:20:0x005e, B:16:0x004b), top: B:546:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x086e A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0015, B:4:0x001a, B:6:0x0020, B:8:0x002e, B:12:0x0038, B:11:0x0035, B:13:0x003b, B:15:0x0047, B:17:0x004e, B:19:0x005a, B:21:0x0061, B:23:0x006f, B:25:0x0076, B:27:0x0082, B:29:0x0089, B:31:0x0095, B:33:0x009c, B:35:0x00aa, B:37:0x00b1, B:39:0x00bf, B:41:0x00c6, B:42:0x00d4, B:44:0x00da, B:45:0x00e6, B:46:0x031c, B:48:0x0322, B:50:0x032e, B:52:0x033b, B:54:0x0345, B:56:0x0352, B:57:0x0364, B:59:0x036a, B:63:0x0376, B:66:0x0382, B:71:0x0395, B:74:0x03a1, B:78:0x03b0, B:83:0x03bf, B:85:0x03c9, B:89:0x03d5, B:91:0x03df, B:95:0x03ef, B:100:0x0404, B:105:0x041d, B:109:0x042b, B:114:0x0440, B:116:0x0448, B:121:0x0459, B:125:0x0467, B:130:0x047c, B:135:0x0497, B:140:0x04a8, B:142:0x04b2, B:146:0x04c0, B:148:0x04c6, B:152:0x04da, B:157:0x04f5, B:159:0x04ff, B:164:0x0510, B:169:0x0529, B:174:0x0542, B:176:0x054c, B:181:0x055d, B:183:0x0567, B:188:0x0578, B:190:0x0582, B:195:0x0593, B:197:0x059d, B:202:0x05ae, B:206:0x05c4, B:211:0x05d9, B:213:0x05e1, B:218:0x05f2, B:220:0x05fa, B:225:0x060b, B:227:0x0613, B:232:0x0624, B:234:0x062e, B:239:0x063f, B:243:0x0655, B:245:0x065b, B:250:0x0672, B:252:0x067c, B:256:0x068a, B:258:0x0690, B:262:0x069e, B:264:0x06a6, B:269:0x06b7, B:271:0x06c1, B:276:0x06e5, B:281:0x06f4, B:286:0x070d, B:288:0x0717, B:293:0x0728, B:295:0x0730, B:300:0x0741, B:302:0x074b, B:307:0x075c, B:309:0x0764, B:314:0x0775, B:316:0x077f, B:321:0x0792, B:326:0x07ad, B:328:0x07b7, B:333:0x07d4, B:335:0x07da, B:337:0x07e2, B:344:0x0803, B:349:0x0818, B:351:0x0822, B:356:0x0831, B:358:0x083b, B:363:0x084a, B:365:0x0854, B:366:0x085b, B:370:0x0872, B:374:0x087e, B:378:0x0890, B:380:0x0896, B:385:0x08ab, B:390:0x08ba, B:392:0x08c4, B:397:0x08d5, B:399:0x08df, B:403:0x08ed, B:405:0x08f3, B:410:0x090a, B:412:0x0914, B:416:0x0922, B:421:0x093b, B:423:0x0945, B:428:0x0956, B:430:0x0960, B:434:0x096e, B:439:0x099b, B:441:0x09a5, B:446:0x09b9, B:451:0x09dc, B:455:0x0a09, B:457:0x0a0f, B:458:0x0a70, B:459:0x0a75, B:454:0x0a01, B:450:0x09d3, B:445:0x09b2, B:460:0x0a76, B:461:0x0a7b, B:438:0x0992, B:433:0x096a, B:462:0x0a7c, B:463:0x0a81, B:427:0x0951, B:464:0x0a82, B:465:0x0a87, B:420:0x0936, B:415:0x091e, B:466:0x0a88, B:467:0x0a8d, B:409:0x0901, B:468:0x0a8e, B:469:0x0a93, B:402:0x08e9, B:470:0x0a94, B:471:0x0a99, B:396:0x08d0, B:472:0x0a9a, B:473:0x0a9f, B:389:0x08b5, B:474:0x0aa0, B:475:0x0aa5, B:377:0x0888, B:476:0x0aa6, B:477:0x0aab, B:369:0x086e, B:478:0x0aac, B:479:0x0ab1, B:362:0x0845, B:480:0x0ab2, B:481:0x0ab7, B:355:0x082c, B:482:0x0ab8, B:483:0x0abd, B:348:0x080f, B:332:0x07c6, B:484:0x0abe, B:485:0x0ac3, B:325:0x07a4, B:486:0x0ac4, B:487:0x0ac9, B:313:0x0770, B:488:0x0aca, B:489:0x0ad1, B:306:0x0757, B:490:0x0ad2, B:491:0x0ad7, B:299:0x073c, B:492:0x0ad8, B:493:0x0adf, B:292:0x0723, B:494:0x0ae0, B:495:0x0ae7, B:285:0x0708, B:280:0x06ef, B:496:0x0ae8, B:497:0x0aed, B:268:0x06b2, B:498:0x0aee, B:499:0x0af5, B:261:0x069a, B:500:0x0af6, B:501:0x0afb, B:255:0x0686, B:502:0x0afc, B:503:0x0b01, B:249:0x0669, B:504:0x0b02, B:505:0x0b07, B:242:0x0651, B:238:0x063a, B:506:0x0b08, B:507:0x0b0d, B:231:0x061f, B:508:0x0b0e, B:509:0x0b15, B:224:0x0606, B:510:0x0b16, B:511:0x0b1d, B:217:0x05ed, B:512:0x0b1e, B:513:0x0b25, B:210:0x05d4, B:205:0x05c0, B:201:0x05a9, B:514:0x0b26, B:515:0x0b2b, B:194:0x058e, B:516:0x0b2c, B:517:0x0b31, B:187:0x0573, B:518:0x0b32, B:519:0x0b37, B:180:0x0558, B:520:0x0b38, B:521:0x0b3d, B:173:0x053d, B:168:0x0524, B:163:0x050b, B:522:0x0b3e, B:523:0x0b43, B:156:0x04ec, B:151:0x04d2, B:524:0x0b44, B:525:0x0b49, B:145:0x04bc, B:526:0x0b4a, B:527:0x0b4f, B:139:0x04a1, B:129:0x0473, B:528:0x0b50, B:529:0x0b55, B:120:0x0454, B:530:0x0b56, B:531:0x0b5d, B:113:0x0437, B:532:0x0b5e, B:533:0x0b63, B:104:0x0418, B:99:0x03ff, B:94:0x03eb, B:534:0x0b64, B:535:0x0b69, B:88:0x03d1, B:536:0x0b6a, B:537:0x0b6f, B:82:0x03ba, B:77:0x03aa, B:538:0x0b70, B:539:0x0b75, B:70:0x0390, B:540:0x0b76, B:541:0x0b7b, B:62:0x0372, B:40:0x00c3, B:36:0x00ae, B:32:0x0099, B:28:0x0086, B:24:0x0073, B:20:0x005e, B:16:0x004b), top: B:546:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0ab8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0aa6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List get$lambda$15(String str, Set set, int i, ComboOrderDao_Impl comboOrderDao_Impl, UUID uuid, Instant instant, Instant instant2, Instant instant3, UUID uuid2, boolean z, Set set2, SQLiteConnection _connection) {
        int i2;
        String text;
        String text2;
        String text3;
        String text4;
        String text5;
        String text6;
        Integer numValueOf;
        int i3;
        int i4;
        OptionChain.TickRequirements tickRequirements;
        Tradability tradabilityFromServerValue;
        String text7;
        String text8;
        String text9;
        String text10;
        String text11;
        String text12;
        BigDecimal bigDecimalStringToBigDecimal;
        int i5;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = set.iterator();
            int i6 = 1;
            while (it.hasNext()) {
                String serverValue = OrderState.INSTANCE.toServerValue((OrderState) it.next());
                if (serverValue == null) {
                    sQLiteStatementPrepare.bindNull(i6);
                } else {
                    sQLiteStatementPrepare.bindText(i6, serverValue);
                }
                i6++;
            }
            int i7 = i + 1;
            String strUuidToString = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(i7);
            } else {
                sQLiteStatementPrepare.bindText(i7, strUuidToString);
            }
            int i8 = i + 2;
            String strUuidToString2 = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString2 == null) {
                sQLiteStatementPrepare.bindNull(i8);
            } else {
                sQLiteStatementPrepare.bindText(i8, strUuidToString2);
            }
            int i9 = i + 3;
            String strInstantToString = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant);
            if (strInstantToString == null) {
                sQLiteStatementPrepare.bindNull(i9);
            } else {
                sQLiteStatementPrepare.bindText(i9, strInstantToString);
            }
            int i10 = i + 4;
            String strInstantToString2 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant2);
            if (strInstantToString2 == null) {
                sQLiteStatementPrepare.bindNull(i10);
            } else {
                sQLiteStatementPrepare.bindText(i10, strInstantToString2);
            }
            int i11 = i + 5;
            String strInstantToString3 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant2);
            if (strInstantToString3 == null) {
                sQLiteStatementPrepare.bindNull(i11);
            } else {
                sQLiteStatementPrepare.bindText(i11, strInstantToString3);
            }
            int i12 = i + 6;
            String strInstantToString4 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant3);
            if (strInstantToString4 == null) {
                sQLiteStatementPrepare.bindNull(i12);
            } else {
                sQLiteStatementPrepare.bindText(i12, strInstantToString4);
            }
            int i13 = i + 7;
            String strUuidToString3 = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid2);
            if (strUuidToString3 == null) {
                sQLiteStatementPrepare.bindNull(i13);
            } else {
                sQLiteStatementPrepare.bindText(i13, strUuidToString3);
            }
            sQLiteStatementPrepare.bindLong(i + 8, z ? 1L : 0L);
            int i14 = i + 9;
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                sQLiteStatementPrepare.bindText(i14, (String) it2.next());
                i14++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "averageNetPremiumPaid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancelUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canceledQuantity");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSymbol");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closingStrategy");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contractFees");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivedState");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "direction");
            String str2 = "getValue(...)";
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "goldSavings");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isReplaceable");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmount");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmountDirection");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openingStrategy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pendingQuantity");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "premium");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AnalyticsStrings.TAG_SORT_ORDER_PRICE);
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremium");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedQuantity");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "regulatoryFees");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stopPrice");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "strategy");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInForce");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedAt");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "refId");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremiumDirection");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmount");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmountDirection");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "formSource");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equityInstrumentId");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "underlyingSymbol");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_canOpenPosition");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_cashComponent");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_expirationDates");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_extendedHoursState");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_lateCloseState");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickAboveCutoff");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickBelowCutoff");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_cutoffPrice");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_receivedAt");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_settleOnOpen");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_symbol");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_tradeValueMultiplier");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_selloutTimeToExpiration");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_affiliateTradability");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_allDayTradability");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_carRequired");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_dayTradeRatio");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_defaultPresetPercentLimit");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_fractionalTradability");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_id");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_listDate");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_maintenanceRatio");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_marginInitialRatio");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_minTickSize");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_name");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_otcMarketTier");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_receivedAt");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_simpleName");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_state");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_symbol");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_tradableChainId");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_type");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_notionalEstimatedQuantityDecimals");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_shortSaleTradability");
            ArrayMap<String, List<UiComboOrderLeg>> arrayMap = new ArrayMap<>();
            int i15 = columnIndexOrThrow12;
            ArrayMap<String, List<ComboOrderSalesTax>> arrayMap2 = new ArrayMap<>();
            while (sQLiteStatementPrepare.step()) {
                int i16 = columnIndexOrThrow11;
                String text13 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (arrayMap.containsKey(text13)) {
                    i5 = columnIndexOrThrow10;
                } else {
                    i5 = columnIndexOrThrow10;
                    arrayMap.put(text13, new ArrayList());
                }
                String text14 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!arrayMap2.containsKey(text14)) {
                    arrayMap2.put(text14, new ArrayList());
                }
                columnIndexOrThrow11 = i16;
                columnIndexOrThrow10 = i5;
            }
            int i17 = columnIndexOrThrow10;
            int i18 = columnIndexOrThrow11;
            sQLiteStatementPrepare.reset();
            comboOrderDao_Impl.m2217x4e5ab2fa(_connection, arrayMap);
            comboOrderDao_Impl.m2219x367d9594(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text15 = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                int i19 = columnIndexOrThrow2;
                BigDecimal bigDecimalStringToBigDecimal2 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (bigDecimalStringToBigDecimal2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                int i20 = columnIndexOrThrow3;
                BigDecimal bigDecimalStringToBigDecimal3 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (bigDecimalStringToBigDecimal3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                UUID uuidStringToUuid2 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (uuidStringToUuid2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text17 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                OptionStrategyType.Companion companion = OptionStrategyType.INSTANCE;
                OptionStrategyType optionStrategyTypeFromServerValue = companion.fromServerValue(text18);
                int i21 = columnIndexOrThrow4;
                BigDecimal bigDecimalStringToBigDecimal4 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                int i22 = i17;
                i17 = i22;
                Instant instantStringToInstant = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i22) ? null : sQLiteStatementPrepare.getText(i22));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i23 = i18;
                if (sQLiteStatementPrepare.isNull(i23)) {
                    i2 = i23;
                    text = null;
                } else {
                    i2 = i23;
                    text = sQLiteStatementPrepare.getText(i23);
                }
                int i24 = columnIndexOrThrow5;
                OrderState orderStateFromServerValue = OrderState.INSTANCE.fromServerValue(text);
                if (orderStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.shared.models.history.shared.OrderState', but it was NULL.");
                }
                int i25 = i15;
                String text19 = sQLiteStatementPrepare.isNull(i25) ? null : sQLiteStatementPrepare.getText(i25);
                i15 = i25;
                OrderDirection.Companion companion2 = OrderDirection.INSTANCE;
                OrderDirection orderDirectionFromServerValue = companion2.fromServerValue(text19);
                if (orderDirectionFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i26 = columnIndexOrThrow6;
                int i27 = columnIndexOrThrow13;
                if (sQLiteStatementPrepare.isNull(i27)) {
                    columnIndexOrThrow13 = i27;
                    text2 = null;
                } else {
                    columnIndexOrThrow13 = i27;
                    text2 = sQLiteStatementPrepare.getText(i27);
                }
                int i28 = columnIndexOrThrow7;
                BigDecimal bigDecimalStringToBigDecimal5 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text2);
                int i29 = columnIndexOrThrow14;
                int i30 = columnIndexOrThrow8;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i29)) != 0;
                int i31 = columnIndexOrThrow15;
                BigDecimal bigDecimalStringToBigDecimal6 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i31) ? null : sQLiteStatementPrepare.getText(i31));
                if (bigDecimalStringToBigDecimal6 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i32 = columnIndexOrThrow16;
                OrderDirection orderDirectionFromServerValue2 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32));
                if (orderDirectionFromServerValue2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i33 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i33)) {
                    columnIndexOrThrow16 = i32;
                    text3 = null;
                } else {
                    columnIndexOrThrow16 = i32;
                    text3 = sQLiteStatementPrepare.getText(i33);
                }
                OptionStrategyType optionStrategyTypeFromServerValue2 = companion.fromServerValue(text3);
                int i34 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i34)) {
                    columnIndexOrThrow18 = i34;
                    text4 = null;
                } else {
                    columnIndexOrThrow18 = i34;
                    text4 = sQLiteStatementPrepare.getText(i34);
                }
                BigDecimal bigDecimalStringToBigDecimal7 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text4);
                if (bigDecimalStringToBigDecimal7 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i35 = columnIndexOrThrow19;
                columnIndexOrThrow19 = i35;
                BigDecimal bigDecimalStringToBigDecimal8 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i35) ? null : sQLiteStatementPrepare.getText(i35));
                int i36 = columnIndexOrThrow20;
                columnIndexOrThrow20 = i36;
                BigDecimal bigDecimalStringToBigDecimal9 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i36) ? null : sQLiteStatementPrepare.getText(i36));
                int i37 = columnIndexOrThrow21;
                columnIndexOrThrow21 = i37;
                BigDecimal bigDecimalStringToBigDecimal10 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i37) ? null : sQLiteStatementPrepare.getText(i37));
                if (bigDecimalStringToBigDecimal10 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i38 = columnIndexOrThrow22;
                columnIndexOrThrow22 = i38;
                BigDecimal bigDecimalStringToBigDecimal11 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i38) ? null : sQLiteStatementPrepare.getText(i38));
                if (bigDecimalStringToBigDecimal11 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i39 = columnIndexOrThrow23;
                columnIndexOrThrow23 = i39;
                BigDecimal bigDecimalStringToBigDecimal12 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i39) ? null : sQLiteStatementPrepare.getText(i39));
                if (bigDecimalStringToBigDecimal12 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i40 = columnIndexOrThrow24;
                columnIndexOrThrow24 = i40;
                BigDecimal bigDecimalStringToBigDecimal13 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i40) ? null : sQLiteStatementPrepare.getText(i40));
                if (bigDecimalStringToBigDecimal13 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i41 = columnIndexOrThrow25;
                columnIndexOrThrow25 = i41;
                BigDecimal bigDecimalStringToBigDecimal14 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i41) ? null : sQLiteStatementPrepare.getText(i41));
                int i42 = columnIndexOrThrow26;
                OptionStrategyType optionStrategyTypeFromServerValue3 = companion.fromServerValue(sQLiteStatementPrepare.isNull(i42) ? null : sQLiteStatementPrepare.getText(i42));
                int i43 = columnIndexOrThrow27;
                columnIndexOrThrow26 = i42;
                OrderTimeInForce orderTimeInForceFromServerValue = OrderTimeInForce.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                if (orderTimeInForceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTimeInForce', but it was NULL.");
                }
                int i44 = columnIndexOrThrow28;
                columnIndexOrThrow28 = i44;
                OrderTrigger orderTriggerFromServerValue = OrderTrigger.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i44) ? null : sQLiteStatementPrepare.getText(i44));
                if (orderTriggerFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTrigger', but it was NULL.");
                }
                int i45 = columnIndexOrThrow29;
                columnIndexOrThrow29 = i45;
                OrderType orderTypeFromServerValue = OrderType.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i45) ? null : sQLiteStatementPrepare.getText(i45));
                if (orderTypeFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderType', but it was NULL.");
                }
                int i46 = columnIndexOrThrow30;
                columnIndexOrThrow30 = i46;
                Instant instantStringToInstant2 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i46) ? null : sQLiteStatementPrepare.getText(i46));
                if (instantStringToInstant2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i47 = columnIndexOrThrow31;
                columnIndexOrThrow31 = i47;
                UUID uuidStringToUuid3 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i47) ? null : sQLiteStatementPrepare.getText(i47));
                int i48 = columnIndexOrThrow32;
                OrderDirection orderDirectionFromServerValue3 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i48) ? null : sQLiteStatementPrepare.getText(i48));
                if (orderDirectionFromServerValue3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i49 = columnIndexOrThrow33;
                if (sQLiteStatementPrepare.isNull(i49)) {
                    columnIndexOrThrow32 = i48;
                    text5 = null;
                } else {
                    columnIndexOrThrow32 = i48;
                    text5 = sQLiteStatementPrepare.getText(i49);
                }
                columnIndexOrThrow27 = i43;
                BigDecimal bigDecimalStringToBigDecimal15 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text5);
                if (bigDecimalStringToBigDecimal15 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i50 = columnIndexOrThrow34;
                OrderDirection orderDirectionFromServerValue4 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i50) ? null : sQLiteStatementPrepare.getText(i50));
                if (orderDirectionFromServerValue4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i51 = columnIndexOrThrow35;
                OptionOrder.FormSource formSourceFromServerValue = OptionOrder.FormSource.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i51) ? null : sQLiteStatementPrepare.getText(i51));
                if (formSourceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionOrder.FormSource', but it was NULL.");
                }
                int i52 = columnIndexOrThrow36;
                columnIndexOrThrow35 = i51;
                UUID uuidStringToUuid4 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i52) ? null : sQLiteStatementPrepare.getText(i52));
                if (uuidStringToUuid4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i53 = columnIndexOrThrow37;
                ComboOrder comboOrder = new ComboOrder(uuidStringToUuid, text15, bigDecimalStringToBigDecimal2, text16, bigDecimalStringToBigDecimal3, uuidStringToUuid2, text17, optionStrategyTypeFromServerValue, bigDecimalStringToBigDecimal4, instantStringToInstant, orderStateFromServerValue, orderDirectionFromServerValue, bigDecimalStringToBigDecimal5, z2, bigDecimalStringToBigDecimal6, orderDirectionFromServerValue2, optionStrategyTypeFromServerValue2, bigDecimalStringToBigDecimal7, bigDecimalStringToBigDecimal8, bigDecimalStringToBigDecimal9, bigDecimalStringToBigDecimal10, bigDecimalStringToBigDecimal11, bigDecimalStringToBigDecimal12, bigDecimalStringToBigDecimal13, bigDecimalStringToBigDecimal14, optionStrategyTypeFromServerValue3, orderTimeInForceFromServerValue, orderTriggerFromServerValue, orderTypeFromServerValue, instantStringToInstant2, uuidStringToUuid3, orderDirectionFromServerValue3, bigDecimalStringToBigDecimal15, orderDirectionFromServerValue4, formSourceFromServerValue, uuidStringToUuid4, sQLiteStatementPrepare.getText(i53));
                columnIndexOrThrow37 = i53;
                columnIndexOrThrow36 = i52;
                int i54 = columnIndexOrThrow38;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i54)) != 0;
                int i55 = columnIndexOrThrow39;
                columnIndexOrThrow39 = i55;
                BigDecimal bigDecimalStringToBigDecimal16 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i55) ? null : sQLiteStatementPrepare.getText(i55));
                int i56 = columnIndexOrThrow40;
                columnIndexOrThrow40 = i56;
                ImmutableList<LocalDate> immutableListStringToLocalDateImmutableList = comboOrderDao_Impl.__modelRoomConverters().stringToLocalDateImmutableList(sQLiteStatementPrepare.isNull(i56) ? null : sQLiteStatementPrepare.getText(i56));
                if (immutableListStringToLocalDateImmutableList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlinx.collections.immutable.ImmutableList<java.time.LocalDate>', but it was NULL.");
                }
                int i57 = columnIndexOrThrow41;
                columnIndexOrThrow41 = i57;
                OptionChain.ExtendedHoursState extendedHoursStateFromServerValue = OptionChain.ExtendedHoursState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i57) ? null : sQLiteStatementPrepare.getText(i57));
                if (extendedHoursStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.ExtendedHoursState', but it was NULL.");
                }
                int i58 = columnIndexOrThrow42;
                columnIndexOrThrow42 = i58;
                UUID uuidStringToUuid5 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i58) ? null : sQLiteStatementPrepare.getText(i58));
                if (uuidStringToUuid5 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i59 = columnIndexOrThrow43;
                columnIndexOrThrow43 = i59;
                OptionChain.LateCloseState lateCloseStateFromServerValue = OptionChain.LateCloseState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59));
                if (lateCloseStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.LateCloseState', but it was NULL.");
                }
                int i60 = columnIndexOrThrow47;
                columnIndexOrThrow47 = i60;
                Instant instantStringToInstant3 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i60) ? null : sQLiteStatementPrepare.getText(i60));
                if (instantStringToInstant3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                columnIndexOrThrow34 = i50;
                int i61 = columnIndexOrThrow48;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(i61)) != 0;
                int i62 = columnIndexOrThrow49;
                String text20 = sQLiteStatementPrepare.getText(i62);
                int i63 = columnIndexOrThrow50;
                if (sQLiteStatementPrepare.isNull(i63)) {
                    columnIndexOrThrow48 = i61;
                    text6 = null;
                } else {
                    columnIndexOrThrow48 = i61;
                    text6 = sQLiteStatementPrepare.getText(i63);
                }
                columnIndexOrThrow49 = i62;
                BigDecimal bigDecimalStringToBigDecimal17 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text6);
                if (bigDecimalStringToBigDecimal17 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i64 = columnIndexOrThrow51;
                if (sQLiteStatementPrepare.isNull(i64)) {
                    columnIndexOrThrow50 = i63;
                    numValueOf = null;
                } else {
                    columnIndexOrThrow50 = i63;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i64));
                }
                int i65 = columnIndexOrThrow44;
                if (sQLiteStatementPrepare.isNull(i65)) {
                    i3 = columnIndexOrThrow45;
                    if (sQLiteStatementPrepare.isNull(i3)) {
                        columnIndexOrThrow51 = i64;
                        i4 = columnIndexOrThrow46;
                        if (!sQLiteStatementPrepare.isNull(i4)) {
                            if (sQLiteStatementPrepare.isNull(i65)) {
                                columnIndexOrThrow44 = i65;
                                text12 = sQLiteStatementPrepare.getText(i65);
                            } else {
                                columnIndexOrThrow44 = i65;
                                text12 = null;
                            }
                            columnIndexOrThrow38 = i54;
                            bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                            if (bigDecimalStringToBigDecimal != null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow45 = i3;
                            BigDecimal bigDecimalStringToBigDecimal18 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3));
                            if (bigDecimalStringToBigDecimal18 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow46 = i4;
                            BigDecimal bigDecimalStringToBigDecimal19 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4));
                            if (bigDecimalStringToBigDecimal19 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            tickRequirements = new OptionChain.TickRequirements(bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal18, bigDecimalStringToBigDecimal19);
                            OptionChain optionChain = new OptionChain(z3, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z4, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i66 = columnIndexOrThrow52;
                            String text21 = !sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66);
                            Tradability.Companion companion3 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion3.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i67 = columnIndexOrThrow53;
                            if (sQLiteStatementPrepare.isNull(i67)) {
                                columnIndexOrThrow52 = i66;
                                text7 = null;
                            } else {
                                columnIndexOrThrow52 = i66;
                                text7 = sQLiteStatementPrepare.getText(i67);
                            }
                            Tradability tradabilityFromServerValue2 = companion3.fromServerValue(text7);
                            if (tradabilityFromServerValue2 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            columnIndexOrThrow53 = i67;
                            int i68 = columnIndexOrThrow54;
                            boolean z5 = ((int) sQLiteStatementPrepare.getLong(i68)) != 0;
                            int i69 = columnIndexOrThrow55;
                            columnIndexOrThrow54 = i68;
                            BigDecimal bigDecimalStringToBigDecimal20 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i69) ? null : sQLiteStatementPrepare.getText(i69));
                            if (bigDecimalStringToBigDecimal20 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i70 = columnIndexOrThrow56;
                            columnIndexOrThrow56 = i70;
                            BigDecimal bigDecimalStringToBigDecimal21 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i70) ? null : sQLiteStatementPrepare.getText(i70));
                            if (bigDecimalStringToBigDecimal21 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i71 = columnIndexOrThrow57;
                            Tradability tradabilityFromServerValue3 = companion3.fromServerValue(sQLiteStatementPrepare.isNull(i71) ? null : sQLiteStatementPrepare.getText(i71));
                            if (tradabilityFromServerValue3 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i72 = columnIndexOrThrow58;
                            if (sQLiteStatementPrepare.isNull(i72)) {
                                columnIndexOrThrow57 = i71;
                                text8 = null;
                            } else {
                                columnIndexOrThrow57 = i71;
                                text8 = sQLiteStatementPrepare.getText(i72);
                            }
                            columnIndexOrThrow55 = i69;
                            UUID uuidStringToUuid6 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text8);
                            if (uuidStringToUuid6 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                            int i73 = columnIndexOrThrow59;
                            LocalDate localDateStringToLocalDate = comboOrderDao_Impl.__commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(i73) ? null : sQLiteStatementPrepare.getText(i73));
                            int i74 = columnIndexOrThrow60;
                            columnIndexOrThrow59 = i73;
                            BigDecimal bigDecimalStringToBigDecimal22 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74));
                            if (bigDecimalStringToBigDecimal22 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i75 = columnIndexOrThrow61;
                            columnIndexOrThrow61 = i75;
                            BigDecimal bigDecimalStringToBigDecimal23 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i75) ? null : sQLiteStatementPrepare.getText(i75));
                            if (bigDecimalStringToBigDecimal23 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i76 = columnIndexOrThrow62;
                            BigDecimal bigDecimalStringToBigDecimal24 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i76) ? null : sQLiteStatementPrepare.getText(i76));
                            int i77 = columnIndexOrThrow63;
                            String text22 = sQLiteStatementPrepare.getText(i77);
                            int i78 = columnIndexOrThrow64;
                            String text23 = sQLiteStatementPrepare.getText(i78);
                            columnIndexOrThrow63 = i77;
                            int i79 = columnIndexOrThrow65;
                            if (sQLiteStatementPrepare.isNull(i79)) {
                                columnIndexOrThrow65 = i79;
                                text9 = null;
                            } else {
                                columnIndexOrThrow65 = i79;
                                text9 = sQLiteStatementPrepare.getText(i79);
                            }
                            columnIndexOrThrow62 = i76;
                            Instant instantStringToInstant4 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(text9);
                            if (instantStringToInstant4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                            }
                            int i80 = columnIndexOrThrow66;
                            String text24 = sQLiteStatementPrepare.isNull(i80) ? null : sQLiteStatementPrepare.getText(i80);
                            int i81 = columnIndexOrThrow67;
                            String text25 = sQLiteStatementPrepare.getText(i81);
                            int i82 = columnIndexOrThrow68;
                            String text26 = sQLiteStatementPrepare.getText(i82);
                            columnIndexOrThrow66 = i80;
                            int i83 = columnIndexOrThrow69;
                            if (sQLiteStatementPrepare.isNull(i83)) {
                                columnIndexOrThrow69 = i83;
                                text10 = null;
                            } else {
                                columnIndexOrThrow69 = i83;
                                text10 = sQLiteStatementPrepare.getText(i83);
                            }
                            columnIndexOrThrow67 = i81;
                            UUID uuidStringToUuid7 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text10);
                            int i84 = columnIndexOrThrow70;
                            String text27 = sQLiteStatementPrepare.getText(i84);
                            columnIndexOrThrow60 = i74;
                            columnIndexOrThrow58 = i72;
                            int i85 = columnIndexOrThrow71;
                            int i86 = (int) sQLiteStatementPrepare.getLong(i85);
                            int i87 = columnIndexOrThrow72;
                            if (sQLiteStatementPrepare.isNull(i87)) {
                                columnIndexOrThrow70 = i84;
                                text11 = null;
                            } else {
                                columnIndexOrThrow70 = i84;
                                text11 = sQLiteStatementPrepare.getText(i87);
                            }
                            Tradability tradabilityFromServerValue4 = companion3.fromServerValue(text11);
                            if (tradabilityFromServerValue4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            Instrument instrument = new Instrument(tradabilityFromServerValue, z5, bigDecimalStringToBigDecimal20, bigDecimalStringToBigDecimal21, tradabilityFromServerValue3, tradabilityFromServerValue2, uuidStringToUuid6, null, null, null, localDateStringToLocalDate, bigDecimalStringToBigDecimal22, bigDecimalStringToBigDecimal23, bigDecimalStringToBigDecimal24, text22, text23, instantStringToInstant4, text24, text25, text26, uuidStringToUuid7, text27, i86, tradabilityFromServerValue4, null, null);
                            Object value = MapsKt.getValue(arrayMap, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            String str3 = str2;
                            Intrinsics.checkNotNullExpressionValue(value, str3);
                            List list = (List) value;
                            Object value2 = MapsKt.getValue(arrayMap2, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            Intrinsics.checkNotNullExpressionValue(value2, str3);
                            arrayList.add(new UiComboOrder(comboOrder, optionChain, instrument, list, (List) value2));
                            columnIndexOrThrow15 = i31;
                            columnIndexOrThrow71 = i85;
                            columnIndexOrThrow68 = i82;
                            str2 = str3;
                            columnIndexOrThrow72 = i87;
                            columnIndexOrThrow64 = i78;
                            columnIndexOrThrow17 = i33;
                            columnIndexOrThrow5 = i24;
                            columnIndexOrThrow2 = i19;
                            columnIndexOrThrow3 = i20;
                            columnIndexOrThrow4 = i21;
                            i18 = i2;
                            columnIndexOrThrow6 = i26;
                            columnIndexOrThrow7 = i28;
                            columnIndexOrThrow8 = i30;
                            columnIndexOrThrow33 = i49;
                            columnIndexOrThrow14 = i29;
                        } else {
                            columnIndexOrThrow46 = i4;
                            columnIndexOrThrow44 = i65;
                            columnIndexOrThrow45 = i3;
                            columnIndexOrThrow38 = i54;
                            tickRequirements = null;
                            OptionChain optionChain2 = new OptionChain(z3, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z4, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i662 = columnIndexOrThrow52;
                            if (!sQLiteStatementPrepare.isNull(i662)) {
                            }
                            Tradability.Companion companion32 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion32.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                            }
                        }
                    } else {
                        columnIndexOrThrow51 = i64;
                    }
                } else {
                    columnIndexOrThrow51 = i64;
                    i3 = columnIndexOrThrow45;
                }
                i4 = columnIndexOrThrow46;
                if (sQLiteStatementPrepare.isNull(i65)) {
                }
                columnIndexOrThrow38 = i54;
                bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                if (bigDecimalStringToBigDecimal != null) {
                }
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    public Flow<List<UiComboOrder>> getEarlier(final Set<? extends OrderState> states, final UUID instrumentId, final Instant since, final Instant before, final Instant createdAt, final UUID id, final int limit, final boolean isFilteringByAccountNumber, final Set<String> accountNumbers) {
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(since, "since");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        SELECT *");
        sb.append("\n");
        sb.append("        FROM UiComboOrder");
        sb.append("\n");
        sb.append("        WHERE derivedState IN (");
        final int size = states.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(")");
        sb.append("\n");
        sb.append("        AND (");
        sb.append("\n");
        sb.append("            ");
        sb.append("?");
        sb.append(" IS NULL ");
        sb.append("\n");
        sb.append("            OR equityInstrumentId = ");
        sb.append("?");
        sb.append("\n");
        sb.append("        )");
        sb.append("\n");
        sb.append("        AND createdAt >= ");
        sb.append("?");
        sb.append("\n");
        sb.append("        AND (");
        sb.append("?");
        sb.append(" IS NULL OR createdAt < ");
        sb.append("?");
        sb.append(")");
        sb.append("\n");
        sb.append("        AND (createdAt < ");
        sb.append("?");
        sb.append(" OR (createdAt = ");
        sb.append("?");
        sb.append(" AND id < ");
        sb.append("?");
        sb.append("))");
        sb.append("\n");
        sb.append("        AND (NOT ");
        sb.append("?");
        sb.append(" OR accountNumber in (");
        final int size2 = accountNumbers.size();
        StringUtil.appendPlaceholders(sb, size2);
        sb.append("))");
        sb.append("\n");
        sb.append("        ORDER BY createdAt DESC, id DESC");
        sb.append("\n");
        sb.append("        LIMIT ");
        sb.append("?");
        sb.append("\n");
        sb.append("        ");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return FlowBuilder.createFlow(this.__db, true, new String[]{"ComboOrderExecution", "OptionInstrument", "Instrument", "ComboOrderLeg", "ComboOrderSalesTax", "UiComboOrder"}, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.getEarlier$lambda$16(string2, states, size, this, instrumentId, since, before, createdAt, id, isFilteringByAccountNumber, accountNumbers, size2, limit, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x082b A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0017, B:4:0x001c, B:6:0x0022, B:8:0x0030, B:12:0x003a, B:11:0x0037, B:13:0x003d, B:15:0x0049, B:17:0x0050, B:19:0x005c, B:21:0x0063, B:23:0x0071, B:25:0x0078, B:27:0x0084, B:29:0x008b, B:31:0x0097, B:33:0x009e, B:35:0x00aa, B:37:0x00b1, B:39:0x00bd, B:41:0x00c4, B:43:0x00d2, B:45:0x00d9, B:46:0x00e8, B:48:0x00ee, B:49:0x00fa, B:50:0x0338, B:52:0x033e, B:54:0x034a, B:56:0x0357, B:58:0x0361, B:60:0x036e, B:61:0x0380, B:63:0x0386, B:67:0x0392, B:70:0x039e, B:75:0x03b1, B:78:0x03bd, B:82:0x03cc, B:87:0x03db, B:89:0x03e5, B:93:0x03f1, B:95:0x03fb, B:99:0x040b, B:104:0x0420, B:109:0x0439, B:113:0x0447, B:118:0x045c, B:120:0x0464, B:125:0x0475, B:129:0x0483, B:134:0x0498, B:139:0x04b3, B:144:0x04c4, B:146:0x04ce, B:150:0x04dc, B:152:0x04e2, B:156:0x04f6, B:161:0x0511, B:163:0x051b, B:168:0x052c, B:173:0x0545, B:178:0x055e, B:180:0x0568, B:185:0x0579, B:187:0x0583, B:192:0x0594, B:194:0x059e, B:199:0x05af, B:201:0x05b9, B:206:0x05ca, B:210:0x05e0, B:215:0x05f5, B:217:0x05fd, B:222:0x060e, B:224:0x0616, B:229:0x0627, B:231:0x062f, B:236:0x0640, B:238:0x064a, B:243:0x065b, B:247:0x0671, B:249:0x0677, B:254:0x068e, B:256:0x0698, B:260:0x06a6, B:262:0x06ac, B:266:0x06ba, B:268:0x06c2, B:273:0x06d3, B:275:0x06dd, B:280:0x0701, B:285:0x0710, B:290:0x0729, B:292:0x0733, B:297:0x0744, B:299:0x074c, B:304:0x075d, B:306:0x0767, B:311:0x0778, B:313:0x0780, B:318:0x0791, B:320:0x079b, B:325:0x07ae, B:330:0x07c9, B:332:0x07d3, B:337:0x07f0, B:339:0x07f6, B:341:0x07fe, B:348:0x081f, B:353:0x0834, B:355:0x083e, B:360:0x084d, B:362:0x0857, B:367:0x0866, B:369:0x0870, B:370:0x0877, B:374:0x088e, B:378:0x089a, B:382:0x08ac, B:384:0x08b2, B:389:0x08c7, B:394:0x08d6, B:396:0x08e0, B:401:0x08f1, B:403:0x08fb, B:407:0x0909, B:409:0x090f, B:414:0x0926, B:416:0x0930, B:420:0x093e, B:425:0x0957, B:427:0x0961, B:432:0x0972, B:434:0x097c, B:438:0x098a, B:443:0x09b7, B:445:0x09c1, B:450:0x09d5, B:455:0x09f8, B:459:0x0a25, B:461:0x0a2b, B:462:0x0a8c, B:463:0x0a91, B:458:0x0a1d, B:454:0x09ef, B:449:0x09ce, B:464:0x0a92, B:465:0x0a97, B:442:0x09ae, B:437:0x0986, B:466:0x0a98, B:467:0x0a9d, B:431:0x096d, B:468:0x0a9e, B:469:0x0aa3, B:424:0x0952, B:419:0x093a, B:470:0x0aa4, B:471:0x0aa9, B:413:0x091d, B:472:0x0aaa, B:473:0x0aaf, B:406:0x0905, B:474:0x0ab0, B:475:0x0ab5, B:400:0x08ec, B:476:0x0ab6, B:477:0x0abb, B:393:0x08d1, B:478:0x0abc, B:479:0x0ac1, B:381:0x08a4, B:480:0x0ac2, B:481:0x0ac7, B:373:0x088a, B:482:0x0ac8, B:483:0x0acd, B:366:0x0861, B:484:0x0ace, B:485:0x0ad3, B:359:0x0848, B:486:0x0ad4, B:487:0x0ad9, B:352:0x082b, B:336:0x07e2, B:488:0x0ada, B:489:0x0adf, B:329:0x07c0, B:490:0x0ae0, B:491:0x0ae5, B:317:0x078c, B:492:0x0ae6, B:493:0x0aed, B:310:0x0773, B:494:0x0aee, B:495:0x0af3, B:303:0x0758, B:496:0x0af4, B:497:0x0afb, B:296:0x073f, B:498:0x0afc, B:499:0x0b03, B:289:0x0724, B:284:0x070b, B:500:0x0b04, B:501:0x0b09, B:272:0x06ce, B:502:0x0b0a, B:503:0x0b11, B:265:0x06b6, B:504:0x0b12, B:505:0x0b17, B:259:0x06a2, B:506:0x0b18, B:507:0x0b1d, B:253:0x0685, B:508:0x0b1e, B:509:0x0b23, B:246:0x066d, B:242:0x0656, B:510:0x0b24, B:511:0x0b29, B:235:0x063b, B:512:0x0b2a, B:513:0x0b31, B:228:0x0622, B:514:0x0b32, B:515:0x0b39, B:221:0x0609, B:516:0x0b3a, B:517:0x0b41, B:214:0x05f0, B:209:0x05dc, B:205:0x05c5, B:518:0x0b42, B:519:0x0b47, B:198:0x05aa, B:520:0x0b48, B:521:0x0b4d, B:191:0x058f, B:522:0x0b4e, B:523:0x0b53, B:184:0x0574, B:524:0x0b54, B:525:0x0b59, B:177:0x0559, B:172:0x0540, B:167:0x0527, B:526:0x0b5a, B:527:0x0b5f, B:160:0x0508, B:155:0x04ee, B:528:0x0b60, B:529:0x0b65, B:149:0x04d8, B:530:0x0b66, B:531:0x0b6b, B:143:0x04bd, B:133:0x048f, B:532:0x0b6c, B:533:0x0b71, B:124:0x0470, B:534:0x0b72, B:535:0x0b79, B:117:0x0453, B:536:0x0b7a, B:537:0x0b7f, B:108:0x0434, B:103:0x041b, B:98:0x0407, B:538:0x0b80, B:539:0x0b85, B:92:0x03ed, B:540:0x0b86, B:541:0x0b8b, B:86:0x03d6, B:81:0x03c6, B:542:0x0b8c, B:543:0x0b91, B:74:0x03ac, B:544:0x0b92, B:545:0x0b97, B:66:0x038e, B:44:0x00d6, B:40:0x00c1, B:36:0x00ae, B:32:0x009b, B:28:0x0088, B:24:0x0075, B:20:0x0060, B:16:0x004d), top: B:550:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x083e A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0017, B:4:0x001c, B:6:0x0022, B:8:0x0030, B:12:0x003a, B:11:0x0037, B:13:0x003d, B:15:0x0049, B:17:0x0050, B:19:0x005c, B:21:0x0063, B:23:0x0071, B:25:0x0078, B:27:0x0084, B:29:0x008b, B:31:0x0097, B:33:0x009e, B:35:0x00aa, B:37:0x00b1, B:39:0x00bd, B:41:0x00c4, B:43:0x00d2, B:45:0x00d9, B:46:0x00e8, B:48:0x00ee, B:49:0x00fa, B:50:0x0338, B:52:0x033e, B:54:0x034a, B:56:0x0357, B:58:0x0361, B:60:0x036e, B:61:0x0380, B:63:0x0386, B:67:0x0392, B:70:0x039e, B:75:0x03b1, B:78:0x03bd, B:82:0x03cc, B:87:0x03db, B:89:0x03e5, B:93:0x03f1, B:95:0x03fb, B:99:0x040b, B:104:0x0420, B:109:0x0439, B:113:0x0447, B:118:0x045c, B:120:0x0464, B:125:0x0475, B:129:0x0483, B:134:0x0498, B:139:0x04b3, B:144:0x04c4, B:146:0x04ce, B:150:0x04dc, B:152:0x04e2, B:156:0x04f6, B:161:0x0511, B:163:0x051b, B:168:0x052c, B:173:0x0545, B:178:0x055e, B:180:0x0568, B:185:0x0579, B:187:0x0583, B:192:0x0594, B:194:0x059e, B:199:0x05af, B:201:0x05b9, B:206:0x05ca, B:210:0x05e0, B:215:0x05f5, B:217:0x05fd, B:222:0x060e, B:224:0x0616, B:229:0x0627, B:231:0x062f, B:236:0x0640, B:238:0x064a, B:243:0x065b, B:247:0x0671, B:249:0x0677, B:254:0x068e, B:256:0x0698, B:260:0x06a6, B:262:0x06ac, B:266:0x06ba, B:268:0x06c2, B:273:0x06d3, B:275:0x06dd, B:280:0x0701, B:285:0x0710, B:290:0x0729, B:292:0x0733, B:297:0x0744, B:299:0x074c, B:304:0x075d, B:306:0x0767, B:311:0x0778, B:313:0x0780, B:318:0x0791, B:320:0x079b, B:325:0x07ae, B:330:0x07c9, B:332:0x07d3, B:337:0x07f0, B:339:0x07f6, B:341:0x07fe, B:348:0x081f, B:353:0x0834, B:355:0x083e, B:360:0x084d, B:362:0x0857, B:367:0x0866, B:369:0x0870, B:370:0x0877, B:374:0x088e, B:378:0x089a, B:382:0x08ac, B:384:0x08b2, B:389:0x08c7, B:394:0x08d6, B:396:0x08e0, B:401:0x08f1, B:403:0x08fb, B:407:0x0909, B:409:0x090f, B:414:0x0926, B:416:0x0930, B:420:0x093e, B:425:0x0957, B:427:0x0961, B:432:0x0972, B:434:0x097c, B:438:0x098a, B:443:0x09b7, B:445:0x09c1, B:450:0x09d5, B:455:0x09f8, B:459:0x0a25, B:461:0x0a2b, B:462:0x0a8c, B:463:0x0a91, B:458:0x0a1d, B:454:0x09ef, B:449:0x09ce, B:464:0x0a92, B:465:0x0a97, B:442:0x09ae, B:437:0x0986, B:466:0x0a98, B:467:0x0a9d, B:431:0x096d, B:468:0x0a9e, B:469:0x0aa3, B:424:0x0952, B:419:0x093a, B:470:0x0aa4, B:471:0x0aa9, B:413:0x091d, B:472:0x0aaa, B:473:0x0aaf, B:406:0x0905, B:474:0x0ab0, B:475:0x0ab5, B:400:0x08ec, B:476:0x0ab6, B:477:0x0abb, B:393:0x08d1, B:478:0x0abc, B:479:0x0ac1, B:381:0x08a4, B:480:0x0ac2, B:481:0x0ac7, B:373:0x088a, B:482:0x0ac8, B:483:0x0acd, B:366:0x0861, B:484:0x0ace, B:485:0x0ad3, B:359:0x0848, B:486:0x0ad4, B:487:0x0ad9, B:352:0x082b, B:336:0x07e2, B:488:0x0ada, B:489:0x0adf, B:329:0x07c0, B:490:0x0ae0, B:491:0x0ae5, B:317:0x078c, B:492:0x0ae6, B:493:0x0aed, B:310:0x0773, B:494:0x0aee, B:495:0x0af3, B:303:0x0758, B:496:0x0af4, B:497:0x0afb, B:296:0x073f, B:498:0x0afc, B:499:0x0b03, B:289:0x0724, B:284:0x070b, B:500:0x0b04, B:501:0x0b09, B:272:0x06ce, B:502:0x0b0a, B:503:0x0b11, B:265:0x06b6, B:504:0x0b12, B:505:0x0b17, B:259:0x06a2, B:506:0x0b18, B:507:0x0b1d, B:253:0x0685, B:508:0x0b1e, B:509:0x0b23, B:246:0x066d, B:242:0x0656, B:510:0x0b24, B:511:0x0b29, B:235:0x063b, B:512:0x0b2a, B:513:0x0b31, B:228:0x0622, B:514:0x0b32, B:515:0x0b39, B:221:0x0609, B:516:0x0b3a, B:517:0x0b41, B:214:0x05f0, B:209:0x05dc, B:205:0x05c5, B:518:0x0b42, B:519:0x0b47, B:198:0x05aa, B:520:0x0b48, B:521:0x0b4d, B:191:0x058f, B:522:0x0b4e, B:523:0x0b53, B:184:0x0574, B:524:0x0b54, B:525:0x0b59, B:177:0x0559, B:172:0x0540, B:167:0x0527, B:526:0x0b5a, B:527:0x0b5f, B:160:0x0508, B:155:0x04ee, B:528:0x0b60, B:529:0x0b65, B:149:0x04d8, B:530:0x0b66, B:531:0x0b6b, B:143:0x04bd, B:133:0x048f, B:532:0x0b6c, B:533:0x0b71, B:124:0x0470, B:534:0x0b72, B:535:0x0b79, B:117:0x0453, B:536:0x0b7a, B:537:0x0b7f, B:108:0x0434, B:103:0x041b, B:98:0x0407, B:538:0x0b80, B:539:0x0b85, B:92:0x03ed, B:540:0x0b86, B:541:0x0b8b, B:86:0x03d6, B:81:0x03c6, B:542:0x0b8c, B:543:0x0b91, B:74:0x03ac, B:544:0x0b92, B:545:0x0b97, B:66:0x038e, B:44:0x00d6, B:40:0x00c1, B:36:0x00ae, B:32:0x009b, B:28:0x0088, B:24:0x0075, B:20:0x0060, B:16:0x004d), top: B:550:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x088a A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0017, B:4:0x001c, B:6:0x0022, B:8:0x0030, B:12:0x003a, B:11:0x0037, B:13:0x003d, B:15:0x0049, B:17:0x0050, B:19:0x005c, B:21:0x0063, B:23:0x0071, B:25:0x0078, B:27:0x0084, B:29:0x008b, B:31:0x0097, B:33:0x009e, B:35:0x00aa, B:37:0x00b1, B:39:0x00bd, B:41:0x00c4, B:43:0x00d2, B:45:0x00d9, B:46:0x00e8, B:48:0x00ee, B:49:0x00fa, B:50:0x0338, B:52:0x033e, B:54:0x034a, B:56:0x0357, B:58:0x0361, B:60:0x036e, B:61:0x0380, B:63:0x0386, B:67:0x0392, B:70:0x039e, B:75:0x03b1, B:78:0x03bd, B:82:0x03cc, B:87:0x03db, B:89:0x03e5, B:93:0x03f1, B:95:0x03fb, B:99:0x040b, B:104:0x0420, B:109:0x0439, B:113:0x0447, B:118:0x045c, B:120:0x0464, B:125:0x0475, B:129:0x0483, B:134:0x0498, B:139:0x04b3, B:144:0x04c4, B:146:0x04ce, B:150:0x04dc, B:152:0x04e2, B:156:0x04f6, B:161:0x0511, B:163:0x051b, B:168:0x052c, B:173:0x0545, B:178:0x055e, B:180:0x0568, B:185:0x0579, B:187:0x0583, B:192:0x0594, B:194:0x059e, B:199:0x05af, B:201:0x05b9, B:206:0x05ca, B:210:0x05e0, B:215:0x05f5, B:217:0x05fd, B:222:0x060e, B:224:0x0616, B:229:0x0627, B:231:0x062f, B:236:0x0640, B:238:0x064a, B:243:0x065b, B:247:0x0671, B:249:0x0677, B:254:0x068e, B:256:0x0698, B:260:0x06a6, B:262:0x06ac, B:266:0x06ba, B:268:0x06c2, B:273:0x06d3, B:275:0x06dd, B:280:0x0701, B:285:0x0710, B:290:0x0729, B:292:0x0733, B:297:0x0744, B:299:0x074c, B:304:0x075d, B:306:0x0767, B:311:0x0778, B:313:0x0780, B:318:0x0791, B:320:0x079b, B:325:0x07ae, B:330:0x07c9, B:332:0x07d3, B:337:0x07f0, B:339:0x07f6, B:341:0x07fe, B:348:0x081f, B:353:0x0834, B:355:0x083e, B:360:0x084d, B:362:0x0857, B:367:0x0866, B:369:0x0870, B:370:0x0877, B:374:0x088e, B:378:0x089a, B:382:0x08ac, B:384:0x08b2, B:389:0x08c7, B:394:0x08d6, B:396:0x08e0, B:401:0x08f1, B:403:0x08fb, B:407:0x0909, B:409:0x090f, B:414:0x0926, B:416:0x0930, B:420:0x093e, B:425:0x0957, B:427:0x0961, B:432:0x0972, B:434:0x097c, B:438:0x098a, B:443:0x09b7, B:445:0x09c1, B:450:0x09d5, B:455:0x09f8, B:459:0x0a25, B:461:0x0a2b, B:462:0x0a8c, B:463:0x0a91, B:458:0x0a1d, B:454:0x09ef, B:449:0x09ce, B:464:0x0a92, B:465:0x0a97, B:442:0x09ae, B:437:0x0986, B:466:0x0a98, B:467:0x0a9d, B:431:0x096d, B:468:0x0a9e, B:469:0x0aa3, B:424:0x0952, B:419:0x093a, B:470:0x0aa4, B:471:0x0aa9, B:413:0x091d, B:472:0x0aaa, B:473:0x0aaf, B:406:0x0905, B:474:0x0ab0, B:475:0x0ab5, B:400:0x08ec, B:476:0x0ab6, B:477:0x0abb, B:393:0x08d1, B:478:0x0abc, B:479:0x0ac1, B:381:0x08a4, B:480:0x0ac2, B:481:0x0ac7, B:373:0x088a, B:482:0x0ac8, B:483:0x0acd, B:366:0x0861, B:484:0x0ace, B:485:0x0ad3, B:359:0x0848, B:486:0x0ad4, B:487:0x0ad9, B:352:0x082b, B:336:0x07e2, B:488:0x0ada, B:489:0x0adf, B:329:0x07c0, B:490:0x0ae0, B:491:0x0ae5, B:317:0x078c, B:492:0x0ae6, B:493:0x0aed, B:310:0x0773, B:494:0x0aee, B:495:0x0af3, B:303:0x0758, B:496:0x0af4, B:497:0x0afb, B:296:0x073f, B:498:0x0afc, B:499:0x0b03, B:289:0x0724, B:284:0x070b, B:500:0x0b04, B:501:0x0b09, B:272:0x06ce, B:502:0x0b0a, B:503:0x0b11, B:265:0x06b6, B:504:0x0b12, B:505:0x0b17, B:259:0x06a2, B:506:0x0b18, B:507:0x0b1d, B:253:0x0685, B:508:0x0b1e, B:509:0x0b23, B:246:0x066d, B:242:0x0656, B:510:0x0b24, B:511:0x0b29, B:235:0x063b, B:512:0x0b2a, B:513:0x0b31, B:228:0x0622, B:514:0x0b32, B:515:0x0b39, B:221:0x0609, B:516:0x0b3a, B:517:0x0b41, B:214:0x05f0, B:209:0x05dc, B:205:0x05c5, B:518:0x0b42, B:519:0x0b47, B:198:0x05aa, B:520:0x0b48, B:521:0x0b4d, B:191:0x058f, B:522:0x0b4e, B:523:0x0b53, B:184:0x0574, B:524:0x0b54, B:525:0x0b59, B:177:0x0559, B:172:0x0540, B:167:0x0527, B:526:0x0b5a, B:527:0x0b5f, B:160:0x0508, B:155:0x04ee, B:528:0x0b60, B:529:0x0b65, B:149:0x04d8, B:530:0x0b66, B:531:0x0b6b, B:143:0x04bd, B:133:0x048f, B:532:0x0b6c, B:533:0x0b71, B:124:0x0470, B:534:0x0b72, B:535:0x0b79, B:117:0x0453, B:536:0x0b7a, B:537:0x0b7f, B:108:0x0434, B:103:0x041b, B:98:0x0407, B:538:0x0b80, B:539:0x0b85, B:92:0x03ed, B:540:0x0b86, B:541:0x0b8b, B:86:0x03d6, B:81:0x03c6, B:542:0x0b8c, B:543:0x0b91, B:74:0x03ac, B:544:0x0b92, B:545:0x0b97, B:66:0x038e, B:44:0x00d6, B:40:0x00c1, B:36:0x00ae, B:32:0x009b, B:28:0x0088, B:24:0x0075, B:20:0x0060, B:16:0x004d), top: B:550:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0ad4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0ac2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List getEarlier$lambda$16(String str, Set set, int i, ComboOrderDao_Impl comboOrderDao_Impl, UUID uuid, Instant instant, Instant instant2, Instant instant3, UUID uuid2, boolean z, Set set2, int i2, int i3, SQLiteConnection _connection) {
        int i4;
        String text;
        String text2;
        String text3;
        String text4;
        String text5;
        String text6;
        Integer numValueOf;
        int i5;
        int i6;
        OptionChain.TickRequirements tickRequirements;
        Tradability tradabilityFromServerValue;
        String text7;
        String text8;
        String text9;
        String text10;
        String text11;
        String text12;
        BigDecimal bigDecimalStringToBigDecimal;
        int i7;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = set.iterator();
            int i8 = 1;
            while (it.hasNext()) {
                String serverValue = OrderState.INSTANCE.toServerValue((OrderState) it.next());
                if (serverValue == null) {
                    sQLiteStatementPrepare.bindNull(i8);
                } else {
                    sQLiteStatementPrepare.bindText(i8, serverValue);
                }
                i8++;
            }
            int i9 = i + 1;
            String strUuidToString = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(i9);
            } else {
                sQLiteStatementPrepare.bindText(i9, strUuidToString);
            }
            int i10 = i + 2;
            String strUuidToString2 = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString2 == null) {
                sQLiteStatementPrepare.bindNull(i10);
            } else {
                sQLiteStatementPrepare.bindText(i10, strUuidToString2);
            }
            int i11 = i + 3;
            String strInstantToString = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant);
            if (strInstantToString == null) {
                sQLiteStatementPrepare.bindNull(i11);
            } else {
                sQLiteStatementPrepare.bindText(i11, strInstantToString);
            }
            int i12 = i + 4;
            String strInstantToString2 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant2);
            if (strInstantToString2 == null) {
                sQLiteStatementPrepare.bindNull(i12);
            } else {
                sQLiteStatementPrepare.bindText(i12, strInstantToString2);
            }
            int i13 = i + 5;
            String strInstantToString3 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant2);
            if (strInstantToString3 == null) {
                sQLiteStatementPrepare.bindNull(i13);
            } else {
                sQLiteStatementPrepare.bindText(i13, strInstantToString3);
            }
            int i14 = i + 6;
            String strInstantToString4 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant3);
            if (strInstantToString4 == null) {
                sQLiteStatementPrepare.bindNull(i14);
            } else {
                sQLiteStatementPrepare.bindText(i14, strInstantToString4);
            }
            int i15 = i + 7;
            String strInstantToString5 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant3);
            if (strInstantToString5 == null) {
                sQLiteStatementPrepare.bindNull(i15);
            } else {
                sQLiteStatementPrepare.bindText(i15, strInstantToString5);
            }
            int i16 = i + 8;
            String strUuidToString3 = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid2);
            if (strUuidToString3 == null) {
                sQLiteStatementPrepare.bindNull(i16);
            } else {
                sQLiteStatementPrepare.bindText(i16, strUuidToString3);
            }
            sQLiteStatementPrepare.bindLong(i + 9, z ? 1L : 0L);
            int i17 = i + 10;
            Iterator it2 = set2.iterator();
            int i18 = i17;
            while (it2.hasNext()) {
                sQLiteStatementPrepare.bindText(i18, (String) it2.next());
                i18++;
            }
            sQLiteStatementPrepare.bindLong(i17 + i2, i3);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "averageNetPremiumPaid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancelUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canceledQuantity");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSymbol");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closingStrategy");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contractFees");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivedState");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "direction");
            String str2 = "getValue(...)";
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "goldSavings");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isReplaceable");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmount");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmountDirection");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openingStrategy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pendingQuantity");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "premium");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AnalyticsStrings.TAG_SORT_ORDER_PRICE);
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremium");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedQuantity");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "regulatoryFees");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stopPrice");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "strategy");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInForce");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedAt");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "refId");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremiumDirection");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmount");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmountDirection");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "formSource");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equityInstrumentId");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "underlyingSymbol");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_canOpenPosition");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_cashComponent");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_expirationDates");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_extendedHoursState");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_lateCloseState");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickAboveCutoff");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickBelowCutoff");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_cutoffPrice");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_receivedAt");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_settleOnOpen");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_symbol");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_tradeValueMultiplier");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_selloutTimeToExpiration");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_affiliateTradability");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_allDayTradability");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_carRequired");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_dayTradeRatio");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_defaultPresetPercentLimit");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_fractionalTradability");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_id");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_listDate");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_maintenanceRatio");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_marginInitialRatio");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_minTickSize");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_name");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_otcMarketTier");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_receivedAt");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_simpleName");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_state");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_symbol");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_tradableChainId");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_type");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_notionalEstimatedQuantityDecimals");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_shortSaleTradability");
            ArrayMap<String, List<UiComboOrderLeg>> arrayMap = new ArrayMap<>();
            int i19 = columnIndexOrThrow12;
            ArrayMap<String, List<ComboOrderSalesTax>> arrayMap2 = new ArrayMap<>();
            while (sQLiteStatementPrepare.step()) {
                int i20 = columnIndexOrThrow11;
                String text13 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (arrayMap.containsKey(text13)) {
                    i7 = columnIndexOrThrow10;
                } else {
                    i7 = columnIndexOrThrow10;
                    arrayMap.put(text13, new ArrayList());
                }
                String text14 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!arrayMap2.containsKey(text14)) {
                    arrayMap2.put(text14, new ArrayList());
                }
                columnIndexOrThrow11 = i20;
                columnIndexOrThrow10 = i7;
            }
            int i21 = columnIndexOrThrow10;
            int i22 = columnIndexOrThrow11;
            sQLiteStatementPrepare.reset();
            comboOrderDao_Impl.m2217x4e5ab2fa(_connection, arrayMap);
            comboOrderDao_Impl.m2219x367d9594(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text15 = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                int i23 = columnIndexOrThrow2;
                BigDecimal bigDecimalStringToBigDecimal2 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (bigDecimalStringToBigDecimal2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                int i24 = columnIndexOrThrow3;
                BigDecimal bigDecimalStringToBigDecimal3 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (bigDecimalStringToBigDecimal3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                UUID uuidStringToUuid2 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (uuidStringToUuid2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text17 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                OptionStrategyType.Companion companion = OptionStrategyType.INSTANCE;
                OptionStrategyType optionStrategyTypeFromServerValue = companion.fromServerValue(text18);
                int i25 = columnIndexOrThrow4;
                BigDecimal bigDecimalStringToBigDecimal4 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                int i26 = i21;
                i21 = i26;
                Instant instantStringToInstant = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i26) ? null : sQLiteStatementPrepare.getText(i26));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i27 = i22;
                if (sQLiteStatementPrepare.isNull(i27)) {
                    i4 = i27;
                    text = null;
                } else {
                    i4 = i27;
                    text = sQLiteStatementPrepare.getText(i27);
                }
                int i28 = columnIndexOrThrow5;
                OrderState orderStateFromServerValue = OrderState.INSTANCE.fromServerValue(text);
                if (orderStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.shared.models.history.shared.OrderState', but it was NULL.");
                }
                int i29 = i19;
                String text19 = sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29);
                i19 = i29;
                OrderDirection.Companion companion2 = OrderDirection.INSTANCE;
                OrderDirection orderDirectionFromServerValue = companion2.fromServerValue(text19);
                if (orderDirectionFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i30 = columnIndexOrThrow6;
                int i31 = columnIndexOrThrow13;
                if (sQLiteStatementPrepare.isNull(i31)) {
                    columnIndexOrThrow13 = i31;
                    text2 = null;
                } else {
                    columnIndexOrThrow13 = i31;
                    text2 = sQLiteStatementPrepare.getText(i31);
                }
                int i32 = columnIndexOrThrow7;
                BigDecimal bigDecimalStringToBigDecimal5 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text2);
                int i33 = columnIndexOrThrow14;
                int i34 = columnIndexOrThrow8;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i33)) != 0;
                int i35 = columnIndexOrThrow15;
                BigDecimal bigDecimalStringToBigDecimal6 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i35) ? null : sQLiteStatementPrepare.getText(i35));
                if (bigDecimalStringToBigDecimal6 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i36 = columnIndexOrThrow16;
                OrderDirection orderDirectionFromServerValue2 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i36) ? null : sQLiteStatementPrepare.getText(i36));
                if (orderDirectionFromServerValue2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i37 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i37)) {
                    columnIndexOrThrow16 = i36;
                    text3 = null;
                } else {
                    columnIndexOrThrow16 = i36;
                    text3 = sQLiteStatementPrepare.getText(i37);
                }
                OptionStrategyType optionStrategyTypeFromServerValue2 = companion.fromServerValue(text3);
                int i38 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i38)) {
                    columnIndexOrThrow18 = i38;
                    text4 = null;
                } else {
                    columnIndexOrThrow18 = i38;
                    text4 = sQLiteStatementPrepare.getText(i38);
                }
                BigDecimal bigDecimalStringToBigDecimal7 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text4);
                if (bigDecimalStringToBigDecimal7 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i39 = columnIndexOrThrow19;
                columnIndexOrThrow19 = i39;
                BigDecimal bigDecimalStringToBigDecimal8 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i39) ? null : sQLiteStatementPrepare.getText(i39));
                int i40 = columnIndexOrThrow20;
                columnIndexOrThrow20 = i40;
                BigDecimal bigDecimalStringToBigDecimal9 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i40) ? null : sQLiteStatementPrepare.getText(i40));
                int i41 = columnIndexOrThrow21;
                columnIndexOrThrow21 = i41;
                BigDecimal bigDecimalStringToBigDecimal10 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i41) ? null : sQLiteStatementPrepare.getText(i41));
                if (bigDecimalStringToBigDecimal10 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i42 = columnIndexOrThrow22;
                columnIndexOrThrow22 = i42;
                BigDecimal bigDecimalStringToBigDecimal11 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i42) ? null : sQLiteStatementPrepare.getText(i42));
                if (bigDecimalStringToBigDecimal11 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i43 = columnIndexOrThrow23;
                columnIndexOrThrow23 = i43;
                BigDecimal bigDecimalStringToBigDecimal12 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                if (bigDecimalStringToBigDecimal12 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i44 = columnIndexOrThrow24;
                columnIndexOrThrow24 = i44;
                BigDecimal bigDecimalStringToBigDecimal13 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i44) ? null : sQLiteStatementPrepare.getText(i44));
                if (bigDecimalStringToBigDecimal13 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i45 = columnIndexOrThrow25;
                columnIndexOrThrow25 = i45;
                BigDecimal bigDecimalStringToBigDecimal14 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i45) ? null : sQLiteStatementPrepare.getText(i45));
                int i46 = columnIndexOrThrow26;
                OptionStrategyType optionStrategyTypeFromServerValue3 = companion.fromServerValue(sQLiteStatementPrepare.isNull(i46) ? null : sQLiteStatementPrepare.getText(i46));
                int i47 = columnIndexOrThrow27;
                columnIndexOrThrow26 = i46;
                OrderTimeInForce orderTimeInForceFromServerValue = OrderTimeInForce.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i47) ? null : sQLiteStatementPrepare.getText(i47));
                if (orderTimeInForceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTimeInForce', but it was NULL.");
                }
                int i48 = columnIndexOrThrow28;
                columnIndexOrThrow28 = i48;
                OrderTrigger orderTriggerFromServerValue = OrderTrigger.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i48) ? null : sQLiteStatementPrepare.getText(i48));
                if (orderTriggerFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTrigger', but it was NULL.");
                }
                int i49 = columnIndexOrThrow29;
                columnIndexOrThrow29 = i49;
                OrderType orderTypeFromServerValue = OrderType.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i49) ? null : sQLiteStatementPrepare.getText(i49));
                if (orderTypeFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderType', but it was NULL.");
                }
                int i50 = columnIndexOrThrow30;
                columnIndexOrThrow30 = i50;
                Instant instantStringToInstant2 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i50) ? null : sQLiteStatementPrepare.getText(i50));
                if (instantStringToInstant2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i51 = columnIndexOrThrow31;
                columnIndexOrThrow31 = i51;
                UUID uuidStringToUuid3 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i51) ? null : sQLiteStatementPrepare.getText(i51));
                int i52 = columnIndexOrThrow32;
                OrderDirection orderDirectionFromServerValue3 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i52) ? null : sQLiteStatementPrepare.getText(i52));
                if (orderDirectionFromServerValue3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i53 = columnIndexOrThrow33;
                if (sQLiteStatementPrepare.isNull(i53)) {
                    columnIndexOrThrow32 = i52;
                    text5 = null;
                } else {
                    columnIndexOrThrow32 = i52;
                    text5 = sQLiteStatementPrepare.getText(i53);
                }
                columnIndexOrThrow27 = i47;
                BigDecimal bigDecimalStringToBigDecimal15 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text5);
                if (bigDecimalStringToBigDecimal15 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i54 = columnIndexOrThrow34;
                OrderDirection orderDirectionFromServerValue4 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i54) ? null : sQLiteStatementPrepare.getText(i54));
                if (orderDirectionFromServerValue4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i55 = columnIndexOrThrow35;
                OptionOrder.FormSource formSourceFromServerValue = OptionOrder.FormSource.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i55) ? null : sQLiteStatementPrepare.getText(i55));
                if (formSourceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionOrder.FormSource', but it was NULL.");
                }
                int i56 = columnIndexOrThrow36;
                columnIndexOrThrow35 = i55;
                UUID uuidStringToUuid4 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i56) ? null : sQLiteStatementPrepare.getText(i56));
                if (uuidStringToUuid4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i57 = columnIndexOrThrow37;
                ComboOrder comboOrder = new ComboOrder(uuidStringToUuid, text15, bigDecimalStringToBigDecimal2, text16, bigDecimalStringToBigDecimal3, uuidStringToUuid2, text17, optionStrategyTypeFromServerValue, bigDecimalStringToBigDecimal4, instantStringToInstant, orderStateFromServerValue, orderDirectionFromServerValue, bigDecimalStringToBigDecimal5, z2, bigDecimalStringToBigDecimal6, orderDirectionFromServerValue2, optionStrategyTypeFromServerValue2, bigDecimalStringToBigDecimal7, bigDecimalStringToBigDecimal8, bigDecimalStringToBigDecimal9, bigDecimalStringToBigDecimal10, bigDecimalStringToBigDecimal11, bigDecimalStringToBigDecimal12, bigDecimalStringToBigDecimal13, bigDecimalStringToBigDecimal14, optionStrategyTypeFromServerValue3, orderTimeInForceFromServerValue, orderTriggerFromServerValue, orderTypeFromServerValue, instantStringToInstant2, uuidStringToUuid3, orderDirectionFromServerValue3, bigDecimalStringToBigDecimal15, orderDirectionFromServerValue4, formSourceFromServerValue, uuidStringToUuid4, sQLiteStatementPrepare.getText(i57));
                columnIndexOrThrow36 = i56;
                columnIndexOrThrow34 = i54;
                int i58 = columnIndexOrThrow38;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i58)) != 0;
                int i59 = columnIndexOrThrow39;
                columnIndexOrThrow37 = i57;
                BigDecimal bigDecimalStringToBigDecimal16 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59));
                int i60 = columnIndexOrThrow40;
                columnIndexOrThrow40 = i60;
                ImmutableList<LocalDate> immutableListStringToLocalDateImmutableList = comboOrderDao_Impl.__modelRoomConverters().stringToLocalDateImmutableList(sQLiteStatementPrepare.isNull(i60) ? null : sQLiteStatementPrepare.getText(i60));
                if (immutableListStringToLocalDateImmutableList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlinx.collections.immutable.ImmutableList<java.time.LocalDate>', but it was NULL.");
                }
                int i61 = columnIndexOrThrow41;
                columnIndexOrThrow41 = i61;
                OptionChain.ExtendedHoursState extendedHoursStateFromServerValue = OptionChain.ExtendedHoursState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i61) ? null : sQLiteStatementPrepare.getText(i61));
                if (extendedHoursStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.ExtendedHoursState', but it was NULL.");
                }
                int i62 = columnIndexOrThrow42;
                columnIndexOrThrow42 = i62;
                UUID uuidStringToUuid5 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i62) ? null : sQLiteStatementPrepare.getText(i62));
                if (uuidStringToUuid5 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i63 = columnIndexOrThrow43;
                columnIndexOrThrow43 = i63;
                OptionChain.LateCloseState lateCloseStateFromServerValue = OptionChain.LateCloseState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i63) ? null : sQLiteStatementPrepare.getText(i63));
                if (lateCloseStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.LateCloseState', but it was NULL.");
                }
                int i64 = columnIndexOrThrow47;
                columnIndexOrThrow47 = i64;
                Instant instantStringToInstant3 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i64) ? null : sQLiteStatementPrepare.getText(i64));
                if (instantStringToInstant3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                columnIndexOrThrow39 = i59;
                int i65 = columnIndexOrThrow48;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(i65)) != 0;
                int i66 = columnIndexOrThrow49;
                String text20 = sQLiteStatementPrepare.getText(i66);
                int i67 = columnIndexOrThrow50;
                if (sQLiteStatementPrepare.isNull(i67)) {
                    columnIndexOrThrow48 = i65;
                    text6 = null;
                } else {
                    columnIndexOrThrow48 = i65;
                    text6 = sQLiteStatementPrepare.getText(i67);
                }
                columnIndexOrThrow49 = i66;
                BigDecimal bigDecimalStringToBigDecimal17 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text6);
                if (bigDecimalStringToBigDecimal17 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i68 = columnIndexOrThrow51;
                if (sQLiteStatementPrepare.isNull(i68)) {
                    columnIndexOrThrow50 = i67;
                    numValueOf = null;
                } else {
                    columnIndexOrThrow50 = i67;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i68));
                }
                int i69 = columnIndexOrThrow44;
                if (sQLiteStatementPrepare.isNull(i69)) {
                    i5 = columnIndexOrThrow45;
                    if (sQLiteStatementPrepare.isNull(i5)) {
                        columnIndexOrThrow51 = i68;
                        i6 = columnIndexOrThrow46;
                        if (!sQLiteStatementPrepare.isNull(i6)) {
                            if (sQLiteStatementPrepare.isNull(i69)) {
                                columnIndexOrThrow44 = i69;
                                text12 = sQLiteStatementPrepare.getText(i69);
                            } else {
                                columnIndexOrThrow44 = i69;
                                text12 = null;
                            }
                            columnIndexOrThrow38 = i58;
                            bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                            if (bigDecimalStringToBigDecimal != null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow45 = i5;
                            BigDecimal bigDecimalStringToBigDecimal18 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5));
                            if (bigDecimalStringToBigDecimal18 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow46 = i6;
                            BigDecimal bigDecimalStringToBigDecimal19 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                            if (bigDecimalStringToBigDecimal19 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            tickRequirements = new OptionChain.TickRequirements(bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal18, bigDecimalStringToBigDecimal19);
                            OptionChain optionChain = new OptionChain(z3, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z4, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i70 = columnIndexOrThrow52;
                            String text21 = !sQLiteStatementPrepare.isNull(i70) ? null : sQLiteStatementPrepare.getText(i70);
                            Tradability.Companion companion3 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion3.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i71 = columnIndexOrThrow53;
                            if (sQLiteStatementPrepare.isNull(i71)) {
                                columnIndexOrThrow52 = i70;
                                text7 = null;
                            } else {
                                columnIndexOrThrow52 = i70;
                                text7 = sQLiteStatementPrepare.getText(i71);
                            }
                            Tradability tradabilityFromServerValue2 = companion3.fromServerValue(text7);
                            if (tradabilityFromServerValue2 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            columnIndexOrThrow53 = i71;
                            int i72 = columnIndexOrThrow54;
                            boolean z5 = ((int) sQLiteStatementPrepare.getLong(i72)) != 0;
                            int i73 = columnIndexOrThrow55;
                            columnIndexOrThrow54 = i72;
                            BigDecimal bigDecimalStringToBigDecimal20 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i73) ? null : sQLiteStatementPrepare.getText(i73));
                            if (bigDecimalStringToBigDecimal20 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i74 = columnIndexOrThrow56;
                            columnIndexOrThrow56 = i74;
                            BigDecimal bigDecimalStringToBigDecimal21 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74));
                            if (bigDecimalStringToBigDecimal21 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i75 = columnIndexOrThrow57;
                            Tradability tradabilityFromServerValue3 = companion3.fromServerValue(sQLiteStatementPrepare.isNull(i75) ? null : sQLiteStatementPrepare.getText(i75));
                            if (tradabilityFromServerValue3 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i76 = columnIndexOrThrow58;
                            if (sQLiteStatementPrepare.isNull(i76)) {
                                columnIndexOrThrow57 = i75;
                                text8 = null;
                            } else {
                                columnIndexOrThrow57 = i75;
                                text8 = sQLiteStatementPrepare.getText(i76);
                            }
                            columnIndexOrThrow55 = i73;
                            UUID uuidStringToUuid6 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text8);
                            if (uuidStringToUuid6 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                            int i77 = columnIndexOrThrow59;
                            LocalDate localDateStringToLocalDate = comboOrderDao_Impl.__commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(i77) ? null : sQLiteStatementPrepare.getText(i77));
                            int i78 = columnIndexOrThrow60;
                            columnIndexOrThrow59 = i77;
                            BigDecimal bigDecimalStringToBigDecimal22 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i78) ? null : sQLiteStatementPrepare.getText(i78));
                            if (bigDecimalStringToBigDecimal22 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i79 = columnIndexOrThrow61;
                            columnIndexOrThrow61 = i79;
                            BigDecimal bigDecimalStringToBigDecimal23 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i79) ? null : sQLiteStatementPrepare.getText(i79));
                            if (bigDecimalStringToBigDecimal23 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i80 = columnIndexOrThrow62;
                            BigDecimal bigDecimalStringToBigDecimal24 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i80) ? null : sQLiteStatementPrepare.getText(i80));
                            int i81 = columnIndexOrThrow63;
                            String text22 = sQLiteStatementPrepare.getText(i81);
                            int i82 = columnIndexOrThrow64;
                            String text23 = sQLiteStatementPrepare.getText(i82);
                            columnIndexOrThrow63 = i81;
                            int i83 = columnIndexOrThrow65;
                            if (sQLiteStatementPrepare.isNull(i83)) {
                                columnIndexOrThrow65 = i83;
                                text9 = null;
                            } else {
                                columnIndexOrThrow65 = i83;
                                text9 = sQLiteStatementPrepare.getText(i83);
                            }
                            columnIndexOrThrow62 = i80;
                            Instant instantStringToInstant4 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(text9);
                            if (instantStringToInstant4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                            }
                            int i84 = columnIndexOrThrow66;
                            String text24 = sQLiteStatementPrepare.isNull(i84) ? null : sQLiteStatementPrepare.getText(i84);
                            int i85 = columnIndexOrThrow67;
                            String text25 = sQLiteStatementPrepare.getText(i85);
                            int i86 = columnIndexOrThrow68;
                            String text26 = sQLiteStatementPrepare.getText(i86);
                            columnIndexOrThrow66 = i84;
                            int i87 = columnIndexOrThrow69;
                            if (sQLiteStatementPrepare.isNull(i87)) {
                                columnIndexOrThrow69 = i87;
                                text10 = null;
                            } else {
                                columnIndexOrThrow69 = i87;
                                text10 = sQLiteStatementPrepare.getText(i87);
                            }
                            columnIndexOrThrow67 = i85;
                            UUID uuidStringToUuid7 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text10);
                            int i88 = columnIndexOrThrow70;
                            String text27 = sQLiteStatementPrepare.getText(i88);
                            columnIndexOrThrow60 = i78;
                            columnIndexOrThrow58 = i76;
                            int i89 = columnIndexOrThrow71;
                            int i90 = (int) sQLiteStatementPrepare.getLong(i89);
                            int i91 = columnIndexOrThrow72;
                            if (sQLiteStatementPrepare.isNull(i91)) {
                                columnIndexOrThrow70 = i88;
                                text11 = null;
                            } else {
                                columnIndexOrThrow70 = i88;
                                text11 = sQLiteStatementPrepare.getText(i91);
                            }
                            Tradability tradabilityFromServerValue4 = companion3.fromServerValue(text11);
                            if (tradabilityFromServerValue4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            Instrument instrument = new Instrument(tradabilityFromServerValue, z5, bigDecimalStringToBigDecimal20, bigDecimalStringToBigDecimal21, tradabilityFromServerValue3, tradabilityFromServerValue2, uuidStringToUuid6, null, null, null, localDateStringToLocalDate, bigDecimalStringToBigDecimal22, bigDecimalStringToBigDecimal23, bigDecimalStringToBigDecimal24, text22, text23, instantStringToInstant4, text24, text25, text26, uuidStringToUuid7, text27, i90, tradabilityFromServerValue4, null, null);
                            Object value = MapsKt.getValue(arrayMap, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            String str3 = str2;
                            Intrinsics.checkNotNullExpressionValue(value, str3);
                            List list = (List) value;
                            Object value2 = MapsKt.getValue(arrayMap2, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            Intrinsics.checkNotNullExpressionValue(value2, str3);
                            arrayList.add(new UiComboOrder(comboOrder, optionChain, instrument, list, (List) value2));
                            columnIndexOrThrow15 = i35;
                            columnIndexOrThrow71 = i89;
                            columnIndexOrThrow68 = i86;
                            str2 = str3;
                            columnIndexOrThrow72 = i91;
                            columnIndexOrThrow64 = i82;
                            columnIndexOrThrow17 = i37;
                            columnIndexOrThrow5 = i28;
                            columnIndexOrThrow2 = i23;
                            columnIndexOrThrow3 = i24;
                            columnIndexOrThrow4 = i25;
                            i22 = i4;
                            columnIndexOrThrow6 = i30;
                            columnIndexOrThrow7 = i32;
                            columnIndexOrThrow8 = i34;
                            columnIndexOrThrow33 = i53;
                            columnIndexOrThrow14 = i33;
                        } else {
                            columnIndexOrThrow46 = i6;
                            columnIndexOrThrow44 = i69;
                            columnIndexOrThrow45 = i5;
                            columnIndexOrThrow38 = i58;
                            tickRequirements = null;
                            OptionChain optionChain2 = new OptionChain(z3, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z4, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i702 = columnIndexOrThrow52;
                            if (!sQLiteStatementPrepare.isNull(i702)) {
                            }
                            Tradability.Companion companion32 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion32.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                            }
                        }
                    } else {
                        columnIndexOrThrow51 = i68;
                    }
                } else {
                    columnIndexOrThrow51 = i68;
                    i5 = columnIndexOrThrow45;
                }
                i6 = columnIndexOrThrow46;
                if (sQLiteStatementPrepare.isNull(i69)) {
                }
                columnIndexOrThrow38 = i58;
                bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                if (bigDecimalStringToBigDecimal != null) {
                }
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    public Flow<List<UiComboOrder>> getLater(final Set<? extends OrderState> states, final UUID instrumentId, final Instant since, final Instant before, final Instant createdAt, final UUID id, final int limit, final boolean isFilteringByAccountNumber, final Set<String> accountNumbers) {
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(since, "since");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        WITH result AS (");
        sb.append("\n");
        sb.append("            SELECT *");
        sb.append("\n");
        sb.append("            FROM UiComboOrder");
        sb.append("\n");
        sb.append("            WHERE derivedState IN (");
        final int size = states.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(")");
        sb.append("\n");
        sb.append("            AND (");
        sb.append("\n");
        sb.append("                ");
        sb.append("?");
        sb.append(" IS NULL ");
        sb.append("\n");
        sb.append("                OR equityInstrumentId = ");
        sb.append("?");
        sb.append("\n");
        sb.append("            )");
        sb.append("\n");
        sb.append("            AND createdAt >= ");
        sb.append("?");
        sb.append("\n");
        sb.append("            AND (");
        sb.append("?");
        sb.append(" IS NULL OR createdAt < ");
        sb.append("?");
        sb.append(")");
        sb.append("\n");
        sb.append("            AND (createdAt > ");
        sb.append("?");
        sb.append(" OR (createdAt = ");
        sb.append("?");
        sb.append(" AND id > ");
        sb.append("?");
        sb.append("))");
        sb.append("\n");
        sb.append("            AND (NOT ");
        sb.append("?");
        sb.append(" OR accountNumber in (");
        final int size2 = accountNumbers.size();
        StringUtil.appendPlaceholders(sb, size2);
        sb.append("))");
        sb.append("\n");
        sb.append("            ORDER BY createdAt ASC, id ASC");
        sb.append("\n");
        sb.append("            LIMIT ");
        sb.append("?");
        sb.append("\n");
        sb.append("        )");
        sb.append("\n");
        sb.append("        SELECT *");
        sb.append("\n");
        sb.append("        FROM result");
        sb.append("\n");
        sb.append("        ORDER BY createdAt DESC, id DESC");
        sb.append("\n");
        sb.append("        ");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return FlowBuilder.createFlow(this.__db, true, new String[]{"ComboOrderExecution", "OptionInstrument", "Instrument", "ComboOrderLeg", "ComboOrderSalesTax", "UiComboOrder"}, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.getLater$lambda$17(string2, states, size, this, instrumentId, since, before, createdAt, id, isFilteringByAccountNumber, accountNumbers, size2, limit, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x082b A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0017, B:4:0x001c, B:6:0x0022, B:8:0x0030, B:12:0x003a, B:11:0x0037, B:13:0x003d, B:15:0x0049, B:17:0x0050, B:19:0x005c, B:21:0x0063, B:23:0x0071, B:25:0x0078, B:27:0x0084, B:29:0x008b, B:31:0x0097, B:33:0x009e, B:35:0x00aa, B:37:0x00b1, B:39:0x00bd, B:41:0x00c4, B:43:0x00d2, B:45:0x00d9, B:46:0x00e8, B:48:0x00ee, B:49:0x00fa, B:50:0x0338, B:52:0x033e, B:54:0x034a, B:56:0x0357, B:58:0x0361, B:60:0x036e, B:61:0x0380, B:63:0x0386, B:67:0x0392, B:70:0x039e, B:75:0x03b1, B:78:0x03bd, B:82:0x03cc, B:87:0x03db, B:89:0x03e5, B:93:0x03f1, B:95:0x03fb, B:99:0x040b, B:104:0x0420, B:109:0x0439, B:113:0x0447, B:118:0x045c, B:120:0x0464, B:125:0x0475, B:129:0x0483, B:134:0x0498, B:139:0x04b3, B:144:0x04c4, B:146:0x04ce, B:150:0x04dc, B:152:0x04e2, B:156:0x04f6, B:161:0x0511, B:163:0x051b, B:168:0x052c, B:173:0x0545, B:178:0x055e, B:180:0x0568, B:185:0x0579, B:187:0x0583, B:192:0x0594, B:194:0x059e, B:199:0x05af, B:201:0x05b9, B:206:0x05ca, B:210:0x05e0, B:215:0x05f5, B:217:0x05fd, B:222:0x060e, B:224:0x0616, B:229:0x0627, B:231:0x062f, B:236:0x0640, B:238:0x064a, B:243:0x065b, B:247:0x0671, B:249:0x0677, B:254:0x068e, B:256:0x0698, B:260:0x06a6, B:262:0x06ac, B:266:0x06ba, B:268:0x06c2, B:273:0x06d3, B:275:0x06dd, B:280:0x0701, B:285:0x0710, B:290:0x0729, B:292:0x0733, B:297:0x0744, B:299:0x074c, B:304:0x075d, B:306:0x0767, B:311:0x0778, B:313:0x0780, B:318:0x0791, B:320:0x079b, B:325:0x07ae, B:330:0x07c9, B:332:0x07d3, B:337:0x07f0, B:339:0x07f6, B:341:0x07fe, B:348:0x081f, B:353:0x0834, B:355:0x083e, B:360:0x084d, B:362:0x0857, B:367:0x0866, B:369:0x0870, B:370:0x0877, B:374:0x088e, B:378:0x089a, B:382:0x08ac, B:384:0x08b2, B:389:0x08c7, B:394:0x08d6, B:396:0x08e0, B:401:0x08f1, B:403:0x08fb, B:407:0x0909, B:409:0x090f, B:414:0x0926, B:416:0x0930, B:420:0x093e, B:425:0x0957, B:427:0x0961, B:432:0x0972, B:434:0x097c, B:438:0x098a, B:443:0x09b7, B:445:0x09c1, B:450:0x09d5, B:455:0x09f8, B:459:0x0a25, B:461:0x0a2b, B:462:0x0a8c, B:463:0x0a91, B:458:0x0a1d, B:454:0x09ef, B:449:0x09ce, B:464:0x0a92, B:465:0x0a97, B:442:0x09ae, B:437:0x0986, B:466:0x0a98, B:467:0x0a9d, B:431:0x096d, B:468:0x0a9e, B:469:0x0aa3, B:424:0x0952, B:419:0x093a, B:470:0x0aa4, B:471:0x0aa9, B:413:0x091d, B:472:0x0aaa, B:473:0x0aaf, B:406:0x0905, B:474:0x0ab0, B:475:0x0ab5, B:400:0x08ec, B:476:0x0ab6, B:477:0x0abb, B:393:0x08d1, B:478:0x0abc, B:479:0x0ac1, B:381:0x08a4, B:480:0x0ac2, B:481:0x0ac7, B:373:0x088a, B:482:0x0ac8, B:483:0x0acd, B:366:0x0861, B:484:0x0ace, B:485:0x0ad3, B:359:0x0848, B:486:0x0ad4, B:487:0x0ad9, B:352:0x082b, B:336:0x07e2, B:488:0x0ada, B:489:0x0adf, B:329:0x07c0, B:490:0x0ae0, B:491:0x0ae5, B:317:0x078c, B:492:0x0ae6, B:493:0x0aed, B:310:0x0773, B:494:0x0aee, B:495:0x0af3, B:303:0x0758, B:496:0x0af4, B:497:0x0afb, B:296:0x073f, B:498:0x0afc, B:499:0x0b03, B:289:0x0724, B:284:0x070b, B:500:0x0b04, B:501:0x0b09, B:272:0x06ce, B:502:0x0b0a, B:503:0x0b11, B:265:0x06b6, B:504:0x0b12, B:505:0x0b17, B:259:0x06a2, B:506:0x0b18, B:507:0x0b1d, B:253:0x0685, B:508:0x0b1e, B:509:0x0b23, B:246:0x066d, B:242:0x0656, B:510:0x0b24, B:511:0x0b29, B:235:0x063b, B:512:0x0b2a, B:513:0x0b31, B:228:0x0622, B:514:0x0b32, B:515:0x0b39, B:221:0x0609, B:516:0x0b3a, B:517:0x0b41, B:214:0x05f0, B:209:0x05dc, B:205:0x05c5, B:518:0x0b42, B:519:0x0b47, B:198:0x05aa, B:520:0x0b48, B:521:0x0b4d, B:191:0x058f, B:522:0x0b4e, B:523:0x0b53, B:184:0x0574, B:524:0x0b54, B:525:0x0b59, B:177:0x0559, B:172:0x0540, B:167:0x0527, B:526:0x0b5a, B:527:0x0b5f, B:160:0x0508, B:155:0x04ee, B:528:0x0b60, B:529:0x0b65, B:149:0x04d8, B:530:0x0b66, B:531:0x0b6b, B:143:0x04bd, B:133:0x048f, B:532:0x0b6c, B:533:0x0b71, B:124:0x0470, B:534:0x0b72, B:535:0x0b79, B:117:0x0453, B:536:0x0b7a, B:537:0x0b7f, B:108:0x0434, B:103:0x041b, B:98:0x0407, B:538:0x0b80, B:539:0x0b85, B:92:0x03ed, B:540:0x0b86, B:541:0x0b8b, B:86:0x03d6, B:81:0x03c6, B:542:0x0b8c, B:543:0x0b91, B:74:0x03ac, B:544:0x0b92, B:545:0x0b97, B:66:0x038e, B:44:0x00d6, B:40:0x00c1, B:36:0x00ae, B:32:0x009b, B:28:0x0088, B:24:0x0075, B:20:0x0060, B:16:0x004d), top: B:550:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x083e A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0017, B:4:0x001c, B:6:0x0022, B:8:0x0030, B:12:0x003a, B:11:0x0037, B:13:0x003d, B:15:0x0049, B:17:0x0050, B:19:0x005c, B:21:0x0063, B:23:0x0071, B:25:0x0078, B:27:0x0084, B:29:0x008b, B:31:0x0097, B:33:0x009e, B:35:0x00aa, B:37:0x00b1, B:39:0x00bd, B:41:0x00c4, B:43:0x00d2, B:45:0x00d9, B:46:0x00e8, B:48:0x00ee, B:49:0x00fa, B:50:0x0338, B:52:0x033e, B:54:0x034a, B:56:0x0357, B:58:0x0361, B:60:0x036e, B:61:0x0380, B:63:0x0386, B:67:0x0392, B:70:0x039e, B:75:0x03b1, B:78:0x03bd, B:82:0x03cc, B:87:0x03db, B:89:0x03e5, B:93:0x03f1, B:95:0x03fb, B:99:0x040b, B:104:0x0420, B:109:0x0439, B:113:0x0447, B:118:0x045c, B:120:0x0464, B:125:0x0475, B:129:0x0483, B:134:0x0498, B:139:0x04b3, B:144:0x04c4, B:146:0x04ce, B:150:0x04dc, B:152:0x04e2, B:156:0x04f6, B:161:0x0511, B:163:0x051b, B:168:0x052c, B:173:0x0545, B:178:0x055e, B:180:0x0568, B:185:0x0579, B:187:0x0583, B:192:0x0594, B:194:0x059e, B:199:0x05af, B:201:0x05b9, B:206:0x05ca, B:210:0x05e0, B:215:0x05f5, B:217:0x05fd, B:222:0x060e, B:224:0x0616, B:229:0x0627, B:231:0x062f, B:236:0x0640, B:238:0x064a, B:243:0x065b, B:247:0x0671, B:249:0x0677, B:254:0x068e, B:256:0x0698, B:260:0x06a6, B:262:0x06ac, B:266:0x06ba, B:268:0x06c2, B:273:0x06d3, B:275:0x06dd, B:280:0x0701, B:285:0x0710, B:290:0x0729, B:292:0x0733, B:297:0x0744, B:299:0x074c, B:304:0x075d, B:306:0x0767, B:311:0x0778, B:313:0x0780, B:318:0x0791, B:320:0x079b, B:325:0x07ae, B:330:0x07c9, B:332:0x07d3, B:337:0x07f0, B:339:0x07f6, B:341:0x07fe, B:348:0x081f, B:353:0x0834, B:355:0x083e, B:360:0x084d, B:362:0x0857, B:367:0x0866, B:369:0x0870, B:370:0x0877, B:374:0x088e, B:378:0x089a, B:382:0x08ac, B:384:0x08b2, B:389:0x08c7, B:394:0x08d6, B:396:0x08e0, B:401:0x08f1, B:403:0x08fb, B:407:0x0909, B:409:0x090f, B:414:0x0926, B:416:0x0930, B:420:0x093e, B:425:0x0957, B:427:0x0961, B:432:0x0972, B:434:0x097c, B:438:0x098a, B:443:0x09b7, B:445:0x09c1, B:450:0x09d5, B:455:0x09f8, B:459:0x0a25, B:461:0x0a2b, B:462:0x0a8c, B:463:0x0a91, B:458:0x0a1d, B:454:0x09ef, B:449:0x09ce, B:464:0x0a92, B:465:0x0a97, B:442:0x09ae, B:437:0x0986, B:466:0x0a98, B:467:0x0a9d, B:431:0x096d, B:468:0x0a9e, B:469:0x0aa3, B:424:0x0952, B:419:0x093a, B:470:0x0aa4, B:471:0x0aa9, B:413:0x091d, B:472:0x0aaa, B:473:0x0aaf, B:406:0x0905, B:474:0x0ab0, B:475:0x0ab5, B:400:0x08ec, B:476:0x0ab6, B:477:0x0abb, B:393:0x08d1, B:478:0x0abc, B:479:0x0ac1, B:381:0x08a4, B:480:0x0ac2, B:481:0x0ac7, B:373:0x088a, B:482:0x0ac8, B:483:0x0acd, B:366:0x0861, B:484:0x0ace, B:485:0x0ad3, B:359:0x0848, B:486:0x0ad4, B:487:0x0ad9, B:352:0x082b, B:336:0x07e2, B:488:0x0ada, B:489:0x0adf, B:329:0x07c0, B:490:0x0ae0, B:491:0x0ae5, B:317:0x078c, B:492:0x0ae6, B:493:0x0aed, B:310:0x0773, B:494:0x0aee, B:495:0x0af3, B:303:0x0758, B:496:0x0af4, B:497:0x0afb, B:296:0x073f, B:498:0x0afc, B:499:0x0b03, B:289:0x0724, B:284:0x070b, B:500:0x0b04, B:501:0x0b09, B:272:0x06ce, B:502:0x0b0a, B:503:0x0b11, B:265:0x06b6, B:504:0x0b12, B:505:0x0b17, B:259:0x06a2, B:506:0x0b18, B:507:0x0b1d, B:253:0x0685, B:508:0x0b1e, B:509:0x0b23, B:246:0x066d, B:242:0x0656, B:510:0x0b24, B:511:0x0b29, B:235:0x063b, B:512:0x0b2a, B:513:0x0b31, B:228:0x0622, B:514:0x0b32, B:515:0x0b39, B:221:0x0609, B:516:0x0b3a, B:517:0x0b41, B:214:0x05f0, B:209:0x05dc, B:205:0x05c5, B:518:0x0b42, B:519:0x0b47, B:198:0x05aa, B:520:0x0b48, B:521:0x0b4d, B:191:0x058f, B:522:0x0b4e, B:523:0x0b53, B:184:0x0574, B:524:0x0b54, B:525:0x0b59, B:177:0x0559, B:172:0x0540, B:167:0x0527, B:526:0x0b5a, B:527:0x0b5f, B:160:0x0508, B:155:0x04ee, B:528:0x0b60, B:529:0x0b65, B:149:0x04d8, B:530:0x0b66, B:531:0x0b6b, B:143:0x04bd, B:133:0x048f, B:532:0x0b6c, B:533:0x0b71, B:124:0x0470, B:534:0x0b72, B:535:0x0b79, B:117:0x0453, B:536:0x0b7a, B:537:0x0b7f, B:108:0x0434, B:103:0x041b, B:98:0x0407, B:538:0x0b80, B:539:0x0b85, B:92:0x03ed, B:540:0x0b86, B:541:0x0b8b, B:86:0x03d6, B:81:0x03c6, B:542:0x0b8c, B:543:0x0b91, B:74:0x03ac, B:544:0x0b92, B:545:0x0b97, B:66:0x038e, B:44:0x00d6, B:40:0x00c1, B:36:0x00ae, B:32:0x009b, B:28:0x0088, B:24:0x0075, B:20:0x0060, B:16:0x004d), top: B:550:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x088a A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0017, B:4:0x001c, B:6:0x0022, B:8:0x0030, B:12:0x003a, B:11:0x0037, B:13:0x003d, B:15:0x0049, B:17:0x0050, B:19:0x005c, B:21:0x0063, B:23:0x0071, B:25:0x0078, B:27:0x0084, B:29:0x008b, B:31:0x0097, B:33:0x009e, B:35:0x00aa, B:37:0x00b1, B:39:0x00bd, B:41:0x00c4, B:43:0x00d2, B:45:0x00d9, B:46:0x00e8, B:48:0x00ee, B:49:0x00fa, B:50:0x0338, B:52:0x033e, B:54:0x034a, B:56:0x0357, B:58:0x0361, B:60:0x036e, B:61:0x0380, B:63:0x0386, B:67:0x0392, B:70:0x039e, B:75:0x03b1, B:78:0x03bd, B:82:0x03cc, B:87:0x03db, B:89:0x03e5, B:93:0x03f1, B:95:0x03fb, B:99:0x040b, B:104:0x0420, B:109:0x0439, B:113:0x0447, B:118:0x045c, B:120:0x0464, B:125:0x0475, B:129:0x0483, B:134:0x0498, B:139:0x04b3, B:144:0x04c4, B:146:0x04ce, B:150:0x04dc, B:152:0x04e2, B:156:0x04f6, B:161:0x0511, B:163:0x051b, B:168:0x052c, B:173:0x0545, B:178:0x055e, B:180:0x0568, B:185:0x0579, B:187:0x0583, B:192:0x0594, B:194:0x059e, B:199:0x05af, B:201:0x05b9, B:206:0x05ca, B:210:0x05e0, B:215:0x05f5, B:217:0x05fd, B:222:0x060e, B:224:0x0616, B:229:0x0627, B:231:0x062f, B:236:0x0640, B:238:0x064a, B:243:0x065b, B:247:0x0671, B:249:0x0677, B:254:0x068e, B:256:0x0698, B:260:0x06a6, B:262:0x06ac, B:266:0x06ba, B:268:0x06c2, B:273:0x06d3, B:275:0x06dd, B:280:0x0701, B:285:0x0710, B:290:0x0729, B:292:0x0733, B:297:0x0744, B:299:0x074c, B:304:0x075d, B:306:0x0767, B:311:0x0778, B:313:0x0780, B:318:0x0791, B:320:0x079b, B:325:0x07ae, B:330:0x07c9, B:332:0x07d3, B:337:0x07f0, B:339:0x07f6, B:341:0x07fe, B:348:0x081f, B:353:0x0834, B:355:0x083e, B:360:0x084d, B:362:0x0857, B:367:0x0866, B:369:0x0870, B:370:0x0877, B:374:0x088e, B:378:0x089a, B:382:0x08ac, B:384:0x08b2, B:389:0x08c7, B:394:0x08d6, B:396:0x08e0, B:401:0x08f1, B:403:0x08fb, B:407:0x0909, B:409:0x090f, B:414:0x0926, B:416:0x0930, B:420:0x093e, B:425:0x0957, B:427:0x0961, B:432:0x0972, B:434:0x097c, B:438:0x098a, B:443:0x09b7, B:445:0x09c1, B:450:0x09d5, B:455:0x09f8, B:459:0x0a25, B:461:0x0a2b, B:462:0x0a8c, B:463:0x0a91, B:458:0x0a1d, B:454:0x09ef, B:449:0x09ce, B:464:0x0a92, B:465:0x0a97, B:442:0x09ae, B:437:0x0986, B:466:0x0a98, B:467:0x0a9d, B:431:0x096d, B:468:0x0a9e, B:469:0x0aa3, B:424:0x0952, B:419:0x093a, B:470:0x0aa4, B:471:0x0aa9, B:413:0x091d, B:472:0x0aaa, B:473:0x0aaf, B:406:0x0905, B:474:0x0ab0, B:475:0x0ab5, B:400:0x08ec, B:476:0x0ab6, B:477:0x0abb, B:393:0x08d1, B:478:0x0abc, B:479:0x0ac1, B:381:0x08a4, B:480:0x0ac2, B:481:0x0ac7, B:373:0x088a, B:482:0x0ac8, B:483:0x0acd, B:366:0x0861, B:484:0x0ace, B:485:0x0ad3, B:359:0x0848, B:486:0x0ad4, B:487:0x0ad9, B:352:0x082b, B:336:0x07e2, B:488:0x0ada, B:489:0x0adf, B:329:0x07c0, B:490:0x0ae0, B:491:0x0ae5, B:317:0x078c, B:492:0x0ae6, B:493:0x0aed, B:310:0x0773, B:494:0x0aee, B:495:0x0af3, B:303:0x0758, B:496:0x0af4, B:497:0x0afb, B:296:0x073f, B:498:0x0afc, B:499:0x0b03, B:289:0x0724, B:284:0x070b, B:500:0x0b04, B:501:0x0b09, B:272:0x06ce, B:502:0x0b0a, B:503:0x0b11, B:265:0x06b6, B:504:0x0b12, B:505:0x0b17, B:259:0x06a2, B:506:0x0b18, B:507:0x0b1d, B:253:0x0685, B:508:0x0b1e, B:509:0x0b23, B:246:0x066d, B:242:0x0656, B:510:0x0b24, B:511:0x0b29, B:235:0x063b, B:512:0x0b2a, B:513:0x0b31, B:228:0x0622, B:514:0x0b32, B:515:0x0b39, B:221:0x0609, B:516:0x0b3a, B:517:0x0b41, B:214:0x05f0, B:209:0x05dc, B:205:0x05c5, B:518:0x0b42, B:519:0x0b47, B:198:0x05aa, B:520:0x0b48, B:521:0x0b4d, B:191:0x058f, B:522:0x0b4e, B:523:0x0b53, B:184:0x0574, B:524:0x0b54, B:525:0x0b59, B:177:0x0559, B:172:0x0540, B:167:0x0527, B:526:0x0b5a, B:527:0x0b5f, B:160:0x0508, B:155:0x04ee, B:528:0x0b60, B:529:0x0b65, B:149:0x04d8, B:530:0x0b66, B:531:0x0b6b, B:143:0x04bd, B:133:0x048f, B:532:0x0b6c, B:533:0x0b71, B:124:0x0470, B:534:0x0b72, B:535:0x0b79, B:117:0x0453, B:536:0x0b7a, B:537:0x0b7f, B:108:0x0434, B:103:0x041b, B:98:0x0407, B:538:0x0b80, B:539:0x0b85, B:92:0x03ed, B:540:0x0b86, B:541:0x0b8b, B:86:0x03d6, B:81:0x03c6, B:542:0x0b8c, B:543:0x0b91, B:74:0x03ac, B:544:0x0b92, B:545:0x0b97, B:66:0x038e, B:44:0x00d6, B:40:0x00c1, B:36:0x00ae, B:32:0x009b, B:28:0x0088, B:24:0x0075, B:20:0x0060, B:16:0x004d), top: B:550:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0ad4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0ac2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List getLater$lambda$17(String str, Set set, int i, ComboOrderDao_Impl comboOrderDao_Impl, UUID uuid, Instant instant, Instant instant2, Instant instant3, UUID uuid2, boolean z, Set set2, int i2, int i3, SQLiteConnection _connection) {
        int i4;
        String text;
        String text2;
        String text3;
        String text4;
        String text5;
        String text6;
        Integer numValueOf;
        int i5;
        int i6;
        OptionChain.TickRequirements tickRequirements;
        Tradability tradabilityFromServerValue;
        String text7;
        String text8;
        String text9;
        String text10;
        String text11;
        String text12;
        BigDecimal bigDecimalStringToBigDecimal;
        int i7;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = set.iterator();
            int i8 = 1;
            while (it.hasNext()) {
                String serverValue = OrderState.INSTANCE.toServerValue((OrderState) it.next());
                if (serverValue == null) {
                    sQLiteStatementPrepare.bindNull(i8);
                } else {
                    sQLiteStatementPrepare.bindText(i8, serverValue);
                }
                i8++;
            }
            int i9 = i + 1;
            String strUuidToString = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(i9);
            } else {
                sQLiteStatementPrepare.bindText(i9, strUuidToString);
            }
            int i10 = i + 2;
            String strUuidToString2 = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString2 == null) {
                sQLiteStatementPrepare.bindNull(i10);
            } else {
                sQLiteStatementPrepare.bindText(i10, strUuidToString2);
            }
            int i11 = i + 3;
            String strInstantToString = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant);
            if (strInstantToString == null) {
                sQLiteStatementPrepare.bindNull(i11);
            } else {
                sQLiteStatementPrepare.bindText(i11, strInstantToString);
            }
            int i12 = i + 4;
            String strInstantToString2 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant2);
            if (strInstantToString2 == null) {
                sQLiteStatementPrepare.bindNull(i12);
            } else {
                sQLiteStatementPrepare.bindText(i12, strInstantToString2);
            }
            int i13 = i + 5;
            String strInstantToString3 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant2);
            if (strInstantToString3 == null) {
                sQLiteStatementPrepare.bindNull(i13);
            } else {
                sQLiteStatementPrepare.bindText(i13, strInstantToString3);
            }
            int i14 = i + 6;
            String strInstantToString4 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant3);
            if (strInstantToString4 == null) {
                sQLiteStatementPrepare.bindNull(i14);
            } else {
                sQLiteStatementPrepare.bindText(i14, strInstantToString4);
            }
            int i15 = i + 7;
            String strInstantToString5 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant3);
            if (strInstantToString5 == null) {
                sQLiteStatementPrepare.bindNull(i15);
            } else {
                sQLiteStatementPrepare.bindText(i15, strInstantToString5);
            }
            int i16 = i + 8;
            String strUuidToString3 = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid2);
            if (strUuidToString3 == null) {
                sQLiteStatementPrepare.bindNull(i16);
            } else {
                sQLiteStatementPrepare.bindText(i16, strUuidToString3);
            }
            sQLiteStatementPrepare.bindLong(i + 9, z ? 1L : 0L);
            int i17 = i + 10;
            Iterator it2 = set2.iterator();
            int i18 = i17;
            while (it2.hasNext()) {
                sQLiteStatementPrepare.bindText(i18, (String) it2.next());
                i18++;
            }
            sQLiteStatementPrepare.bindLong(i17 + i2, i3);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "averageNetPremiumPaid");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancelUrl");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canceledQuantity");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSymbol");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closingStrategy");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contractFees");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivedState");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "direction");
            String str2 = "getValue(...)";
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "goldSavings");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isReplaceable");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmount");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "netAmountDirection");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openingStrategy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pendingQuantity");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "premium");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, AnalyticsStrings.TAG_SORT_ORDER_PRICE);
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremium");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedQuantity");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "regulatoryFees");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stopPrice");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "strategy");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInForce");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedAt");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "refId");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "processedPremiumDirection");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmount");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "estimatedTotalNetAmountDirection");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "formSource");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equityInstrumentId");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "underlyingSymbol");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_canOpenPosition");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_cashComponent");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_expirationDates");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_extendedHoursState");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_lateCloseState");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickAboveCutoff");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_tickBelowCutoff");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_minTicks_cutoffPrice");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_receivedAt");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_settleOnOpen");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_symbol");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_tradeValueMultiplier");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_selloutTimeToExpiration");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_affiliateTradability");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_allDayTradability");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_carRequired");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_dayTradeRatio");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_defaultPresetPercentLimit");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_fractionalTradability");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_id");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_listDate");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_maintenanceRatio");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_marginInitialRatio");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_minTickSize");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_name");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_otcMarketTier");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_receivedAt");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_simpleName");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_state");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_symbol");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_tradableChainId");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_type");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_notionalEstimatedQuantityDecimals");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "equity_instrument_shortSaleTradability");
            ArrayMap<String, List<UiComboOrderLeg>> arrayMap = new ArrayMap<>();
            int i19 = columnIndexOrThrow12;
            ArrayMap<String, List<ComboOrderSalesTax>> arrayMap2 = new ArrayMap<>();
            while (sQLiteStatementPrepare.step()) {
                int i20 = columnIndexOrThrow11;
                String text13 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (arrayMap.containsKey(text13)) {
                    i7 = columnIndexOrThrow10;
                } else {
                    i7 = columnIndexOrThrow10;
                    arrayMap.put(text13, new ArrayList());
                }
                String text14 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!arrayMap2.containsKey(text14)) {
                    arrayMap2.put(text14, new ArrayList());
                }
                columnIndexOrThrow11 = i20;
                columnIndexOrThrow10 = i7;
            }
            int i21 = columnIndexOrThrow10;
            int i22 = columnIndexOrThrow11;
            sQLiteStatementPrepare.reset();
            comboOrderDao_Impl.m2217x4e5ab2fa(_connection, arrayMap);
            comboOrderDao_Impl.m2219x367d9594(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                UUID uuidStringToUuid = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                if (uuidStringToUuid == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text15 = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                int i23 = columnIndexOrThrow2;
                BigDecimal bigDecimalStringToBigDecimal2 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (bigDecimalStringToBigDecimal2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                int i24 = columnIndexOrThrow3;
                BigDecimal bigDecimalStringToBigDecimal3 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (bigDecimalStringToBigDecimal3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                UUID uuidStringToUuid2 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (uuidStringToUuid2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                String text17 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                OptionStrategyType.Companion companion = OptionStrategyType.INSTANCE;
                OptionStrategyType optionStrategyTypeFromServerValue = companion.fromServerValue(text18);
                int i25 = columnIndexOrThrow4;
                BigDecimal bigDecimalStringToBigDecimal4 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                int i26 = i21;
                i21 = i26;
                Instant instantStringToInstant = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i26) ? null : sQLiteStatementPrepare.getText(i26));
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i27 = i22;
                if (sQLiteStatementPrepare.isNull(i27)) {
                    i4 = i27;
                    text = null;
                } else {
                    i4 = i27;
                    text = sQLiteStatementPrepare.getText(i27);
                }
                int i28 = columnIndexOrThrow5;
                OrderState orderStateFromServerValue = OrderState.INSTANCE.fromServerValue(text);
                if (orderStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.shared.models.history.shared.OrderState', but it was NULL.");
                }
                int i29 = i19;
                String text19 = sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29);
                i19 = i29;
                OrderDirection.Companion companion2 = OrderDirection.INSTANCE;
                OrderDirection orderDirectionFromServerValue = companion2.fromServerValue(text19);
                if (orderDirectionFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i30 = columnIndexOrThrow6;
                int i31 = columnIndexOrThrow13;
                if (sQLiteStatementPrepare.isNull(i31)) {
                    columnIndexOrThrow13 = i31;
                    text2 = null;
                } else {
                    columnIndexOrThrow13 = i31;
                    text2 = sQLiteStatementPrepare.getText(i31);
                }
                int i32 = columnIndexOrThrow7;
                BigDecimal bigDecimalStringToBigDecimal5 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text2);
                int i33 = columnIndexOrThrow14;
                int i34 = columnIndexOrThrow8;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i33)) != 0;
                int i35 = columnIndexOrThrow15;
                BigDecimal bigDecimalStringToBigDecimal6 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i35) ? null : sQLiteStatementPrepare.getText(i35));
                if (bigDecimalStringToBigDecimal6 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i36 = columnIndexOrThrow16;
                OrderDirection orderDirectionFromServerValue2 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i36) ? null : sQLiteStatementPrepare.getText(i36));
                if (orderDirectionFromServerValue2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i37 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i37)) {
                    columnIndexOrThrow16 = i36;
                    text3 = null;
                } else {
                    columnIndexOrThrow16 = i36;
                    text3 = sQLiteStatementPrepare.getText(i37);
                }
                OptionStrategyType optionStrategyTypeFromServerValue2 = companion.fromServerValue(text3);
                int i38 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i38)) {
                    columnIndexOrThrow18 = i38;
                    text4 = null;
                } else {
                    columnIndexOrThrow18 = i38;
                    text4 = sQLiteStatementPrepare.getText(i38);
                }
                BigDecimal bigDecimalStringToBigDecimal7 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text4);
                if (bigDecimalStringToBigDecimal7 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i39 = columnIndexOrThrow19;
                columnIndexOrThrow19 = i39;
                BigDecimal bigDecimalStringToBigDecimal8 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i39) ? null : sQLiteStatementPrepare.getText(i39));
                int i40 = columnIndexOrThrow20;
                columnIndexOrThrow20 = i40;
                BigDecimal bigDecimalStringToBigDecimal9 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i40) ? null : sQLiteStatementPrepare.getText(i40));
                int i41 = columnIndexOrThrow21;
                columnIndexOrThrow21 = i41;
                BigDecimal bigDecimalStringToBigDecimal10 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i41) ? null : sQLiteStatementPrepare.getText(i41));
                if (bigDecimalStringToBigDecimal10 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i42 = columnIndexOrThrow22;
                columnIndexOrThrow22 = i42;
                BigDecimal bigDecimalStringToBigDecimal11 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i42) ? null : sQLiteStatementPrepare.getText(i42));
                if (bigDecimalStringToBigDecimal11 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i43 = columnIndexOrThrow23;
                columnIndexOrThrow23 = i43;
                BigDecimal bigDecimalStringToBigDecimal12 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                if (bigDecimalStringToBigDecimal12 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i44 = columnIndexOrThrow24;
                columnIndexOrThrow24 = i44;
                BigDecimal bigDecimalStringToBigDecimal13 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i44) ? null : sQLiteStatementPrepare.getText(i44));
                if (bigDecimalStringToBigDecimal13 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i45 = columnIndexOrThrow25;
                columnIndexOrThrow25 = i45;
                BigDecimal bigDecimalStringToBigDecimal14 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i45) ? null : sQLiteStatementPrepare.getText(i45));
                int i46 = columnIndexOrThrow26;
                OptionStrategyType optionStrategyTypeFromServerValue3 = companion.fromServerValue(sQLiteStatementPrepare.isNull(i46) ? null : sQLiteStatementPrepare.getText(i46));
                int i47 = columnIndexOrThrow27;
                columnIndexOrThrow26 = i46;
                OrderTimeInForce orderTimeInForceFromServerValue = OrderTimeInForce.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i47) ? null : sQLiteStatementPrepare.getText(i47));
                if (orderTimeInForceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTimeInForce', but it was NULL.");
                }
                int i48 = columnIndexOrThrow28;
                columnIndexOrThrow28 = i48;
                OrderTrigger orderTriggerFromServerValue = OrderTrigger.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i48) ? null : sQLiteStatementPrepare.getText(i48));
                if (orderTriggerFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderTrigger', but it was NULL.");
                }
                int i49 = columnIndexOrThrow29;
                columnIndexOrThrow29 = i49;
                OrderType orderTypeFromServerValue = OrderType.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i49) ? null : sQLiteStatementPrepare.getText(i49));
                if (orderTypeFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderType', but it was NULL.");
                }
                int i50 = columnIndexOrThrow30;
                columnIndexOrThrow30 = i50;
                Instant instantStringToInstant2 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i50) ? null : sQLiteStatementPrepare.getText(i50));
                if (instantStringToInstant2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                int i51 = columnIndexOrThrow31;
                columnIndexOrThrow31 = i51;
                UUID uuidStringToUuid3 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i51) ? null : sQLiteStatementPrepare.getText(i51));
                int i52 = columnIndexOrThrow32;
                OrderDirection orderDirectionFromServerValue3 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i52) ? null : sQLiteStatementPrepare.getText(i52));
                if (orderDirectionFromServerValue3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i53 = columnIndexOrThrow33;
                if (sQLiteStatementPrepare.isNull(i53)) {
                    columnIndexOrThrow32 = i52;
                    text5 = null;
                } else {
                    columnIndexOrThrow32 = i52;
                    text5 = sQLiteStatementPrepare.getText(i53);
                }
                columnIndexOrThrow27 = i47;
                BigDecimal bigDecimalStringToBigDecimal15 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text5);
                if (bigDecimalStringToBigDecimal15 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i54 = columnIndexOrThrow34;
                OrderDirection orderDirectionFromServerValue4 = companion2.fromServerValue(sQLiteStatementPrepare.isNull(i54) ? null : sQLiteStatementPrepare.getText(i54));
                if (orderDirectionFromServerValue4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderDirection', but it was NULL.");
                }
                int i55 = columnIndexOrThrow35;
                OptionOrder.FormSource formSourceFromServerValue = OptionOrder.FormSource.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i55) ? null : sQLiteStatementPrepare.getText(i55));
                if (formSourceFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionOrder.FormSource', but it was NULL.");
                }
                int i56 = columnIndexOrThrow36;
                columnIndexOrThrow35 = i55;
                UUID uuidStringToUuid4 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i56) ? null : sQLiteStatementPrepare.getText(i56));
                if (uuidStringToUuid4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i57 = columnIndexOrThrow37;
                ComboOrder comboOrder = new ComboOrder(uuidStringToUuid, text15, bigDecimalStringToBigDecimal2, text16, bigDecimalStringToBigDecimal3, uuidStringToUuid2, text17, optionStrategyTypeFromServerValue, bigDecimalStringToBigDecimal4, instantStringToInstant, orderStateFromServerValue, orderDirectionFromServerValue, bigDecimalStringToBigDecimal5, z2, bigDecimalStringToBigDecimal6, orderDirectionFromServerValue2, optionStrategyTypeFromServerValue2, bigDecimalStringToBigDecimal7, bigDecimalStringToBigDecimal8, bigDecimalStringToBigDecimal9, bigDecimalStringToBigDecimal10, bigDecimalStringToBigDecimal11, bigDecimalStringToBigDecimal12, bigDecimalStringToBigDecimal13, bigDecimalStringToBigDecimal14, optionStrategyTypeFromServerValue3, orderTimeInForceFromServerValue, orderTriggerFromServerValue, orderTypeFromServerValue, instantStringToInstant2, uuidStringToUuid3, orderDirectionFromServerValue3, bigDecimalStringToBigDecimal15, orderDirectionFromServerValue4, formSourceFromServerValue, uuidStringToUuid4, sQLiteStatementPrepare.getText(i57));
                columnIndexOrThrow36 = i56;
                columnIndexOrThrow34 = i54;
                int i58 = columnIndexOrThrow38;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i58)) != 0;
                int i59 = columnIndexOrThrow39;
                columnIndexOrThrow37 = i57;
                BigDecimal bigDecimalStringToBigDecimal16 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59));
                int i60 = columnIndexOrThrow40;
                columnIndexOrThrow40 = i60;
                ImmutableList<LocalDate> immutableListStringToLocalDateImmutableList = comboOrderDao_Impl.__modelRoomConverters().stringToLocalDateImmutableList(sQLiteStatementPrepare.isNull(i60) ? null : sQLiteStatementPrepare.getText(i60));
                if (immutableListStringToLocalDateImmutableList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlinx.collections.immutable.ImmutableList<java.time.LocalDate>', but it was NULL.");
                }
                int i61 = columnIndexOrThrow41;
                columnIndexOrThrow41 = i61;
                OptionChain.ExtendedHoursState extendedHoursStateFromServerValue = OptionChain.ExtendedHoursState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i61) ? null : sQLiteStatementPrepare.getText(i61));
                if (extendedHoursStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.ExtendedHoursState', but it was NULL.");
                }
                int i62 = columnIndexOrThrow42;
                columnIndexOrThrow42 = i62;
                UUID uuidStringToUuid5 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i62) ? null : sQLiteStatementPrepare.getText(i62));
                if (uuidStringToUuid5 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
                int i63 = columnIndexOrThrow43;
                columnIndexOrThrow43 = i63;
                OptionChain.LateCloseState lateCloseStateFromServerValue = OptionChain.LateCloseState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(i63) ? null : sQLiteStatementPrepare.getText(i63));
                if (lateCloseStateFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionChain.LateCloseState', but it was NULL.");
                }
                int i64 = columnIndexOrThrow47;
                columnIndexOrThrow47 = i64;
                Instant instantStringToInstant3 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(i64) ? null : sQLiteStatementPrepare.getText(i64));
                if (instantStringToInstant3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                columnIndexOrThrow39 = i59;
                int i65 = columnIndexOrThrow48;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(i65)) != 0;
                int i66 = columnIndexOrThrow49;
                String text20 = sQLiteStatementPrepare.getText(i66);
                int i67 = columnIndexOrThrow50;
                if (sQLiteStatementPrepare.isNull(i67)) {
                    columnIndexOrThrow48 = i65;
                    text6 = null;
                } else {
                    columnIndexOrThrow48 = i65;
                    text6 = sQLiteStatementPrepare.getText(i67);
                }
                columnIndexOrThrow49 = i66;
                BigDecimal bigDecimalStringToBigDecimal17 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text6);
                if (bigDecimalStringToBigDecimal17 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                }
                int i68 = columnIndexOrThrow51;
                if (sQLiteStatementPrepare.isNull(i68)) {
                    columnIndexOrThrow50 = i67;
                    numValueOf = null;
                } else {
                    columnIndexOrThrow50 = i67;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i68));
                }
                int i69 = columnIndexOrThrow44;
                if (sQLiteStatementPrepare.isNull(i69)) {
                    i5 = columnIndexOrThrow45;
                    if (sQLiteStatementPrepare.isNull(i5)) {
                        columnIndexOrThrow51 = i68;
                        i6 = columnIndexOrThrow46;
                        if (!sQLiteStatementPrepare.isNull(i6)) {
                            if (sQLiteStatementPrepare.isNull(i69)) {
                                columnIndexOrThrow44 = i69;
                                text12 = sQLiteStatementPrepare.getText(i69);
                            } else {
                                columnIndexOrThrow44 = i69;
                                text12 = null;
                            }
                            columnIndexOrThrow38 = i58;
                            bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                            if (bigDecimalStringToBigDecimal != null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow45 = i5;
                            BigDecimal bigDecimalStringToBigDecimal18 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5));
                            if (bigDecimalStringToBigDecimal18 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            columnIndexOrThrow46 = i6;
                            BigDecimal bigDecimalStringToBigDecimal19 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                            if (bigDecimalStringToBigDecimal19 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            tickRequirements = new OptionChain.TickRequirements(bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal18, bigDecimalStringToBigDecimal19);
                            OptionChain optionChain = new OptionChain(z3, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z4, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i70 = columnIndexOrThrow52;
                            String text21 = !sQLiteStatementPrepare.isNull(i70) ? null : sQLiteStatementPrepare.getText(i70);
                            Tradability.Companion companion3 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion3.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i71 = columnIndexOrThrow53;
                            if (sQLiteStatementPrepare.isNull(i71)) {
                                columnIndexOrThrow52 = i70;
                                text7 = null;
                            } else {
                                columnIndexOrThrow52 = i70;
                                text7 = sQLiteStatementPrepare.getText(i71);
                            }
                            Tradability tradabilityFromServerValue2 = companion3.fromServerValue(text7);
                            if (tradabilityFromServerValue2 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            columnIndexOrThrow53 = i71;
                            int i72 = columnIndexOrThrow54;
                            boolean z5 = ((int) sQLiteStatementPrepare.getLong(i72)) != 0;
                            int i73 = columnIndexOrThrow55;
                            columnIndexOrThrow54 = i72;
                            BigDecimal bigDecimalStringToBigDecimal20 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i73) ? null : sQLiteStatementPrepare.getText(i73));
                            if (bigDecimalStringToBigDecimal20 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i74 = columnIndexOrThrow56;
                            columnIndexOrThrow56 = i74;
                            BigDecimal bigDecimalStringToBigDecimal21 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74));
                            if (bigDecimalStringToBigDecimal21 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i75 = columnIndexOrThrow57;
                            Tradability tradabilityFromServerValue3 = companion3.fromServerValue(sQLiteStatementPrepare.isNull(i75) ? null : sQLiteStatementPrepare.getText(i75));
                            if (tradabilityFromServerValue3 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            int i76 = columnIndexOrThrow58;
                            if (sQLiteStatementPrepare.isNull(i76)) {
                                columnIndexOrThrow57 = i75;
                                text8 = null;
                            } else {
                                columnIndexOrThrow57 = i75;
                                text8 = sQLiteStatementPrepare.getText(i76);
                            }
                            columnIndexOrThrow55 = i73;
                            UUID uuidStringToUuid6 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text8);
                            if (uuidStringToUuid6 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                            }
                            int i77 = columnIndexOrThrow59;
                            LocalDate localDateStringToLocalDate = comboOrderDao_Impl.__commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(i77) ? null : sQLiteStatementPrepare.getText(i77));
                            int i78 = columnIndexOrThrow60;
                            columnIndexOrThrow59 = i77;
                            BigDecimal bigDecimalStringToBigDecimal22 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i78) ? null : sQLiteStatementPrepare.getText(i78));
                            if (bigDecimalStringToBigDecimal22 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i79 = columnIndexOrThrow61;
                            columnIndexOrThrow61 = i79;
                            BigDecimal bigDecimalStringToBigDecimal23 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i79) ? null : sQLiteStatementPrepare.getText(i79));
                            if (bigDecimalStringToBigDecimal23 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                            }
                            int i80 = columnIndexOrThrow62;
                            BigDecimal bigDecimalStringToBigDecimal24 = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(i80) ? null : sQLiteStatementPrepare.getText(i80));
                            int i81 = columnIndexOrThrow63;
                            String text22 = sQLiteStatementPrepare.getText(i81);
                            int i82 = columnIndexOrThrow64;
                            String text23 = sQLiteStatementPrepare.getText(i82);
                            columnIndexOrThrow63 = i81;
                            int i83 = columnIndexOrThrow65;
                            if (sQLiteStatementPrepare.isNull(i83)) {
                                columnIndexOrThrow65 = i83;
                                text9 = null;
                            } else {
                                columnIndexOrThrow65 = i83;
                                text9 = sQLiteStatementPrepare.getText(i83);
                            }
                            columnIndexOrThrow62 = i80;
                            Instant instantStringToInstant4 = comboOrderDao_Impl.__commonRoomConverters().stringToInstant(text9);
                            if (instantStringToInstant4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                            }
                            int i84 = columnIndexOrThrow66;
                            String text24 = sQLiteStatementPrepare.isNull(i84) ? null : sQLiteStatementPrepare.getText(i84);
                            int i85 = columnIndexOrThrow67;
                            String text25 = sQLiteStatementPrepare.getText(i85);
                            int i86 = columnIndexOrThrow68;
                            String text26 = sQLiteStatementPrepare.getText(i86);
                            columnIndexOrThrow66 = i84;
                            int i87 = columnIndexOrThrow69;
                            if (sQLiteStatementPrepare.isNull(i87)) {
                                columnIndexOrThrow69 = i87;
                                text10 = null;
                            } else {
                                columnIndexOrThrow69 = i87;
                                text10 = sQLiteStatementPrepare.getText(i87);
                            }
                            columnIndexOrThrow67 = i85;
                            UUID uuidStringToUuid7 = comboOrderDao_Impl.__commonRoomConverters().stringToUuid(text10);
                            int i88 = columnIndexOrThrow70;
                            String text27 = sQLiteStatementPrepare.getText(i88);
                            columnIndexOrThrow60 = i78;
                            columnIndexOrThrow58 = i76;
                            int i89 = columnIndexOrThrow71;
                            int i90 = (int) sQLiteStatementPrepare.getLong(i89);
                            int i91 = columnIndexOrThrow72;
                            if (sQLiteStatementPrepare.isNull(i91)) {
                                columnIndexOrThrow70 = i88;
                                text11 = null;
                            } else {
                                columnIndexOrThrow70 = i88;
                                text11 = sQLiteStatementPrepare.getText(i91);
                            }
                            Tradability tradabilityFromServerValue4 = companion3.fromServerValue(text11);
                            if (tradabilityFromServerValue4 == null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                            }
                            Instrument instrument = new Instrument(tradabilityFromServerValue, z5, bigDecimalStringToBigDecimal20, bigDecimalStringToBigDecimal21, tradabilityFromServerValue3, tradabilityFromServerValue2, uuidStringToUuid6, null, null, null, localDateStringToLocalDate, bigDecimalStringToBigDecimal22, bigDecimalStringToBigDecimal23, bigDecimalStringToBigDecimal24, text22, text23, instantStringToInstant4, text24, text25, text26, uuidStringToUuid7, text27, i90, tradabilityFromServerValue4, null, null);
                            Object value = MapsKt.getValue(arrayMap, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            String str3 = str2;
                            Intrinsics.checkNotNullExpressionValue(value, str3);
                            List list = (List) value;
                            Object value2 = MapsKt.getValue(arrayMap2, sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            Intrinsics.checkNotNullExpressionValue(value2, str3);
                            arrayList.add(new UiComboOrder(comboOrder, optionChain, instrument, list, (List) value2));
                            columnIndexOrThrow15 = i35;
                            columnIndexOrThrow71 = i89;
                            columnIndexOrThrow68 = i86;
                            str2 = str3;
                            columnIndexOrThrow72 = i91;
                            columnIndexOrThrow64 = i82;
                            columnIndexOrThrow17 = i37;
                            columnIndexOrThrow5 = i28;
                            columnIndexOrThrow2 = i23;
                            columnIndexOrThrow3 = i24;
                            columnIndexOrThrow4 = i25;
                            i22 = i4;
                            columnIndexOrThrow6 = i30;
                            columnIndexOrThrow7 = i32;
                            columnIndexOrThrow8 = i34;
                            columnIndexOrThrow33 = i53;
                            columnIndexOrThrow14 = i33;
                        } else {
                            columnIndexOrThrow46 = i6;
                            columnIndexOrThrow44 = i69;
                            columnIndexOrThrow45 = i5;
                            columnIndexOrThrow38 = i58;
                            tickRequirements = null;
                            OptionChain optionChain2 = new OptionChain(z3, bigDecimalStringToBigDecimal16, immutableListStringToLocalDateImmutableList, extendedHoursStateFromServerValue, uuidStringToUuid5, lateCloseStateFromServerValue, tickRequirements, instantStringToInstant3, z4, text20, bigDecimalStringToBigDecimal17, numValueOf);
                            int i702 = columnIndexOrThrow52;
                            if (!sQLiteStatementPrepare.isNull(i702)) {
                            }
                            Tradability.Companion companion32 = Tradability.INSTANCE;
                            tradabilityFromServerValue = companion32.fromServerValue(text21);
                            if (tradabilityFromServerValue != null) {
                            }
                        }
                    } else {
                        columnIndexOrThrow51 = i68;
                    }
                } else {
                    columnIndexOrThrow51 = i68;
                    i5 = columnIndexOrThrow45;
                }
                i6 = columnIndexOrThrow46;
                if (sQLiteStatementPrepare.isNull(i69)) {
                }
                columnIndexOrThrow38 = i58;
                bigDecimalStringToBigDecimal = comboOrderDao_Impl.__commonRoomConverters().stringToBigDecimal(text12);
                if (bigDecimalStringToBigDecimal != null) {
                }
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    public Flow<Integer> countTotal(final Set<? extends OrderState> states, final UUID instrumentId, final Instant since, final Instant before, final boolean isFilteringByAccountNumber, final Set<String> accountNumbers) {
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(since, "since");
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        SELECT COUNT(1)");
        sb.append("\n");
        sb.append("        FROM UiComboOrder");
        sb.append("\n");
        sb.append("        WHERE derivedState IN (");
        final int size = states.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(")");
        sb.append("\n");
        sb.append("        AND (");
        sb.append("\n");
        sb.append("            ");
        sb.append("?");
        sb.append(" IS NULL ");
        sb.append("\n");
        sb.append("            OR equityInstrumentId = ");
        sb.append("?");
        sb.append("\n");
        sb.append("        )");
        sb.append("\n");
        sb.append("        AND createdAt >= ");
        sb.append("?");
        sb.append("\n");
        sb.append("        AND (");
        sb.append("?");
        sb.append(" IS NULL OR createdAt < ");
        sb.append("?");
        sb.append(")");
        sb.append("\n");
        sb.append("        AND (NOT ");
        sb.append("?");
        sb.append(" OR accountNumber in (");
        StringUtil.appendPlaceholders(sb, accountNumbers.size());
        sb.append("))");
        sb.append("\n");
        sb.append("        ");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return FlowBuilder.createFlow(this.__db, true, new String[]{"UiComboOrder"}, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.countTotal$lambda$18(string2, states, size, this, instrumentId, since, before, isFilteringByAccountNumber, accountNumbers, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer countTotal$lambda$18(String str, Set set, int i, ComboOrderDao_Impl comboOrderDao_Impl, UUID uuid, Instant instant, Instant instant2, boolean z, Set set2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = set.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                String serverValue = OrderState.INSTANCE.toServerValue((OrderState) it.next());
                if (serverValue == null) {
                    sQLiteStatementPrepare.bindNull(i2);
                } else {
                    sQLiteStatementPrepare.bindText(i2, serverValue);
                }
                i2++;
            }
            int i3 = i + 1;
            String strUuidToString = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(i3);
            } else {
                sQLiteStatementPrepare.bindText(i3, strUuidToString);
            }
            int i4 = i + 2;
            String strUuidToString2 = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString2 == null) {
                sQLiteStatementPrepare.bindNull(i4);
            } else {
                sQLiteStatementPrepare.bindText(i4, strUuidToString2);
            }
            int i5 = i + 3;
            String strInstantToString = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant);
            if (strInstantToString == null) {
                sQLiteStatementPrepare.bindNull(i5);
            } else {
                sQLiteStatementPrepare.bindText(i5, strInstantToString);
            }
            int i6 = i + 4;
            String strInstantToString2 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant2);
            if (strInstantToString2 == null) {
                sQLiteStatementPrepare.bindNull(i6);
            } else {
                sQLiteStatementPrepare.bindText(i6, strInstantToString2);
            }
            int i7 = i + 5;
            String strInstantToString3 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant2);
            if (strInstantToString3 == null) {
                sQLiteStatementPrepare.bindNull(i7);
            } else {
                sQLiteStatementPrepare.bindText(i7, strInstantToString3);
            }
            sQLiteStatementPrepare.bindLong(i + 6, z ? 1L : 0L);
            int i8 = i + 7;
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                sQLiteStatementPrepare.bindText(i8, (String) it2.next());
                i8++;
            }
            Integer numValueOf = null;
            if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
            }
            return numValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.robinhood.android.options.combo.dao.ComboOrderDao
    public Flow<Integer> countLater(final Set<? extends OrderState> states, final UUID instrumentId, final Instant since, final Instant before, final Instant createdAt, final UUID id, final boolean isFilteringByAccountNumber, final Set<String> accountNumbers) {
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(since, "since");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        SELECT COUNT(1)");
        sb.append("\n");
        sb.append("        FROM UiComboOrder");
        sb.append("\n");
        sb.append("        WHERE derivedState IN (");
        final int size = states.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(")");
        sb.append("\n");
        sb.append("        AND (");
        sb.append("\n");
        sb.append("            ");
        sb.append("?");
        sb.append(" IS NULL ");
        sb.append("\n");
        sb.append("            OR equityInstrumentId = ");
        sb.append("?");
        sb.append("\n");
        sb.append("        )");
        sb.append("\n");
        sb.append("        AND createdAt >= ");
        sb.append("?");
        sb.append("\n");
        sb.append("        AND (");
        sb.append("?");
        sb.append(" IS NULL OR createdAt < ");
        sb.append("?");
        sb.append(")");
        sb.append("\n");
        sb.append("        AND (createdAt > ");
        sb.append("?");
        sb.append(" OR (createdAt = ");
        sb.append("?");
        sb.append(" AND id > ");
        sb.append("?");
        sb.append("))");
        sb.append("\n");
        sb.append("        AND (NOT ");
        sb.append("?");
        sb.append(" OR accountNumber in (");
        StringUtil.appendPlaceholders(sb, accountNumbers.size());
        sb.append("))");
        sb.append("\n");
        sb.append("        ");
        final String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return FlowBuilder.createFlow(this.__db, true, new String[]{"UiComboOrder"}, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderDao_Impl.countLater$lambda$19(string2, states, size, this, instrumentId, since, before, createdAt, id, isFilteringByAccountNumber, accountNumbers, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer countLater$lambda$19(String str, Set set, int i, ComboOrderDao_Impl comboOrderDao_Impl, UUID uuid, Instant instant, Instant instant2, Instant instant3, UUID uuid2, boolean z, Set set2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            Iterator it = set.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                String serverValue = OrderState.INSTANCE.toServerValue((OrderState) it.next());
                if (serverValue == null) {
                    sQLiteStatementPrepare.bindNull(i2);
                } else {
                    sQLiteStatementPrepare.bindText(i2, serverValue);
                }
                i2++;
            }
            int i3 = i + 1;
            String strUuidToString = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString == null) {
                sQLiteStatementPrepare.bindNull(i3);
            } else {
                sQLiteStatementPrepare.bindText(i3, strUuidToString);
            }
            int i4 = i + 2;
            String strUuidToString2 = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid);
            if (strUuidToString2 == null) {
                sQLiteStatementPrepare.bindNull(i4);
            } else {
                sQLiteStatementPrepare.bindText(i4, strUuidToString2);
            }
            int i5 = i + 3;
            String strInstantToString = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant);
            if (strInstantToString == null) {
                sQLiteStatementPrepare.bindNull(i5);
            } else {
                sQLiteStatementPrepare.bindText(i5, strInstantToString);
            }
            int i6 = i + 4;
            String strInstantToString2 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant2);
            if (strInstantToString2 == null) {
                sQLiteStatementPrepare.bindNull(i6);
            } else {
                sQLiteStatementPrepare.bindText(i6, strInstantToString2);
            }
            int i7 = i + 5;
            String strInstantToString3 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant2);
            if (strInstantToString3 == null) {
                sQLiteStatementPrepare.bindNull(i7);
            } else {
                sQLiteStatementPrepare.bindText(i7, strInstantToString3);
            }
            int i8 = i + 6;
            String strInstantToString4 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant3);
            if (strInstantToString4 == null) {
                sQLiteStatementPrepare.bindNull(i8);
            } else {
                sQLiteStatementPrepare.bindText(i8, strInstantToString4);
            }
            int i9 = i + 7;
            String strInstantToString5 = comboOrderDao_Impl.__commonRoomConverters().instantToString(instant3);
            if (strInstantToString5 == null) {
                sQLiteStatementPrepare.bindNull(i9);
            } else {
                sQLiteStatementPrepare.bindText(i9, strInstantToString5);
            }
            int i10 = i + 8;
            String strUuidToString3 = comboOrderDao_Impl.__commonRoomConverters().uuidToString(uuid2);
            if (strUuidToString3 == null) {
                sQLiteStatementPrepare.bindNull(i10);
            } else {
                sQLiteStatementPrepare.bindText(i10, strUuidToString3);
            }
            sQLiteStatementPrepare.bindLong(i + 9, z ? 1L : 0L);
            int i11 = i + 10;
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                sQLiteStatementPrepare.bindText(i11, (String) it2.next());
                i11++;
            }
            Integer numValueOf = null;
            if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
            }
            return numValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonRoomConverters __commonRoomConverters() {
        return this.__commonRoomConverters.getValue();
    }

    /* renamed from: __fetchRelationshipComboOrderExecutionAscomRobinhoodAndroidOptionsComboDbComboOrderExecution */
    private final void m2215x2589e318(final SQLiteConnection _connection, ArrayMap<String, List<ComboOrderExecution>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(_map, true, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComboOrderDao_Impl.m2216xc4af9daf(this.f$0, _connection, (ArrayMap) obj);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `id`,`legId`,`price`,`processedQuantity`,`quantity`,`settlementDate`,`timestamp` FROM `ComboOrderExecution` WHERE `legId` IN (");
        StringUtil.appendPlaceholders(sb, setKeySet.size());
        sb.append(")");
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(string2);
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            sQLiteStatementPrepare.bindText(i, it.next());
            i++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "legId");
            if (columnIndex != -1) {
                while (sQLiteStatementPrepare.step()) {
                    List<ComboOrderExecution> list = _map.get(sQLiteStatementPrepare.getText(columnIndex));
                    if (list != null) {
                        String text = null;
                        UUID uuidStringToUuid = __commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
                        if (uuidStringToUuid == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                        UUID uuidStringToUuid2 = __commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(1) ? null : sQLiteStatementPrepare.getText(1));
                        if (uuidStringToUuid2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                        BigDecimal bigDecimalStringToBigDecimal = __commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2));
                        if (bigDecimalStringToBigDecimal == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                        }
                        BigDecimal bigDecimalStringToBigDecimal2 = __commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3));
                        BigDecimal bigDecimalStringToBigDecimal3 = __commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4));
                        if (bigDecimalStringToBigDecimal3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                        }
                        LocalDate localDateStringToLocalDate = __commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(5) ? null : sQLiteStatementPrepare.getText(5));
                        if (localDateStringToLocalDate == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDate', but it was NULL.");
                        }
                        if (!sQLiteStatementPrepare.isNull(6)) {
                            text = sQLiteStatementPrepare.getText(6);
                        }
                        Instant instantStringToInstant = __commonRoomConverters().stringToInstant(text);
                        if (instantStringToInstant == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        list.add(new ComboOrderExecution(uuidStringToUuid, uuidStringToUuid2, bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal2, bigDecimalStringToBigDecimal3, localDateStringToLocalDate, instantStringToInstant));
                    }
                }
                sQLiteStatementPrepare.close();
                return;
            }
            sQLiteStatementPrepare.close();
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __fetchRelationshipComboOrderExecutionAscomRobinhoodAndroidOptionsComboDbComboOrderExecution$lambda$20 */
    public static final Unit m2216xc4af9daf(ComboOrderDao_Impl comboOrderDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap _tmpMap) {
        Intrinsics.checkNotNullParameter(_tmpMap, "_tmpMap");
        comboOrderDao_Impl.m2215x2589e318(sQLiteConnection, _tmpMap);
        return Unit.INSTANCE;
    }

    /* renamed from: __fetchRelationshipOptionInstrumentAscomRobinhoodModelsDbOptionInstrument */
    private final void m2222xa5770ea9(final SQLiteConnection _connection, ArrayMap<String, OptionInstrument> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(_map, false, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComboOrderDao_Impl.m2223xbfec4801(this.f$0, _connection, (ArrayMap) obj);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `cashAmount`,`contractType`,`expirationDate`,`id`,`issueDate`,`longStrategyCode`,`optionChainId`,`receivedAt`,`selloutDatetime`,`shortStrategyCode`,`state`,`strikePrice`,`chainSymbol`,`tradability` FROM `OptionInstrument` WHERE `id` IN (");
        StringUtil.appendPlaceholders(sb, setKeySet.size());
        sb.append(")");
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(string2);
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            sQLiteStatementPrepare.bindText(i, it.next());
            i++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "id");
            if (columnIndex != -1) {
                while (sQLiteStatementPrepare.step()) {
                    String text = sQLiteStatementPrepare.getText(columnIndex);
                    if (_map.containsKey(text)) {
                        String text2 = null;
                        BigDecimal bigDecimalStringToBigDecimal = __commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
                        OptionContractType optionContractTypeFromServerValue = OptionContractType.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(1) ? null : sQLiteStatementPrepare.getText(1));
                        if (optionContractTypeFromServerValue == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionContractType', but it was NULL.");
                        }
                        LocalDate localDateStringToLocalDate = __commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2));
                        if (localDateStringToLocalDate == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDate', but it was NULL.");
                        }
                        UUID uuidStringToUuid = __commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3));
                        if (uuidStringToUuid == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                        LocalDate localDateStringToLocalDate2 = __commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4));
                        if (localDateStringToLocalDate2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDate', but it was NULL.");
                        }
                        String text3 = sQLiteStatementPrepare.getText(5);
                        UUID uuidStringToUuid2 = __commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(6) ? null : sQLiteStatementPrepare.getText(6));
                        if (uuidStringToUuid2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                        Instant instantStringToInstant = __commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(7) ? null : sQLiteStatementPrepare.getText(7));
                        if (instantStringToInstant == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        Instant instantStringToInstant2 = __commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(8) ? null : sQLiteStatementPrepare.getText(8));
                        if (instantStringToInstant2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        String text4 = sQLiteStatementPrepare.getText(9);
                        OptionState optionStateFromServerValue = OptionState.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(10) ? null : sQLiteStatementPrepare.getText(10));
                        if (optionStateFromServerValue == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OptionState', but it was NULL.");
                        }
                        BigDecimal bigDecimalStringToBigDecimal2 = __commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(11) ? null : sQLiteStatementPrepare.getText(11));
                        if (bigDecimalStringToBigDecimal2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                        }
                        String text5 = sQLiteStatementPrepare.getText(12);
                        if (!sQLiteStatementPrepare.isNull(13)) {
                            text2 = sQLiteStatementPrepare.getText(13);
                        }
                        Tradability tradabilityFromServerValue = Tradability.INSTANCE.fromServerValue(text2);
                        if (tradabilityFromServerValue == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                        }
                        _map.put(text, new OptionInstrument(bigDecimalStringToBigDecimal, optionContractTypeFromServerValue, localDateStringToLocalDate, uuidStringToUuid, localDateStringToLocalDate2, text3, uuidStringToUuid2, instantStringToInstant, instantStringToInstant2, text4, optionStateFromServerValue, bigDecimalStringToBigDecimal2, text5, tradabilityFromServerValue));
                    }
                }
                sQLiteStatementPrepare.close();
                return;
            }
            sQLiteStatementPrepare.close();
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __fetchRelationshipOptionInstrumentAscomRobinhoodModelsDbOptionInstrument$lambda$21 */
    public static final Unit m2223xbfec4801(ComboOrderDao_Impl comboOrderDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap _tmpMap) {
        Intrinsics.checkNotNullParameter(_tmpMap, "_tmpMap");
        comboOrderDao_Impl.m2222xa5770ea9(sQLiteConnection, _tmpMap);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void __fetchRelationshipInstrumentAscomRobinhoodModelsDbInstrument(final SQLiteConnection _connection, ArrayMap<String, Instrument> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        int i = 0;
        if (_map.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(_map, false, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComboOrderDao_Impl.m2221x6fc8a718(this.f$0, _connection, (ArrayMap) obj);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `affiliateTradability`,`carRequired`,`dayTradeRatio`,`defaultPresetPercentLimit`,`fractionalTradability`,`allDayTradability`,`id`,`ipoAccessStatus`,`ipoS1Url`,`issuerType`,`listDate`,`maintenanceRatio`,`marginInitialRatio`,`minTickSize`,`name`,`otcMarketTier`,`receivedAt`,`simpleName`,`state`,`symbol`,`tradableChainId`,`type`,`notionalEstimatedQuantityDecimals`,`shortSaleTradability`,`shortMarginRatio`,`shortSaleLocateAvailability` FROM `Instrument` WHERE `id` IN (");
        StringUtil.appendPlaceholders(sb, setKeySet.size());
        sb.append(")");
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(string2);
        Iterator<String> it = setKeySet.iterator();
        int i2 = 1;
        int i3 = 1;
        while (it.hasNext()) {
            sQLiteStatementPrepare.bindText(i3, it.next());
            i3++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "id");
            if (columnIndex != -1) {
                while (sQLiteStatementPrepare.step()) {
                    String text = sQLiteStatementPrepare.getText(columnIndex);
                    if (_map.containsKey(text)) {
                        String text2 = sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i);
                        Tradability.Companion companion = Tradability.INSTANCE;
                        Tradability tradabilityFromServerValue = companion.fromServerValue(text2);
                        if (tradabilityFromServerValue == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                        }
                        boolean z = ((int) sQLiteStatementPrepare.getLong(i2)) != 0 ? i2 : i;
                        BigDecimal bigDecimalStringToBigDecimal = __commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2));
                        if (bigDecimalStringToBigDecimal == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                        }
                        BigDecimal bigDecimalStringToBigDecimal2 = __commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3));
                        if (bigDecimalStringToBigDecimal2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                        }
                        Tradability tradabilityFromServerValue2 = companion.fromServerValue(sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4));
                        if (tradabilityFromServerValue2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                        }
                        Tradability tradabilityFromServerValue3 = companion.fromServerValue(sQLiteStatementPrepare.isNull(5) ? null : sQLiteStatementPrepare.getText(5));
                        if (tradabilityFromServerValue3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                        }
                        UUID uuidStringToUuid = __commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(6) ? null : sQLiteStatementPrepare.getText(6));
                        if (uuidStringToUuid == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                        IpoAccessStatus ipoAccessStatusFromServerValue = IpoAccessStatus.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(7) ? null : sQLiteStatementPrepare.getText(7));
                        HttpUrl httpUrlStringToHttpUrlConverter = __commonRoomConverters().stringToHttpUrlConverter(sQLiteStatementPrepare.isNull(8) ? null : sQLiteStatementPrepare.getText(8));
                        IssuerType issuerTypeFromServerValue = IssuerType.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(9) ? null : sQLiteStatementPrepare.getText(9));
                        LocalDate localDateStringToLocalDate = __commonRoomConverters().stringToLocalDate(sQLiteStatementPrepare.isNull(10) ? null : sQLiteStatementPrepare.getText(10));
                        BigDecimal bigDecimalStringToBigDecimal3 = __commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(11) ? null : sQLiteStatementPrepare.getText(11));
                        if (bigDecimalStringToBigDecimal3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                        }
                        BigDecimal bigDecimalStringToBigDecimal4 = __commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(12) ? null : sQLiteStatementPrepare.getText(12));
                        if (bigDecimalStringToBigDecimal4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                        }
                        BigDecimal bigDecimalStringToBigDecimal5 = __commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(13) ? null : sQLiteStatementPrepare.getText(13));
                        String text3 = sQLiteStatementPrepare.getText(14);
                        String text4 = sQLiteStatementPrepare.getText(15);
                        Instant instantStringToInstant = __commonRoomConverters().stringToInstant(sQLiteStatementPrepare.isNull(16) ? null : sQLiteStatementPrepare.getText(16));
                        if (instantStringToInstant == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        String text5 = sQLiteStatementPrepare.isNull(17) ? null : sQLiteStatementPrepare.getText(17);
                        String text6 = sQLiteStatementPrepare.getText(18);
                        String text7 = sQLiteStatementPrepare.getText(19);
                        UUID uuidStringToUuid2 = __commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(20) ? null : sQLiteStatementPrepare.getText(20));
                        String text8 = sQLiteStatementPrepare.getText(21);
                        int i4 = (int) sQLiteStatementPrepare.getLong(22);
                        Tradability tradabilityFromServerValue4 = companion.fromServerValue(sQLiteStatementPrepare.isNull(23) ? null : sQLiteStatementPrepare.getText(23));
                        if (tradabilityFromServerValue4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.Tradability', but it was NULL.");
                        }
                        _map.put(text, new Instrument(tradabilityFromServerValue, z, bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal2, tradabilityFromServerValue2, tradabilityFromServerValue3, uuidStringToUuid, ipoAccessStatusFromServerValue, httpUrlStringToHttpUrlConverter, issuerTypeFromServerValue, localDateStringToLocalDate, bigDecimalStringToBigDecimal3, bigDecimalStringToBigDecimal4, bigDecimalStringToBigDecimal5, text3, text4, instantStringToInstant, text5, text6, text7, uuidStringToUuid2, text8, i4, tradabilityFromServerValue4, __commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(24) ? null : sQLiteStatementPrepare.getText(24)), ShortSaleLocateAvailability.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(25) ? null : sQLiteStatementPrepare.getText(25))));
                        i2 = 1;
                        i = 0;
                    }
                }
                sQLiteStatementPrepare.close();
                return;
            }
            sQLiteStatementPrepare.close();
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __fetchRelationshipInstrumentAscomRobinhoodModelsDbInstrument$lambda$22 */
    public static final Unit m2221x6fc8a718(ComboOrderDao_Impl comboOrderDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap _tmpMap) {
        Intrinsics.checkNotNullParameter(_tmpMap, "_tmpMap");
        comboOrderDao_Impl.__fetchRelationshipInstrumentAscomRobinhoodModelsDbInstrument(sQLiteConnection, _tmpMap);
        return Unit.INSTANCE;
    }

    /* renamed from: __fetchRelationshipComboOrderLegAscomRobinhoodAndroidOptionsComboUiUiComboOrderLeg */
    private final void m2217x4e5ab2fa(final SQLiteConnection _connection, ArrayMap<String, List<UiComboOrderLeg>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        int i = 1;
        if (_map.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(_map, true, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComboOrderDao_Impl.m2218x87ef7b14(this.f$0, _connection, (ArrayMap) obj);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `id`,`orderId`,`instrumentId`,`instrumentType`,`positionEffect`,`ratioQuantity`,`side` FROM `ComboOrderLeg` WHERE `orderId` IN (");
        StringUtil.appendPlaceholders(sb, setKeySet.size());
        sb.append(")");
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(string2);
        Iterator<String> it = setKeySet.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            sQLiteStatementPrepare.bindText(i2, it.next());
            i2++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "orderId");
            if (columnIndex != -1) {
                ArrayMap<String, List<ComboOrderExecution>> arrayMap = new ArrayMap<>();
                ArrayMap<String, OptionInstrument> arrayMap2 = new ArrayMap<>();
                ArrayMap<String, Instrument> arrayMap3 = new ArrayMap<>();
                while (sQLiteStatementPrepare.step()) {
                    String text = sQLiteStatementPrepare.getText(0);
                    if (!arrayMap.containsKey(text)) {
                        arrayMap.put(text, new ArrayList());
                    }
                    arrayMap2.put(sQLiteStatementPrepare.getText(2), null);
                    arrayMap3.put(sQLiteStatementPrepare.getText(2), null);
                }
                sQLiteStatementPrepare.reset();
                m2215x2589e318(_connection, arrayMap);
                m2222xa5770ea9(_connection, arrayMap2);
                __fetchRelationshipInstrumentAscomRobinhoodModelsDbInstrument(_connection, arrayMap3);
                while (sQLiteStatementPrepare.step()) {
                    List<UiComboOrderLeg> list = _map.get(sQLiteStatementPrepare.getText(columnIndex));
                    if (list != null) {
                        UUID uuidStringToUuid = __commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
                        if (uuidStringToUuid == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                        UUID uuidStringToUuid2 = __commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i));
                        if (uuidStringToUuid2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                        UUID uuidStringToUuid3 = __commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2));
                        if (uuidStringToUuid3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                        ApiComboOrder.InstrumentType instrumentTypeFromServerValue = ApiComboOrder.InstrumentType.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3));
                        if (instrumentTypeFromServerValue == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.robinhood.android.options.combo.api.ApiComboOrder.InstrumentType', but it was NULL.");
                        }
                        OrderPositionEffect orderPositionEffectFromServerValue = OrderPositionEffect.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4));
                        if (orderPositionEffectFromServerValue == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderPositionEffect', but it was NULL.");
                        }
                        int i3 = (int) sQLiteStatementPrepare.getLong(5);
                        OrderSide orderSideFromServerValue = OrderSide.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(6) ? null : sQLiteStatementPrepare.getText(6));
                        if (orderSideFromServerValue == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.robinhood.models.db.OrderSide', but it was NULL.");
                        }
                        ComboOrderLeg comboOrderLeg = new ComboOrderLeg(uuidStringToUuid, uuidStringToUuid2, uuidStringToUuid3, instrumentTypeFromServerValue, orderPositionEffectFromServerValue, i3, orderSideFromServerValue);
                        Object value = MapsKt.getValue(arrayMap, sQLiteStatementPrepare.getText(0));
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        list.add(new UiComboOrderLeg(comboOrderLeg, (List) value, arrayMap2.get(sQLiteStatementPrepare.getText(2)), arrayMap3.get(sQLiteStatementPrepare.getText(2))));
                        i = 1;
                    }
                }
                sQLiteStatementPrepare.close();
                return;
            }
            sQLiteStatementPrepare.close();
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __fetchRelationshipComboOrderLegAscomRobinhoodAndroidOptionsComboUiUiComboOrderLeg$lambda$23 */
    public static final Unit m2218x87ef7b14(ComboOrderDao_Impl comboOrderDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap _tmpMap) {
        Intrinsics.checkNotNullParameter(_tmpMap, "_tmpMap");
        comboOrderDao_Impl.m2217x4e5ab2fa(sQLiteConnection, _tmpMap);
        return Unit.INSTANCE;
    }

    /* renamed from: __fetchRelationshipComboOrderSalesTaxAscomRobinhoodAndroidOptionsComboDbComboOrderSalesTax */
    private final void m2219x367d9594(final SQLiteConnection _connection, ArrayMap<String, List<ComboOrderSalesTax>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(_map, true, new Function1() { // from class: com.robinhood.android.options.combo.dao.ComboOrderDao_Impl$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComboOrderDao_Impl.m2220xa4f3652f(this.f$0, _connection, (ArrayMap) obj);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `id`,`orderId`,`type`,`displayName`,`feeRate`,`fee` FROM `ComboOrderSalesTax` WHERE `orderId` IN (");
        StringUtil.appendPlaceholders(sb, setKeySet.size());
        sb.append(")");
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(string2);
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            sQLiteStatementPrepare.bindText(i, it.next());
            i++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "orderId");
            if (columnIndex != -1) {
                while (sQLiteStatementPrepare.step()) {
                    List<ComboOrderSalesTax> list = _map.get(sQLiteStatementPrepare.getText(columnIndex));
                    if (list != null) {
                        String text = null;
                        UUID uuidStringToUuid = __commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
                        if (uuidStringToUuid == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                        UUID uuidStringToUuid2 = __commonRoomConverters().stringToUuid(sQLiteStatementPrepare.isNull(1) ? null : sQLiteStatementPrepare.getText(1));
                        if (uuidStringToUuid2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                        }
                        String text2 = sQLiteStatementPrepare.getText(2);
                        String text3 = sQLiteStatementPrepare.getText(3);
                        BigDecimal bigDecimalStringToBigDecimal = __commonRoomConverters().stringToBigDecimal(sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4));
                        if (bigDecimalStringToBigDecimal == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                        }
                        if (!sQLiteStatementPrepare.isNull(5)) {
                            text = sQLiteStatementPrepare.getText(5);
                        }
                        BigDecimal bigDecimalStringToBigDecimal2 = __commonRoomConverters().stringToBigDecimal(text);
                        if (bigDecimalStringToBigDecimal2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.math.BigDecimal', but it was NULL.");
                        }
                        list.add(new ComboOrderSalesTax(uuidStringToUuid, uuidStringToUuid2, text2, text3, bigDecimalStringToBigDecimal, bigDecimalStringToBigDecimal2));
                    }
                }
                sQLiteStatementPrepare.close();
                return;
            }
            sQLiteStatementPrepare.close();
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: __fetchRelationshipComboOrderSalesTaxAscomRobinhoodAndroidOptionsComboDbComboOrderSalesTax$lambda$24 */
    public static final Unit m2220xa4f3652f(ComboOrderDao_Impl comboOrderDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap _tmpMap) {
        Intrinsics.checkNotNullParameter(_tmpMap, "_tmpMap");
        comboOrderDao_Impl.m2219x367d9594(sQLiteConnection, _tmpMap);
        return Unit.INSTANCE;
    }

    private final ModelRoomConverters __modelRoomConverters() {
        return this.__modelRoomConverters.getValue();
    }

    /* compiled from: ComboOrderDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/combo/dao/ComboOrderDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-db-room_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.listOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(CommonRoomConverters.class), Reflection.getOrCreateKotlinClass(ModelRoomConverters.class)});
        }
    }
}
