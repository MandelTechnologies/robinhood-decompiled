package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.robinhood.librobinhood.data.prefs.ChainContractTypePref;
import com.robinhood.librobinhood.data.prefs.ChainOrderSidePref;
import com.robinhood.models.dao.OptionOrderFilterDao;
import com.robinhood.models.p320db.OptionChainGlobalFilter;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionOrderFilter;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import timber.log.Timber;

/* compiled from: OptionOrderFilterStore.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0010J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0010H\u0001¢\u0006\u0002\b R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionOrderFilterStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionOrderFilterDao;", "globalChainOrderSidePref", "Lcom/robinhood/prefs/StringPreference;", "globalChainContractTypePref", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/OptionOrderFilterDao;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;)V", "getGlobalChainOrderSidePref", "()Lcom/robinhood/prefs/StringPreference;", "getGlobalChainContractTypePref", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/db/OptionOrderFilter;", "", "getAndSaveOptionOrderFilter", "Lio/reactivex/Observable;", "filterKey", "", "saveOptionFilterAndGlobalFilter", "filter", "getGlobalFilter", "Lcom/robinhood/models/db/OptionChainGlobalFilter;", "saveGlobalFilter", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "optionContractType", "Lcom/robinhood/models/db/OptionContractType;", "saveOptionOrderFilter", "saveOptionOrderFilter$lib_store_options_externalDebug", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionOrderFilterStore extends Store {
    private final OptionOrderFilterDao dao;
    private final StringPreference globalChainContractTypePref;
    private final StringPreference globalChainOrderSidePref;
    private final Function1<OptionOrderFilter, Unit> saveAction;

    public final StringPreference getGlobalChainOrderSidePref() {
        return this.globalChainOrderSidePref;
    }

    public final StringPreference getGlobalChainContractTypePref() {
        return this.globalChainContractTypePref;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderFilterStore(StoreBundle storeBundle, final OptionOrderFilterDao dao, @ChainOrderSidePref StringPreference globalChainOrderSidePref, @ChainContractTypePref StringPreference globalChainContractTypePref) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(globalChainOrderSidePref, "globalChainOrderSidePref");
        Intrinsics.checkNotNullParameter(globalChainContractTypePref, "globalChainContractTypePref");
        this.dao = dao;
        this.globalChainOrderSidePref = globalChainOrderSidePref;
        this.globalChainContractTypePref = globalChainContractTypePref;
        final LogoutKillswitch logoutKillswitch = storeBundle.getLogoutKillswitch();
        final RoomDatabase roomDatabase = storeBundle.getRoomDatabase();
        this.saveAction = new Function1<OptionOrderFilter, Unit>() { // from class: com.robinhood.librobinhood.data.store.OptionOrderFilterStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OptionOrderFilter optionOrderFilter) {
                m22684invoke(optionOrderFilter);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22684invoke(OptionOrderFilter optionOrderFilter) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(optionOrderFilter);
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
    }

    public final Observable<OptionOrderFilter> getAndSaveOptionOrderFilter(final String filterKey) {
        Intrinsics.checkNotNullParameter(filterKey, "filterKey");
        final Flow flowTakeWhileLoggedIn = takeWhileLoggedIn(this.dao.getOptionOrderFilter(filterKey));
        return asObservable(new Flow<OptionOrderFilter>() { // from class: com.robinhood.librobinhood.data.store.OptionOrderFilterStore$getAndSaveOptionOrderFilter$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderFilterStore$getAndSaveOptionOrderFilter$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String $filterKey$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ OptionOrderFilterStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderFilterStore$getAndSaveOptionOrderFilter$$inlined$map$1$2", m3645f = "OptionOrderFilterStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderFilterStore$getAndSaveOptionOrderFilter$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, OptionOrderFilterStore optionOrderFilterStore, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = optionOrderFilterStore;
                    this.$filterKey$inlined = str;
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
                        OptionOrderFilter optionOrderFilter = (OptionOrderFilter) CollectionsKt.firstOrNull((List) obj);
                        if (optionOrderFilter == null) {
                            optionOrderFilter = this.this$0.getGlobalFilter().toOptionOrderFilter(this.$filterKey$inlined);
                            this.this$0.saveOptionOrderFilter$lib_store_options_externalDebug(optionOrderFilter);
                        } else {
                            this.this$0.saveGlobalFilter(optionOrderFilter.getSide(), optionOrderFilter.getContractType());
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionOrderFilter, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OptionOrderFilter> flowCollector, Continuation continuation) {
                Object objCollect = flowTakeWhileLoggedIn.collect(new AnonymousClass2(flowCollector, this, filterKey), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    public final void saveOptionFilterAndGlobalFilter(OptionOrderFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        saveOptionOrderFilter$lib_store_options_externalDebug(filter);
        saveGlobalFilter(filter.getSide(), filter.getContractType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionChainGlobalFilter getGlobalFilter() {
        OrderSide orderSideFromServerValue = OrderSide.INSTANCE.fromServerValue(this.globalChainOrderSidePref.get());
        if (orderSideFromServerValue == null) {
            orderSideFromServerValue = OrderSide.BUY;
        }
        OptionContractType optionContractTypeFromServerValue = OptionContractType.INSTANCE.fromServerValue(this.globalChainContractTypePref.get());
        if (optionContractTypeFromServerValue == null) {
            optionContractTypeFromServerValue = OptionContractType.CALL;
        }
        return new OptionChainGlobalFilter(orderSideFromServerValue, optionContractTypeFromServerValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveGlobalFilter(OrderSide orderSide, OptionContractType optionContractType) {
        this.globalChainOrderSidePref.set(orderSide.getServerValue());
        this.globalChainContractTypePref.set(optionContractType.getServerValue());
    }

    public final void saveOptionOrderFilter$lib_store_options_externalDebug(final OptionOrderFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Completable completableSubscribeOn = Completable.fromAction(new Action() { // from class: com.robinhood.librobinhood.data.store.OptionOrderFilterStore$saveOptionOrderFilter$1
            @Override // io.reactivex.functions.Action
            public final void run() {
                this.this$0.saveAction.invoke(filter);
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(completableSubscribeOn, "subscribeOn(...)");
        ScopedSubscriptionKt.subscribeIn(completableSubscribeOn, getStoreScope());
    }
}
